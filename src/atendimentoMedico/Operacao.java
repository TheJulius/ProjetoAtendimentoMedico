package atendimentoMedico;

import java.util.Date;

public class Operacao {
	
	private Date inicio;
	private Date fim;

	public Operacao(Date inicio, Date fim){
		setInicio(inicio);
		setFim(fim);
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		if(inicio != null)
			this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		if(fim != null)
			this.fim = fim;
	}
	
	public Date tempoTotal() {
		return null;
	}
	
	

}
