package com.ghostzone.user_service.app.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class UpdateUserDTO {
    @NotNull(message = "El username no deberia ser nulo")
    @NotEmpty(message = "El username no deberia estar vacio")
    private String username;
    @NotNull(message = "La contraseña no deberia ser nula")
    @NotEmpty(message = "La contraseña no deberia estar vacia")
    private String password;
    @NotNull(message = "La descripción no debería ser nula")
    @NotEmpty(message = "La descripción no debería estar vacia")
    private String description;
}
