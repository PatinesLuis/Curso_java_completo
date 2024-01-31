package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			
		
		System.out.println("Room numbers");
		int number = ler.nextInt();
		
		System.out.println("Check-in (dd/mm/yyyy)");
		Date checkIn = sfd.parse(ler.next());
		
		System.out.println("Check-out (dd/mm/yyyy)");
		Date checkOut = sfd.parse(ler.next());
		
		
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			
			System.out.println("Check-in (dd/mm/yyyy)");
			checkIn = sfd.parse(ler.next());
			
			System.out.println("Check-out (dd/mm/yyyy)");
			checkOut = sfd.parse(ler.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch(ParseException e) {
			System.out.println("invalid date format");
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("error");
		}
			}

	}


