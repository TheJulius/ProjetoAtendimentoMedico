package atendimentoMedico;

import java.util.Date;

public class Atestado extends Operacao {
	
	private int cid;
	
	public Atestado(Date inicio, Date fim) {
		super(inicio, fim);
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void emitirAtestado(Atendimento atendimento) { }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append("]");
		return builder.toString();
	}	
}
