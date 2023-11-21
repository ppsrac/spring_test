package com.example.demo.service

import com.example.demo.db.model.User

interface UserService {

    fun findById(id: Long): User

    fun findAllUsers(): List<User>

    fun save(user: User):User

}