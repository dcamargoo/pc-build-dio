package com.example.pc_build_dio.controller;

import com.example.pc_build_dio.entity.User;
import com.example.pc_build_dio.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// controller para receber as requisições dos usuários

@Tag(name = "Usuários e Builds", description = "Criar e gerenciar usuários e suas builds de PC")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @Operation(summary = "Criar usuário", description = "Cria um usuário e uma build de PC para o mesmo")
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @Operation(summary = "Listar usuários", description = "Lista todos os usuários cadastrados no sistema")
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @Operation(summary = "Buscar um usuário", description = "Busca um usuário específico cadastrado no sistema")
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @Operation(summary = "Deletar usuário", description = "Remove um usuário pelo ID")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}