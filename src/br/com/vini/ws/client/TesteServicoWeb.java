package br.com.vini.ws.client;

public class TesteServicoWeb {
	
	public static void main(String[] args) {
		
		EstoqueWS cliente = new EstoqueWsService().getEstoqueWsImplPort();
		
		Filtros filtros = new Filtros();
		Filtro filtro = new Filtro();
		filtro.setNome("Iphone");
		filtro.setTipo(TipoItem.CELULAR.toString());
		filtros.getFiltro().add(filtro);
		ListaItens todosOsItens = cliente.todosOsItens(filtros);
		
		todosOsItens.getItem().stream().forEach(i-> System.out.println(i.nome));
		
	}

}
