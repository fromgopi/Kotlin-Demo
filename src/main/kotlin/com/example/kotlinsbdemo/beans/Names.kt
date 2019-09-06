package com.example.kotlinsbdemo.beans

import org.springframework.data.annotation.Id

data class Names(
        @Id val id: Int,
        val first_name: String,
        val last_name: String,
        val age: Int,
        val address: String,
        val city: String
)