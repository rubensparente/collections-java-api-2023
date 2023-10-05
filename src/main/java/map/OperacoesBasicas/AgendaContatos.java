package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, Integer telefone) {
        this.agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos () {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatos("Rubens", 123456);
        agendaContatos.adicionarContatos("Rubens", 565656);
        agendaContatos.adicionarContatos("Rubens Parente", 111111111);
        agendaContatos.adicionarContatos("Rubens DIO", 654654654);
        agendaContatos.adicionarContatos("Raimunda Silva", 11111111);
        agendaContatos.adicionarContatos("Rubens", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Raimunda Silva");
        agendaContatos.exibirContatos();

    }
}
