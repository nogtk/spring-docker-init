package com.example.dockerinit

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/hello")
    fun hello() = mapOf("message" to "Hello, World!")
}