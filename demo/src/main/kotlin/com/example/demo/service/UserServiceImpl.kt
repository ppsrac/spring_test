package com.example.demo.service

import com.example.demo.db.model.User
import com.example.demo.db.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) :UserService{
    override fun findById(id: Long): User {
        return userRepository.findById(id).orElseThrow()
    }

    override fun findAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun save(user: User): User {
        return userRepository.save(user)
    }
}