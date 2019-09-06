package com.example.kotlinsbdemo.controllers

import com.example.kotlinsbdemo.beans.Names
import com.example.kotlinsbdemo.service.NameService
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NameController(private val nameService: NameService) {

    @GetMapping("/")
    fun getNames(): ResponseEntity<List<Names>>{
        val list = nameService.getAllNames()
        return ok(list)
    }
}