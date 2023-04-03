package app.persistence;

import java.util.Optional;

import app.modelo.entidade.Aluno;

public interface IAlunoRepository {

  Optional<Aluno> findByCpf(String cpf);

  // class EntityNotFoundException extends Exception {}
  
}
