interface I1 {

	abstract void selectmonth();
     abstract void  seatselection();
	abstract void signup();
	abstract void history();

	abstract void bus_selection();
	 abstract void  personaldetails();

	abstract void booking();

	abstract void selectdate();

	abstract double viewTotalRevenue(double TICKET_PRICE, int numSeats);

	abstract void yourlocation();

	abstract void cancelTicket();

	abstract void login();

	abstract void setPassword(String password);

	abstract void m1();
}

class Bank 
{
  static double currentbalance=300.0;
  static String holdername="harsha";
  static Long accountnum=1234567l;
  static String  IFSC = "12423ifsc";
   static Long phone_number=9110547361l;	
	
   
}

abstract class A extends Bank implements I1 {
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	static B obj = new B();
	static int  numSeats;
  static double wallet=1000;
  static int seatno;
	static private String password = "narendra@123";
	static String password1 = "narendra@123";
	static String id = "narendra";	
	static String gender="Male";
	static  String yourlocation;

	static double totalPrice;
	static String name="narendra.payyavula";
	static  String mobilenumber="9110547361";
	static String  busnames;
    static int c=0;
	static final int MAX_SEATS = 50;
	static String yourdestination;
     static int month ;
static int selectdate;
	static double TICKET_PRICE = 100.0;
	static int totalSeatsBooked = 0;
}

class B extends A
{
	static java.util.Scanner sc = new java.util.Scanner(System.in);

	@Override
	public void setPassword(String password) 
	{
		this.password1= password;
		System.out.println("your password changed");
		  
	}

	@Override
	public void m1() {
		System.out.println("enter the new password:--");
		String passwrd = sc.next();
             if(passwrd.equals(password1))
		 { 
			this.setPassword(passwrd);
		 }
		
	}

	static String getPassword() {
		B obj = new B();
		obj.m1();
		return password1;
	}

	B() {
		System.out.println("Welcome to RedBuss");
	}

	B(String a) {
		this();
		System.out.println(a);
	}
      
	@Override
	public void login() {
		System.out.println("1:---login");
		   System.out.println("2:--signup");
		String enter = sc.next();
		switch (enter) {
		case "1":
			System.out.println("enter your id1:-- ");
			String id1 = sc.next();

			System.out.println("enter the password");
			String password1 = sc.next();
			if (id1.equals(id)) {

				if (password1.equals(password1)) {
					System.out.println("Welcome to Bus Ticket Booking App!");

				}
				else
				{
					login();
				}

			}
			else
			{
				login();
			}
			break;
		case "2":
			signup();
			break;
		 default:
				login();break;
		}
	}

