package com.diego.testespring.Entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVenda {
    private String produtoId;
    @Min(1)
    private int quantidade;
    @Positive
    private double valorUnitario;
}
