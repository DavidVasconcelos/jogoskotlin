package br.com.fiap.jogoskotlin.Exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.*

@ControllerAdvice
class ControllerAdviceRequestError : ResponseEntityExceptionHandler() {
    @ExceptionHandler(value = [(NoSuchElementException::class)])
    fun handleNoSuchElement(ex: NoSuchElementException,request: WebRequest): ResponseEntity<ErrorsDetails> {
        val errorDetails = ErrorsDetails(Date(),
                "Validation Failed",
                ex.message!!
        )
        return ResponseEntity(errorDetails, HttpStatus.NOT_FOUND)
    }
}

data class ErrorsDetails(val time: Date, val message: String, val details: String)