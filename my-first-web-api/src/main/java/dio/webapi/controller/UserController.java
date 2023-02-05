package dio.webapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.webapi.model.Usuario;
import dio.webapi.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers() {
       return repository.findAll();
    }
}
