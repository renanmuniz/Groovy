package aula

import classes.Cantor
import classes.Cliente
import classes.Comida
import classes.Conexao
import classes.Fatura
import classes.Funcionario
import classes.Funcionario2
import classes.Nota
import classes.Palco
import classes.Pedido
import classes.Produto
import classes.Relatorio
import classes.Somar
import classes.Tela
import classes.Teste
import classes.Torcida
import classes.Venda
import groovy.sql.DataSet
import groovy.sql.Sql
import groovy.xml.MarkupBuilder
import org.junit.Test
import classes.Cliente as Xu
import static java.util.Calendar.*

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

    @Test
    void exercicio29() {
        Torcida t = null
        def corintiano = [
                pular : {println "Curintia pulando"},
                gritar : {p -> println "curintia - " + p}
        ] as Torcida
        t = corintiano
        t.pular()
        t.gritar("Vai ae")

        def porcada = [
                pular : {println "porco eooo"},
                gritar : {p -> println "porcooooo - " + p}
        ] as Torcida
        t = porcada
        t.pular()
        t.gritar("verdão")
    }

    void exercicio30(){
    //static main(arg) {
        def tela = new Tela()
        tela.setVisible(true)
    }

    @Test
    void exercicio31ponto1() {
        def fat = new Fatura()
        fat.metaClass.vender = {valor -> println("Venda no valor de: " + valor)}
        fat.vender(10.00)
    }

    @Test
    void exercicio31ponto2() {
        def f1 = new Fatura()
        //f1.faturar(10)

        Fatura.metaClass.faturar = {valor -> println "Faturar no valor = " + valor}
        def f2 = new Fatura()
        f2.faturar(10)
    }

    @Test
    void exercicio32ponto1() {
        def fat = new Fatura()
        //fat.nome = "Renan"

        fat.metaClass.nome = "Renan"
        println fat.nome
        fat.nome = "outra coisa"
        println fat.nome
    }

    @Test
    void exercicio32ponto2() {
        def f1 = new Fatura()
        //f1.cliente = "teste"

        Fatura.metaClass.cliente = ""
        def fat = new Fatura()
        fat.cliente = "Renan"
        println fat.cliente
    }

    @Test
    void exercicio32ponto3() {
        Fatura.metaClass.static.impressao = {println "metodo estatico ok"}
        Fatura.impressao()
        def f = new Fatura()
        f.impressao()
    }


    @Test
    void exercicioExpando32ponto5() {
        Expando cliente = new Expando()
        cliente.nome = "Renan"
        cliente.idade = 30
        cliente.impressao = {println "nome: $nome   idade: $idade"}
        cliente.impressao()

    }

    @Test
    void exercicio33() {
        def v1 = new BigDecimal("10.50")
        def v2 = 10.50
        println v2.getClass().name

        def v3 = v1 + v2
        println v3.getClass().name
        println v3

        v3 = v1 - v2
        println v3

        v3 = v1 * v2
        println v3
    }

    @Test
    void exercicio34() {
        def v1 = "Renan"
        def v2 = "Renan"
        println v1 == v2

        def v3 = v1 - "nan"
        println v3

        String texto = "renan"
        println texto.capitalize()
        println texto.findIndexOf {it=="n"}
        println texto.findIndexOf {it=="r"}

        String textoGrande = '''Quando o texto 
        for muito grande
        nao preicsa ficar mais 
        concatenando usando +'''
        println textoGrande

        def nome = "Renan"
        def idade = 30
        def salario = 2095.0
        def sql = "insert into cliente  (nome,idade,salario) values $nome, $idade, $salario"
        println sql

    }


    @Test
    void exercicio35() {
        def data1 = new Date()
        data1[YEAR] = 2020
        data1[MONTH] = 5
        data1[DATE] = 22
        println data1

        def data2 = new Date()
        data2[YEAR] = 2020
        data2[MONTH] = JUNE
        data2[DATE] = 23
        println data2

        if(data1>data2){
            println "data 1 maior que data 2"
        } else
        {
            println "data 1 menor que data 2"
        }

        Date data = new Date()
        println data
        data+=1
        println data
        data-=1
        println data
        data++
        println data
        data--
        println data

        println data.format("dd/MM/yyyy hh:mm:ss")

    }

    @Test
    void exercicio36() {
        10.times { println it}
        1.upto(10) { println it}
        5.downto(1) { println it}

    }

    @Test
    void exercicio37() {
        def x = new FileWriter("D:/1.txt").withWriter {e -> e.write("Renan Muniz")}
        def a = new File("D:/2.txt")
        a.write("outro")

        def b = new File("D:/3.txt")
        b.text = "Linha 1"
        5.times {b << "\nnova linha usando sobrecarga de operador.($it)"}

        def c = new File("D:/3.txt")
        println c.text

        println c.readLines()*.toUpperCase()

        new File("D:/3.txt").eachLine {linha -> println linha}

        a.delete()
        b.delete()
        c.delete()
        new File("D:/1.txt").delete()

        new File("C:/").eachFile { println it.name}
    }

    @Test
    void exercicio39() {
        Sql con = Sql.newInstance("jdbc:hsqldb:file:E:/hsql/base;shutdown=true", "sa", "1234")
        con.eachRow("select * from cliente"){p -> println p.id + " - " + p.nome + " - " + p.email}

        def lista = con.rows("select * from cliente")
        lista.each {cli -> println cli.email}

        con.executeInsert("insert into cliente (nome,email)values('groovy','groovy@email.com')")

        con.eachRow("select * from cliente"){p -> println p.id + " - " + p.nome + " - " + p.email}

        DataSet tabela = con.dataSet("cliente")
        tabela.add(nome: "g2", email: "g@g.com")

        con.eachRow("select * from cliente"){p -> println p.id + " - " + p.nome + " - " + p.email}
    }

    @Test
    void exercicio40() {
        def lista1 = [1,2,3,4]
        println lista1.getClass().name

        def lista2 = ["Renan","Evelyn","Ana"]
        println lista2.getClass().name

        def lista3 = new ArrayList<BigDecimal>()
        lista3.add(1.50)
        lista3 << 10.50
        lista3 << 20.50

        lista1.each { println it}
        lista2.each { println it}
        lista3.each { println it}

        def total = 0
        lista3.each {total += it}
        println total

        def clientes = []
        clientes << new Cliente(nome: "Xico", data: new Date())
        clientes << new Cliente(nome: "Luan", data: new Date())
        clientes << new Cliente(nome: "Luana", data: new Date())
        clientes << new Cliente(nome: "Fernando", data: new Date())
        clientes << new Cliente(nome: "Anny", data: new Date())

        def achou = clientes.find {c -> c.nome.contains("Luc")}
        println achou

        def achou2 = clientes.find {c -> c.nome.contains("L")}
        println achou2

        def encontrados = clientes.findAll {c -> c.nome.contains("L")}
        encontrados.each {c -> println c}

        clientes.sort {c1, c2 -> c1.nome.compareTo(c2.nome)}
        println clientes

        def set = clientes as Set
        println set.getClass().name
        set.each {c -> println c}
        def lista4 = set as List

        def listaImutavel = lista4.asImmutable()
        def setImutavel = set.asImmutable()

        def listaSyn = lista4.asSynchronized()
        def setSyn = set.asSynchronized()

        def func = clientes.collect {c -> new Funcionario(nome: c.nome)}
        println func

    }

    @Test
    void exercicio40ponto2() {
        def mapa =[:]
        println mapa.getClass().name

        mapa["pai"]="Renan"
        mapa["mae"]="Evelyn"
        println mapa

        println mapa["pai"]
        println mapa["filha"]

        mapa.remove("pai")
        println mapa

        def pessoas = ["jonas":10,"pedro":11,"rebeca":12]
        println pessoas

        pessoas.values().each { println it}

        pessoas.keySet().each { println it}
    }

    @Test
    void exercicio41() {
        def writer = new StringWriter()
        def html = new MarkupBuilder(writer)
        html.html {
            head {title "Minha pagina"}
            body(id: "main") {
                h1 "Titulo 1"
                p "linha de texto"
                p {strong "outro texto"}
                a href:"pagina.html","Clique aqui"
            }
        }
        println writer
    }

    @Test
    void exercicio43() {



    }
}
