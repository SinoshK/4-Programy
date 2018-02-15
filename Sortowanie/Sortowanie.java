import java.util.Scanner;

public class Sortowanie {
    public static void main(String[] args){
      Tosort sort = new Tosort();
      int[] tab = new int[10];
      int zmien;
      int cosrobi = 1;

      System.out.println("Program sortujacy liczby.");
      System.out.println("Sortujący z Arrays i sort.");
      sort.losowanie();

      System.out.println("A ten zwlasnej implementacji.");
      for (int i=0; i<tab.length; i++){
        tab[i] = sort.losowanie2();
        System.out.print(tab[i]+" ");
      }

      System.out.println("");

        while (cosrobi > 0){
          cosrobi = 0;
          for (int i=0; i<tab.length-1; i++){
          if (tab[i]>tab[i+1]){
            zmien = tab[i];
            tab[i] = tab[i+1];
            tab[i+1] = zmien;
            cosrobi++;
          }
        }
      }
      for (int i=0; i<tab.length; i++){
        System.out.print(tab[i]+" ");
      }
    }
  }
