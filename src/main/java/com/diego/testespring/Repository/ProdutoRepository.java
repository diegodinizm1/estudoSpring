package com.diego.testespring.Repository;

import com.diego.testespring.Entity.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
