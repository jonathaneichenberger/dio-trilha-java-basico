import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasList;

    public ListaTarefas() {
        tarefasList = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        if(!tarefasList.isEmpty()) {
            for(Tarefa tarefa : tarefasList) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = tarefa;
                    break;
                }
            }
            tarefasList.remove(tarefaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }

        if(tarefaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if(!tarefasList.isEmpty()) {
            System.out.println(tarefasList);
        } else {
            System.out.println("Tarefa não encontrada!");
        }

    }

    public int contarTarefas() {
        return tarefasList.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasList.isEmpty()) {
            for (Tarefa tarefa : tarefasList) {
                if(tarefa.isTarefaConcluida()) {
                    tarefasConcluidas.add(tarefa);
                }
            }
            return tarefasConcluidas;
        } else {
            System.out.println("A lista está vazia!");
            return null;
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasList.isEmpty()) {
            for (Tarefa tarefa : tarefasList) {
                if(!tarefa.isTarefaConcluida()) {
                    tarefasPendentes.add(tarefa);
                }
            }
            return tarefasPendentes;
        } else {
            System.out.println("A lista está vazia!");
            return null;
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if(!tarefasList.isEmpty()) {
            for(Tarefa t: tarefasList) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setTarefaConcluida(true);
                    break;
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        if(!tarefasList.isEmpty()) {
            for(Tarefa t: tarefasList) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaPendente = t;
                }
            }
        }
        if(tarefaPendente != null) {
            if(tarefaPendente.isTarefaConcluida()) {
                tarefaPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if(!tarefasList.isEmpty()) {
            tarefasList.clear();
        } else {
            System.out.println("A lista já está vazia!");
        }
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");
        listaTarefas.adicionarTarefa("Tarefa 6");

        listaTarefas.exibirTarefas();
        System.out.println("Atualmente você tem " + listaTarefas.contarTarefas() + " tarefas");
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.marcarTarefaConcluida("Tarefa 5");
        listaTarefas.marcarTarefaConcluida("Tarefa 4");
        System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());
        listaTarefas.marcarTarefaConcluida("Tarefa 6");
        listaTarefas.marcarTarefaPendente("Tarefa 5");
        listaTarefas.obterTarefasConcluidas();
        System.out.println("Tarefas Concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas Pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();

        System.out.println("Atualmente você tem " + listaTarefas.contarTarefas() + " tarefas");





    }
}