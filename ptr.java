class ptr {
    int x;
    int y;

    public void read(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("the value of x:" + x);
        System.out.println("the value of y:" + y);
    }
}

class pointer {
    public static void main(String[] args) {
        ptr p = new ptr();
        p.read(2, 4);
        p.display();
    }
}
