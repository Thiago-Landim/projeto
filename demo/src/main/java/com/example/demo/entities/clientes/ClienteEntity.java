package com.example.demo.entities.clientes;

import lombok.Data;

@Data
public abstract class ClienteEntity {

    private String nome;
    private int matricula;
    private String ordemDeServico;




    public abstract String consultarOrdem();
}

