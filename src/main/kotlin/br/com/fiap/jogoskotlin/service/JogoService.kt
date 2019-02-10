package br.com.fiap.jogoskotlin.service

import br.com.fiap.jogoskotlin.model.Jogo
import br.com.fiap.jogoskotlin.repository.JogoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class JogoService {

    @Autowired
    lateinit var jogoRepository: JogoRepository

    fun salvar(jogo: Jogo) : Jogo{
        val aux = jogoRepository.findByTitulo(jogo.titulo!!)
        if(aux != null) {
            jogo.id = aux.id
        }

        return jogoRepository.save(jogo)
    }

    fun buscarTodos(): List<Jogo> {
        return jogoRepository.findAll()
    }

    fun buscar(titulo: String) : Jogo {
        return jogoRepository.findByTitulo(titulo)
    }
}