package com.pedro.novaes.gereciamento_tarefas.controller;

import com.pedro.novaes.gereciamento_tarefas.entity.Tarefa;
import com.pedro.novaes.gereciamento_tarefas.service.TarefaService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa tarefa){
        Tarefa novaTarefa = tarefaService.criarTarefa(tarefa);
        return ResponseEntity.ok(novaTarefa);
    }

    @GetMapping
    public ResponseEntity<List<Tarefa>> listarTarefas(){
        return ResponseEntity.ok(tarefaService.listarTarefa());
    }

    // Buscar tarefa por ID
    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarTarefaPorId(@PathVariable UUID id){
        return ResponseEntity.ok(tarefaService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizarTarefa(@PathVariable UUID id, @RequestBody Tarefa tarefa){
        return ResponseEntity.ok(tarefaService.atualizarTarefa(id, tarefa));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarefa(@PathVariable UUID id){
        tarefaService.excluirTarefa(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/concluir")
    public ResponseEntity<Tarefa> marcarConcluida(@PathVariable UUID id){
        return ResponseEntity.ok(tarefaService.marcarConcluida(id));
    }
}
