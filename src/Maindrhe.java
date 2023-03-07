import java.util.ArrayList;
import java.util.Random;
public class Maindrhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		ArrayList<Integer> cisla = new ArrayList<Integer>();
		for(int i = 0; i< 10; i++) {
			cisla.add(rnd.nextInt(1000)+1);
		}
		int x = cisla.get(0);
		for (int i =1; i <cisla.size()-1; i++) {
			if(x> cisla.get(i)) {
				cisla.remove(i);
				i = i-1;
			}
			else {
				x= cisla.get(i);
			}
		}
		for (int a : cisla) {
			System.out.print(a+" ");
		}
	}

}
