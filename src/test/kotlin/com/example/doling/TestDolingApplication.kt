package com.example.doling

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestDolingApplication

fun main(args: Array<String>) {
    fromApplication<DolingApplication>().with(TestDolingApplication::class).run(*args)
}
