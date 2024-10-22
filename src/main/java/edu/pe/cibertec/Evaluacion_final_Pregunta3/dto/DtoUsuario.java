package edu.pe.cibertec.Evaluacion_final_Pregunta3.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoUsuario {
    private Long id;
    private String codigo;
    private String password;
    private String email;
    private String rol;
    private Boolean activo;
}