package estudos.doichejunior.controletarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estudos.doichejunior.controletarefas.model.Usuario;
import estudos.doichejunior.controletarefas.service.UserService;

@RestController
@RequestMapping("usuarios")
public class UsuarioRestController {
    @Autowired
    private UserService userService;


	@GetMapping
	public ResponseEntity<Iterable<Usuario>> buscarTodos() {
		return ResponseEntity.ok(userService.FindAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(userService.FindById(id));

	}

	@PostMapping
	public ResponseEntity<Usuario> inserir(@RequestBody Usuario usuario) {
		userService.create(usuario);
		return ResponseEntity.ok(usuario);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
		userService.update(id, usuario);
		return ResponseEntity.ok(usuario);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		userService.delete(id);
		return ResponseEntity.ok().build();
	}

    
}
