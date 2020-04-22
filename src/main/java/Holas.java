import java.util.Scanner;
public class Holas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz Ordenada.");
        System.out.print("Inserta numero de Filas: ");
        int nFilas=sc.nextInt();
        System.out.print("Inserta numero de Columnas: ");
        int nColumnas=sc.nextInt();
        
        int [][] matriz = new int [nFilas][nColumnas]; 
        
        System.out.println("Guardar Matriz");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        //Matriz Original
        System.out.println("Matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+matriz[i][j]+"]" + " ");   
            }
                System.out.println();
        }
        
        //Ordenando Matriz
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                for(int y=0; y<nFilas; y++){
                    for(int x=0; x<nColumnas; x++){
                        if(matriz[i][j] < matriz[y][x]){
                            int aux=matriz[i][j];
                            matriz[i][j]=matriz[y][x];
                            matriz[y][x]=aux;
                        }
                    }
                }
            }
        }
        
        System.out.println("\nMatriz Ordenada: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+matriz[i][j]+"]"+ " ");
            }
                System.out.println();
        }  
    }
}