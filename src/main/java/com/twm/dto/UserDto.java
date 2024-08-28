package com.twm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class UserDto {

    @JsonProperty("id")
    private Long id;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @JsonProperty("email")
    private String email;

    @NotBlank(message = "Password is required")
    @JsonProperty("password")
    private String password;

    @NotBlank(message = "Provider is required")
    @Pattern(regexp = "native|twm", message = "Provider must be 'native' or 'twm'")
    @JsonProperty("provider")
    private String provider;

    @JsonProperty("auth_time")
    private LocalDateTime authTime;

    private String captcha;
}
