package com.example.productserviceproxyapplication.Controller;

import com.example.productserviceproxyapplication.Dto.ProductDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Products")
public class ProductController {
    @GetMapping
    public String getAllProducts() {
        return "getAllProducts";
    }
    @GetMapping("/{id}")
    public String getProductById(@RequestBody long id) {
        return "getProductById " + "id  ";
    }
    @PostMapping()
    public String createProduct(@RequestBody ProductDto productDto) {
        return "createProduct";
    }
    @PutMapping("/{id}")
    public String updateProduct(@RequestBody long id) {
        return "updateProduct";
    }
    @DeleteMapping("/{id}")
    public String deleteProduct(@RequestBody long id) {
        return "deleteProduct";
    }
}
