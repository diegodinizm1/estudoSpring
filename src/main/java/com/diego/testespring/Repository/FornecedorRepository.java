package com.diego.testespring.Repository;

import com.diego.testespring.Entity.Fornecedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FornecedorRepository extends MongoRepository<Fornecedor, String> {
}
