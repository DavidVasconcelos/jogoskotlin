package br.com.fiap.jogoskotlin.controller

import br.com.fiap.jogoskotlin.model.Jogo
import br.com.fiap.jogoskotlin.service.JogoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = "/jogo")
class JogoController {

    @Autowired
    lateinit var jogoService: JogoService

    @GetMapping
    internal fun buscarTodos(): List<Jogo> {
        return jogoService.buscarTodos()
    }

    @GetMapping(value = "/titulo/{titulo}")
    internal fun buscar(@PathVariable(value = "titulo") titulo: String): Jogo {
        return jogoService.buscar(titulo)
    }

    @PostMapping
    fun save(@RequestBody jogo: Jogo): Jogo {
        return jogoService.salvar(jogo)
    }
}