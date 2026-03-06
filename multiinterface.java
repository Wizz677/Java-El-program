import java.util.*;
interface personal{
    public void personalDetails();
    
}
interface official{
    public void officialDetails();
    
}

public class employee implements personal, official {
    String name;
    String gender;
    int empid;
    String deptname;
    employee(String name, String gender, int empid, String deptname){
        this.name = name;
        this.gender = gender;
        this.empid = empid;
        this.deptname=deptname;
    }
    
    public void personalDetails() {
        System.out.println("personal Name:" + name);
        System.out.println("personal gender:" + gender);
    }
    public void officialDetails() {
        System.out.println("Employee empid:" +empid);
        System.out.println("Employee department:" +deptname;
        
    }
    
}

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter gender:");
        String gender=sc.nextLine();
        System.out.println("Enter empid:");
         System.out.println("Enter Department:");
        String gender=sc.nextLine();
        
         System.out.println("Enter choices:");
         
       
        
        
    }
}
