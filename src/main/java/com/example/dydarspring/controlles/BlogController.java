package com.example.dydarspring.controlles;


import com.example.dydarspring.models.Post;
import com.example.dydarspring.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Iterator;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();//вытянет полностью все записи из posts
        model.addAttribute("posts",posts);
        return "blog-main";
    }
}
