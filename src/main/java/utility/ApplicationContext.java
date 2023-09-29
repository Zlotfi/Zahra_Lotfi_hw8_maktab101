package utility;

import connection.JdbcConnection;
import repository.*;
import service.*;

import java.sql.Connection;

public class ApplicationContext {

    private static final Connection CONNECTION;
    private static final UserRepository USER_REPOSITORY;
    private static final UserService USER_SERVICE;
    private static final BrandRepository BRAND_REPOSITORY;
    private static final BrandService BRAND_SERVICE;
    private static final CategoryRepository CATEGORY_REPOSITORY;
    private static final CategoryService CATEGORY_SERVICE;
    private static final ProductRepository PRODUCT_REPOSITORY;
    private static final ProductService PRODUCT_SERVICE;
    private static final ShareHolderRepository SHARE_HOLDER_REPOSITORY;
    private static final ShareHolderService SHARE_HOLDER_SERVICE;

    static {
        CONNECTION = JdbcConnection.getConnection();
        USER_REPOSITORY = new UserRepository(CONNECTION);
        USER_SERVICE = new UserService(USER_REPOSITORY);
        BRAND_REPOSITORY = new BrandRepository(CONNECTION);
        BRAND_SERVICE = new BrandService(BRAND_REPOSITORY);
        CATEGORY_REPOSITORY = new CategoryRepository(CONNECTION);
        CATEGORY_SERVICE = new CategoryService(CATEGORY_REPOSITORY);
        PRODUCT_REPOSITORY = new ProductRepository(CONNECTION);
        PRODUCT_SERVICE = new ProductService(PRODUCT_REPOSITORY);
        SHARE_HOLDER_REPOSITORY = new ShareHolderRepository(CONNECTION);
        SHARE_HOLDER_SERVICE = new ShareHolderService(SHARE_HOLDER_REPOSITORY);
    }

    public static UserService getUserService(){
        return USER_SERVICE;
    }

    public static BrandService getBrandService(){
        return BRAND_SERVICE;
    }

    public static CategoryService getCategoryService(){
        return CATEGORY_SERVICE;
    }

    public static ProductService getProductService(){
        return PRODUCT_SERVICE;
    }

    public static ShareHolderService getShareHolderService(){
        return SHARE_HOLDER_SERVICE;
    }
}
