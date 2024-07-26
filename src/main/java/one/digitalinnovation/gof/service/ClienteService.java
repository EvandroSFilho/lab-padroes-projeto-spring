package one.digitalinnovation.gof.service;


import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padçao <b>Strategy</b> no domínio de client, com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interdace.
 * @author Evandro
 * */
public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id,Cliente cliente);
    void deletar(Long id);
}
