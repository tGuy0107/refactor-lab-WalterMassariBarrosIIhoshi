package figuras;

public class Paralelogramo {
    private final String tipo = "Rectángulo";
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

public Paralelogramo(double a, double b) {
base = a;
altura = b;
}

public void mostrar() {
System.out.println("Tipo: " + tipo);
System.out.println("Ancho: " + base);
System.out.println("Alto: " + altura);

    System.out.println("Perímetro: " + getPer());

    double area = getArea();
    System.out.println("Área: " + area);
}

    private double getArea() {
        double area = base * altura;
        return area;
    }

    private double getPer() {
        return (base * 2) + (altura * 2);
    }

public boolean mismoTamanyo(boolean exactitud, Paralelogramo paral) {
if (exactitud) {
return this.base == paral.base && this.altura == paral.altura;
} else {
return Math.abs(this.base - paral.base) < 1 &&
Math.abs(this.altura - paral.altura) < 1;
}
}
}
