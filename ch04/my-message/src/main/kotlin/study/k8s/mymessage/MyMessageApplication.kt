package study.k8s.mymessage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyMessageApplication

fun main(args: Array<String>) {
    runApplication<MyMessageApplication>(*args)
}
