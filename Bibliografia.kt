class Bibliografia(
    nome:String,
    editora:String,
    numPaginas:Int,
    anoPublicacao:Int,
    autor:String,

):Livros(nome,editora,numPaginas,anoPublicacao,autor) {

    override fun categoriaLivros(): String {
        return "Bibliografia"
    }

    override fun precoLivros(): Double {
        return 35.0
    }


}
