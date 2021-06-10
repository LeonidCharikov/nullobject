public class Main  
{ 
    public static void main(String[] args)  
    { 
        Emp emp1 = Empdata.getClient("Lokesh"); 
        Emp emp2 = Empdata.getClient("Kushagra"); 
        Emp emp3 = Empdata.getClient("Vikram"); 
        Emp emp4 = Empdata.getClient("Rishabh"); 
  
  
        System.out.println(emp1.getName()); 
        System.out.println(emp2.getName()); 
        System.out.println(emp3.getName()); 
        System.out.println(emp4.getName()); 
    } 
} 