package com.diego.testespring.Entity;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fornecedores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    @Id
    private int id;
    @NotBlank(message = "Nome não pode estar em branco!")
    private String nome;
    private String telefone;
}
