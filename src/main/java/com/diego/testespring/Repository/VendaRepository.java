package com.diego.testespring.Repository;

import com.diego.testespring.Entity.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendaRepository extends MongoRepository<Venda, String> {
}
