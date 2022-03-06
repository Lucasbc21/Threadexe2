package view;
import controller.Matriz;

public class calc {
	public static void main(String [] args) {
		int[][] matriz = new int[3][5];
		for(int i = 0; i < 3; i++)
			for(int j=0; j < 5; j++) 
				matriz[i][j] = (int) (Math.random() * 100);
		
		for(int i =0; i < 3; i++)
			new Matriz(i+1, matriz[i]).start();
	}
}