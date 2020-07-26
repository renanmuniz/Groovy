package aula

import classes.Cliente
import org.junit.Test

class Exercicios {

    @Test
    void exercicio1ponto2() {
        int a = 10
        println a.class
        println a.toString()
        println 12l.class.name

        println 11g.class.name

        BigDecimal valor = 200.50
        println valor
    }

    @Test
    void exercicio2() {
        Cliente c = new Cliente()
        c.setNome "Renan"
        c.setData new Date()
        println c.somar(10,10)
        println c.getNome() + " - " + c.getData()
    }

    @Test
    void exercicio3() {
        Cliente c = new Cliente()
        //println c.getNome() + c.getData()

        //c = new Cliente(nome: "Renan")
        //println c.getNome() + c.getData()

        //c = new Cliente(data: new Date())
        //println c.getNome() + c.getData()

        c = new Cliente(nome: "Renan", data: new Date())
        println c.getNome() + " - " +c.getData()
    }

    @Test
    void exercicio4() {
        Cliente c = new Cliente(nome: "Renan", data: new Date())
        println c.getNome()
        println c.getData()

        println c["nome"]
        println c["data"]

        c["nome"] = "Vinicius"

        println c["nome"]
        println c["data"]



    }

}
