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
			duracaoMinutos  = minutosTermino - minutosInicio;
		else {
			duracaoMinutos = 60 - minutosInicio + minutosTermino;
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}
}
