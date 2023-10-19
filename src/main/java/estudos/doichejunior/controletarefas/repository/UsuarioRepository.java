package estudos.doichejunior.controletarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudos.doichejunior.controletarefas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    boolean existsById(Long id);
}
