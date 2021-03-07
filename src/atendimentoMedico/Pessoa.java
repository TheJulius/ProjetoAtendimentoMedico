package atendimentoMedico;

import java.util.Date;

public class Pessoa {
	
	private Date dataNascimento;
	private String nome;
	
	public int calcularIdade() {
		return 0;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		if(dataNascimento != null)
			this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() != 0)
			this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [dataNascimeno=");
		builder.append(dataNascimento);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
}
