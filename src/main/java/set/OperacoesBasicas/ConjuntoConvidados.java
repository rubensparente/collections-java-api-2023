package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado) {
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Exixtgem " + conjuntoConvidados.contarConvidados() + " convidado (s) dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2",1234);
        conjuntoConvidados.adicionarConvidado("Convidado 3",1236);
        conjuntoConvidados.adicionarConvidado("Convidado 4",1235);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Exixtgem " + conjuntoConvidados.contarConvidados() + " convidado (s) dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoCodigoConvite(1234);

        System.out.println("Exixtgem " + conjuntoConvidados.contarConvidados() + " convidado (s) dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
