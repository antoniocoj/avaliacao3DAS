package Cadastros;

public class DuracaoMinutos {

	private int minutosInicio;
	private int minutosTermino;
	
	public DuracaoMinutos(int minutosInicio, int minutosTermino){
		this.minutosInicio = minutosInicio;
		this.minutosTermino = minutosTermino;
	}
	
	public int compute() {
		int duracaoMinutos = 0;
		
		if (minutosTermino > minutosInicio) 
			duracaoMinutos  = duracaoViagemMinutos();
		else {
			duracaoMinutos = 60 + duracaoViagemMinutos();
			if (duracaoMinutos == 60)
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}

	private int duracaoViagemMinutos() {
		return minutosTermino - minutosInicio;
	}
}
