package com.diego.testespring.Entity;

import jakarta.validation.constraints.Min;

public class ItemVenda {
    private String produtoId;
    @Min(1)
    private int quantidade;
    private double valorUnitario;
}
