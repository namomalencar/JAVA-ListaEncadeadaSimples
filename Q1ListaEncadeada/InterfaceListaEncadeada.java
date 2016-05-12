package Q1ListaEncadeada;

public interface InterfaceListaEncadeada {

	// Cria uma lista
	//Na criação do objeto
	
	// Insere elemento no inicio
	public int insertInicio(int value);
	
	//Imprimir os valores armazenados na lista;
	public void printIterativo();
	
	//Imprimir os valores armazenados na lista usando recursão;
	public void printRecursivo();
	
	//Imprimir os valores armazenados na lista em ordem reversa (da cauda para a cabeça da lista);
	public void printReverso();
	//Verificar se a lista está vazia (retorna 1 se vazia ou 0 se não vazia);
	public boolean isEmpty();
	
	//Recuperar/Buscar um determinado elemento da lista;
	public Object getElementOnList(int value);
	
	//Remover um determinado elemento da lista;
	public void removeElementOnListIterativo(int value);
	
	//Remover um determinado elemento da lista usando recursão;
	public void removeElementOnListRecursivo(int value);

	//Liberar a lista;  
	public void clear();
	

}
