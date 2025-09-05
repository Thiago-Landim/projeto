package com.example.demo.entities.tecnicos;

import com.example.demo.entities.clientes.ClienteEntity;
import lombok.Data;

@Data
public class TecnicoEntity extends ClienteEntity {

    private boolean osFinalizada;
    private int osEmExecucao;



    @Override
    public String consultarOrdem() {
        return "nome e OS do cliente";
    }
    public void finalizarOS(){
        osFinalizada = true;
    }










}
