package aula

class ExercicioThread {
    //@Test
    static main(args) {
        Thread.start{10.times{println "Rodando na outra thread[$it]"}}
    }
}
