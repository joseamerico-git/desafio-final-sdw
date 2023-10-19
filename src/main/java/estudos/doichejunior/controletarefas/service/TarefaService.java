package estudos.doichejunior.controletarefas.service;

import estudos.doichejunior.controletarefas.model.Tarefa;

public interface TarefaService {

    Iterable<Tarefa> findAll();

	Tarefa findById(Long id);

	Tarefa create(Tarefa tarefa);

	void update(Long id, Tarefa tarefa);

	void delete(Long id);

    
}
