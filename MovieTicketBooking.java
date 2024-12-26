package TicketBookingSystem;
import java.util.*;
public class MovieTicketBooking {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to Movie Ticket Booking System ");
	System.out.println("----------------------------------------------------------");
	System.out.println("Enter 1 to book a ticket");
	System.out.println("Enter 2 to view booking offers");
	System.out.println("----------------------------------------------------------");
	System.out.println();
	System.out.println("enter your option");
	int a = sc.nextInt();
	sc.nextLine();
	System.out.println("----------------------------------------------------------");
	if(a==1) {
		System.out.println("choose a movie you wanna watch");
		  System.out.println("""
		            1)Pushpa 2: The Rule
		            2)Mufasa: The Lion King
		            3)Baby John
		            4)Max(2024)
		            5)UI
		            6)Moana 2
		            7)Solo Leveling:ReAwakening
		            8)Lucky Baskhar
		            """);
		  String one="Pushpa 2: The Rule";
		  String two="Mufasa: The Lion King";
		  String three="Baby John";
		  String four="Max(2024)";
		  String five="UI";
		  String six="Moana 2";
		  String seven="Solo Leveling:ReAwakening";
		  String eight="Lucky Baskhar";
		  
		System.out.println("----------------------------------------------------------");

		  System.out.println("Enter your option ");
		  
		  int option= sc.nextInt();
		  String selectedmovie="";
		  switch(option) {
		  case 1-> selectedmovie=one;
		  case 2 -> selectedmovie=two;
		  case 3 -> selectedmovie=three;
		  case 4 -> selectedmovie=four;
		  case 5 -> selectedmovie=five;
		  case 6 -> selectedmovie=six;
		  case 7 -> selectedmovie=seven;
		  case 8 -> selectedmovie=eight;
		  default -> System.out.println("enter valid option");
		  }
	
		 System.out.println("Select the theatre to the movie "+selectedmovie);
		 System.out.println("""
1)Prasad's IMAX
2)Amb Cinemas
3)PVR Cinemas (Hyderabad Central Mall, Panjagutta)
4)INOX Movies (GVK One, Banjara Hills)
5)Cinepolis (Manjeera Trinity Mall, Kukatpally)
6)Asian Cinemas Multiplex
7)CinePlanet Multiplex (Kompally)
8)Sri Ramulu Theatre (Moosapet)
9)SVM Cinemas (Kukatpally)
10)Sudarshan 35mm (RTC X Roads)
		 		""");
		 System.out.println("enter the option to choose the theatre");
		 int theatreOption = sc.nextInt();
		 String selectedTheatre = "";
		 switch (theatreOption) {
		     case 1 -> selectedTheatre = "Prasad's IMAX";
		     case 2 -> selectedTheatre = "Amb Cinemas";
		     case 3 -> selectedTheatre = "PVR Cinemas (Hyderabad Central Mall, Panjagutta)";
		     case 4 -> selectedTheatre = "INOX Movies (GVK One, Banjara Hills)";
		     case 5 -> selectedTheatre = "Cinepolis (Manjeera Trinity Mall, Kukatpally)";
		     case 6 -> selectedTheatre = "Asian Cinemas Multiplex";
		     case 7 -> selectedTheatre = "CinePlanet Multiplex (Kompally)";
		     case 8 -> selectedTheatre = "Sri Ramulu Theatre (Moosapet)";
		     case 9 -> selectedTheatre = "SVM Cinemas (Kukatpally)";
		     case 10 -> selectedTheatre = "Sudarshan 35mm (RTC X Roads)";
		     default -> System.out.println("Enter a valid theatre option");
		 }
		 System.out.println("selected theatre is"+selectedTheatre);
		 System.out.println("enter the no.of persons going to watch the movie(eg.1 or 2 or10)");
		 int no_of_persons=sc.nextInt();
		 int prize_of_a_ticket=250;
		 int total_amount=no_of_persons*prize_of_a_ticket;
		 System.out.println("The amount to be paid is"+ total_amount);
		 System.out.println("The amount to be paid is " + total_amount);
		 System.out.println("Select your seats (e.g., S1 S2 S3):");
		 sc.nextLine();
		 String selectedSeats = sc.nextLine();
		 System.out.println("seats selected by you are " + selectedSeats);
		 System.out.println("----------------------------------------------------------");
		 System.out.println("""
		 		payment confirmation
		 		1)payment done
		 		2)yet to be done		 				 		
		 		""");
		 int payment_confirmation= sc.nextInt();
		 if(payment_confirmation==1) {
			 System.out.println("----------------------------------------------------------");
			    System.out.println("Here is your ticket:");
			    System.out.println("----------------------------------------------------------");
			    System.out.println("Movie: " + selectedmovie);
			    System.out.println("Theatre: " + selectedTheatre);
			    System.out.println("Seats: " + selectedSeats);
			    System.out.println("Total Amount Paid: ₹" + total_amount);
			    System.out.println("Enjoy your movie!");
			} else {
			    System.out.println("Payment is not done. Please complete the payment to confirm your booking.");
			}
		 }
	else if(a==2) {
		System.out.println("----------------------------------------------------------");
	    System.out.println("Current Booking Offers:");
	    System.out.println("1) Buy 2 tickets, get 1 free!");
	    System.out.println("2) 20% off on weekdays for morning shows.");
	    System.out.println("3) Cashback of ₹50 on payments via XYZ Wallet.");
	    System.out.println("4) Flat 10% discount on bookings above ₹1000.");
	    System.out.println("----------------------------------------------------------");
		
	}
	else {
		System.out.println("enter a correct option");
	}
		
	
	}
	
	
}

