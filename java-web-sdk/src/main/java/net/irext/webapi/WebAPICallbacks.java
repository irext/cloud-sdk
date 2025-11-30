package net.irext.webapi;

import net.irext.webapi.model.Brand;
import net.irext.webapi.model.Category;
import net.irext.webapi.model.City;
import net.irext.webapi.model.RemoteIndex;
import net.irext.webapi.model.StbOperator;
import net.irext.webapi.model.UserApp;

import java.io.InputStream;
import java.util.List;

/**
 * Filename:       WebAPICallbacks.java
 * Revised:        Date: 2017-07-01
 * Revision:       Revision: 1.0
 * <p>
 * Description:    HTTP Response Callbacks
 * <p>
 * Revision log:
 * 2017-07-01: created by strawmanbobi
 */
public class WebAPICallbacks {

    /**
     * Default constructor for WebAPICallbacks.
     */
    public WebAPICallbacks() {
    }

    /**
     * Callback interface for sign in operations.
     */
    public interface SignInCallback {
        /**
         * Called when sign in is successful.
         *
         * @param userApp the user application information
         */
        void onSignInSuccess(UserApp userApp);
        
        /**
         * Called when sign in fails.
         */
        void onSignInFailed();
        
        /**
         * Called when an error occurs during sign in.
         */
        void onSignInError();
    }

    /**
     * Callback interface for listing categories.
     */
    public interface ListCategoriesCallback  {
        /**
         * Called when listing categories is successful.
         *
         * @param categories the list of categories
         */
        void onListCategoriesSuccess(List<Category> categories);
        
        /**
         * Called when listing categories fails.
         */
        void onListCategoriesFailed();
        
        /**
         * Called when an error occurs during listing categories.
         */
        void onListCategoriesError();
    }

    /**
     * Callback interface for listing brands.
     */
    public interface ListBrandsCallback {
        /**
         * Called when listing brands is successful.
         *
         * @param brands the list of brands
         */
        void onListBrandsSuccess(List<Brand> brands);
        
        /**
         * Called when listing brands fails.
         */
        void onListBrandsFailed();
        
        /**
         * Called when an error occurs during listing brands.
         */
        void onListBrandsError();
    }

    /**
     * Callback interface for listing popular brands.
     */
    public interface ListPopularBrandsCallback {
        /**
         * Called when listing popular brands is successful.
         *
         * @param brands the list of popular brands
         */
        void onListPopularBrandsSuccess(List<Brand> brands);
        
        /**
         * Called when listing popular brands fails.
         */
        void onListPopularBrandsFailed();
        
        /**
         * Called when an error occurs during listing popular brands.
         */
        void onListPopularBrandsError();
    }

    /**
     * Callback interface for listing popular cities.
     */
    public interface ListPopularCitiesCallback {
        /**
         * Called when listing popular cities is successful.
         *
         * @param cities the list of popular cities
         */
        void onListPopularCitiesSuccess(List<City> cities);
        
        /**
         * Called when listing popular cities fails.
         */
        void onListPopularCitiesFailed();
        
        /**
         * Called when an error occurs during listing popular cities.
         */
        void onListPopularCitiesError();
    }

    /**
     * Callback interface for listing provinces.
     */
    public interface ListProvincesCallback {
        /**
         * Called when listing provinces is successful.
         *
         * @param provinces the list of provinces
         */
        void onListProvincesSuccess(List<City> provinces);
        
        /**
         * Called when listing provinces fails.
         */
        void onListProvincesFailed();
        
        /**
         * Called when an error occurs during listing provinces.
         */
        void onListProvincesError();
    }

    /**
     * Callback interface for listing cities.
     */
    public interface ListCitiesCallback {
        /**
         * Called when listing cities is successful.
         *
         * @param cities the list of cities
         */
        void onListCitiesSuccess(List<City> cities);
        
        /**
         * Called when listing cities fails.
         */
        void onListCitiesFailed();
        
        /**
         * Called when an error occurs during listing cities.
         */
        void onListCitiesError();
    }

    /**
     * Callback interface for listing areas.
     */
    public interface ListAreasCallback {
        /**
         * Called when listing areas is successful.
         *
         * @param cities the list of cities
         */
        void onListAreasSuccess(List<City> cities);
        
        /**
         * Called when listing areas fails.
         */
        void onListAreasFailed();
        
        /**
         * Called when an error occurs during listing areas.
         */
        void onListAreasError();
    }

    /**
     * Callback interface for listing operators.
     */
    public interface ListOperatersCallback {
        /**
         * Called when listing operators is successful.
         *
         * @param operators the list of operators
         */
        void onListOperatorsSuccess(List<StbOperator> operators);
        
        /**
         * Called when listing operators fails.
         */
        void onListOperatorsFailed();
        
        /**
         * Called when an error occurs during listing operators.
         */
        void onListOperatorsError();
    }

    /**
     * Callback interface for listing indexes.
     */
    public interface ListIndexesCallback {
        /**
         * Called when listing indexes is successful.
         *
         * @param indexes the list of remote indexes
         */
        void onListIndexesSuccess(List<RemoteIndex> indexes);
        
        /**
         * Called when listing indexes fails.
         */
        void onListIndexesFailed();
        
        /**
         * Called when an error occurs during listing indexes.
         */
        void onListIndexesError();
    }

    /**
     * Callback interface for downloading binary files.
     */
    public interface DownloadBinCallback {
        /**
         * Called when downloading binary is successful.
         *
         * @param inputStream the input stream of the downloaded binary
         */
        void onDownloadBinSuccess(InputStream inputStream);
        
        /**
         * Called when downloading binary fails.
         */
        void onDownloadBinFailed();
        
        /**
         * Called when an error occurs during downloading binary.
         */
        void onDownloadBinError();
    }
}