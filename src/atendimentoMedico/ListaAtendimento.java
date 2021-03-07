package atendimentoMedico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaAtendimento {
	
	private List<Atendimento> latendimento = new ArrayList<Atendimento>();
	
	public boolean addAtendimento(int prioridade, int estado, Date inicio, Date fim) {
		Atendimento a = new Atendimento(prioridade, estado, inicio, fim);
		return latendimento.add(a);
	}
	
	public List<Atendimento> mostrarLista() {
		return latendimento;
		
	}
	
	public void addLista() { }

}
