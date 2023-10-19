package estudos.doichejunior.controletarefas.service;

import estudos.doichejunior.controletarefas.model.Tarefa;

public interface TarefaService {

    Iterable<Tarefa> findAll();

	Tarefa findById(Long id);

	void create(Tarefa produto);

	void update(Long id, Tarefa produto);

	void delete(Long id);

    
}
