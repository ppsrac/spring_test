package com.example.demo.api.controller

import com.example.demo.api.request.UserRequestDto
import com.example.demo.api.response.UserResponseDto
import com.example.demo.db.model.User
import com.example.demo.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class UserController(private val userService: UserService){

    @PostMapping
    fun createUser(@RequestBody userDto: UserRequestDto): ResponseEntity<UserResponseDto>{

        var user = User(
            name = userDto.name,
            email = userDto.email
        )

        user = userService.save(user)

        var response = UserResponseDto(
            name = user.name,
            email = user.email
        )
        return ResponseEntity.ok(response)
    }
}