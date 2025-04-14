package com.diego.testespring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "vendas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venda {
    @Id
    private long id;
    private LocalDateTime dataVenda;
    private Cliente cliente;
    private double valor;
    private List<ItemVenda> produtos;
}
