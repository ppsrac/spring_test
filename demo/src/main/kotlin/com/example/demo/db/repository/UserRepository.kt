package com.example.demo.db.repository

import com.example.demo.db.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {

}