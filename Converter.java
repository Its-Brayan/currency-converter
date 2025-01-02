import java.util.Scanner;
interface methods{
	void usd_to_eur();
	void eur_to_usd();
	void usd_to_gbp();
	void gbp_to_usd();
	void eur_to_gbp();
	void gbp_to_eur();
}
public class Converter implements methods{
	Scanner scan = new Scanner(System.in);
	public void usd_to_eur(){
   System.out.println("Please enter the amount you want to convert");
   double amount = scan.nextDouble();
   double euro = amount * 0.97;
   System.out.println("The amount in euros is: "+ euro);
	}
	public void eur_to_usd(){
		System.out.println("Please enter the amount you want to convert");
   double amount = scan.nextDouble();
   double dollar = amount * 1.04;
    System.out.println("The amount in euros is: "+"$"+dollar);
	}
	public void usd_to_gbp(){
     System.out.println("Please enter the amount you want to convert");
   double amount = scan.nextDouble();
   double gbp = amount * 0.80;
   System.out.println("The amount in pounds is: "+ gbp+" pounds");
	}
	public void gbp_to_usd(){
		 System.out.println("Please enter the amount you want to convert");
   double amount = scan.nextDouble();
   double dollar = amount * 1.25;
   System.out.println("The amount in dollars is: "+"$"+ dollar);
	}
   public void eur_to_gbp(){
   	System.out.println("Please enter the amount you want to convert");
   double amount = scan.nextDouble();
   double gbp = amount * 0.83;
   System.out.println("The amount in pounds is: "+ gbp+" pounds");

   }
	public void gbp_to_eur(){
		System.out.println("Please enter the amount you want to convert");
   double amount = scan.nextDouble();
   double eur = amount * 1.21;
    System.out.println("The amount in euros is: "+ eur);
	}




	public static void main(String [] args){
		Converter convert = new Converter();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("option 1: USD TO EUR");
		System.out.println("option 2: EUR TO USD");
		System.out.println("option 3: USD TO GBP");
		System.out.println("option 4: GBP TO USD");
		System.out.println("option 5: EUR TO GBP");
		System.out.println("option 6: GBP TO EUR");
         System.out.println();
         System.out.println("Please select your option");
         int option = scan1.nextInt();
          
         switch(option){
         case 1:
         convert.usd_to_eur();
         break;
           case 2:
           	convert.eur_to_usd();
           	break;
           case 3:
           	convert.usd_to_gbp();
           	break;
           case 4:
           	convert.gbp_to_usd();
           	break;
           case 5:
           	convert.eur_to_gbp();
           	break;
           case 6:
           	convert.gbp_to_eur();
           	break;
           default:
           	System.out.println("please select a valid option");

         }





	}
}