import java.util.*;
public class Nproject
{
	public static void main(String[] args)
	{
	 System.out.println("*********COLLEGE ADMISSION*********");	
	 System.out.println("Fill details for admission in diploma");
                  System.out.println("Enter 1 for First year");	
  System.out.println("Enter 2 for Direct second year");
	 System.out.println("Enter 3 to Exit");
	 System.out.println("Choose one:");
	 Scanner sc1 = new Scanner(System.in);
	 int a = sc1.nextInt();
	  switch(a)
	  {
		  case 1:
			     //First year
			       College1yr aa = new College1yr();
			       aa.adddet();
			       aa.caste();
		                        aa.displayadd();	 
                                                          break;      
		  case 2:
			     //DSY
			    clg2yr bb = new clg2yr();
			    bb.adddet();
			    bb.caste();
		                     bb.displayadd();	
                                                       break;       
		  
		  case 3: 
			     // exit
                                                      College1yr cc = new College1yr();
                                                      cc.exit();
                                                      break;
			  
		  default:
			  System.out.println("Wrong choice");
	  }
	}
}
class College1yr
{    static String name, dob;
     static int seatno, c;
     static  float per;
	Scanner sc2 = new Scanner(System.in);
    void adddet()
    {
	  System.out.println("Enter student name, percentage, dob, seatno: ");
       name = sc2.next(); 
       per = sc2.nextFloat();
       dob = sc2.next();
      seatno = sc2.nextInt();
    }
    void caste()
    {
       System.out.println("choose your caste");   
       System.out.println("1.Open");
       System.out.println("2. Obc"); 
       System.out.println("3. Sc/St");
       System.out.println("4. other");
       System.out.println("Enter your caste:");
       int c = sc2.nextInt();
       switch(c)
       {
       case 1:
    	      //Open
    	      System.out.println(" Total fees : 65,000");
                       break;
       case 2: 
    	     //Obc
    	     System.out.println("Total fees: 45.000");
                      break;
       case 3 & 4:
    	     System.out.println("Total fees: 8,000");
                      break;
       default:
    	      System.out.println("Wrong choice ");
       }
    }
    void displayadd()
    {
       System.out.println("Student details are: ");
       System.out.println("Name :"+ name + "\npercentage: "+ per +"\ndob: "+ dob +"\nseatno: "+ seatno + "\ncase: "+ c);
    }
   
  void exit()
    {
    	System.exit(0);
    }


}
class clg2yr
{
	  static String name, dob;
	     static int seatno, c;
	     static  float per;
		Scanner sc3 = new Scanner(System.in);
	    void adddet()
	    {
		  System.out.println("Enter student name, percentage, dob, seatno: ");
	       name = sc3.next(); 
	       per = sc3.nextFloat();
	       dob = sc3.next();
	      seatno = sc3.nextInt();
	    }
	    void caste()
	    {
	       System.out.println("choose your caste");   
	       System.out.println("1.Open");
	       System.out.println("2. Obc"); 
	       System.out.println("3. Sc/St");
	       System.out.println("4. other");
	       System.out.println("Enter your caste:");
	        c = sc3.nextInt();
	       switch(c)
	       {
	       case 1:
	    	      //Open
	    	      System.out.println(" Total fees : 67,000");
                                         break;
	       case 2: 
	    	     //Obc
	    	     System.out.println("Total fees: 47.000");
                                        break;
	       case 3 & 4:
	    	     System.out.println("Total fees: 9,000");
                                        break;
	       default:
	    	      System.out.println("Wrong choice ");
	       }
	    }
	    void displayadd()
	    {
	       System.out.println("Student details are: ");
	       System.out.println("Name :"+ name + "\npercentage: "+ per +"\ndob: "+ dob +"\nseatno: "+ seatno + "\ncase: "+ c);
	    }
}
