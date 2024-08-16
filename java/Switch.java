import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch(num) {
            case 0: 
                System.out.println("value is : 0");
                break;
            case 1: 
                System.out.println("value is : 1");
                break;
            case 2: 
                System.out.println("value is : 2");
                break;
            case 3: 
                System.out.println("value is : 3");
                break;
            default:
                System.out.println("value not in the record");
        }
        scan.close();
    }
}
