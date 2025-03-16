class human{
    private String name = "Narmadha";
    private int Reg_no = 10103;

    String Whats_Your_Name(){
        return name;
    }
    int Whats_Your_Reg(){
        return Reg_no;
    }
}
public class Eancap {
    public static void main(String[] args) {
        human h = new human();
        System.out.println(h.Whats_Your_Name());
        System.out.println(h.Whats_Your_Reg());

    }
}