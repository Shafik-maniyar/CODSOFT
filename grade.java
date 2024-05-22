
import java.util.*;
public class grade {
    private int comptotal;
    private int mathstotal;
    private int electotal;
   

    Scanner sc = new Scanner(System.in);
    public void accept(){

    
    System.out.println("enter comp marks");
    comptotal=sc.nextInt();
    System.out.println("enter maths marks");
    mathstotal=sc.nextInt();
    System.out.println("enter elec marks");
    electotal=sc.nextInt();
    }

    
    public void display()
    {
        System.out.print(+comptotal+"\t"+mathstotal+"\t"+electotal+"\t\n");
       
       
       

    }

    public void totalstd()
    {
        int total;
        System.out.println("total marks of the student out of 300 are");
        total=comptotal+mathstotal+electotal;
        System.out.println(total);
        float percentage;
        percentage=((total/100)*300)/10;
        System.out.println("total percentage of the student are:"+percentage);
        float average;
        average=(total)/3;
        System.out.println("the average of the student is:"+average);
        
       
    }
  

    }
    
     class Innergrade {
    public static void main(String[] args) {
        grade g = new grade();
        g.accept();
        g.display();
        g.totalstd();
    }
        
    }
    

