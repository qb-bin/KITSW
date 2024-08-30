class ThisObj {
    int a;
    ThisObj(int val) {
        this.a = val;
    }
    void print() {
        System.out.println(this.a);
    }    
}

class This {
    public static void main(String args[]) {
        ThisObj o1 = new ThisObj(9);
        o1.print();
    }
}