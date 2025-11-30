## Usage

### 1. Register your APP
Register your APP on [IRext SDK console](http://site.irext.net), (You need to register an IRext account first).

While your APP is registered, you can see the APP key and APP secret in your APP list.

### 2. Import the SDK
Import the SDK package in your maven project by adding following lines to pom.xml and sync the maven project.
```xml
<dependency>
    <groupId>net.irext.webapi</groupId>
    <artifactId>irext-webapi</artifactId>
    <version>1.5.1</version>
</dependency>
```

### 3. Use the SDK

Import classes:
```java
import net.irext.webapi.model.*;    
import net.irext.webapi.WebAPIs;
import net.irext.webapi.WebAPICallbacks.*;
```
Get web API instance:
```java
WebAPIs webApis = WebAPIs.getInstance();
```
Sign in for access id and token:
```java
// App key and secret are fetched in step 1.
SignInCallback signInCallback = new SignInCallback() {
    @Override
    public void onSignInSuccess(UserApp userApp) {
        int id = userApp.getId();
        int token = userApp.getToken();
    }

    @Override
    public void onSignInFailed() {
    }

    @Override
    public void onSignInError() {
    }
};
webApis.signIn(context, signInCallback);
```
Fetch household appliances categories:
```java
ListCategoriesCallback listCategoriesCallback = new ListCategoriesCallback() {
    @Override
    public void onListCategoriesSuccess(List<Category> categories) {
    }

    @Override
    public void onListCategoriesFailed() {
    }

    @Override
    public void onListCategoriesError() {
    }
};
webApis.listCategories(listCategoriesCallback);
```
Fetch brands of a certain category other than STB:
```java
ListBrandsCallback listBrandsCallback = new ListBrandsCallback() {
    @Override
    public void onListBrandsSuccess(List<Brand> brands) {
    }

    @Override
    public void onListBrandsFailed() {
    }

    @Override
    public void onListBrandsError() {
    }
};
webApis.listBrands(category.getId(), listBrandsCallback);
```
Fetch cities (in China) for STB:
```java
ListProvincesCallback listProvincesCallback = new ListProvincesCallback() {
    @Override
    public void onListProvincesSuccess(List<City> provinces) {
    }

    @Override
    public void onListProvincesFailed() {
    }

    @Override
    public void onListProvincesError() {
    }
};

ListCitiesCallback listCitiesCallback = new ListCitiesCallback() {
    @Override
    public void onListCitiesSuccess(List<City> cities) {
    }

    @Override
    public void onListCitiesFailed() {
    }

    @Override
    public void onListCitiesError() {
    }
};
webApis.listProvinces(listProvincesCallback);
webApis.listCities(provincePrefix, listCitiesCallback);
```
Fetch STB operators of a certain city:
```java
ListOperatersCallback listOperatorCallback = new ListOperatersCallback() {

    @Override
    public void onListOperatorsSuccess(List<StbOperator> operators) {
    }

    @Override
    public void onListOperatorsFailed() {
    }

    @Override
    public void onListOperatorsError() {
    }
};
webApis.listOperators(cityCode, listOperatorCallback);
```
Fetch remote indexes of a certain brand or STB operator:
```java
ListIndexesCallback listIndexesCallback = new ListIndexesCallback() {

    @Override
    public void onListIndexesSuccess(List<RemoteIndex> indexes) {
    }

    @Override
    public void onListIndexesFailed() {
    }

    @Override
    public void onListIndexesError() {
    }
};
webApis.listRemoteIndexes(category.getId(), brand.getId(), city.getCode(), operator.getOperator_id(), listIndexesCallback);
```
Download IR binary for certain remote index:
```java
DownloadBinCallback downloadBinCallback = new DownloadBinCallback() {

    @Override
    public void onDownloadBinSuccess(InputStream inputStream) {
    }

    @Override
    public void onDownloadBinFailed() {
    }

    @Override
    public void onDownloadBinError() {
    }
};
webApis.downloadBin(remoteIndex.getRemote_map(), remoteIndex.getId(), downloadBinCallback);
```
