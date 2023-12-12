package org.example.Cliente.dao.ClienteDAO;

import org.example.Cliente.dto.ClienteDTO;
import org.example.Cliente.model.Cliente;
import org.example.utils.interfaces.Crudable;

public class ClienteDao implements Crudable<ClienteDTO, Cliente> {

    @Override
    public Cliente create(ClienteDTO obj) {
        Cliente cliente = new Cliente();
        cliente.setId(obj.getId());
        cliente.setNome(obj.getNome());
        return cliente;
    }

}
