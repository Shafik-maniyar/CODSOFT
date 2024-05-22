import java.util.*;
import java.io.*;
class Atm 
{
    
    int pin=0000;
    float balance;
  
    public void checkpin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your pin:");
        int enterpin=sc.nextInt();
        if(enterpin==pin)
        {
        menu();

        }
        else{
        System.out.println("enter a valid pin");

        }
    }
            public void menu()
            {        
                    Scanner sc= new Scanner(System.in);
                    System.out.println("Enter your choice");
                    System.out.println("1:Check Balance");
                    System.out.println("2:Withdraw Money");
                    System.out.println("3:Deposit Money");
                    System.out.println("4:Exit"); 

                    int choice=sc.nextInt();
                    switch(choice)
                    {
                        case 1: checkbalance();
                        break;
                        case 2: withdrawmoney();
                        break;
                        case 3: depositmoney();
                        break;
                        case 4: 
                        break;
                    

                    }
            
            
          
            

    
            }

        public void checkbalance()
        {
            System.out.println("Balance:"+balance);
            menu();
        }
        public void withdrawmoney()
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter amount you want to use:");
		    int amt=sc.nextInt();
		        if(amt>balance)
            {
			
			    System.out.println("insufficient funds");
            }
                else{
            
                    balance=balance-amt;
                    System.out.println("Money withdrawl is successful");
                    }
                menu();

        }
        public void depositmoney()
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your deposit amount");
            int dpamt =sc.nextInt();
            balance=balance+dpamt;
            System.out.println("Money deposit is successful");
            menu();
            
        }
    
}

class testatm
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        Atm at = new Atm();
        at.checkbalance();
        at.depositmoney();
        at.withdrawmoney();
        at.menu();

        
    }
}
