class Triangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoC() {
        return ladoC;
    }

    public String checkTriangle() {
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            return "Esses lados nao podem formar um triangulo";
        } else if (ladoA == ladoB && ladoB == ladoC) {
            return "Esses lados fazem um triangulo equilátero.";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Esses lados fazem um triangulo isóceles.";
        } else {
            return "Esses lados fazem um triangulo escaleno.";
        }
    }
}