	@Override
	public void signup() 
	{
 	
		System.out.println("enter your id");
		 id=sc.next();
		System.out.print("enter your name--");
		 name = sc.next();
		System.out.println("plz selcet your gender:--");
		 gender = sc.next();
             if((gender.equals("male"))||(gender.equals("female")))
                {
                   System.out.println("enter your phone number:--");
		     mobilenumber = sc.next();
		
	          	System.out.println("Thanks for join our family...");   
                 }
              else
                {
                  signup();
                 }
		
	}
	public  void seatselection(){
			System.out.println("______________________________________________");
	    System.out.println("select the number of seats that you want to  to book: ");
		int numSeat1 = sc.nextInt();
               numSeats= numSeat1;
	     while(numSeat1>0)
		{
	          System.out.println("please enter the seat number:--");
			seatno=sc.nextInt();
			switch(seatno)
			{
				case 1:
				   System.out.println("you have selected the seat number"+seatno);System.out.println("______________________________________________");break;
				case 2:
				   System.out.println("you have selected the seat number"+seatno);System.out.println("______________________________________________"); break;
				case 3:
				   System.out.println("you have selected the seat number"+seatno);System.out.println("______________________________________________"); break;
				case 4:
				   System.out.println("you have selected the seat number"+seatno); System.out.println("______________________________________________");break;
				case 5:
				   System.out.println("you have selected the seat number"+seatno); System.out.println("______________________________________________");break;
				case 6:
				   System.out.println("you have selected the seat number"+seatno); System.out.println("______________________________________________");break;	
				case 7:
				   System.out.println("you have selected the seat number"+seatno);System.out.println("______________________________________________"); break;
				case 8:
				   System.out.println("you have selected the seat number"+seatno);System.out.println("______________________________________________"); break;
				case 9:
				   System.out.println("you have selected the seat number"+seatno); System.out.println("______________________________________________");break;
				case 10:
				   System.out.println("you have selected the seat number"+seatno); System.out.println("______________________________________________");break;
				case 11:
				   System.out.println("you have selected the seat number"+seatno); System.out.println("______________________________________________");break;
				case 12:
				   System.out.println("you have selected the seat number"+seatno); System.out.println("______________________________________________");break;
				case 13: 
				   System.out.println("you have selected the seat number"+seatno);
						System.out.println("______________________________________________");
					 break;
				  case 14:
				   System.out.println("you have selected the seat number"+seatno);
						System.out.println("______________________________________________");
					 break;
					case 15:
				   System.out.println("you have selected the seat number"+seatno);
					System.out.println("______________________________________________");
					 break;
			}
			numSeat1--;
		}
		
		}				
       public void bus_selection()
	{
		System.out.println("select your bus by enter  respective digits to the buses are available:--");
			System.out.println("______________________________________________");
			System.out.println("Enter 1 :---Guru Translines ");
	
			System.out.println("Enter 2:-----ganesh bus ");
			System.out.println("Enter 3:---- narendra Tours and Travels");
			System.out.println("Enter 4:----harsha TOURS AND TRAVELS");
			System.out.println("Enter 5:---pokiri Tours and Travels");
			System.out.println("______________________________________________");
			 busnames=sc.next();
			switch( busnames)
			{
				case "1":		
					System.out.println("You have choosen the    Guru Translines  for your journey");
							System.out.println("______________________________________________");break;
				case "2":		
					System.out.println("You have choosen the    ganesh bus for your journey");
									System.out.println("______________________________________________");break;
				case "3":		
					System.out.println("You have choosen the    narendra Tours and Travels. for your journey");
						System.out.println("______________________________________________");
					break;
				case "4":		
					System.out.println("You have choosen the harsha  TOURS AND TRAVELS.  for your journey");
						System.out.println("______________________________________________");
						break;
				case "5":		
					System.out.println("You have choosen the  pokiri Tours and Travels  for your journey");break;
				 default:
						 bus_selection();
							System.out.println("______________________________________________");
								break;
			}
	}
					
					

	@Override
	public void selectmonth() {
		System.out.println("select your month  ");
		System.out.println("______________________________________________");
		 month = sc.nextInt();
		if (month <= 12) {
			System.out.println("you have selected  the  month as " + month);
			System.out.println("______________________________________________");
		} else {
			System.out.println("please enter valid month ");
			System.out.println("______________________________________________");
			selectmonth();
		}
		return;
	}

	@Override
	public void selectdate()
	{
		
		System.out.println("please select your date of journey  ");
		 {System.out.println("______________________________________________");
	 selectdate = sc.nextInt();
		if (selectdate <= 31) {
				System.out.println("______________________________________________");
			System.out.print("you have selcted  the date as: " + selectdate + ". ");
		} else {System.out.println("______________________________________________");
			System.out.println("please enter the correct date ");
			selectdate();
		}
		return;
	}
	}

	@Override
	public double viewTotalRevenue(double TICKET_PRICE, int numSeats) {
		double totalRevenue = TICKET_PRICE * numSeats;
		
		return totalRevenue;
	}

