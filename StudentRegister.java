/*postgres=# create table Studenttable(sid int primary key,sname text,registeredcourse text);
CREATE TABLE
postgres=# create table Coursetable(cid int primary key,title text,description text,capacity int,schedule time);
CREATE TABLE
postgres=# select * from Coursetable;
 cid | title | description | capacity | schedule
-----+-------+-------------+----------+----------
(0 rows)


postgres=# select * from Studenttable;
 sid | sname | registeredcourse
-----+-------+------------------
(0 rows)*/

import java.sql.*;
import java.util.*;
import java.io.*;
public class jdq1q4 
{
    public static void main(String arrs[])
    {
        Connection con;
        ResultSet rs;
        Statement st;
        try
        {
         Scanner sc = new Scanner(System.in);
            int choice;
            int sid,cid;
            String name;
            int marks;
            Class.forName("org.postgresql.Driver");
            con=  DriverManager.getConnection("jdbc:postgres://localhost/student","postgres","password");
            st=con.createStatement();//using the connection get a statement
            
            System.out.println("1.Register");
            System.out.println("2.Delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

        
            switch(choice)
            {
                case 1:System.out.println("enter the student id to register for the course");
                        sid = sc.nextInt();
                       System.out.println("enter course id for which the student has to register");
                        cid = sc.nextInt();
                    
                       st.executeUpdate("insert into Studenttable where sid="+sid+")");
                       System.out.println("Inserted successfully");

                        break;


                case 2: System.out.println("enter student id");
                        sid = sc.nextInt();
                        System.out.println("enter the course id");
                        cid = sc.nextInt(); //no need to add double quotes and plus when to insert at the end
                        st.executeUpdate("delete from studentcourse where sid="+sid+" and cid="+cid+")");
                        break;




                case 3:rs=st.executeQuery("select * from student");//in a tabular format
                       System.out.println("ID\t\tNAME\t\tMARKS");
                       while(rs.next())
                       {                                        //double plus double quotes
                        System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3));
                       }
                        break;


                


               
            }
          

        
         
        }
        catch(Exception e)
        {

        }
    
    }    
}
