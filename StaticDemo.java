class StaticDemo {

    static int x;

    static {
        x = 10;
        System.out.println("Static block executed");
    }

    static void show() {
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        StaticDemo.show();
    }
}