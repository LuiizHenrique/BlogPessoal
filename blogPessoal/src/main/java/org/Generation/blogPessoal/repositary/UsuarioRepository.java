package org.Generation.blogPessoal.repositary;

import java.util.List;
import java.util.Optional;

import org.Generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario , Long> { 
public Usuario findByUsuarioContainingIgnoreCase(String usuario);
	public Optional<Usuario> findByUsuario(String usuario);
	
	public List <Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	
	
}
//package org.generation.blog.repository;
