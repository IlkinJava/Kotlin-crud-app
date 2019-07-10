package com.example.kotlin.crud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication

open class KotlinCrudApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinCrudApplication::class.java, *args)
}