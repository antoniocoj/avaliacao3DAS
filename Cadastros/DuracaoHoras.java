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
		
		if (horaTermino == horaInicio)
			duracaoHoras = 0;
		if (horaTermino > horaInicio) //varias possibilidades... 
			if (horaTermino == horaInicio + 1) {  
				if (minutosTermino < minutosInicio)  //nao chegou a uma hora
					duracaoHoras = 0;
				else //durou pelo menos uma hora
					duracaoHoras = 1;
			} else { //possivelmente ultrapassou duas horas
				if (horaTermino - horaInicio > 2) //
					duracaoHoras = horaTermino - horaInicio;
				else if (horaTermino - horaInicio == 2 &&   //certamente menos de duas horas  
						 minutosTermino < minutosInicio)    //e mais de uma hora
					duracaoHoras = 1;
				else //duracao de duas horas, certamente
					duracaoHoras = 2;
					
			}
		if (horaTermino < horaInicio) 
			duracaoHoras = -1; //para casos em que a hora de termino nao foi registrada
		return duracaoHoras;
		
	}
}
