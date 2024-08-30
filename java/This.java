class ThisObj {
    String rno, name;
    ThisObj(String r, String n) {
        rno  = r;
        name = n;
    }
    void print() {
        System.out.println(this.rno + " " + this.name);
    }    
}

class This {
    public static void main(String args[]) {
        ThisObj o1 = new ThisObj("B24DS065L", "qb");
        o1.print();
    }
}