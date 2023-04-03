package app.persistence;

import java.util.List;

import app.modelo.entidade.Boleto;

public interface IBoletoRepository {

  List<Boleto> findBoletosByCpf(String cpf);
  
}
