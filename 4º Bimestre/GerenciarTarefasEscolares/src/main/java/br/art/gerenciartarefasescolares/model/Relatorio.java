package br.art.gerenciartarefasescolares.model;

import java.util.ArrayList;
import java.util.List;


public class Relatorio {
    private List<Tarefa> tarefas = new ArrayList<>();
    public void mostrarDesemp(int Qtd){
        for (Tarefa t : tarefas) {
            System.out.println("Tarefa: " + t.getTitulo() + "\tStatus: " + t.concluido(t.getStatus()));
            if(t.getStatus() == true)
                Qtd++;
        }
        System.out.println("Tarefas Concluidas: " + Qtd + "/" + tarefas.size());
    }
}
