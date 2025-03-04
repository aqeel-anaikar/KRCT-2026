public class elseifL {
    public static void main(String[] args) 
    {
        int mark = 3,pass=35;

        if(mark==100){
            System.out.println("Centum");
        }
        else if(mark >=80){
            System.out.println("Above 80");
        }
        else if(mark >=50){
            System.out.println("Above 50");
        }
        else if(mark >=35){
            System.out.println("Pass");
        }

        else{
            System.out.println("Fail");
        }

    }
}