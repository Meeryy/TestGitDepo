import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> cisla = new ArrayList<Integer>();
         
		while(true) {
			System.out.print("Zadej cisl:");
			int x = sc.nextInt();
			if(x==0) break;
			if (x < 0){
				System.out.println(x+"Neni kladne cislo");
				
			} else {
			cisla.add(x);
			}
		}
		System.out.println();
		for (int x: cisla) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int y: cisla) {
			System.out.print(y+" ");
		}
		System.out.println();
		for (int y :cisla) {
			if(y % 2 == 0) System.out.print(y+" ");
		}
		System.out.println();
		
		double suma =0;
		for (int y:cisla){
			suma += y;
		}
		System.out.println("Prumer"+(suma/cisla.size()));
	   Collections.sort(cisla);
	   System.out.println("Max"+cisla.get(cisla.size()-1));
	   boolean neniDruhe = true;
	   int nejmensi = cisla.get(0);
	   for(int y:cisla) {
		   if(nejmensi< y) {
			   System.out.println("Druhe nejmensi"+y);
			   neniDruhe = false;
			   break;
			   
		   }
	   }if (neniDruhe)System.out.println("vlistu neniDruhe nejmensi cislo");
	}
	

}
