package com.example.mall.controller;

import com.example.mall.bean.Product;
import com.example.mall.bean.User;
import com.example.mall.exception.ProductNotFoundException;
import com.example.mall.repository.ProductRepository;
import com.example.mall.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller // This means that this class is a Controller
@RequestMapping(path="/user") // This means URL's start with /demo (after Application path)
public class UserController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository repository;

    //    @RequestParam Integer productId, @RequestParam String name, @RequestParam String description, @RequestParam String keywords, @RequestParam String icon, @RequestParam Integer categoryId, @RequestParam Integer brandId
//            , @RequestParam String email
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewProduct (@RequestBody Map<String,Object> params) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        User user = new User();
        String userId = params.get("userId").toString();
        user.setUserId(userId);
        String username = params.get("username").toString();
        user.setUsername(username);
        String password = params.get("password").toString();
        user.setPassword(password);
        String phone = params.get("phone").toString();
        user.setPhone(phone);
        String address = params.get("address").toString();
        user.setAddress(address);
        repository.save(user);
        return "Saved";
    }

    @GetMapping(path="/get/")
    public @ResponseBody Iterable<User> getAllProducts() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public @ResponseBody User getProduct(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PutMapping("/put/{id}")
    User replaceProduct(@RequestBody Map<String,Object> params, @PathVariable Integer id) {

        return repository.findById(id)
                .map(user -> {
                    String userId = params.get("userId").toString();
                    user.setUserId(userId);
                    String username = params.get("username").toString();
                    user.setUsername(username);
                    String password = params.get("password").toString();
                    user.setPassword(password);
                    String phone = params.get("phone").toString();
                    user.setPhone(phone);
                    String address = params.get("address").toString();
                    user.setAddress(address);
                    return repository.save(user);
                })
                .orElseGet(() -> {
                    User user = new User();
                    String userId = params.get("userId").toString();
                    user.setUserId(userId);
                    String username = params.get("username").toString();
                    user.setUsername(username);
                    String password = params.get("password").toString();
                    user.setPassword(password);
                    String phone = params.get("phone").toString();
                    user.setPhone(phone);
                    String address = params.get("address").toString();
                    user.setAddress(address);
                    return repository.save(user);
                });
    }

    @DeleteMapping("/delete/{id}")
    void deleteEmployee(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}

