package estudos.doichejunior.controletarefas.service;



import estudos.doichejunior.controletarefas.model.Usuario;

public interface UserService {


    Iterable<Usuario> FindAll();

    Usuario FindById(Long id);

    void create(Usuario userToCreate);

    void delete(Long id);
   
    void update(Long id, Usuario usuario);
    
}
