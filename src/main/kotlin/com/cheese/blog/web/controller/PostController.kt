package com.cheese.blog.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/blog")
class PostController {

    @GetMapping()
    fun getPosts(): String {
        return "posts"
    }
}