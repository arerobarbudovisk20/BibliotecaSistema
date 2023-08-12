class NaoFiccao(
    nome:String,
    editora:String,
    numPaginas:Int,
    anoPublicacao:Int,
    autor:String

):Livros(nome,editora,numPaginas,anoPublicacao,autor) {

    override fun categoriaLivros(): String {
        return "Não Ficção"
    }

    override fun precoLivros(): Double {
        return 45.67
    }

}
