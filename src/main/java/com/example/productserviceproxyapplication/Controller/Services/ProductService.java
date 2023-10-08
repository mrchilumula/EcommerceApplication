package com.example.productserviceproxyapplication.Controller.Services;

public class ProductService implements IProductService {
    @Override
    public String getAllProducts() {
        return "getAllProducts";
    }
    @Override
    public String getProductById(String id) {
        return "getProductById";
    }
    @Override
    public String createProduct(String productDto) {
        return "createProduct";
    }
    @Override
    public String updateProduct(String id) {
        return "updateProduct";
    }
@Override
public String deleteProduct(String id) {
        return "deleteProduct";
    }

}
