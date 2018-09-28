package br.com.ufba.bolao.bolao.Repository;

import br.com.ufba.bolao.bolao.Model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
