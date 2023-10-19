package estudos.doichejunior.controletarefas.service;



import estudos.doichejunior.controletarefas.model.Usuario;

public interface UserService {


    Iterable<Usuario> FindAll();

    Usuario FindById(Long id);

    Usuario create(Usuario userToCreate);

    void delete(Long id);
   
    void update(Long id, Usuario usuario);
    
}
