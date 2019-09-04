package ifrn.dominio;

public class Aluno {

		private String nome;
		private String matricula;
		
		public Aluno(String nome, String matricula) {
			super();
			this.nome = nome;
			this.matricula = matricula;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getMatricula() {
			return matricula;
		}
		
		public String toString() {
			return "| Mat.: " + this.getMatricula() + " - Nome: " + this.getNome() + " |";
		}

		@Override
		public boolean equals(Object obj) {
			
			if(!(obj instanceof Aluno))
				return false;
			
			Aluno outroAluno = (Aluno) obj;			
			return this.matricula.equals(outroAluno.getMatricula());
		}
		
		
				
}
