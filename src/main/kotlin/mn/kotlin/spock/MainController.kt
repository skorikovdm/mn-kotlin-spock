package mn.kotlin.spock

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/main")
class MainController {

    @Get("/")
    fun index(): HttpStatus {
        return HttpStatus.OK
    }
}