package com.example.myproj.controllers;

import com.example.myproj.models.Product;
import com.example.myproj.repo.ProductRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/catalog/products")
public class CatalogController {
    private final CatalogService catalogService;
    @Autowired
    private ProductRepository productRepository;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/all")
    public List<Product> products(){
        return catalogService.products();
    }
//    public String catalog(Model model) {
//        Iterable<Product> products = productRepository.findAll();
//        model.addAttribute("products", products);
//        return "catalog";
//    }

/*    @PostMapping("/add")
    public BaseResponse catalogProductAdd(@RequestParam(value="key") String key, @RequestBody Product request) {
        final BaseResponse response;
        if (sharedKey.equalsIgnoreCase(key)) {
            String title = request.getTitle();
            String description = request.getDescription();
            String photo = request.getPhoto();
            String price = request.getPrice();
            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;
    }*/

    @PostMapping("/add")
    public void catalogProductAdd(@RequestBody Product product) {
        catalogService.add(product);
        System.out.println("Успешно добавлено!");
    }

    @DeleteMapping("/delete/product_{productID}")
    public void catalogProductDelete(@PathVariable("productID") Long id) {
        catalogService.delete(id);
    }

}
