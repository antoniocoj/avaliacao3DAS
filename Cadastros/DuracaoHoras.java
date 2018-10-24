package Cadastros;

public class DuracaoHoras{

	private int horaInicio;
	private int minutosInicio;
	private int horaTermino;
	private int minutosTermino;

	
	public DuracaoHoras(int horaInicio, int minutosInicio, int horaTermino, int minutosTermino){

		this.horaInicio = horaInicio;
		this.minutosInicio = minutosInicio;
		this.horaTermino = horaTermino;
		this.minutosTermino = minutosTermino;

	}
	
	public int compute() {
		
		int duracaoHoras = 0;
		
		duracaoHoras = duracaoZero(duracaoHoras);
		duracaoHoras = duracaoRegistrada(duracaoHoras);
		duracaoHoras = duracaoNaoRegistrada(duracaoHoras);
		return duracaoHoras;
		
	}

	private int duracaoNaoRegistrada(int duracaoHoras) {
		if (horaTermino < horaInicio) 
			duracaoHoras = -1;
		return duracaoHoras;
	}

	private int duracaoRegistrada(int duracaoHoras) {
		if (horaTermino > horaInicio)
			if (horaTermino == horaInicio + 1) {  
				if (minutosTermino < minutosInicio)
					duracaoHoras = 0;
				else 
					duracaoHoras = 1;
			} else {
				if (duracaoViagemHoras() > 2)
					duracaoHoras = duracaoViagemHoras();
				else if (duracaoViagemHoras() == 2 &&
						 minutosTermino < minutosInicio)
					duracaoHoras = 1;
				else 
					duracaoHoras = 2;
			}
		return duracaoHoras;
	}

	private int duracaoViagemHoras() {
		return horaTermino - horaInicio;
	}

	private int duracaoZero(int duracaoHoras) {
		if (horaTermino == horaInicio)
			duracaoHoras = 0;
		return duracaoHoras;
	}
}
