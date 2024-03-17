package com.example.dockerinit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerInitApplication

fun main(args: Array<String>) {
	runApplication<DockerInitApplication>(*args)
}
