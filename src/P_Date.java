public class Date {

//TODOS LO COMENTARIOS VAN EN LA MAINCLASS MENOS LOS DEL FINAL 
//public static void main (String[] args){}
	//	private int variable 1=day;
	//	private int variable 2=month; 
	//	private int variable 3=year; 
	//	Date getRandomDate() 
	private int day;
	private int month;
	private int year;
	
	public int get.day;
		this.day;
	public int get.month;
		this.month;
	public int get.year;
		this.year;

public constructor 
//int day; 26
//int month; 10
//int year; 2022

public boolean isSameYear (Date another){
	if (this.year == another.getYear()){
		return true;
	}
	else {
		return false;
	}
} 

public boolean isSameMonth (Date another){
	if (this.month == another.getMonth()){
		return true;
	}
	else {
		return false;
	}
}

public boolean isSameDay (Date another){
	if (this.day == another.getDay()){
		return true;
	}
	else {
		return false;
	}
}

public boolean isSameDate (Date another){
	if (this.Date == another.getDate()){
		return true;
	}
	else {
		return false;
	}
}

public boolean isSameYearWOIf (Date another){
	return (this.year == another.getYear());

}

public boolean isSameMonthWOIf (Date another){
	return (this.month == another.getMonth());
	
}

public boolean isSameDayWOIf (Date another){
	return (this.day == another.getDay());
	
}

public boolean isSameDateWOIf (Date another){
	return (this.date == another.getDate());
	
}
public string getMonthName(){
	String monthName;
	switch (this.month){
		case 1:
			return ("Enero");
			break;
		case 2:
			return ("Febrero");
			break;
		case 3:
			return ("Marzo");
			break;
		case 4:
			return ("Abril");
			break;
		case 5:
			return ("Mayo");
			break;
		case 6:
			return ("Junio");
			break;
		case 7:
			return ("Julio");
			break;
		case 8:
			return ("Agosto");
			break;
		case 9:
			return ("Septiembre");
			break;
		case 10:
			return ("Octubre");
			break;
		case 11:
			return ("Noviembre");
			break;
		case 12:
			return ("Diciembre");
			break;
		default;
	}

public int CorrectDayOfCorrectMonth(){
	String monthName = int day, int month;
	switch(this.Month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10: 
		case 12:
			System.out.println("El mes tiene 31 días");
			if(this.day <= 31){
				return true
			} else {
				return false
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 días");
			if(this.month <= 30){
				return true
			} else {
				return false
			}
			break;
		case 2:
			System.out.println("El mes tiene 28 o 29 días");
			if(this.month <= 29){
				return true
			} else {
				return false
			}
			break;
		default;
	}
}

public String getSeasonName(){
	String monthName;
	switch(this.season){
		case 1:
		case 2:
		case 3:
			return ("invierno");
			break;
		case 4:
		case 5:
		case 6:
			return ("primavera");
			break;
		case 7:
		case 8:
		case 9:
			return ("verano");
			break;
		case 10:
		case 11:
		case 12: 
			return ("invierno");
			break; 
		default;
	}

}


}

public int getMonthsLeft(){
		return 12 - this.month
}

public String toString(){
	StringBuffer salida = new StringBuffer();
	cadena.append("El día es: " + this.day + "El mes es: " + this.month + "el año es:" + this.year);
	return salida.toString;
	
}

public int getMonthsWithSameDays(){
	for (int i=1, i<=12, i++){
		switch(i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10: 
			case 12:
				if (this.month == 31){
				System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
				}
			case 4:
			case 6:
			case 9:
			case 11:
				if (this.month == 30){
				System.out.println("Abril, Junio, Septiembre, Noviembre");
				}
			case 2:
				if (this.month == 28){
				System.out.println("Febrero");
				}
			default;
		}
	}
}

public int getNumDaysSinceStartYear(){
	int numDays=this.day
	for (int i=this.month -1; i>=1; i--){
		numDay=getNumDaysMonth(i);
	}
	
	return numDays;
}

public int getNumTriesToday(){
	int numTries =0;
	do {
		date=getRandomDate();
		numTries++;
	} while (!date.equals(this)); //This.equals
	return numTries
		date=getRandomDate();

}

public int getNumTriesToday(){
	int numTries =0;
	do{
		date=getRandomdate();
		numTries++;
		
	} while (!date.equals(this));
	return numTries;
		date = getRandomDate();
	}

public int daysOfTheWeek(){
	int resto=this.getNumDaysSinceStartYear()%7;
	switch (resto){
		case 0: 
			return("El mismo día");
			break; 
		case 1:
			return("Un día más");
			break;
		case 2:
			return("Dos días más");
			break;
		case 3:
			return("Tres días más");
			break;
		case 4:
			return("Cuatro días más");
			break;
		case 5: 
			return("Cinco días más");
			break;
		case 6:
			return("Seis días más");
			break;
		default;
	}
	
}

}
//En la practica final es necesario utilizar metodos que no sean muy complejos, porque sino va a ser muy dificil el poder "testear" la practica final. 
