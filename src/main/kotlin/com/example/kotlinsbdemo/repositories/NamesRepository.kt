package com.example.kotlinsbdemo.repositories

import com.example.kotlinsbdemo.beans.Names
import org.springframework.data.repository.CrudRepository

interface NamesRepository : CrudRepository<Names, String>