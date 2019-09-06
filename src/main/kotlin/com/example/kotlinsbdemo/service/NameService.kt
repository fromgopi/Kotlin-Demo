package com.example.kotlinsbdemo.service

import com.example.kotlinsbdemo.beans.Names
import com.example.kotlinsbdemo.repositories.NamesRepository
import org.springframework.stereotype.Service

@Service
class NameService (private val namesRepository: NamesRepository){

    fun getAllNames(): List<Names> {
        return namesRepository.findAll().toList()
    }
}