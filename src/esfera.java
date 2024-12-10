public class esfera {
    public static double calcularEsfera(double raio) {
        double volume = 0.0;
        volume = ( 4 * Math.PI * raio * raio * raio ) / 3.0;
        return volume;
    }
}
