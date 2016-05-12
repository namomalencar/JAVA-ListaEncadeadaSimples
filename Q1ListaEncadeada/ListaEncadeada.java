package Q1ListaEncadeada;

public class ListaEncadeada implements InterfaceListaEncadeada {

	// Referência para a cabeça da lista
	private No cabeca = null;

	@Override
	public int insertInicio(int value) {
		No aux = new No(value);
		aux.setNext(cabeca);
		cabeca = aux;
		System.out.println("Valor " + value + " inserido com sucesso no inicio da lista");
		return 0;
	}

	@Override
	public void printIterativo() {
		No iterativo = new No();
		iterativo = cabeca;
		int i = 1;
		while (iterativo != null) {
			System.out.println("Iterativo - Elemento " + i + " da lista é: " + iterativo.getValue());
			iterativo = iterativo.getNext();
			i++;
		}

	}

	@Override
	public void printRecursivo() {
		printRecursivoInterno(1, cabeca);
	}

	private void printRecursivoInterno(int i, No no) {
		// TODO Auto-generated method stub
		if (no != null) {
			System.out.println("Recursivo - Elemento " + i + " da lista é: " + no.getValue());
			i++;
			printRecursivoInterno(i, no.getNext());
		}
	}

	@Override
	public void printReverso() {
		printReversoInterno(0, cabeca);
	}

	private void printReversoInterno(int i, No no) {
		if (no != null) {
			i++;
			printReversoInterno(i, no.getNext());
			System.out.println("Reverso Recursivo - Elemento " + i + " da lista é: " + no.getValue());
		}
	}

	@Override
	public boolean isEmpty() {
		if (cabeca == null) {
			System.out.println("Lista vazia");
			return true;
		} else {
			System.out.println("A lista não é vazia");
			return false;
		}
	}

	@Override
	public Object getElementOnList(int elemento) {
		// Recursivo, mais elegante
		return getElementOnListInterno(elemento, cabeca);
	}

	private Object getElementOnListInterno(int elemento, No no) {
		if (no.getValue() == elemento) {
			return no;
		} else {
			if (no.getNext() == null) {
				return null;
			} else {
				return getElementOnListInterno(elemento, no.getNext());
			}
		}
	}

	@Override
	public void removeElementOnListIterativo(int value) {
		No ant = null;
		No atual = cabeca;
		while (atual != null && atual.getValue() != value) {
			ant = atual;
			atual = atual.getNext();
		}
		if (atual == null) {
			System.out.println("Elemento com valor " + value + " não pode ser removido, pois não existe na lista");
		} else {
			// O elemento a ser removido é a cabeça então cabeça recebe o
			// proximo
			if (ant == null) {
				System.out.println("Elemento com valor " + atual.getValue() + " removido");
				cabeca = atual.getNext();
			} else {
				// Remove o elemento atual, set o anterior para o next do atual
				System.out.println("Elemento " + atual.getValue() + " removido");
				ant.setNext(atual.getNext());
			}
		}
	}

	@Override
	public void removeElementOnListRecursivo(int value) {
		cabeca = (No) removeElementOnListRecursivoInterno(cabeca, value);
	}

	private Object removeElementOnListRecursivoInterno(No no, int value) {
		if (!isEmpty()) {
			// Se o nó a ser retirado é o primeiro
			if (no.getValue() == value) {
				// No iterativo = new No();
				// iterativo = cabeca;
				no = no.getNext();
				System.out.println("Valor " + value + " retirado RECURSIVAMENTE com sucesso");
			} else {
				if (no.getNext() != null) {
					no.setNext((No) removeElementOnListRecursivoInterno(no.getNext(), value));
				} else {
					System.out.println("O elemento " + value + " não existe na lista");
				}
			}
		}
		return no;
	}

	@Override
	public void clear() {
		No iterativo = new No();
		iterativo = cabeca;
		while (iterativo != null) {
			cabeca = iterativo;
			iterativo = cabeca.getNext();
			cabeca = null;
		}
		System.out.println("Limpeza da lista efetuada com sucesso");
	}

	public No getCabeca() {
		return cabeca;
	}

	public void setCabeca(No cabeca) {
		this.cabeca = cabeca;
	}

}
