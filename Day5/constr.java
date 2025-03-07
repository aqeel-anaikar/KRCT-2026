import java.util.Scanner;

class wifi
{
    // Data members
    // Instance variables
    int Id;
    String Name;
    // Constructor
    wifi(int id, String name){
        // this keyword is used to refer to the current object
        this.Id = id;
        this.Name = name;
    }
    void get_name()
    {
        // Printing the values of the data members
        System.out.println("Id :"+Id);
        System.out.println("Name:"+Name);
    }
}
public class constr {
    public static void main(String[] args) {
        // Creating object of class wifi
        wifi student = new wifi(101,"nandhini");
        wifi staff = new wifi(503,"narmadha");
        student.get_name();
        // Calling the method of class wifi
        staff.get_name();

    }
}
