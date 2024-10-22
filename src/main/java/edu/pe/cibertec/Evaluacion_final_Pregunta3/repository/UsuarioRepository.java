package edu.pe.cibertec.Evaluacion_final_Pregunta3.repository;

import edu.pe.cibertec.Evaluacion_final_Pregunta3.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCodigo(String codigo);
}