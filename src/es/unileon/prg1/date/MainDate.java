package es.unileon.prg1.date;



public class MainDate{
	
	public static void main(String args[]){
	
	Date today = new Date ();
	Date another = new Date ();



//mensajes por pantalla de ayuda
	System.out.println(" ----- MENSAJE DE CONTROL ----- ");
	System.out.println("HOY     : "+today.getDay()+" / "+today.getMonth()+" / "+today.getYear()) ;
	System.out.println("OTRA:  "+another.getDay()+" / "+another.getMonth()+" / "+another.getYear()) ;
	System.out.println(" ");	

	System.out.println(" ----- PARTE 1 ----- ");	

	System.out.println(" Comparamos Hoy y Especial - ejemplos");
	
//Ejercicios DIAPOSITIVA-2
	System.out.println("Tienen el mismo DIA? - "+today.isSameDay(another));

	System.out.println("Tienen el mismo MES? - "+today.isSameMonth(another));
	
	System.out.println("Tienen el mismo AÑO? - "+today.isSameYear(another));
	
	System.out.println("Tienen la misma FECHA (completa)? - "+today.isSame(another));

	System.out.println(" ");


System.out.println(" ");
	
//Ejercicios DIAPOSITIVA-3 - SOBRE TODAY**

	System.out.println(" ----- PARTE 2 ----- ");


	System.out.println("Nombre del mes introducido - "+today.getMonthName());

	System.out.println("Checking Mes ... - "+today.checkDays(today.getMonth()));

System.out.println("Checking CURRENT_SEASON ... - "+today.getMonthName());

System.out.println(" ");


//Ejercicios DIAPOSITIVA-4 - SOBRE OTHER**
	System.out.println(" ----- PARTE 3 ----- ");

//-- HECHO EN CLASE
	System.out.println("Imprime fecha Especial - "+today.printDate());

	System.out.println("Numero de MESES hasta fin de año - "+today.getMonthsLeft());

	
System.out.println("Dias hasta siguiente Mes = "+today.getDaysLeftOfMonth());


	System.out.println("Meses con el numero de dias de "+today.getMonthName());
	
	System.out.println("Dias desde 1 de Enero = "+today.daysPast());
	
	System.out.println(" ");

//Ejercicios DIAPOSITIVA-5
//DIA DE LA SEMANA de una fecha
	System.out.println("DIA DE LA SEMANA PARA LA FECHA DADA = "+today.dayOfWeek());
	}
}
