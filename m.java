
import java.io.FileWriter; 
import java.util.*;
import java.io.IOException; 
import java .util.Scanner;
import java.util.Random;
class demo2 
{
  void get_data() {  
    try {  Scanner s=new Scanner(System.in);
      FileWriter myWriter = new FileWriter("filename.txt");
System.out.println("\t\t\t ENTER THE USER NAME :");
      String name=s.nextLine();
System.out.println("\t\t\t ENTER THE USER AGE :");
      int age=s.nextInt();
System.out.println("\t\t\t ENTER THE USER CREDIT SCORE :");
int cr=s.nextInt();
       myWriter.write(name+age+cr);
      myWriter.close();
      System.out.println("\t\t\t\t RECORD SUCESSFULLY SUBMITTED");
    }
 catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
    
} 
   
}



class demo1
{void new_policy()
{int m;
do{
System.out.println("\t\t\t 1: Buy a new policy");
System.out.println("\t\t\t 2: To renew a existing policy");
System.out.println("\t\t\t 3: To go back to main menu");
Scanner s=new Scanner(System.in);
 m=s.nextInt();
switch(m)
{case 1:
System.out.println("\t\t\t\t!!*****CHOOSE POLICIES*****!!");
System.out.println("\t\t\t 1 for a health policy");
System.out.println("\t\t\t 2 for a car loan");
System.out.println("\t\t\t 3 for a home loan");
System.out.println("\t\t\t 4 for a term plans");
int c=s.nextInt();
switch(c)
{case 1:
System.out.println("You applied for a health policy");
break;
case 2:
System.out.println("You applied for the car loan");
break;
case 3:
System.out.println("You applied for a home loan");
break;
case 4:
System.out.println("You applied for the term plans");
break;
default:
System.out.println("you enntered the wronng option");
break;
}
break;
case 2:
System.out.println("Existing Policy Renewed");
break;
case 3:
System.out.println("Exit!!");
break;
}}while(m!=3);
}


void premium_calculator()
{Scanner s = new Scanner(System.in);
System.out.println("\t\t ENTER THE EXISTING AMOUNT:");
int amount=s.nextInt();
System.out.println("\t\t\t 1 : know the intrest on health policy:");
System.out.println("\t\t\t 2 : know the intrest on car loan:");
System.out.println("\t\t\t 3 : know the intrest on home loan:");
System.out.println("\t\t\t 4 : know the intrest on term plans:");
int k=s.nextInt();
switch(k)
{case 1:
amount+=(amount*12)/100;
System.out.println("AMOUNT WITH INTREST :"+ amount);
break;
case 2:
amount+=(amount*25)/100;
System.out.println("AMOUNT WITH INTREST :"+ amount);
break;
case 3:
amount+=(amount*18)/100;
System.out.println("AMOUNT WITH INTREST :"+ amount);
break;
case 4:
amount+=(amount*19)/100;
System.out.println("AMOUNT WITH INTREST :"+ amount);
break;
}
}
}

class demo
{

void credit_score()
{
 Random rand = new Random(); //instance of random class
      int upperbound = 1000;
        //generate random values from 0-1000
      int int_random = rand.nextInt(upperbound); 
System.out.println("\t\t\t YOUR CREDIT SCORE IS:"+int_random);
}


void foreign_units()
{
Scanner s = new Scanner(System.in);
System.out.println("\t\t ENTER THE EXISTING AMOUNT:");
float amounts=s.nextFloat();
System.out.println("\t\t\t 1 : know the units in USA:");
System.out.println("\t\t\t 2 : know the units in CHINA:");
System.out.println("\t\t\t 3 : know the units in UK:");
System.out.println("\t\t\t 4 : know the units in CANADA:");
int t=s.nextInt();
switch(t)
{case 1:
amounts*=0.013;
System.out.println("AMOUNT IN USA :"+ amounts);
break;
case 2:
amounts*=0.092;
System.out.println("AMOUNT IN CHINA :"+ amounts);
break;
case 3:
amounts*=0.010;
System.out.println("AMOUNT IN UK :"+ amounts);
break;
case 4:
amounts*=0.018;
System.out.println("AMOUNT IN CANADA :"+ amounts);
break;
}

}


public static void main (String  a[])
{int n;
do{
System.out.println("\t\t\t\t!!*****WELCOME TO THE POLICY MANEGEMENT SYSTEM*****!!");
System.out.println("\t\t\t 1: coustomer portal");
System.out.println("\t\t\t 2: premium calculator");
System.out.println("\t\t\t 3: credit score");
System.out.println("\t\t\t 4: Foreign units");
System.out.println("\t\t\t 5: For registration");
System.out.println("\t\t\t 6: for exit");
Scanner s=new Scanner(System.in);
n=s.nextInt();

demo2 p=new demo2();
demo1 v=new demo1();
demo d=new demo();
switch(n)
{
case 1:
v.new_policy();
break;

case 2:
v.premium_calculator();
break;

case 3:
d.credit_score();
break;
case 4:
d.foreign_units();
break;
case 5:
p.get_data();
break;
case 6:
System.out.println("*****THANKS FOR USING THE SYSTEM*****");
break;

}}while(n!=6);
}
 
}






