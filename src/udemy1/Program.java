package udemy1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

import javax.swing.plaf.synth.SynthSpinnerUI;

import company.Employe;
import gometry.Triangle;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Date newDate = Date.from(Instant.parse("2018-06-05T15:42:07Z"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(newDate);
		cal.add(Calendar.DATE, 4);
		newDate = cal.getTime();
		System.out.println(newDate);
		
		sc.close();
	}
	
	public static int getMax(int a, int b, int c){
		int result;
		if (a > b && a > c){
			result = a;
		}else if(b > c){
			result = c;
		}else{
			result = c;
		}
		return result;
	}
	public static void print(int print){
		System.out.println(print);
	}
}
