public class SumaTotalMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {20, 30, 40, 50}
        };
        
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        System.out.println("Suma total de la matriz: " + total);
    }
}
