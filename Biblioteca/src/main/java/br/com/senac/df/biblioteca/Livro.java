/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.biblioteca;

/**
 *
 * @author ana62216106
 */
public class Livro {
    String titulo;
    String autor;
    String genero;
    int anoPublicacao;
    int numeroPaginas;
    double preco;
    double tempoLivro;
    
    public Livro(String titulo, String autor,String genero,int anoPublicacao,int numeroPaginas, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.preco = preco;
            
   } 
    public void tempoLivro(){
       tempoLivro = 2026 - anoPublicacao; 
        
}
    public void imprimir(){
        System.out.println("Título:"  + titulo);
        System.out.println("Autor:"  + autor);
        System.out.println("Gênero:"  + genero);
        System.out.println("Ano de publicação:" + anoPublicacao);
        System.out.println("Número de páginas:" + numeroPaginas );
        System.out.println("Preço:" + preco );
        System.out.println("Há quantos anos foi publicado:" + tempoLivro);
        System.out.println("----------------------------------------------------" );
        
        

    }
}
