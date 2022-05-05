import java.util.Scanner;

public class Arreglo2{
  
  private static Scanner entrada;
  public static void main(String args[]){
    entrada = new Scanner(System.in);
    
    int m[][] = new int[3][3];
    int opc, i, j, t, x, y, temp;
    do {
      System.out.println("Menu");
      System.out.println("1. Cargar");
      System.out.println("2. Invertir");
      System.out.println("3. Ordenar");
      System.out.println("4. Imprimir");
      System.out.println("5. Salir");
      System.out.println("Digite opcion: ");
      opc = entrada.nextInt();

      switch(opc){
        case 1: cargar(m);
        break;

        case 2: invertir(m);
	break;

	case 3: ordenar(m);
	break;

        case 4: imprimir(m);
        break;
       }
      } while(opc != 5);
     }

  public static void cargar(int m[][]){
    System.out.println("Digite datos \n ");
    for (int i = 0; i < m.length; i++){
      for (int j = 0; j < m[i].length; j++){
        System.out.println("m[" + i + "][" + j + "]");
        m[i][j] = entrada.nextInt();
   }
	System.out.println("\n");
  }
 }
  
  public static void invertir(int m[][]) {
    for (int i = 0; i <= m.length / 2; i++) {
      for (int j = 0; j < m[i].length - i; j++) {
        int temp = m[i][j];
        m[i][j] = m[m.length - 1 - i][m[i].length - 1 - j];
        m[m.length - 1 - i][m[i].length - 1 - j] = temp;
   }
  }
 }

  public static void ordenar(int m[][]){
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        for (int x = 0; x < 3; x++){
          for (int y = 0; y < 3; y++){
            if (m[i][j] > m[x][y]){
              int t = m[i][j];
	      m[i][j] = m[x][y];
	      m[x][y] = t;
      }
     }
    }
   }
  }
 } 

  public static void imprimir(int m[][]){
    System.out.println("Los datos cargados son \n");
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 3; j++){
        System.out.print(" " + m[i][j]);
   }
      System.out.println("\n");
  }
 } 
}

