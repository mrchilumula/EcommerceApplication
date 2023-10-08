package com.example.productserviceproxyapplication.Controller.Services;

public interface IProductService {
    String getAllProducts();

    String getProductById(String id);

    String createProduct(String productDto);

    String updateProduct(String id);

    String deleteProduct(String id);
}
