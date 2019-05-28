package mn.kotlin.spock

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mn.kotlin.spock")
                .mainClass(Application.javaClass)
                .start()
    }
}