package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogaLivros {

    //Atributo
    private List<Livro> livroList;

    public CatalogaLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionar(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoIncial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoIncial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogaLivros catalogaLivros = new CatalogaLivros();
        catalogaLivros.adicionar("Livro 1", "Autor 1", 2020);
        catalogaLivros.adicionar("Livro 1", "Autor 2", 2021);
        catalogaLivros.adicionar("Livro 2", "Autor 2", 2022);
        catalogaLivros.adicionar("Livro 3", "Autor 3", 2023);
        catalogaLivros.adicionar("Livro 4", "Autor 4", 1994);

        System.out.println(catalogaLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogaLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogaLivros.pesquisarPorTitulo("Livro 1"));
    }
}
