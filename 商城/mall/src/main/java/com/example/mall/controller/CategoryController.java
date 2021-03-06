package com.example.mall.controller;

import com.example.mall.bean.Product_brand;
import com.example.mall.bean.Product_category;
import com.example.mall.exception.ProductNotFoundException;
import com.example.mall.repository.BrandRepository;
import com.example.mall.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller // This means that this class is a Controller
@RequestMapping(path="/category") // This means URL's start with /demo (after Application path)
public class CategoryController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private CategoryRepository repository;

    //    @RequestParam Integer productId, @RequestParam String name, @RequestParam String description, @RequestParam String keywords, @RequestParam String icon, @RequestParam Integer categoryId, @RequestParam Integer brandId
//            , @RequestParam String email
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewProduct (@RequestBody Map<String,Object> params) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Product_category category = new Product_category();
        String categoryId = params.get("categoryId").toString();
        category.setCategoryId(categoryId);
        String name = params.get("name").toString();
        category.setName(name);
        String level = params.get("level").toString();
        category.setLevel(level);
        String icon = params.get("icon").toString();
        category.setIcon(icon);
        repository.save(category);
        return "Saved";
    }

    @GetMapping(path="/get/")
    public @ResponseBody Iterable<Product_category> getAllProducts() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public @ResponseBody Product_category getProduct(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PutMapping("/put/{id}")
    Product_category replaceProduct(@RequestBody Map<String,Object> params, @PathVariable Integer id) {

        return repository.findById(id)
                .map(category -> {
                    String categoryId = params.get("categoryId").toString();
                    category.setCategoryId(categoryId);
                    String name = params.get("name").toString();
                    category.setName(name);
                    String level = params.get("level").toString();
                    category.setLevel(level);
                    String icon = params.get("icon").toString();
                    category.setIcon(icon);
                    return repository.save(category);
                })
                .orElseGet(() -> {
                    Product_category category = new Product_category();
                    String categoryId = params.get("categoryId").toString();
                    category.setCategoryId(categoryId);
                    String name = params.get("name").toString();
                    category.setName(name);
                    String level = params.get("level").toString();
                    category.setLevel(level);
                    String icon = params.get("icon").toString();
                    category.setIcon(icon);
                    return repository.save(category);
                });
    }

    @DeleteMapping("/delete/{id}")
    void deleteEmployee(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}

