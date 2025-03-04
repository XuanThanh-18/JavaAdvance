package com.samsung.firstspringboot.Models.ViewModels;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginUser {

    @NotBlank(message = "Email khong duoc de trong")
    private String email;

    @NotBlank(message = "Pasword khong duoc de trong")
    @Size(min = 6, message = "mat khau phai nhieu hon 6 ki tu")
    private String password;
}
