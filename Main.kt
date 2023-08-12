fun main() {
    val livro1 = Ficcao(
        nome = "O Último Reino",
        editora = "Record",
        numPaginas = 362,
        anoPublicacao = 2019,
        autor = "Bernard Cornwell"
    )


    println("Nome: ${livro1.nome}")
    println("Editora: ${livro1.editora}")
    println("Número de Páginas: ${livro1.numPaginas}")
    println("Ano de Publicação: ${livro1.anoPublicacao}")
    println("Autor: ${livro1.autor}")
    println("Categoria: ${livro1.categoriaLivros()}")
    println("Preço: ${livro1.precoLivros()}")


    println()
    println()

    val livro2 = Bibliografia(
        nome = "A Vida e Obra de Obama",
        editora = "Globo",
        numPaginas = 289,
        anoPublicacao = 2023,
        autor = "Barack Obama"
    )

    println("Nome: ${livro2.nome}")
    println("Editora: ${livro2.editora}")
    println("Número de Páginas: ${livro2.numPaginas}")
    println("Ano de Publicação: ${livro2.anoPublicacao}")
    println("Autor: ${livro2.autor}")
    println("Categoria: ${livro2.categoriaLivros()}")
    println("Preço: ${livro2.precoLivros()}")

    println()
    println()

    val livro3 = NaoFiccao(
        nome = "Uma Breve História da Humanidade",
        editora = "Companhia Das Letras",
        numPaginas = 472,
        anoPublicacao = 2020,
        autor = "Harari"
    )

    println("Nome: ${livro3.nome}")
    println("Editora: ${livro3.editora}")
    println("Número de Páginas: ${livro3.numPaginas}")
    println("Ano de Publicação: ${livro3.anoPublicacao}")
    println("Autor: ${livro3.autor}")
    println("Categoria: ${livro3.categoriaLivros()}")
    println("Preço: ${livro3.precoLivros()}")


}
