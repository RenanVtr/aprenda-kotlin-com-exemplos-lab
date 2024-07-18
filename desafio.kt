/*A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais
 * voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. 
 * Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais. 
 * Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, 
 * definido pela capacidade de matricular um ou mais Alunos.*/

data class Usuario (val nome : String)
enum class Nivel (var nivel : String){BASICO("Basico"), INTERMEDIARIO("Intermediario"), AVANCADO("Avancado")}
data class Conteudo( var nome : String, var duracao : Int)
    
data class Formacao (var nome : String){

var nivel : Nivel = Nivel.AVANCADO
val conteudosEducacionais = mutableListOf<Conteudo>()
val inscritos = mutableListOf<Usuario>()

fun cadastrarConteudo( nome : String, duracao : Int){
    val conteudo = Conteudo(nome,duracao)
    conteudosEducacionais.add(conteudo)
}

fun matricular(usuario : Usuario){
    inscritos.add(usuario)
    println("Usuario ${usuario.nome} cadastrado com sucesso no curso $nome!\n")
	}

fun info(){
    println("==========DADOS DO CURSO==========")
    println("Nome da formação: $nome")
    println("Nivel: "+ nivel)
    println("Alunos Matriculados: " + inscritos.size)
    println("Conteudo Educacional:")
    println(conteudosEducacionais)
	}
}

fun main() {
 	
    var formacao = Formacao("Ingles")
	formacao.cadastrarConteudo("Introducao",10)
    formacao.cadastrarConteudo("Conteudo Basico",50)
    formacao.cadastrarConteudo("Conteudo Avancado",100)
    
    var usuario1 = Usuario("Renan")
    var usuario2 = Usuario("Daniela")
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    
    formacao.info()
    
    
}
