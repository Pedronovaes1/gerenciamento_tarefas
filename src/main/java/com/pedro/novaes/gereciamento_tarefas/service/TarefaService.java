package com.pedro.novaes.gereciamento_tarefas.service;

import com.pedro.novaes.gereciamento_tarefas.entity.Tarefa;
import com.pedro.novaes.gereciamento_tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa criarTarefa(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTarefa(){
        return tarefaRepository.findAll();
    }

    public Tarefa buscarPorId(UUID id ){
        return tarefaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public Tarefa atualizarTarefa(UUID id, Tarefa novaTarefa){
        Tarefa tarefa = buscarPorId(id);
        tarefa.setDescricao(novaTarefa.getDescricao());
        tarefa.setTitulo(novaTarefa.getTitulo());
        return tarefaRepository.save(tarefa);
    }

    public void excluirTarefa(UUID id){
        tarefaRepository.deleteById(id);
    }

    public Tarefa marcarConcluida(UUID id){
        Tarefa tarefa = buscarPorId(id);
        tarefa.setConcluida(true);
        return tarefaRepository.save(tarefa);
    }
}
