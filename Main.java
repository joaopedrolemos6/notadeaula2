public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setLadoA(5);
        triangle.setLadoB(5);
        triangle.setLadoC(5);
        System.out.println(triangle.checkTriangle());

        Triangle triangle2 = new Triangle();
        triangle2.setLadoA(5);
        triangle2.setLadoB(6);
        triangle2.setLadoC(7);
        System.out.println(triangle2.checkTriangle());
    }
}