package estudos.doichejunior.controletarefas.service.impl;

import java.util.Optional;

import estudos.doichejunior.controletarefas.model.Tarefa;
import estudos.doichejunior.controletarefas.repository.TarefaRepository;
import estudos.doichejunior.controletarefas.service.TarefaService;

public class TaferaServiceImpl implements TarefaService {

    private static TarefaRepository tarefaRepository;

    @Override
    public Iterable<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa findById(Long id) {
        Optional<Tarefa> taferfaBd = tarefaRepository.findById(id);
        return taferfaBd.get();
    }

    @Override
    public Tarefa create(Tarefa tarefa) {
        if (tarefaRepository.existsById(tarefa.getId())) {
            // exceptoin
        }
        return tarefaRepository.save(tarefa);
    }

    @Override
    public void update(Long id, Tarefa tarefa) {
        Optional<Tarefa> tarefaBd = tarefaRepository.findById(id);
        if (tarefaBd.isPresent()) {
            tarefaRepository.save(tarefa);
        }
    }

    @Override
    public void delete(Long id) {
        tarefaRepository.deleteById(id);
    }

}
