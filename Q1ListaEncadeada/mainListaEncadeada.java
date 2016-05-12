package Q1ListaEncadeada;

public class mainListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();

		// Criar lista
		System.out.println("=====================================");
		// Verificar se vazio
		// Sim, deve está vazia
		lista.isEmpty();
		System.out.println("=====================================");
		// Inserções
		for (int i = 1; i <= 5; i++) {
			lista.insertInicio(i);
		}
		System.out.println("=====================================");
		// Print lista iterativamente
		lista.printIterativo();
		System.out.println("=====================================");
		// Print lista recursivamente
		lista.printRecursivo();
		System.out.println("=====================================");
		// Print lista recursivamente reverso, da cauda para a cabeça
		lista.printReverso();
		System.out.println("=====================================");
		// Verificar se está vazia
		lista.isEmpty();
		System.out.println("=====================================");
		// Verificar se tem determinado elemento, se retorna null não tem
		int busca = 4;
		No no = (No) lista.getElementOnList(busca);
		if (no != null) {
			System.out.println("Elemento " + no.getValue() + " encontrado");
		} else {
			System.out.println("Elemento " + busca + " NÃO encontrado");
		}
		System.out.println("=====================================");
		// Verificar se tem determinado elemento, se retorna null não tem
		busca = 999;
		no = (No) lista.getElementOnList(999);
		if (no != null) {
			System.out.println("Elemento" + no.getValue() + " encontrado");
		} else {
			System.out.println("Elemento " + busca + " NÃO encontrado");
		}
		System.out.println("=====================================");
		// Remover elemento iterativamente
		int remove = 2;
		lista.removeElementOnListIterativo(remove);
		System.out.println("=====================================");
		remove = 999;
		lista.removeElementOnListIterativo(remove);
		System.out.println("=====================================");
		// Print lista iterativamente
		lista.printIterativo();
		System.out.println("=====================================");
		// Remoção elemento recursiva
		remove = 4;
		lista.removeElementOnListRecursivo(remove);
		System.out.println("=====================================");
		lista.printIterativo();
		System.out.println("=====================================");
		// Remoção elemento recursiva
		remove = 999;
		lista.removeElementOnListRecursivo(remove);
		System.out.println("=====================================");
		lista.printIterativo();
		System.out.println("=====================================");
		lista.clear();
		lista.isEmpty();
		

	}
}
