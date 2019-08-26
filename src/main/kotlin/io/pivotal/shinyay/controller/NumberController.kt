package io.pivotal.shinyay.controller

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Flux

@Controller
class NumberController {

    @GetMapping(path = ["/numbers"], produces = [MediaType.APPLICATION_STREAM_JSON_VALUE])
    @ResponseBody
    fun getNumbers(): Flux<Int> = Flux.range(1, 100)
}