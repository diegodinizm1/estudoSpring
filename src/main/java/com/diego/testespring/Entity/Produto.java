package com.diego.testespring.Entity;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    @Id
    @Generated
    private int id;
    @NotBlank
    private String nome;
    private String categoria;
    private String fornecedor;
    @NotBlank
    private double precoVenda;
    private double precoCompra;
    @Min(1)
    private int quantidadeEstoque;
}
