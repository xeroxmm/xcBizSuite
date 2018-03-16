package serverInit

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication(scanBasePackages = ["controllers","models","serverInit","services"])
@EnableAutoConfiguration
class SpringBootKotlinExampleApplication constructor() : CommandLineRunner {
    override fun run(vararg p0: String?) {
        val someLogicVar = false
        if (someLogicVar)
            throw Exception()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootKotlinExampleApplication::class.java, *args)
}