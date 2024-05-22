import java.util.*;
import java.io.*;
 class numgame 
{

     
        public void game()
        {
            int c=0;
            int score=0;
        
            while (c<10) 
            {
        
    
                Random r = new Random();
                int s=r.nextInt(100);
                //System.out.println(s);
                Scanner sc = new Scanner(System.in);
                System.out.println("enter your number to guess and match");
                int a=sc.nextInt();
                c++;

                if(s==a)
                {
                    System.out.println("its correct");
                    score++;
                }
                else
                if(s<a){
                    System.out.println("too high");

                }
                else
                {
                    System.out.println("too low");
                }
                System.out.println("the number was:"+s);
                System.out.println("no of tries is "+c);
        
    
        
                if(c==10)
                {
                    System.out.println("you cannot have more than 10 tries");
                    System.out.println("your score is:"+score);
               
                }
                
             
            }
                Scanner sc = new Scanner(System.in);
                
                System.out.print("do you want to go for another round(1/0):");
               
                int choice;
                choice=sc.nextInt();
               switch(choice)
               {
                    case 1:game();
                    break;
                    case 0:break;

               }
         
            
        }
        

       
   
        
        

    
}  
class testgame
{
    public static void main(String[] args) {
        numgame nm = new numgame();
        nm.game();
    }
}  


 
    

