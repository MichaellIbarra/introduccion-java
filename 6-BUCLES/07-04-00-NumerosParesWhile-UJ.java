public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Números Pares del 0 al 20 ***");
        var contador = 0;
        while(contador <= 20){
            // Revisamos si es un numero par
            if(contador % 2 == 0)
                System.out.print(contador + " ");
            contador++;
        }
    }
}
