package oopAirport;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Flight {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input departure date");
		String inputdate = sc.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM");
		
		Date departuredate = sdf.parse(inputdate);
		
		System.out.println("How many tickets will you buy?");
		int ticket = sc.nextInt();
		sc.nextLine();
		
		while(ticket >= 3) {
			System.out.println("there are no tickets. Please buy the tickets, not more than 3");
			ticket = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("where will you go?");
		String location = sc.next();
		
		int distance;
		
		if(location.equals("NewYork")) {
			NewYorkFlight nyc = new NewYorkFlight();
			distance = nyc.Distance;
		} else if(location.equals("Manila")) {
			ManilaFlight mf = new ManilaFlight();
			distance = mf.Distance;
		} else {
			LondonFlight ld = new LondonFlight();
			distance = ld.Distance;
		}
		
		int price = 0;
		
		if(distance < 5) {
			price += 100;
		} else if (distance < 9.9) {
			price += 150;
		} else {
			price += 200;
		}
		
		Date hotstart = sdf.parse("01/May");
		Date hotend = sdf.parse("31/July");
		
		if(departuredate.compareTo(hotstart) >= 0 && departuredate.compareTo(hotend) <= 0) {
			price += 50;
		} else {
			
		}
		
		price = price * ticket;

		System.out.println("your purchase is successful. Price is " + price + "만원");
		
	}

}
