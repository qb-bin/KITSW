class Args {
    public static void add(double d, int ...arr) {
        int result = 0;

        for(int i : arr) {
            result += i;
        }
        System.out.println(result + d);
    }
    public static void main(String ... args) {
        int result = 0;
        
        if(args.length != 0) {
            for(String str : args) {
                result += Integer.parseInt(str);
            }
            System.out.println(result);
        }

        Args.add(9.0, 9);
        Args.add(9);
        Args.add(9, 9, 9, 9, 9);
        Args.add(9.9);
    }
}
