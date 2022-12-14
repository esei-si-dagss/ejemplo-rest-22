package es.uvigo.dagss.pedidos.servicios;

import java.util.List;
import java.util.Optional;

import es.uvigo.dagss.pedidos.entidades.Cliente;

public interface ClienteService {
	public Cliente crear(Cliente cliente);
	public Cliente modificar(Cliente cliente);
	public void eliminar(Cliente cliente);
	public Optional<Cliente> buscarPorDNI(String dni);
	public List<Cliente> buscarTodos();
	public List<Cliente> buscarPorNombre(String patron);
	public List<Cliente> buscarPorLocalidad(String localidad);
}