	@Override
	public void yourlocation() {
            
		System.out.println("SELECT YOUR BOARDING POINT : ");
		 System.out.println("______________________________________________");
		System.out.println("ENTER (1) FOR HYDERABAD");	
		System.out.println("ENTER (2) FOR VIJAYAWADA");
		System.out.println("ENTER  (3) FOR  GUNTUR");
		System.out.println("ENTER (4) FOR NUZIVIDU");
		System.out.println("ENTER (5) FOR SECUNDERABD");
		System.out.println("ENTER (6) FOR SRIKAKULAM");
	 
			System.out.println("______________________________________________");
	         yourlocation = sc.next();
		 System.out.println("______________________________________________");

		switch (yourlocation) {
		case "1":
			System.out.println("your location  is:   HYDERABAD");
			 System.out.println("______________________________________________");
			break;
		case "2":
			System.out.println("your  location  is:  VIJAYAWADA");
			 System.out.println("______________________________________________");
			break;
		case "3":
			System.out.println("your   location is:  GUNTUR");
			 System.out.println("______________________________________________");
			break;
		case "4":
			System.out.println("your  location  is:  NUZIVIDU");
				 System.out.println("______________________________________________");
			break;
		case "5":
			System.out.println("your  location  is:  SECUNDERABAD");
			 System.out.println("______________________________________________");
			break;
		case "6":
			System.out.println("your  location  is:  SRIKAKULAM");
			 System.out.println("______________________________________________");
			break;
	  
		default:
			yourlocation();

		}
		 
		System.out.println("SELECT YOUR DESTINATION : ");
		 System.out.println("______________________________________________");
		System.out.println("ENTER (1) FOR HYDERABAD");	
		System.out.println("ENTER (2) FOR VIJAYAWADA");
		System.out.println("ENTER  (3) FOR  GUNTUR");
		System.out.println("ENTER (4) FOR NUZIVIDU");
		System.out.println("ENTER (5) FOR SECUNDERABD");
		System.out.println("ENTER (6) FOR SRIKAKULAM");
		System.out.println("______________________________________________");
		 yourdestination = sc.next();
		switch (yourdestination) {
		case "1":
			System.out.println("your location  is:   HYDERABAD");
			 System.out.println("______________________________________________");
			break;
		case "2":
			System.out.println("your  location  is:  VIJAYAWADA");
			 System.out.println("______________________________________________");
			break;
		case "3":
			System.out.println("your   location is:  GUNTUR");
			 System.out.println("______________________________________________");
			break;
		case "4":
			System.out.println("your  location  is:  NUZIVIDU");
				 System.out.println("______________________________________________");
			break;
		case "5":
			System.out.println("your  location  is:  SECUNDERABAD");
			 System.out.println("______________________________________________");
			break;
		case "6":
			System.out.println("your  location  is:  SRIKAKULAM");
			 System.out.println("______________________________________________");
			break;
		default:
			yourlocation();	System.out.println("___________________________________________________");
			break;
		 
		}

		return;
	}
  static  void stops1()
{
	if(yourdestination.equals("1"))
      {System.out.println("1:--KukatPally mertro pickup point and departure time is [2am] ");
      System.out.println("2:--Jntu Bus Station and departure time is [1am]  ");
      System.out.println("3:-- Ameerpet and departure time is [3pm] ");
      System.out.println("4:--HITEC City  and departure time is [4am] ");
      System.out.println("5:--Jublie Hills CheckPost  and departure time is [3am]  ");
      System.out.println("________________________________________________");
      String p1=sc.next();
	switch(p1)
	{
		case "1":
			System.out.println("You have selected KukatPally mertro pickup point ");break;
	        case "2":
				System.out.println("you have selected Jntu Bus Station ");break;
		    case "3":
				System.out.println("you have selected Ameerpet ");break;
			 case "4":
				System.out.println("You have selected HITEC City");break;
				 case "5":
				System.out.println("You have selected Jublie Hills CheckPost ");break;
				default:
				obj.stops();break;
		
	}
	}
	 if(yourdestination.equals("2"))
	 {   System.out.println("1:--Kanaka Durga Varadhi Bus Stop  and departure time is [6pm] ");
	 System.out.println("2:-- Currency Nagar  and departure time is [5am] ");
	 System.out.println("3:--PVP Mall Bus stop and departure time is [4am] ");
	 System.out.println("4:-- Besant Road and departure time is [3pm] ");
	 System.out.println("5:--Benz Circle  Benz Circle  and departure time is [3am]  ");
	 System.out.println("______________________________________________________");
		   String p2=sc.next();
		   switch(p2)
		   {
			   case "1":
				   System.out.println("You have selected  Kanaka Durga Varadhi Bus Stop ");break;
				   case "2":
					   System.out.println("you have selected  Currency Nagar  ");break;
				   case "3":
					   System.out.println("you have selected PVP Mall Bus stop  ");break;
					case "4":
					   System.out.println("You have selected Besant Road ");break;
						case "5":
					   System.out.println("You have selected Benz Circle  ");break;
					   default:
					   obj.stops();break;
			   
		   }
	 }
	 if(yourdestination.equals("3"))
	 {   System.out.println("1:--JeediMetla Bus Depot and departure time is [3am] ");
	 System.out.println("2:--  Jublie BUs Station  and departure time is [3am] ");
	 System.out.println("3:-- Narayana guda Bus station and departure time is [4pm] ");
	 System.out.println("4:--MGBS Bus Station and departure time is [5am] ");
	 System.out.println("5:--guntur RTCBus Stand and departure time is [7pm] ");
	 System.out.println("______________________________________________________");
		   String p3=sc.next();
		   switch(p3)
		   {
			   case "1":
				   System.out.println("You have selected JeediMetla Bus Depot   ");break;
				   case "2":
					   System.out.println("you have selected Jublie BUs Station   ");break;
				   case "3":
					   System.out.println("you have selected  Narayana guda Bus station ");break;
					case "4":
					   System.out.println("You have selected MGBS Bus Station  ");break;
						case "5":
					   System.out.println("You have selected  guntur RTCBus Stand  ");break;
					     default:
		  					obj.stops();break;

	      }           
     }
	 if(yourdestination.equals("4"))
	 {   System.out.println("1:--APSRTC Bus Stand and departure time is [4pm]  ");
	 System.out.println("2:--  APSRTC Bus Depo and departure time is [12pm] ");
	 System.out.println("3:--IIIT Nuzividu and departure time is [1am] ");
	 System.out.println("4:--    Flower market  and departure time is [2pm] ");
	 System.out.println("5:-- Police Station and departure time is [1pm] ");
	 System.out.println("______________________________________________________");
		   String p4=sc.next();
		   switch(p4)
		   {
			   case "1":
				   System.out.println("You have selected  APSRTC Bus Stand   ");break;
				   case "2":
					   System.out.println("you have selected  APSRTC Bus Depo ");break;
				   case "3":
					   System.out.println("you have selected  IIIT Nuzividu ");break;
					case "4":
					   System.out.println("You have selected  Flower market ");break;
						case "5":
					   System.out.println("You have selected  Police Station");break;
					   default:
					   obj.stops();break;
	}
	
}
if(yourdestination.equals("5"))
{   System.out.println("1:--Market Road Bus Stop and departure time is [1am] ");
System.out.println("2:-- Secunderabad Bus Stop and departure time is [9am] ");
System.out.println("3:--Old BowenPalli Bus Stop and departure time is [4pm] ");
System.out.println("4:--Diamond Point and departure time is [2pm]  ");
System.out.println("5:--Sithaphalmandi Bus Stop and departure time is [3am] ");
System.out.println("______________________________________________________");
	  String p5=sc.next();
	  switch(p5)
	  {
		  case "1":
			  System.out.println("You have selected --Market Road Bus Stop ");break;
			  case "2":
				  System.out.println("you have selected Secunderabad Bus Stop  ");break;
			  case "3":
				  System.out.println("you have selected  Old BowenPalli Bus Sto ");break;
			   case "4":
				  System.out.println("You have selected Diamond Point  ");break;
				   case "5":
				  System.out.println("You have selected Sithaphalmandi Bus Stop   ");break;
				  default:
				  obj.stops();break;
}

}
if(yourdestination.equals("6"))
{   System.out.println("1:--Srikakulam Old Bus Stand  and departure time is [2am] ");
System.out.println("2:-- Seepanaidupeta Bus Station and departure time is [1pm] ");
System.out.println("3:--APSRTC Bus Depot and departure time is [8pm]  ");
System.out.println("4:--Ambedkar Junction Bus Stop and departure time is [4am]  ");
System.out.println("5:-- Pedapadu and departure time is [3am] ");
System.out.println("______________________________________________________");
	  String p6=sc.next();
	  switch(p6)
	  {
		  case "1":
			  System.out.println("You have selected Srikakulam Old Bus Stand   ");break;
			  case "2":
				  System.out.println("you have selected  Seepanaidupeta Bus Station   ");break;
			  case "3":
				  System.out.println("you have selected   APSRTC Bus Depot ");break;
			   case "4":
				  System.out.println("You have selected Ambedkar Junction Bus Stop   ");break;
				   case "5":
				  System.out.println("You have selected  Pedapadu  ");break;
				  default:
				  obj.stops();break;
}

}
}
    static  void stops()
{
	if(yourlocation.equals("1"))
      {System.out.println("1:--KukatPally mertro pickup point [arrival time is  9pm]");
      System.out.println("2:--Jntu Bus Station arrival time is [9.30pm]");
      System.out.println("3:-- Ameerpet  arrival time is[10.00pm]");
      System.out.println("4:--HITEC City   arrival time is [10.30pm]");
      System.out.println("5:--Jublie Hills CheckPost  arrival time is [11pm] ");
      System.out.println("________________________________________________");
      String p1=sc.next();
	switch(p1)
	{
		case "1":
			System.out.println("You have selected KukatPally mertro pickup point");break;
	        case "2":
				System.out.println("you have selected Jntu Bus Station    ");break;
		    case "3":
				System.out.println("you have selected Ameerpet ");break;
			 case "4":
				System.out.println("You have selected HITEC City");break;
				 case "5":
				System.out.println("You have selected Jublie Hills CheckPost ");break;
				default:
				obj.stops();break;
		
	}
	}
	 if(yourlocation.equals("2"))
	 {   System.out.println("1:--Kanaka Durga Varadhi Bus Stop   arrives at[1am]");
	 System.out.println("2:-- Currency Nagar  and  arrival time is [2am]");
	 System.out.println("3:--PVP Mall Bus stop  and  arrival time is [3am]");
	 System.out.println("4:-- Besant Road   and  arrival time is [4am]");
	 System.out.println("5:--Benz Circle  Benz Circle   and  arrival time is [5am] ");
	 System.out.println("______________________________________________________");
		   String p2=sc.next();
		   switch(p2)
		   {
			   case "1":
				   System.out.println("You have selected  Kanaka Durga Varadhi Bus Stop ");break;
				   case "2":
					   System.out.println("you have selected  Currency Nagar  ");break;
				   case "3":
					   System.out.println("you have selected PVP Mall Bus stop  ");break;
					case "4":
					   System.out.println("You have selected Besant Road ");break;
						case "5":
					   System.out.println("You have selected Benz Circle  ");break;
					   default:
					   obj.stops();break;
			   
		   }
	 }
	 if(yourlocation.equals("3"))
	 {   System.out.println("1:--JeediMetla Bus Depot  and  arrival time is [1pm]");
	 System.out.println("2:--  Jublie BUs Station  and  arrival time is [2pm]");
	 System.out.println("3:-- Narayana guda Bus station  and  arrival time is [3pm]");
	 System.out.println("4:--MGBS Bus Station  and  arrival time is [4pm]");
	 System.out.println("5:--guntur RTCBus Stand  and  arrival time is [5pm]");
	 System.out.println("______________________________________________________");
		   String p3=sc.next();
		   switch(p3)
		   {
			   case "1":
				   System.out.println("You have selected JeediMetla Bus Depot   ");break;
				   case "2":
					   System.out.println("you have selected Jublie BUs Station   ");break;
				   case "3":
					   System.out.println("you have selected  Narayana guda Bus station ");break;
					case "4":
					   System.out.println("You have selected MGBS Bus Station  ");break;
						case "5":
					   System.out.println("You have selected  guntur RTCBus Stand  ");break;
					     default:
		  					obj.stops();break;

	      }           
     }
	 if(yourlocation.equals("4"))
	 {   System.out.println("1:--APSRTC Bus Stand and  arrival time is [3am]");
	 System.out.println("2:--  APSRTC Bus Depo and  arrival time is [2am]");
	 System.out.println("3:--IIIT Nuzividu  and  arrival time is [1am]");
	 System.out.println("4:--    Flower market and  arrival time is [11pm]");
	 System.out.println("5:-- Police Station  and  arrival time is [10pm]");
	 System.out.println("______________________________________________________");
		   String p4=sc.next();
		   switch(p4)
		   {
			   case "1":
				   System.out.println("You have selected  APSRTC Bus Stand   ");break;
				   case "2":
					   System.out.println("you have selected  APSRTC Bus Depo ");break;
				   case "3":
					   System.out.println("you have selected  IIIT Nuzividu ");break;
					case "4":
					   System.out.println("You have selected  Flower market ");break;
						case "5":
					   System.out.println("You have selected  Police Station");break;
					   default:
					   obj.stops();break;
	}
	
}
if(yourlocation.equals("5"))
{   System.out.println("1:--Market Road Bus Stop   and  arrival time is [3pm] ");
System.out.println("2:-- Secunderabad Bus Stop  and  arrival time is [4pm]");
System.out.println("3:--Old BowenPalli Bus Stop and  arrival time is [5pm]");
System.out.println("4:--Diamond Point  and  arrival time is [6pm]");
System.out.println("5:--Sithaphalmandi Bus Stoop and  arrival time is [8pm]");
System.out.println("______________________________________________________");
	  String p5=sc.next();
	  switch(p5)
	  {
		  case "1":
			  System.out.println("You have selected --Market Road Bus Stop ");break;
			  case "2":
				  System.out.println("you have selected Secunderabad Bus Stop  ");break;
			  case "3":
				  System.out.println("you have selected  Old BowenPalli Bus Sto ");break;
			   case "4":
				  System.out.println("You have selected Diamond Point  ");break;
				   case "5":
				  System.out.println("You have selected Sithaphalmandi Bus Stop   ");break;
				  default:
				  obj.stops();break;
}

}
if(yourlocation.equals("6"))
{   System.out.println("1:--Srikakulam Old Bus Stand   and  arrival time is [11pm]");
System.out.println("2:-- Seepanaidupeta Bus Station and  arrival time is [2pm]");
System.out.println("3:--APSRTC Bus Depot  and  arrival time is [4pm]");
System.out.println("4:--Ambedkar Junction Bus Stop   and  arrival time is [5pm]");
System.out.println("5:-- Pedapadu   and  arrival time is [4.30pm]");
System.out.println("______________________________________________________");
	  String p6=sc.next();
	  switch(p6)
	  {
		  case "1":
			  System.out.println("You have selected Srikakulam Old Bus Stand   ");break;
			  case "2":
				  System.out.println("you have selected  Seepanaidupeta Bus Station   ");break;
			  case "3":
				  System.out.println("you have selected   APSRTC Bus Depot ");break;
			   case "4":
				  System.out.println("You have selected Ambedkar Junction Bus Stop   ");break;
				   case "5":
				  System.out.println("You have selected  Pedapadu  ");break;
				  default:
				  obj.stops();break;
}

}
}

