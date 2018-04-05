package es.unileon.prg.date;


public class MainDate{
	
	public static void main(String args[]){

	
	Date today = new Date (31,3,2018);
//	Date other = new Date (6,2,1993);
	Date other = new Date (9,4,1994);


//mensajes por pantalla de ayuda
	System.out.println(" ----- MENSAJE DE CONTROL ----- ");
	System.out.println("HOY     : "+today.getDay()+" / "+today.getMonth()+" / "+today.getYear()) ;
	System.out.println("ESPECIAL:  "+other.getDay()+" / "+other.getMonth()+" / "+other.getYear()) ;
	System.out.println(" ");	

	System.out.println(" ----- PARTE 1 ----- ");	

	System.out.println(" Comparamos Hoy y Especial - ejemplos");
	
//Ejercicios DIAPOSITIVA-2
	System.out.println("Tienen el mismo DIA? - "+today.isSameDay(other.getDay()));

	System.out.println("Tienen el mismo MES? - "+today.isSameMonth(other.getMonth()));
	
	System.out.println("Tienen el mismo AÑO? - "+today.isSameYear(other.getYear()));
	
	System.out.println("Tienen la misma FECHA (completa)? - "+today.isSame(other.getDay(),other.getMonth(),other.getYear()));

	System.out.println(" ");

//SIN IF
	System.out.println("DAY SIN IF - "+today.isSameDayWithOutIf(other.getDay()));

	System.out.println("DAY SIN IF - "+today.isSameMonthWithOutIf(other.getMonth()));

	System.out.println("DAY SIN IF - "+today.isSameYearWithOutIf(other.getYear()));

	System.out.println("DAY SIN IF - "+today.isSameWithOutIf(other.getDay(),other.getMonth(),other.getYear()));

System.out.println(" ");
	
//Ejercicios DIAPOSITIVA-3 - SOBRE TODAY**

	System.out.println(" ----- PARTE 2 ----- ");

System.out.println("Imprime fecha para parte 2 - "+today.printDate(today.getDay(),today.getMonth(),today.getYear()));

	System.out.println("Nombre del mes introducido - "+today.getMonthName(today.getMonth()));

	System.out.println("Checking Mes ... - "+today.checkMonthDays(today.getMonth()));

System.out.println("Checking CURRENT_SEASON ... - "+today.seasonOfTheMonth(today.getMonth(),today.getDay()));

System.out.println(" ");




//Ejercicios DIAPOSITIVA-4 - SOBRE OTHER**
	System.out.println(" ----- PARTE 3 ----- ");

//-- HECHO EN CLASE
	System.out.println("Imprime fecha Especial - "+other.printDate(other.getDay(),other.getMonth(),other.getYear()));

	System.out.println("Numero de MESES hasta fin de año - "+other.monthsUntilYearEnd(other.getMonth()));

	
System.out.println("Dias hasta siguiente Mes = "+other.countDaysForNextMonth(other.getDay(),other.getMonth()));

	//Extra
	System.out.println("(EXTRA*) - Dias hasta siguiente Año = "+other.countDaysTillNewYear(other.getDay(),other.getMonth()));

	System.out.println("Meses con el numero de dias de "+other.getMonthName(other.getMonth())+" = " +other.compareMonth(other.getMonth()));
	
	System.out.println("Dias desde 1 de Enero = "+other.daysSinseFirstOfTheYear(other.getDay(),other.getMonth()));
	
	System.out.println(" ");



//Ejercicios DIAPOSITIVA-5
	System.out.println(" ----- PARTE 4 ----- ");

//No tenemos en cuenta el AÑO
	System.out.println("Random ATTEMPS for EQUAL date = "+other.attempsToEqualDate(other.getDay(),other.getMonth()));

System.out.println("(DO_WHILE EDITION)= "+other.attempsToEqualWithDoWhile(other.getDay(),other.getMonth()));

	//Extra cogemos 2 metodos anteriores y nos devuelve el numero de untentos de random hasta que son iguales

	System.out.println("(EXTRA)* -Randoms hasta que ambos metodos dan mismo numero de intentos= "+other.attempsToAttempsEqual(other.getDay(),other.getMonth()));


//DIA DE LA SEMANA de una fecha
	System.out.println("DIA DE LA SEMANA PARA LA FECHA DADA = "+other.weekDay(other.getDay(),other.getMonth()));

	}
}
