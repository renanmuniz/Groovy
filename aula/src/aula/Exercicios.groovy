package aula

import classes.Cliente
import classes.Produto
import org.junit.Test
import classes.Cliente as Xu
import static javax.swing.JFrame.EXIT_ON_CLOSE as ex

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

    @Test
    void exercicio5() {
        Produto p = new Produto("CD",50.0)
        println p.nome + " - " + p.valor

        p.nome = "SummerEletroHits"
        p.valor = 80.0
        println p.nome + " - " + p.valor
    }

    @Test
    void exercicio6() {
        Xu c = new Xu(nome: "Renan", data: new Date())
        println c.getNome() + " - " + c.getData()

        println ex

    }

}
