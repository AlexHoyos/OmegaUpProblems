import java.util.*;
public class MatrizRoll {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        int[][] matriz = new int[max][max];
        for(int i = 0; i<max; i++){
            matriz[0][i] = in.nextInt();
            for(int x = 0; x<max; x++){
                if(x < max && (i-x) >= 0 && x != 0){
                    matriz[x][i-x] = matriz[0][i];
                }
                if(i < (max-1) && (i+(max-1)-x) < max && (x+1) < max){
                    matriz[x+1][i+(max-1)-x] = matriz[0][i];
                }
            }
        }

        matriz[max-1][max-1] = matriz[0][max-2];

        for(int i = 0; i<max; i++){
            for(int x = 0; x<max; x++){
                System.out.print(matriz[i][x] + " ");
            }
            System.out.print("\n");
        }

    }
}
