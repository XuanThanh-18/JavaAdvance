package com.samsung.firstspringboot.Controller;

import com.samsung.firstspringboot.Models.ViewModels.LoginUser;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/")
    @ResponseBody
    public String login(@Valid @RequestBody LoginUser account, BindingResult result){
        if(result.hasErrors()){
            return result.getAllErrors().toString();
        }
        return "Login Username: " + account.getEmail() + " Password: " + account.getPassword();
    }

    @PostMapping("/register")
    @ResponseBody
    public ResponseEntity register(@RequestBody List<LoginUser> account){
        return ResponseEntity.ok(account);
    }

    @GetMapping("/info")
    @ResponseBody
    public String GetUserInfo(@RequestHeader("Authorization") String token){
        return token;
    }
}
