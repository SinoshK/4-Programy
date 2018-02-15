import java.util.Random;
import java.util.Arrays;

public class Tosort {

  void losowanie(){
    int[] tablica = new int[10];
    Random generator = new Random();
  for (int i = 0; i<tablica.length; i++){
    tablica[i] = generator.nextInt(10)+1;
    System.out.print(tablica[i]+" ");
    }
    Arrays.sort(tablica);
    System.out.println("\n"+Arrays.toString(tablica));
  }

  int losowanie2(){
    Random generator = new Random();
    int m = generator.nextInt(10)+1;
    return m;
    }
  }
