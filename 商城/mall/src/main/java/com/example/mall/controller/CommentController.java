package com.example.mall.controller;

import com.example.mall.bean.Comment;
import com.example.mall.exception.ProductNotFoundException;
import com.example.mall.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller // This means that this class is a Controller
@RequestMapping(path="/comment") // This means URL's start with /demo (after Application path)
public class CommentController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private CommentRepository repository;

    //    @RequestParam Integer productId, @RequestParam String name, @RequestParam String description, @RequestParam String keywords, @RequestParam String icon, @RequestParam Integer categoryId, @RequestParam Integer brandId
//            , @RequestParam String email
    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewProduct (@RequestBody Map<String,Object> params) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Comment comment = new Comment();
        String commentId = params.get("commentId").toString();
        comment.setCommentId(commentId);
        String productId = params.get("productId").toString();
        comment.setProductId(productId);
        String userId = params.get("userId").toString();
        comment.setUserId(userId);
        String content = params.get("content").toString();
        comment.setContent(content);
        String createTime = params.get("createTime").toString();
        comment.setCreateTime(createTime);
        repository.save(comment);
        return "Saved";
    }

    @GetMapping(path="/get/")
    public @ResponseBody Iterable<Comment> getAllProducts() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public @ResponseBody Comment getProduct(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    @PutMapping("/put/{id}")
    Comment replaceProduct(@RequestBody Map<String,Object> params, @PathVariable Integer id) {

        return repository.findById(id)
                .map(comment -> {
                    String commentId = params.get("commentId").toString();
                    comment.setCommentId(commentId);
                    String productId = params.get("productId").toString();
                    comment.setProductId(productId);
                    String userId = params.get("userId").toString();
                    comment.setUserId(userId);
                    String content = params.get("content").toString();
                    comment.setContent(content);
                    String createTime = params.get("createTime").toString();
                    comment.setCreateTime(createTime);
                    return repository.save(comment);
                })
                .orElseGet(() -> {
                    Comment comment = new Comment();
                    String commentId = params.get("commentId").toString();
                    comment.setCommentId(commentId);
                    String productId = params.get("productId").toString();
                    comment.setProductId(productId);
                    String userId = params.get("userId").toString();
                    comment.setUserId(userId);
                    String content = params.get("content").toString();
                    comment.setContent(content);
                    String createTime = params.get("createTime").toString();
                    comment.setCreateTime(createTime);
                    return repository.save(comment);
                });
    }

    @DeleteMapping("/delete/{id}")
    void deleteEmployee(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}

