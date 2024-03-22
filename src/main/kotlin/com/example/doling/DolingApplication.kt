package com.example.doling

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DolingApplication

fun main(args: Array<String>) {
    runApplication<DolingApplication>(*args)
}
