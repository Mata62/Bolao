package br.com.ufba.bolao.bolao.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    @NotNull(message = "O unuário não pode ser registrado sem um nome ")
    private String nome;

    @Column(name="cpf")
    @NotNull(message = "O usuário não pode ser cadastrado sem um cpf")
    private String cpf;

    @Column(name = "email")
    @NotNull(message = "O usuário não pode ser cadastrado sem e-mail")
    private String email;

    public Usuario() {
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
