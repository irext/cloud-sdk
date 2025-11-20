package net.irext.webapi;

import com.google.gson.Gson;
import net.irext.webapi.bean.ACStatus;
import net.irext.webapi.model.*;
import net.irext.webapi.utils.Constants;
import net.irext.webapi.request.*;
import net.irext.webapi.response.*;
import net.irext.webapi.WebAPICallbacks.*;
import okhttp3.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * Filename:       WebAPIs.java
 * Revised:        Date: 2017-03-30
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP Request initializer
 * <p>
 * Revision log:
 * 2017-03-30: created by strawmanbobi
 */
public class WebAPIs {

    @SuppressWarnings("all")
    private static final String TAG = WebAPIs.class.getSimpleName();

    private static WebAPIs mInstance = null;

    private static final String DEFAULT_ADDRESS = "http://localhost:8081";
    private static final String DEFAULT_APP = "/irext-server";
    private static String URL_PREFIX = DEFAULT_ADDRESS + DEFAULT_APP;

    // download bin from OSS
    private static final String IR_BIN_FILE_PREFIX = "irda_";
    private static final String IR_BIN_FILE_SUFFIX = ".bin";
    private static final String IR_BIN_DOWNLOAD_PREFIX = "http://irext-debug.oss-cn-hangzhou.aliyuncs.com/";

    private static final String SERVICE_SIGN_IN = "/app/app_login";
    private static final String SERVICE_LIST_CATEGORIES = "/indexing/list_categories";
    private static final String SERVICE_LIST_BRANDS = "/indexing/list_brands";
    private static final String SERVICE_LIST_PROVINCES = "/indexing/list_provinces";
    private static final String SERVICE_LIST_CITIES = "/indexing/list_cities";
    private static final String SERVICE_LIST_OPERATORS = "/indexing/list_operators";
    private static final String SERVICE_LIST_INDEXES = "/indexing/list_indexes";
    private static final String SERVICE_DOWNLOAD_BIN = "/operation/download_bin";
    private static final String SERVICE_ONLINE_DECODE = "/operation/decode";
    private static final String SERVICE_GET_AC_PARAMETERS = "/operation/get_ac_parameters";

    private int id;
    private String token;

    private final OkHttpClient mHttpClient;

    /**
     * Constructs a WebAPIs instance with the specified address and application name.
     *
     * @param address the server address
     * @param appName the application name
     */
    private WebAPIs(String address, String appName) {
        if (null != address && null != appName) {
            URL_PREFIX = address + appName;
        }
        mHttpClient = new OkHttpClient();
    }

    /**
     * Initializes the WebAPIs instance with the specified address and application name.
     *
     * @param address the server address
     * @param appName the application name
     */
    private static void initializeInstance(String address, String appName) {
        mInstance = new WebAPIs(address, appName);
    }

    /**
     * Gets the WebAPIs instance, creating it if necessary.
     *
     * @param address the server address
     * @param appName the application name
     * @return the WebAPIs instance
     */
    @SuppressWarnings("unused")
    public static WebAPIs getInstance(String address, String appName) {
        if (null == mInstance) {
            initializeInstance(address, appName);
        }
        return mInstance;
    }

    /**
     * Gets a file byte stream from the specified URL.
     *
     * @param url the URL to get the file from
     * @return the file byte stream
     * @throws IOException if an I/O error occurs
     */
    private InputStream getFileByteStreamByURL(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = new OkHttpClient().newCall(request).execute();
        return response.body().byteStream();
    }

    /**
     * Posts data to the server at the specified URL.
     *
     * @param url the URL to post to
     * @param json the JSON data to post
     * @return the server response
     * @throws IOException if an I/O error occurs
     */
    private String postToServer(String url, String json) throws IOException {
        MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");

        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = mHttpClient.newCall(request).execute();
        return response.body().string();
    }

    /**
     * Posts data to the server for octet stream response.
     *
     * @param url the URL to post to
     * @param json the JSON data to post
     * @return the input stream response
     * @throws IOException if an I/O error occurs
     */
    private InputStream postToServerForOctets(String url, String json) throws IOException {
        MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JSON, json);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();

