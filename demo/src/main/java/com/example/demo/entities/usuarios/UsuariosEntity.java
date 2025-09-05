package com.example.demo.entities.usuarios;

import com.example.demo.entities.clientes.ClienteEntity;
import lombok.Data;

@Data
public class UsuariosEntity extends ClienteEntity  {






    @Override
    public String consultarOrdem() {
        return "consulta se a ordem esta aberta" +
                " ou fechado com seu nome e a requisição e o técnico que esta atendendo ela";
    }

    public void abrirChamado(){

    }

}
