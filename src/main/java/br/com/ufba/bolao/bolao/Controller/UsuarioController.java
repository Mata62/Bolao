package br.com.ufba.bolao.bolao.Controller;

import br.com.ufba.bolao.bolao.Model.Usuario;
import br.com.ufba.bolao.bolao.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(name = "bolao/")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @GetMapping("todos")
    public List<Usuario> findAll(){
        System.out.println("Procurando usuários");
        List<Usuario> usuarios = new ArrayList<>();
        repository.findAll().forEach(usuarios::add);
        return usuarios;
    }
}
