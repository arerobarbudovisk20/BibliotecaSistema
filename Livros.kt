open class Livros(
    var nome:String,
    var editora:String,
    var numPaginas:Int,
    var anoPublicacao:Int,
    var autor:String

) {

    open fun categoriaLivros():String{
        return ""
    }

    open fun precoLivros():Double {
        return 0.0

    }
}
