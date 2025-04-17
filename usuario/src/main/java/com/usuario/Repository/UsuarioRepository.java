package com.usuario.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
