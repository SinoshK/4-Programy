import java.util.Scanner;

public class Gra {
    public static void main(String[] args){
      Scanner take = new Scanner(System.in);
      Los los = new Los();
      int zgad = 0;
      int ukryta;
      int prob = 0;

      System.out.println("Zagrajmy w gre :)\nZgadnij jaka liczbe wylosowalem");

      ukryta = los.losowanie();

      while(zgad != ukryta){
        prob++;
      zgad = take.nextInt();
      if (zgad == ukryta){
      System.out.println("Brawo zgadles !!!");
      }
      else if (zgad > ukryta){
      System.out.println("Twoja liczba jest za duza");
      }
      else if (zgad < ukryta){
      System.out.println("Twoja liczba jest za mala");
      }
    }
    System.out.println("Liczba prob to: "+prob);
  }
}
