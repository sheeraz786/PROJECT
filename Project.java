import java.util.*;
	class Project{
	
	public static void main (String args[]){
	
	
	int total = 300;
	Scanner ob  = new Scanner(System.in);
	
	System.out.println("select them below");
	
	System.out.println("1:calculater\n2:marksheet\n3:converter\n4 currency");
	int select = ob.nextInt();
	
	
	switch(select){
	
	case 1:
	
	System.out.println("1:calculater");
	
	System.out.println("enter first value");
	int a  = ob.nextInt();
	
	System.out.println("enter second value");
	int b  = ob.nextInt();

	System.out.println("addition is      "+(a+b));
	
	
	System.out.println("subtrction  is      "+(a-b));
	
	System.out.println("multiplication is      "+(a*b));
	
	
	System.out.println("division  is      "+(a/b));
	break;
	
	case 2:
	
	System.out.println("1:marksheet");
	System.out.println("enter java marks");
	int java = ob.nextInt();
	
       System.out.println("enter c marks");
       int c = ob.nextInt();
	
       System.out.println("enter php marks");
       int php = ob.nextInt(); 
	int obtain = java+c+php;
	
	float percentage  = (obtain*100)/300;
	
	System.out.println(" total marks    "+total);
      System.out.println(" obtain marks    "+obtain);
	System.out.println(" percentage  of marks    "+percentage);
break;
      
       case 3:

       System.out.println("1:converter\n1:kilogram to grams\n2:grams to kilogram");
	
	System.out.println(" enter 1 to convert kilogram to gram and enter 2 to grams to kilogram");
      int num = ob.nextInt();
	if(num==1){
	System.out.println(" kilogram to grams    ");
	
	System.out.println(" enter kilogram    ");
       int kilogram= ob.nextInt();
       int grams = kilogram*1000;
       System.out.println(" grams is "+grams);}
	else {
	System.out.println("  grams to kilogram    ");
	
	System.out.println(" enter grams    ");
       int gm= ob.nextInt();
       int kilo = gm/1000;
       System.out.println(" kilograms  is "+kilo);}
break;
       
   case 4:
       System.out.println("enter 1 to convert Dollor to pakistan rupees and enter 2 to pakistan rupees to Dollor");

	int currency =ob.nextInt();

      if(currency==1){

     System.out.println("Dollor to pakistan rupees ");

     System.out.println("enter Dollor ");

    int Dollor= ob.nextInt();
    int Pakrupees=Dollor*142;
    System.out.println("Pak rupees is "+Pakrupees);}
    else{
    System.out.println(" pakistan rupees to dollor ");

    System.out.println(" enter pakistan rupees");

    int pakrupees= ob.nextInt();
    int Dollor= pakrupees/100;
    System.out.println("Dollor is  "+Dollor);}
break;
   

	
}
}
}