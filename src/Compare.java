public class Compare {
    public static void main(String[] args){
        int i=9;
        int j=10;
        if(++i<11 && ++j<12){
            System.out.println("True");
        }
        else{
            System.out.println("False");

        }
        System.out.println("i = " +i);
        System.out.println("j = " +j);

    }
}
