package classes

trait Lutador {
    String arma
    abstract void correr()
    void lutar() {
        print "Lutador " + arma + " lutando..."
    }
}