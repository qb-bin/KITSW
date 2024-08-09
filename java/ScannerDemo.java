import java.util.*;  
class ScannerDemo {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.print("input the marks : ");
        int i = scanner.nextInt(); 
        //i : int console input
        if(i < 0) System.out.println("invalid input");
        else if(i > 90) {
            System.out.println("grade : S");
        }
        else if(i < 90 & i > 80) {
            System.out.println("grade : A");
        }
        else if(i < 80 & i > 70) {
            System.out.println("grade : B");
        }
        else if(i < 70 & i > 60) {
            System.out.println("grade : C");
        }
        else if(i < 60 & i > 50){
            System.out.println("grade : D");
        }
        else {
            System.out.println("grade : D");
        }
        scanner.close();

    }  
}