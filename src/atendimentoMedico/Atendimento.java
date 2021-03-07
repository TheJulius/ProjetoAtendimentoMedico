package atendimentoMedico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Atendimento extends Operacao{
	
	private int prioridade;
	private int estado;
	
	private List<Paciente> lpaciente = new ArrayList<Paciente>();
	
	public Atendimento(int prioridade, int estado, Date inicio, Date fim) {
		super(inicio, fim);
		setPrioridade(prioridade);
		setEstado(estado);
	}
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		if(prioridade != 0)
			this.prioridade = prioridade;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		if(estado != 0)
		this.estado = estado;
	}
	
	public boolean addPaciente(String paciente, Date data) {
		Paciente p = new Paciente(paciente, data);
		return lpaciente.add(p);
	}
	
	public void calcularPrioridade(boolean repostas[]) { }
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append("]");
		return builder.toString();
	}
	
	

}
