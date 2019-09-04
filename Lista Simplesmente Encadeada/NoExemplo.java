package ifrn.ed.lineares.list;

import ifrn.dominio.Aluno;

public class NoExemplo {
	//Referencia um objeto da classe Aluno
	private Aluno informacao;
	
	//Referencia um objeto da classe NoExemplo, o próximo nó
	private NoExemplo proximoNo;
	
	public Aluno getInformacao() {
		return informacao;
	}
	public void setInformacao(Aluno informacao) {
		this.informacao = informacao;
	}
	public NoExemplo getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(NoExemplo proximoNo) {
		this.proximoNo = proximoNo;
	}
}