        Response response = mHttpClient.newCall(request).execute();
        return response.body().byteStream();
    }

    /**
     * Signs in with the specified app key and secret.
     *
     * @param appKey the application key
     * @param appSecret the application secret
     * @param signInCallback the sign in callback
     */
    @SuppressWarnings("unused")
    public void signIn(String appKey, String appSecret, SignInCallback signInCallback) {
        String signInURL = URL_PREFIX + SERVICE_SIGN_IN;
        AppSignInRequest appSignInRequest = new AppSignInRequest();
        appSignInRequest.setAppKey(appKey);
        appSignInRequest.setAppSecret(appSecret);
        appSignInRequest.setAppType(2);
        String bodyJson = appSignInRequest.toJson();

        try {
            String response = postToServer(signInURL, bodyJson);
            LoginResponse loginResponse = new Gson().fromJson(response, LoginResponse.class);
            if (loginResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                UserApp userApp = loginResponse.getEntity();
                if (0 != userApp.getId() && null != userApp.getToken()) {
                        id = userApp.getId();
                        token = userApp.getToken();
                        signInCallback.onSignInSuccess(userApp);
                } else {
                    signInCallback.onSignInFailed();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            signInCallback.onSignInError();
        }
    }

    /**
     * Lists categories with the specified parameters.
     *
     * @param from the starting index
     * @param count the number of categories to list
     * @param listCategoriesCallback the list categories callback
     */
    @SuppressWarnings("unused")
    public void listCategories(int from, int count, ListCategoriesCallback listCategoriesCallback) {
        String listCategoriesURL = URL_PREFIX + SERVICE_LIST_CATEGORIES;
        ListCategoriesRequest listCategoriesRequest = new ListCategoriesRequest();
        listCategoriesRequest.setId(id);
        listCategoriesRequest.setToken(token);
        listCategoriesRequest.setFrom(from);
        listCategoriesRequest.setCount(count);
        String bodyJson = listCategoriesRequest.toJson();

        try {
            String response = postToServer(listCategoriesURL, bodyJson);
            CategoriesResponse categoriesResponse = new Gson().fromJson(response, CategoriesResponse.class);

            if(categoriesResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                listCategoriesCallback.onListCategoriesSuccess(categoriesResponse.getEntity());
            } else {
                listCategoriesCallback.onListCategoriesFailed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            listCategoriesCallback.onListCategoriesError();
        }
    }

    /**
     * Lists brands with the specified parameters.
     *
     * @param categoryId the category ID
     * @param from the starting index
     * @param count the number of brands to list
     * @param listBrandsCallback the list brands callback
     */
    @SuppressWarnings("unused")
    public void listBrands(int categoryId, int from, int count,
                           ListBrandsCallback listBrandsCallback) {
        String listBrandsURL = URL_PREFIX + SERVICE_LIST_BRANDS;
        ListBrandsRequest listBrandsRequest = new ListBrandsRequest();
        listBrandsRequest.setId(id);
        listBrandsRequest.setToken(token);
        listBrandsRequest.setCategoryId(categoryId);
        listBrandsRequest.setFrom(from);
        listBrandsRequest.setCount(count);
        String bodyJson = listBrandsRequest.toJson();

        try {
            String response = postToServer(listBrandsURL, bodyJson);
            BrandsResponse brandsResponse = new Gson().fromJson(response, BrandsResponse.class);

            if (brandsResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                listBrandsCallback.onListBrandsSuccess(brandsResponse.getEntity());
            } else {
                listBrandsCallback.onListBrandsFailed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            listBrandsCallback.onListBrandsError();
        }
    }

    /**
     * Lists provinces.
     *
     * @param listProvincesCallback the list provinces callback
     */
    @SuppressWarnings("unused")
    public void listProvinces(ListProvincesCallback listProvincesCallback) {
        String listProvincesURL = URL_PREFIX + SERVICE_LIST_PROVINCES;
        ListCitiesRequest listCitiesRequest = new ListCitiesRequest();
        listCitiesRequest.setId(id);
        listCitiesRequest.setToken(token);
        String bodyJson = listCitiesRequest.toJson();

        try {
            String response = postToServer(listProvincesURL, bodyJson);
            CitiesResponse citiesResponse = new Gson().fromJson(response, CitiesResponse.class);

            if (citiesResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                listProvincesCallback.onListProvincesSuccess(citiesResponse.getEntity());
            } else {
                listProvincesCallback.onListProvincesFailed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            listProvincesCallback.onListProvincesError();
        }
    }

    /**
     * Lists cities with the specified prefix.
     *
     * @param prefix the province prefix
     * @param listCitiesCallback the list cities callback
     */
    @SuppressWarnings("unused")
    public void listCities(String prefix, ListCitiesCallback listCitiesCallback) {
        String listCitiesURL = URL_PREFIX + SERVICE_LIST_CITIES;
        ListCitiesRequest listCitiesRequest = new ListCitiesRequest();
        listCitiesRequest.setId(id);
        listCitiesRequest.setToken(token);
        listCitiesRequest.setProvincePrefix(prefix);
        String bodyJson = listCitiesRequest.toJson();

        try {
            String response = postToServer(listCitiesURL, bodyJson);
            CitiesResponse citiesResponse = new Gson().fromJson(response, CitiesResponse.class);

            if (citiesResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                listCitiesCallback.onListCitiesSuccess(citiesResponse.getEntity());
            } else {
                listCitiesCallback.onListCitiesFailed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            listCitiesCallback.onListCitiesError();
        }
    }

    /**
     * Lists operators for the specified city code.
     *
     * @param cityCode the city code
     * @param listOperatersCallback the list operators callback
     */
    @SuppressWarnings("unused")
    public void listOperators(String cityCode,
                              ListOperatersCallback listOperatersCallback) {
        String listOperatorsURL = URL_PREFIX + SERVICE_LIST_OPERATORS;
        ListOperatorsRequest listOperatorsRequest = new ListOperatorsRequest();
        listOperatorsRequest.setId(id);
        listOperatorsRequest.setToken(token);
        listOperatorsRequest.setCityCode(cityCode);
        listOperatorsRequest.setFrom(0);
        listOperatorsRequest.setCount(20);
        String bodyJson = listOperatorsRequest.toJson();

        try {
            String response = postToServer(listOperatorsURL, bodyJson);
            OperatorsResponse operatorsResponse = new Gson().fromJson(response, OperatorsResponse.class);

            if (operatorsResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                listOperatersCallback.onListOperatorsSuccess(operatorsResponse.getEntity());
            } else {
                listOperatersCallback.onListOperatorsFailed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            listOperatersCallback.onListOperatorsError();
        }
    }

    /**
     * Lists remote indexes with the specified parameters.
     *
     * @param categoryId the category ID
     * @param brandId the brand ID
     * @param cityCode the city code
     * @param operatorId the operator ID
     * @param withParaData the parameter data flag
     * @param onListIndexCallback the list indexes callback
     */
    @SuppressWarnings("unused")
    public void listRemoteIndexes(int categoryId,
                                  int brandId,
                                  String cityCode,
                                  String operatorId,
                                  int withParaData,
                                  ListIndexesCallback onListIndexCallback) {
        String listIndexesURL = URL_PREFIX + SERVICE_LIST_INDEXES;
        ListIndexesRequest listIndexesRequest = new ListIndexesRequest();
        listIndexesRequest.setId(id);
        listIndexesRequest.setToken(token);
        listIndexesRequest.setCategoryId(categoryId);
        listIndexesRequest.setBrandId(brandId);
        listIndexesRequest.setCityCode(cityCode);
        listIndexesRequest.setOperatorId(operatorId);
        listIndexesRequest.setWithParaData(withParaData);
        listIndexesRequest.setFrom(0);
        listIndexesRequest.setCount(20);
        String bodyJson = listIndexesRequest.toJson();

        try {
            String response = postToServer(listIndexesURL, bodyJson);

            IndexesResponse indexesResponse = new Gson().fromJson(response, IndexesResponse.class);

            if (indexesResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                onListIndexCallback.onListIndexesSuccess(indexesResponse.getEntity());
            } else {
                onListIndexCallback.onListIndexesFailed();
            }
        } catch (Exception e) {
            e.printStackTrace();
            onListIndexCallback.onListIndexesError();
        }
    }

    /**
     * Downloads a binary file with the specified parameters.
     *
     * @param remoteMap the remote map
     * @param indexId the index ID
     * @param downloadBinCallback the download binary callback
     */
    @SuppressWarnings("unused")
    public void downloadBin(String remoteMap, int indexId,
                            DownloadBinCallback downloadBinCallback) {
        String downloadURL = URL_PREFIX + SERVICE_DOWNLOAD_BIN;
        DownloadBinaryRequest downloadBinaryRequest = new DownloadBinaryRequest();
        downloadBinaryRequest.setId(id);
        downloadBinaryRequest.setToken(token);
        downloadBinaryRequest.setIndexId(indexId);

        String bodyJson = downloadBinaryRequest.toJson();

        if (null != bodyJson) {
            try {
                InputStream binStream = postToServerForOctets(downloadURL, bodyJson);

                if (null != binStream) {
                    downloadBinCallback.onDownloadBinSuccess(binStream);
                } else {
                    downloadBinCallback.onDownloadBinFailed();
                }
            } catch (IOException e) {
                e.printStackTrace();
                downloadBinCallback.onDownloadBinError();
            }
        }
    }

    /**
     * Decodes IR data with the specified parameters.
     *
     * @param indexId the index ID
     * @param acStatus the AC status
     * @param keyCode the key code
     * @param changeWindDir the change wind direction flag
     * @param directDecode the direct decode flag
     * @param paraData the parameter data
     * @return the decoded IR data
     */
    @SuppressWarnings("unused")
    public int[] decodeIR(int indexId, ACStatus acStatus, int keyCode, int changeWindDir,
                          Integer directDecode, Integer paraData) {
        String decodeURL = URL_PREFIX + SERVICE_ONLINE_DECODE;
        DecodeRequest decodeRequest = new DecodeRequest();
        decodeRequest.setId(id);
        decodeRequest.setToken(token);
        decodeRequest.setIndexId(indexId);
        decodeRequest.setAcStatus(acStatus);
        decodeRequest.setKeyCode(keyCode);
        decodeRequest.setChangeWindDir(changeWindDir);
        decodeRequest.setDirectDecode(directDecode);
        decodeRequest.setParaData(paraData);

        String bodyJson = decodeRequest.toJson();

        if (null != bodyJson) {
            try {
                String response = postToServer(decodeURL, bodyJson);

                DecodeResponse decodeResponse = new Gson().fromJson(response, DecodeResponse.class);

                if (decodeResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                    return decodeResponse.getEntity();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Gets AC parameters with the specified parameters.
     *
     * @param indexId the index ID
     * @param mode the mode
     * @return the AC parameters
     */
    @SuppressWarnings("unused")
    public ACParameters getACParameters(int indexId, int mode) {
        String decodeURL = URL_PREFIX + SERVICE_GET_AC_PARAMETERS;
        GetACParametersRequest getACParametersRequest = new GetACParametersRequest();
        getACParametersRequest.setId(id);
        getACParametersRequest.setToken(token);
        getACParametersRequest.setIndexId(indexId);
        getACParametersRequest.setMode(mode);

        String bodyJson = getACParametersRequest.toJson();
        if (null != bodyJson) {
            try {
                String response = postToServer(decodeURL, bodyJson);

                ACParametersResponse acParametersResponse = new Gson().fromJson(response, ACParametersResponse.class);

                if (acParametersResponse.getStatus().getCode() == Constants.ERROR_CODE_SUCCESS) {
                    return acParametersResponse.getEntity();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}