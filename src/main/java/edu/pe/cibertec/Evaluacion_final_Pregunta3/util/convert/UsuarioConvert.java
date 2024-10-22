package edu.pe.cibertec.Evaluacion_final_Pregunta3.util.convert;

import edu.pe.cibertec.Evaluacion_final_Pregunta3.dto.DtoUsuario;
import edu.pe.cibertec.Evaluacion_final_Pregunta3.model.Usuario;

public class UsuarioConvert {

    public static DtoUsuario toDto(Usuario usuario) {
        DtoUsuario dto = new DtoUsuario();
        dto.setId(usuario.getId());
        dto.setCodigo(usuario.getCodigo());
        dto.setPassword(usuario.getPassword());
        dto.setEmail(usuario.getEmail());
        dto.setRol(usuario.getRol());
        dto.setActivo(usuario.getActivo());
        return dto;
    }

    public static Usuario toEntity(DtoUsuario dto) {
        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());
        usuario.setCodigo(dto.getCodigo());
        usuario.setPassword(dto.getPassword());
        usuario.setEmail(dto.getEmail());
        usuario.setRol(dto.getRol());
        usuario.setActivo(dto.getActivo());
        return usuario;
    }
}

