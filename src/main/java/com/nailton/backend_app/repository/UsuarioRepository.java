package com.nailton.backend_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nailton.backend_app.model.UsuarioModel;



public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

}