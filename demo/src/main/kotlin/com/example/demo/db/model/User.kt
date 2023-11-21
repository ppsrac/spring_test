package com.example.demo.db.model

import jakarta.persistence.*

@Entity
@Table(name = "user")
class User(

    @Column(length = 100)
    val name: String,

    @Column(length = 100)
    val email: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
){
    init{
        if(!isValidEmail(email)){
            throw IllegalStateException("Invalid email")
        }
    }

    companion object{
        fun isValidEmail(email: String): Boolean{
            val emailRegex = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})$"
            return email.matches(emailRegex.toRegex())
        }
    }
}