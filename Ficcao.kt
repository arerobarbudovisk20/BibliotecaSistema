class Ficcao(
    nome:String,
    editora:String,
    numPaginas:Int,
    anoPublicacao:Int,
    autor:String

):Livros(nome,editora,numPaginas,anoPublicacao,autor) {

    override fun categoriaLivros():String{
        return "Ficção"
    }

    override fun precoLivros(): Double {
        return 28.56
    }
}
