package com.example.demo.api.request

import jakarta.validation.constraints.NotBlank

data class UserRequestDto (
    @field:NotBlank(message = "name cannot be blank")
    val name:String,

    @field:NotBlank(message = "email cannot be blank")
    val email:String
)