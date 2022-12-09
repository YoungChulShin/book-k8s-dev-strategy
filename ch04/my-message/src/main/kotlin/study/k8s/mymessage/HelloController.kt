package study.k8s.mymessage

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    @Value("\${my-message}") val myMessage: String,
) {

    @GetMapping("/hello")
    fun hello(): String {
        return myMessage
    }
}