package br.com.fiap.jogoskotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Jogo {

    @Id
    var id: String? = null
    var titulo: String? = null
    var plataforma: String? = null
}