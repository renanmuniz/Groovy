package classes

class Nota {
    Integer itens
    Double valor

    Nota plus(Nota nota) {
        println "plus"
        Nota novo = new Nota()
        novo.itens = this.itens + nota.itens
        novo.valor = this.valor + nota.valor
        novo  //return
    }

    Nota next() {
        println "next"
        this.itens += this.itens
        this.valor += this.valor
        this //return
    }
}
