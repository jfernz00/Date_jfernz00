package es.unileon.prg1.date;


public class Date {

	private int _day;
	private int _month;
	private int _year;
	
	public Date(){
		int day = 1;
		int month = 1;
		int year = 2017;
	}

	public Date(int day, int month, int year) throws DateException{
		StringBuffer message= new StringBuffer();
		
		if(day <= 0){
		message.append("Dia Erroneo "+day);
		}
		if(month<=0){
		message.append("Mes Erroneo "+month);
		}
		else {
			if ( month > 12 ){
				message.append("Error " + month);
		}
		else{
			if(day>daysOfMonth(month)){
			message.append("Combinacion Erronea "+day+" / "+month);
			}
		}
		}

	if(message.length() !=0){
		throw new DateException("ERROR FECHA");
	}
	else{
		_day = day;
		_month = month;
		_year = year;
	}
}

//CLONE
	public Date(Date another){
		_day = another.getDay();
		_month = another.getMonth();
		_year = another.getYear();
	}
	
//day
	public int getDay(){
	return _day;
	}

	public void setDay(int day) throws DateException{
		if(day<=0){
			throw new DateException("Dia Erroneo "+day);
		}
		else {
			if ( !this.checkDays(day) ){
				throw new DateException("Error de combinacion " + day + "/" + _month);
			}
			else {
			day = _day;
			}
		}
	}	


//month
	public int getMonth() {
		return _month;
	}

	public void setMonth(int month) throws DateException{
		if ( month <= 0 || month>12) {
			throw new DateException("Mes ERRONEO " + month);			
		} else {
			month = _month;
			}
		}
	

//year
	public int getYear() {
		return _year;
	}

	public void setYear(int year) throws DateException{
		if(year<0){
			throw new DateException("Año Erroneo");		
		}
		else{
		year = _year;
		}
	}

//TOMORROW
	public Date tomorrow(){
		Date tomorrow = null;
				
		int dia = _day;
		int mes = _month;
		int anno = _year;
		
		dia++;

		if ( dia > this.daysOfMonth(_month)) {
			dia = 1;
			mes++;
			if ( mes > 12 ) {
				mes = 1;
				anno++;
			}	
		}
		try{
			tomorrow = new Date(dia, mes, anno);
		}
		catch (DateException e){
			System.err.println("ERROR TOMORROW: " + e.getMessage());
		}

		return tomorrow;
	}


