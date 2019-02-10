package br.com.fiap.jogoskotlin.controller

import br.com.fiap.jogoskotlin.model.User
import br.com.fiap.jogoskotlin.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@CrossOrigin
@RequestMapping(value = "/user")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @PostMapping(value = "/login")
    internal fun login(@RequestBody user: User): User {
        return userService.login(user)
    }

    @PostMapping
    fun salvar(@RequestBody user: User) : User {
       return userService.salvar(user)
    }
}