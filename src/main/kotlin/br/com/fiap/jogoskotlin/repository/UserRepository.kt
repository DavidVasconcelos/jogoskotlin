package br.com.fiap.jogoskotlin.repository

import br.com.fiap.jogoskotlin.model.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String> {

    fun findByEmail(email : String) : User
    fun findByEmailAndPassword(email : String, password: String) : User
}