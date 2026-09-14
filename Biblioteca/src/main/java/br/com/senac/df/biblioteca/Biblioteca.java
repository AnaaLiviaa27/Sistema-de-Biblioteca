/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.biblioteca;

/**
 *
 * @author ana62216106
 */
public class Biblioteca {

    public static void main(String[] args) {
       Livro livro1 = new Livro("Biblioteca da meia noite", "Matt Haig","ficção fantástica", 2020,308,40);
       Livro livro2 = new Livro("Trono de Vidro 1","Sarah J. Maas","fantasia",2012,392,62.90);
       Livro livro3 = new Livro("Era uma vez um coração partido","Stephanie Garber","romantasia",2022,352,49.72);
       Livro livro4 = new Livro(" O Príncipe Cruel","Holly Black"," Fantasia Sombria",2018,322,45.43);
       Livro livro5 = new Livro("A mandibula de Caim","Edward Powys Mathers","mistério",1934,216,39.90);
       Livro livro6 = new Livro("As vantagens de ser invisível","Stephen Chbosky","literatura juvenil",1999,288,46);
       Livro livro7 = new Livro("Caraval","Stephanie Garber","fantasia",2017,352,35.90 );
       Livro livro8 = new Livro("O bosque das coisas perdidas","Shea Ernshaw","mistério/suspense",2022,368,64.90);
       Livro livro9 = new Livro("Diário de uma princesa desastrada","Maidy Lacerda e Renata de Souza","romance infanto-juvenil",2022,256,47.78);
       Livro livro10 = new Livro("O mistério da fábrica de livros","Pedro Bandeira","infantojuvenil",1988,96,45);
       Livro livro11 = new Livro("Powerless","Lauren Roberts","romantasia",2023,464,56.43);
       Livro livro12 = new Livro("O abismo de Celina","Ariani Castelo","fantasia sombria",2024,256,45.16);
       Livro livro13 = new Livro("Sonho e pesadelo","Marina Dutra","fantasia",2024,368,69.90);
       Livro livro14 = new Livro("A cidade dos fantasmas 1","Victoria Schwab","fantasia juvenil",2018,224,39.80);
       Livro livro15 = new Livro("Minha versão de você","Christina Lauren","romance",2017,315,33.45);   
       
       livro1.tempoLivro();
       livro2.tempoLivro();
       livro3.tempoLivro();
       livro4.tempoLivro();
       livro5.tempoLivro();
       livro6.tempoLivro();
       livro7.tempoLivro();
       livro8.tempoLivro();
       livro9.tempoLivro();
       livro10.tempoLivro();
       livro11.tempoLivro();
       livro12.tempoLivro();
       livro13.tempoLivro();
       livro14.tempoLivro();
       livro15.tempoLivro();
       
       livro1.imprimir();
       livro2.imprimir();
       livro3.imprimir();
       livro4.imprimir();
       livro5.imprimir();
       livro6.imprimir();
       livro7.imprimir();
       livro8.imprimir();
       livro9.imprimir();
       livro10.imprimir();
       livro11.imprimir();
       livro12.imprimir();
       livro13.imprimir();
       livro14.imprimir();
       livro15.imprimir();
        
       livro15.genero = "fantasia";
       System.out.println("Gênero do livro 15 alterado: " + livro15.genero);
       
       
    }
}
