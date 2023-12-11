package org.example.Cliente.translator;

import org.example.Cliente.dto.ClienteDTO;
import org.example.Cliente.model.Cliente;

public class ClienteTranslator {

    public static Cliente toClient(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNome(cliente.getNome());
        return cliente;
    }

}
