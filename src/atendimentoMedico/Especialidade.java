package atendimentoMedico;

public class Especialidade {
	
	private String descricao;
	
	public Especialidade() {
		
	}
	
	public Especialidade(String especialidade) {
		setDescricao(especialidade);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao.length()!=0)
			this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
	
	

}