	@Override
	 public void personaldetails()
	{      System.out.println("Name=  "+name);
		System.out.println("Gender= "+gender);
		System.out.println("mobile number=  "+mobilenumber);
		System.out.println("id=  "+id);
	 
	}
public void history()
{    
	System.out.print(" Your boarding point"+yourlocation);
       System.out.println("droping point is  "+yourdestination);
	System.out.println("month  is "+month);
	System.out.println("date is "+selectdate);
		System.out.println("Bus name is "+busnames);
		System.out.println("Seat number is  "+seatno);
		System.out.println("Number of seats you have booked is  "+totalSeatsBooked);
		System.out.println("Fare==="+totalPrice+"  including All taxes..");
	 obj.all();
	
}
	public void cancelTicket() {
		if (totalSeatsBooked == 0) {
			
			System.out.println("Sorry, no tickets booked yet!");
			System.out.println("______________________________________________");obj.all();
			return;
		}
		
		System.out.print("Enter number of seats to cancel: ");
		System.out.println("______________________________________________");
		numSeats = sc.nextInt();
		if (numSeats > totalSeatsBooked) {
				
			System.out.println("Sorry, only " + totalSeatsBooked + " tickets are booked!");
			System.out.println("______________________________________________");
			totalSeatsBooked = numSeats;
			return;
		}
		double refundAmount = TICKET_PRICE * numSeats;
		System.out.println("Refund amount: 	Rs--" + refundAmount);
           System.out.println("______________________________________________");
		System.out.print("Confirm cancellation (Yes/No)? ");
		String confirm = sc.next();
		if (confirm.equalsIgnoreCase("Yes")) {
			totalSeatsBooked -= numSeats;
			
			System.out.println(numSeats + " seats are cancelled successfully!");
			System.out.println("______________________________________________");
		} else {
			System.out.println("______________________________________________");
			System.out.println("Cancellation cancelled.");
		}
	}

