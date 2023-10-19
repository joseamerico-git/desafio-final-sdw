package estudos.doichejunior.controletarefas.service.impl;



import java.util.Optional;

import estudos.doichejunior.controletarefas.model.Tarefa;
import estudos.doichejunior.controletarefas.repository.TarefaRepository;
import estudos.doichejunior.controletarefas.service.TarefaService;

public class TaferaServiceImpl implements TarefaService  {
    
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
    public void create(Tarefa tarefa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public void update(Long id, Tarefa tarefa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
