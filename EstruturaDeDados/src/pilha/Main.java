package pilha;

public class Main {
	
	public static void main(String[] args) {
		Pilha minhaPilha = new Pilha(5);
		minhaPilha.empilhar(7);
		minhaPilha.empilhar(3);
		minhaPilha.empilhar(4);
		minhaPilha.empilhar(7);
		minhaPilha.empilhar(3);
		minhaPilha.empilhar(8);
		minhaPilha.remover();
		minhaPilha.remover();
		minhaPilha.remover();
		minhaPilha.remover();
		minhaPilha.remover();
		minhaPilha.remover();
		//minhaPilha.exibirElementos();
	}

}
