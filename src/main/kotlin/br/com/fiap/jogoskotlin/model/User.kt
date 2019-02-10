package br.com.fiap.jogoskotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.NotNull


@Document
class User {

    @Id
    var id: String? = null
    @NotNull
    var email: String? = null
    @NotNull
    var password: String? = null
}