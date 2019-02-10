package br.com.fiap.jogoskotlin.service

import br.com.fiap.jogoskotlin.model.User
import br.com.fiap.jogoskotlin.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun salvar(user: User) : User {
        val aux = userRepository.findByEmail(user.email!!)
        if (aux != null) {
            user.id = aux.id
        }

        return userRepository.save(user)
    }

    @Throws(NoSuchElementException::class)
    fun login(user: User): User {
        val userSaved = userRepository.findByEmailAndPassword(user?.email.toString(), user?.password.toString())

        if(userSaved == null || userSaved?.password != user?.password.toString()) {
            throw NoSuchElementException("Usuário ou senha inválidos")
        }

        return userSaved
    }
}