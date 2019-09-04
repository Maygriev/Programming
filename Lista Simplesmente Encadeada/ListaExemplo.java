package ifrn.ed.lineares.list;

import ifrn.dominio.Aluno;

public class ListaExemplo {
	//Inicializa a lista com um nó vazio
	private NoExemplo inicioLista = null;
	
	//Método de inserção de novo elemento na lista
	public void inserirElemento(Aluno aluno) {
		//Cria um nó vazio
		NoExemplo novoElemento = new NoExemplo();
		
		//Insere o aluno no novo nó
		novoElemento.setInformacao(aluno);
		
		//Aponta o nó inicial como próximo nó
		novoElemento.setProximoNo(inicioLista);
		
		//Aponta o novo nó como inicio da lista
		inicioLista = novoElemento;
	}
	
	//Método de remoção de elemento, caso possua o aluno especificado
	public void removerElemento(Aluno aluno) {
		//Cria um nó auxiliar referenciando o primeiro nó
		NoExemplo auxiliar = inicioLista;
		
		//Cria um nó que apontará para o nó anterior ao verificado
		NoExemplo anterior = null;
		
		//Cria um nó que apontará para o nó seguinte ao verificado
		NoExemplo seguinte = null;
		
		//Cria um aluno que apontará para o aluno que está sendo verificado
		Aluno alunoTeste = null;
		
		//Loop que percorre a lista até encontrar o aluno ou chegar ao final dela
		while(auxiliar != null) {
			//Referencia o aluno que está dentro do nó verificado
			alunoTeste = auxiliar.getInformacao();
			
			//Referencia o próximo nó que será verificado
			seguinte = auxiliar.getProximoNo();
			
			//Condicionais que implementam a lógica
			//Verifica se o aluno verificado é igual ao aluno passado como parametro
			if(alunoTeste.equals(aluno)) {
				//Caso seja igual:
				//Verifica se o nó é o primeiro da lista
				if(anterior == null) {
					//Caso seja o primeiro, a lista apontará para o segundo
					inicioLista = inicioLista.getProximoNo();
				} else {
					//Caso não seja o primeiro:
					//Verifica se ele possui um próximo nó
					if(auxiliar.getProximoNo() == null) {
						//Caso não possua, o nó anterior passa a ser o último
						anterior.setProximoNo(null);
					} else {
						//Caso possua, o nó anterior apontará para ele
						anterior.setProximoNo(seguinte);
					}
				}
				
				//Encerra o loop
				auxiliar = null;
			} else {
				//Caso não seja igual, avança uma posição:
				
				//O anterior passa a ser o nó verificado
				anterior = auxiliar;
				//O nó verificado passa a ser o seguinte
				auxiliar = seguinte;
			}
		}
	}
	
	//Método de busca de elemento, retorna o aluno buscado, caso encontre
	public Aluno buscarAluno(Aluno aluno) {
		//Cria um nó auxiliar referenciando o primeiro nó
		NoExemplo auxiliar = inicioLista;
		
		//Cria um nó que apontará para o nó seguinte ao verificado
		NoExemplo seguinte = null;
		
		//Cria um aluno que apontará para o aluno que está sendo verificado
		Aluno alunoTeste = null;
		
		//Loop que percorre a lista até encontrar o aluno ou chegar ao final dela
		while(auxiliar != null) {
			//Referencia o aluno que está dentro do nó verificado
			alunoTeste = auxiliar.getInformacao();
			
			//Referencia o próximo nó que será verificado
			seguinte = auxiliar.getProximoNo();
			
			//Condicionais que implementam a lógica
			//Verifica se o aluno verificado é igual ao aluno passado como parametro
			if(alunoTeste.equals(aluno)) {
				//Caso seja igual, ele retorna a informação
				return alunoTeste;
			} else {
				//Caso não seja igual, avança uma posição
				//O nó verificado passa a ser o seguinte
				auxiliar = seguinte;				
			}
		}
		
		//Caso percorra o loop e não encontre o aluno, retorna nulo
		return null;
	}
	
	
	//Método utilizado para exibir a lista no console
	public String toString() {
		String texto = "";
		
		NoExemplo auxiliar = inicioLista;
		NoExemplo seguinte = null;
		Aluno aluno = null;
		
		while(auxiliar != null) {
			aluno = auxiliar.getInformacao();
			
			texto = texto + aluno.toString() + "\n";
			
			seguinte = auxiliar.getProximoNo();
			auxiliar = seguinte;
		}
		
		return texto;
	}
}
