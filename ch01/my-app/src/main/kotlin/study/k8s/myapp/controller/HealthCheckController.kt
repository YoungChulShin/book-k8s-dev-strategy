package study.k8s.myapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @GetMapping("/api/healthcheck")
    fun livenessCheck(): String {
        return "OK"
    }
}