	public void viewAvailableSeats() {
		int availableSeats = MAX_SEATS - totalSeatsBooked;
		System.out.println("Available seats: " + availableSeats);obj.all();
	}

	@Override
	public void booking() {
		totalPrice = TICKET_PRICE * numSeats;
		System.out.println("Total price: $" + totalPrice);
		if (totalSeatsBooked == MAX_SEATS) {
			System.out.println("______________________________________________");
			System.out.println("Sorry, all seats are booked!");
		
			return;
		}
		if (totalSeatsBooked + numSeats > MAX_SEATS) {
			System.out.println("______________________________________________");
			System.out.println("Sorry, only " + (MAX_SEATS - totalSeatsBooked) + " seats are available!");
			System.out.println("______________________________________________");
			return;
		}
		 System.out.println("______________________________________________");
		System.out.println("1:--- to confirm the booking");
		System.out.println("2:--- to cancle the booking");	
		System.out.println("______________________________________________");
		
		String confirm1 = sc.next();
		if (confirm1.equals("1")) {
			totalSeatsBooked += numSeats;
			System.out.println("1:--transaction  through phnpay");
			System.out.println("2:--transaction through wallet ");
			String trans=sc.next();
			switch(trans)
			{
			    case "1":
					
			 if(totalPrice>currentbalance)
	             {
	       	System.out.println("Payment Failed  because of low balance in your account !!");
             	}
			else{
			System.out.println(numSeats + " seats booked successfully!");
			System.out.println("______________________________________________");
			
		}break;
		case "2":
			if(totalPrice>wallet)
				{
						System.out.println("Sorry,You dont have sufficient balance in your wallet"); 
				}
				else
					{
							wallet=wallet-totalPrice;
							System.out.println(numSeats + " Seats booked successfully!");
					}
}
	 
	}obj.all();
}
void all()
			{
			System.out.println("1:--to book tickets");
			 System.out.println("2:--Personal Data  ");
	      		System.out.println("3:---My Bookings  ");
	  		    System.out.println("4:----About Us  ");
	   		    System.out.println("5:--Feed Back  ");
	   		  	  System.out.println("6:--Logout  ");
		  
			String opt=sc.next();
			if(opt.equals("1")){
			obj.yourlocation();
			obj.selectmonth();
			obj.selectdate();
			System.out.println("______________________________________________");
 			System.out.println("search for busses for your journey:--");
			obj.bus_selection();
			obj.seatselection();
			System.out.println(yourlocation);
			obj.stops();
			obj.stops1();
			obj.booking();
			System.out.println("(1):--- to cancle the tickets");
			System.out.println("(2):---to check the seats availabality:--");
			System.out.println("(3):--- for the resetting your password:--");
			System.out.println("(4):--- to exit from app ");	
			System.out.println("(5):---- to get the booking details");
			System.out.println("(6):---  to get the my account option");
			System.out.println("********************************************");
			String other_options = sc.next();
			switch (other_options) {
			case "1":
				obj.cancelTicket();
				break;
			case "2":
				obj.viewAvailableSeats();
				break;
			case "3":
				System.out.println(obj.getPassword());break;
			case "4":
				System.exit(0);
			case "5":
					obj.history();break;
			 case "6":
			              obj.personaldetails();break;
			}
			}else if(opt.equals("2")){
		  obj.personaldetails();
			}
			else if(opt.equals("3")){
					obj.history();
			}
			else if(opt.equals("4")){
					System.out.println("The Red Bus app is a popular mobile application used for booking bus tickets in India. It provides users with a simple and efficient way to search for buses, compare prices, and book tickets online. The app offers a user-friendly interface, allowing users to easily filter their search results by departure time, bus type, and various other preferences. Additionally, it provides real-time tracking of buses, so users can stay updated on their bus's arrival time. Overall, the Red Bus app is a convenient and reliable option for booking bus tickets in India.");
			}else if(opt.equals("5")){
					System.out.println("Please Submit your Valuable Feedback");
					String feedback=sc.next();
			        System.out.println("1:-- to send the feedback ");
			          System.out.println("2:---to go to  back ");
			}
					else if(opt.equals("6")){
				System.exit(0);}
			
        }
}
			
	class C extends B {
		C() {
			super(sc.next());
		}
			 
	}


	class Main extends C {
		public  static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			System.out.println("______________________________________________");
			      System.out.println("press 1 :To open the 	RedBuss App");
  String s=sc.next();
  if(s.equals("1"))     
				obj.login();
            obj.all();
			   
}
   }