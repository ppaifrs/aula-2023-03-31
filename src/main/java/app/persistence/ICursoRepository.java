package app.persistence;

import java.util.Optional;

import app.modelo.entidade.Curso;

public interface ICursoRepository {

  Optional<Curso> findByCodigo(Integer codigoCurso);
  
}
