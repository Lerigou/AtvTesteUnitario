package sample.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClienteTest {

    @Test
    public void testeCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Marcia");
        assertEquals("Marcia", cliente.getNome());
        cliente.setCpf("000.000.000-00");
        assertEquals("000.000.000-00", cliente.getCpf());
        cliente.setEmail("marcia@gmail.com");
        assertEquals("marcia@gmail.com", cliente.getEmail());
    }
}