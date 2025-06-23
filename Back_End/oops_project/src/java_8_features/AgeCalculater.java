package java_8_features;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate birth=LocalDate.of(2004, 8,31);
		LocalDate current=LocalDate.now();
		
		Period age=Period.between(birth, current);
		System.out.println(age);
		System.out.println("Age : "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days");
		

	}

}
