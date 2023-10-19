package estudos.doichejunior.controletarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudos.doichejunior.controletarefas.model.Tarefa;



public interface TarefaRepository extends JpaRepository<Tarefa,Long> {
    boolean existsById(Long id); 
    
}
