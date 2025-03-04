public class nested {
    public static void main(String[] args) {
        int mark =37;
        if(mark>=35){
            System.out.println("Pass");
            if(mark>=80){
                System.out.println("Above 80");
                if(mark ==100){
                    System.out.println("Centum");
                }
            }
        }
        else{
            System.out.println("Fail");
        }

    }
}
