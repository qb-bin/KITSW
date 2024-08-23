class BoxSet {
    double width;
    double heigth;
    double depth;     

    void setData(double w, double h, double d) {
        width  = w;
        heigth = h;
        depth  = d; 
    }

    double volume() {

        return (width * heigth * depth);
    }

}

class SetEx {
    public static void main(String[] args) {
        BoxSet b = new BoxSet();
        b.setData(10, 20, 30);
        System.out.println((b.volume()));
    }
}

