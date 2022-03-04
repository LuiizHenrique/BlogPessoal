package org.Generation.blogPessoal.repositary;

import java.util.Optional;

import org.Generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario , Long>        {
	public Optional<Usuario> findByUsuario(String usuario);
	
	
	
}
