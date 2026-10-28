package pilha;

public class Pilha {
	
	int fundo;
	int topo;
	int [] pilha;
	int tamanho;
	
	public Pilha(int tamanho) {
		pilha = new int[tamanho];
		fundo = 0;
		topo = 0;
		this.tamanho = tamanho;
	}
	
	public void empilhar(int valor) {
		if(topo != pilha.length) {
			pilha[topo] = valor;
			topo = topo + 1;
		} else {
			System.out.println("Cheia");
		}
		
	}
	
	public void exibirElementos() {
		for(int i = 0; i < pilha.length; i++) {
			System.out.print("Pilha["+i+"] = "+pilha[i]+"\n");
		}
	}
	
	public void remover() {
		if(topo != 0) {
			pilha[topo - 1] = 0;
			topo = topo - 1;
		} else {
			System.out.print("Pilha vazia, não pode remover");
		}
	}

}
