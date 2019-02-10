package br.com.fiap.jogoskotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class JogoskotlinApplication

fun main(args: Array<String>) {
	SpringApplication.run(JogoskotlinApplication::class.java, *args)
}

