public class Prime {
    public static boolean isPrime(int x) {
        boolean flag_1 = true;
        int temp = (x / 2);

        for(int i = 2; i <= temp; i++) {            
            if ((x % i) == 0) {
                flag_1 = false;
                return flag_1;
         
            }
        }
        return flag_1;
    }

    public static void main(String args[]) {
        int i = 0;
        int limit = 13;
        limit++;

        while(i < limit) {
            if (isPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
    
}

