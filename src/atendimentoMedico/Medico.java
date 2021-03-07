package atendimentoMedico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {
	
	public Medico(String nome, Date dataNascimento) {
		setDataNascimento(dataNascimento);
		setNome(nome);
	}

	List<Especialidade> lEspecialidade = new ArrayList<Especialidade>();
	
	public boolean addEspecialidade(Especialidade especialidade) {
		return lEspecialidade.add(especialidade);
	}

}
