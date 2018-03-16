package controllers
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import java.util.concurrent.atomic.AtomicLong

data class Greeting(val id: Long, val content: String)

@Controller
class HomeController {
    val temporary = AtomicLong()

    @GetMapping("/i")
    fun greeting():String { return "info" }

    @GetMapping("/")
    fun test():String{ return "index" }
}
