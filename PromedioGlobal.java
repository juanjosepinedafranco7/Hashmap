public class PromedioGlobal {
    public static void main(String[] args) {
        int[][] matriz = {
            {80, 85, 90},
            {75, 88, 92},
            {82, 79, 87}
        };
        
        int suma = 0, totalCeldas = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                totalCeldas++;
            }
        }
        double promedio = (double) suma / totalCeldas;
        System.out.println("Promedio global: " + promedio);
    }
}
