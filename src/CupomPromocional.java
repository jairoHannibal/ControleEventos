import java.time.LocalDateTime;


public class CupomPromocional {
	private int numero;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	
	public boolean validaCupom(){
		if(LocalDateTime.now().isAfter(dataInicio) ||LocalDateTime.now().isBefore(dataFim)){
			return true;
		}
		return false;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
