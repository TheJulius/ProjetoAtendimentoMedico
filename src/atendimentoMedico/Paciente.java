package atendimentoMedico;

import java.util.Date;

public class Paciente extends Pessoa{
	
	public Paciente(String nome, Date dataNascimento) {
		
		setDataNascimento(dataNascimento);
		setNome(nome);
		
	}

}
