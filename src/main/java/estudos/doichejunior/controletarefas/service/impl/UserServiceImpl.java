package estudos.doichejunior.controletarefas.service.impl;


import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import estudos.doichejunior.controletarefas.model.Usuario;
import estudos.doichejunior.controletarefas.repository.UsuarioRepository;
import estudos.doichejunior.controletarefas.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UsuarioRepository usuarioRepository;

    
   
    public UserServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario FindById(Long id) {
          Optional<Usuario> user = usuarioRepository.findById(id);
      return user.orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario userToCreate) {
        if(usuarioRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User ID already exists.");
        }

         return usuarioRepository.save(userToCreate);
    }

    @Override
    public void delete(Long id) {
        usuarioRepository.deleteById(id);       
    }

    @Override
    public Iterable<Usuario> FindAll() {
       return usuarioRepository.findAll();
    }

   

    @Override
    public void update(Long id, Usuario usuario) {
        Optional<Usuario> clienteBd = usuarioRepository.findById(id);
		if (clienteBd.isPresent()) {
			usuarioRepository.save(usuario);
		}
      
    }
    
}