	public boolean isSameDay(Date another){
		if ( _day == another.getDay()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isSameMonth(Date another){
		if (_month == another.getMonth()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSameYear(Date another){
		return _year == another.getYear();
	}

	public boolean isSame (Date another){
		return this.isSameDay(another) && this.isSameMonth(another) && this.isSameYear(another);
	}


//----------------------- SIN IF--------------------

	public boolean isSameDayWithOutIf(int day){
	return (_day==day);
	}

	public boolean isSameMonthWithOutIf(int month){
	return (_month==month);
	}
	
	public boolean isSameYearWithOutIf(int year){
	return (_year==year);
	}

	public boolean isSameWithOutIf(int day, int month, int year){
	return (((_month==month)&&(_day==day))&&(_year==year));
	}

//-------------------------------------------------------



//MONTH_NAME
	public String getMonthName(){
		String cadMonth=null;
		switch(_month){
			case 1: cadMonth="January";
				break;
			case 2: cadMonth="February";
				break;
			case 3: cadMonth="March";
				break;
			case 4: cadMonth="April";
				break;
			case 5: cadMonth="May";
				break;
			case 6: cadMonth="June";
				break;
			case 7: cadMonth="July";
				break;
			case 8: cadMonth="August";
				break;
			case 9: cadMonth="September";
				break;
			case 10: cadMonth="October";
				break;
			case 11: cadMonth="November";
				break;
			case 12: cadMonth="Dicember";
				break;
		}
	return cadMonth;
	}

	
//SEASON
	public String getSeasonName(){
		String season=null;
		switch(_month){
			case 1: //next
			case 2: //next
			case 3: 
				if (_day<=21){
season="Winter";
				}
				else{
season="Spring";
				}
				break;
			case 4: //next
			case 5: //next
			case 6: 
				if (_day<=21){
season="Spring";
				}
				else{
season="Summer";
				}
				break;
			case 7: //next
			case 8: //next
			case 9: if (_day<=23){season="Summer";
				}
				else{season="Autumn";
				}
				break;
			case 10: //next
			case 11: //next
			case 12:if (_day<=21){
season="Autumn";
				}
				else{
season="Winter";
				}
				break;
			}
	return season;
	}

//MOTHS_UNTIL_YEAR_ENDS
	public int getMonthsLeft(){
		Date x = new Date (this);
		int left=0;
	
			for(int i=_month; i<=12;i++){
				left++;
			}
	
	return left;
	}
//PRINT_DATE
	public String printDate(){
		String printDate=_day+" / "+_month+" / "+_year;
	return printDate;
	}

//CHECK
	public boolean checkDays(int day){
		return ( ( day > 0 ) && (day <= this.daysOfMonth(_month) ) );
	}

//Cuenta numero dias del mes (ayuda)

	public int daysOfMonth(){
		return this.daysOfMonth(_month);	
	}

	private int daysOfMonth (int month){
		int numDay=0;
			switch(month){
				//28				
				case 2:  numDay=28;
					break;
				//30
				case 4://next
				case 6://next
				case 9://next
				case 11:numDay=30;
					break;
				//31
				case 1://next
				case 3://next
				case 5://next
				case 7://next
				case 8://next
				case 10://next
				case 12:numDay=31;
					break;
				default:numDay=-1;
					break;
			}
		return numDay;
		}

	private boolean correctDay(int day){
		return ( ( day > 0 ) && (day <= this.daysOfMonth(_month) ) );
	}

//DAYS_TILL_MONTH_END

	public int getDaysLeftOfMonth(){
		Date y = new Date(this);
		int lft=0;
		int b=y.daysOfMonth();
		
			for(int i=y.getDay();i<=b ; i++){
			lft++;
			}
	return lft;
	}


//COMPARA MESES CON MISMOS DIAS
	public String getMonthsSameDays(){
		Date z = new Date();
		StringBuffer equalMonths = new StringBuffer();
		try{
			for ( int i = 1; i <= 12; i++) {
				z.setMonth(i);
				if ( z.daysOfMonth() == this.daysOfMonth() ) {
					equalMonths.append(z.getMonthName() + " ");
				}
			}
		} catch (DateException e){
			System.err.println("MESES MISMO NUMERO DIAS: " + e.getMessage());
		}
		return equalMonths.toString();
	}

//DIAS DESDE PRIMERO DE AÑO

	public int daysPast(){
		int total=0;
		try{
			Date z = new Date(1,1,_year);
			for (int i=1; i < _month; i++ ) {
				total += z.daysOfMonth();
				z.setMonth(i + 1);
				
			}
			total=total+_day-1;
		}
		catch (DateException e){
			System.err.println("Dias Pasados " + e.getMessage());
		}
	return total;
}

//DIA DE LA SEMANA PARA UNA FECHA DADA

	public String dayOfWeek() {
		String name = "";
	
		switch (_day) {
		case 1: 
			name = "Monday";
			break;
		case 2: 
			name = "Tuesday";
			break;
		case 3: 
			name = "Wednesday";
			break;
		case 4: 
			name = "Thursday";
			break;
		case 5: 
			name = "Friday";
			break;
		case 6: 
			name = "Saturday";
			break;
		case 7: 
			name = "Sunday";
			break;
		default:
			name = "FAIL";
		}
	
		return name;
	}

	
	
	public String toString(){
		
		return _day + "/" + _month + "/" + _year;
	}
}

