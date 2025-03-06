public class rev {
    public static void main(String[] args) {
        String str = "ASDF";
        char carr[]= str.toCharArray();
        for(int i = carr.length - 1;i>=0;i--){
            System.out.print(carr[i]);
        }
    }
}
