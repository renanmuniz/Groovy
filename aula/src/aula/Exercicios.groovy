package aula

import classes.Cantor
import classes.Cliente
import classes.Comida
import classes.Conexao
import classes.Funcionario
import classes.Funcionario2
import classes.Nota
import classes.Palco
import classes.Pedido
import classes.Produto
import classes.Relatorio
import classes.Somar
import classes.Teste
import classes.Venda
import org.junit.Test
import classes.Cliente as Xu

import java.time.LocalDate

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

    @Test
    void exercicio7() {
        Venda v = new Venda()
        println v.vender(100)
        println v.vender(100,20)

    }

    @Test
    void exercicio8() {
        Somar soma = new Somar()
        println soma.somar(10)
        println soma.somar(10,10)
        println soma.somar(10,10,10)
    }

    @Test
    void exercicio9() {
        Cliente c = null
        c?.nome="Renan"
        println c?.getNome()

        Cliente c2 = new Cliente()
        c2?.nome = "Renan"
        println c2?.getNome()
    }

    @Test
    void exercicio10() {
        List<String> colecao = new ArrayList<>()
        colecao.add("Fernando")
        colecao.add(null)
        colecao.add("Renan")
        colecao.add("Vinicius")
        println colecao

        colecao = colecao*.toUpperCase()
        println colecao
    }

    @Test
    void exercicio11() {
        URL url = new URL("http://www.google.com.br")
        println url
    }

    @Test
    void exercicio12() {
        String nome = null
        if(nome) {
            println true
        } else {
            println false
        }

        nome = "Renan"
        if(nome) {
            println true
        } else {
            println false
        }


        int valor = 0
        if(valor) {
            println true
        } else {
            println false
        }

        valor = 5
        if(valor) {
            println true
        } else {
            println false
        }

        List<String> colecao = new ArrayList<>()
        if(colecao) {
            println true
        } else {
            println false
        }

        colecao.add "Renan"
        if(colecao) {
            println true
        } else {
            println false
        }

    }

    @Test
    void exercicio13() {
        Nota n1 = new Nota(itens:2,valor:20)
        Nota n2 = new Nota(itens:2,valor:20)
        Nota n3 = n1 + n2
        println "itens: " + n3.itens
        println "valor: " + n3.valor
        n1++
        println "n1.itens: " + n1.itens
        println "n1.valor: " + n1.valor
    }

    @Test
    void exercicio13ponto2() {
        BigDecimal vl = 10
        println vl

        vl = vl + 1
        println vl

        vl++
        println vl

        vl = vl - 5
        println vl

        Date data = new Date()
        println data
        data++
        println data


    }

    @Test
    void exercicio14() {
        Funcionario f = new Funcionario(nome: "Renan", idade:30, salario:2095.0)
        println f
    }

    @Test
    void exercicio15() {
        Funcionario2 f1 = new Funcionario2(nome: "Renan", idade:30, salario:2095.0)
        Funcionario2 f2 = new Funcionario2(nome: "Renan", idade:30, salario:2095.0)
        println f1.equals(f2)
        println f2.equals(f1)
    }

    @Test
    void exercicio16() {
        Pedido p = new Pedido(cliente: "Renan", numero:10)
        println p.cliente + " - " + p.numero
        println p

        //p.cliente = "Fernando"

    }


    @Test
    void exercicio17() {
        Conexao.instance.valor = 10
        println Conexao.instance.valor
        Conexao con = Conexao.instance
        con.valor = 11
        println Conexao.instance.valor
    }

    @Test
    void exercicio18() {
        Comida comida = Comida.builder().fruta("maca").bebida("guarana").doce("chocolate").build()
        println comida.fruta
        println comida.bebida
        println comida.doce
    }

    @Test
    void exercicio19() {
        def objeto = "texto"
        println objeto.getClass()

        objeto = 10
        println objeto.getClass()

        objeto = 10.50
        println objeto.getClass()

        objeto = new Nota(itens: 2, valor: 20)
        println objeto.getClass()

        objeto = new Pedido(cliente: "Renan", numero: 10)
        println objeto.getClass()
    }

    @Test
    void exercicio20() {
        def teste = new Teste()
        def v1 = teste.metodo("Renan")
        println v1.getClass()
        println v1

        v1 = teste.metodo(10)
        println v1.getClass()
        println v1

        def data = new Date()
        println data
        v1 = teste.metodo data
        println v1.getClass()
        println v1


    }

    @Test
    void exercicio21() {
        def colecao = new ArrayList<String>()
        colecao.add("Renan")
        colecao.add("Vinicius")
        for (item in colecao) {
            println item.class.toString() + " = " + item
        }

        colecao = new ArrayList<Integer>()
        colecao.add(10)
        colecao.add(20)
        for (item in colecao) {
            println item.class.toString() + " = " + item
        }

    }

    @Test
    void exercicio22() {
        def metodo = {int v1, int v2 -> v1 + v2}
        println metodo(10,10)
        println metodo(2,3)
    }

    @Test
    void exercicio23() {
        def imprimir = {String v ->
            String temp = v.trim().replace("a","@")
            temp = temp.toUpperCase()
            temp
        }
        println imprimir("Renan")
    }

    @Test
    void exercicio24() {
        def funcao = {v1, v2 -> v1 + v2}
        def r1 = funcao(2,5)
        println r1.class
        println r1

        def r2 = funcao("Renan ","Muniz ")
        println r2.class
        println r2

        def r3 = funcao(LocalDate.now(),1)
        println r3.class
        println r3
    }

    @Test
    void exercicio25() {
        def limpeza = {texto -> texto.trim().replace("a","@").replace(" ","").capitalize()}
        def rel = new Relatorio()
        rel.emitir("r e n a n ", limpeza)
    }

    @Test
    void exercicio26() {
        def rel = new Relatorio()
        rel.emitir("RENAN") {v -> v + " DA SILVA"}
        rel.emitir("RENAN") {a -> a.replace("N", "#")}
    }

    @Test
    void exercicio27() {
        def rel = new Relatorio()
        rel.emitir("RENAN") {it + " DA SILVA"}
        rel.emitir("RENAN") {it.reverse()}
    }

    @Test
    void exercicio28() {
        Palco palco = new Palco()
        Cantor cantor = null

        def imp = {println "vou cantar"}
        cantor = imp
        cantor.cantar()

        palco.show(cantor)

        cantor = {println "agora vou chorar"}
        cantor.cantar()

        palco.show({println "closure cantando como se fosse cantor"})
    }

}
