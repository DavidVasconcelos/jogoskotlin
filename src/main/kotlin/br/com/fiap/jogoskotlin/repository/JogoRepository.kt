package br.com.fiap.jogoskotlin.repository

import br.com.fiap.jogoskotlin.model.Jogo
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import java.util.stream.Stream

interface JogoRepository : MongoRepository<Jogo, String> {

    @Query("{}")
    fun all() : Stream<Jogo>

    fun findByTitulo(titulo: String) : Jogo
}