public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparación ***");
        int a = 3, b = 2;
        // Igualdad ==
        var resultado = a == b;
        System.out.println("resultado a == b : " + resultado);
        // Distinto !=
        resultado = a != b;
        System.out.println("resultado a != b : " + resultado);
        // Mayor que
        resultado = a > b;
        System.out.println("resultado a > b : " + resultado);
        // Mayor o igual que
        resultado = a >= b;
        System.out.println("resultado a >= b: " + resultado);
        // Menor que
        resultado = a < b;
        System.out.println("resultado a < b : " + resultado);
        // Menor o igual que
        resultado = a <= b;
        System.out.println("resultado a <= b " + resultado);
    }
}
