package classes

class Pessoa implements Animal,Lutador{
    @Override
    void pular() {
        println "pessoa " + nome + " pulando..."
    }

    @Override
    void correr() {
        println "pessoa " + nome + " correndo..."
    }
}
