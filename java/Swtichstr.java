public class Swtichstr {
    public static void main(String args[]) {
        
        String str = "kits";

        switch(str) {
            case "kits": 
                System.out.println("Kakatiya institute of tech.");
                break;
            case "ku": 
                System.out.println("Kakatiya University");
                break;
            case "bits": 
                System.out.println("Birla institue of tech.");
                break;
            default:
                System.out.println("not recognised");
        }
    }
}