package com.pedro.novaes.gereciamento_tarefas.repository;

import com.pedro.novaes.gereciamento_tarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, UUID> {
}
