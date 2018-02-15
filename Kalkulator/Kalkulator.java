import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
      Funkcje funkcje = new Funkcje();
      String zmienna;
      double wynik;

      System.out.println("Witaj w moim prostym kalkulatorze :)\nNapisz co chcesz zrobic:");
      System.out.println("1 Dodawanie \n2 Odejmowanie \n3 Mnozenie \n4 Dzielenie");
      System.out.println("Autor \nExit");

      Scanner take = new Scanner(System.in);

      for (;;){
        
      zmienna = take.nextLine();

        switch(zmienna){
case "1":
    funkcje.odczyt();
    wynik = funkcje.dodawanie();
        System.out.println("Wynikiem dodawanie jest: "+wynik);
    break;
case "2":
    funkcje.odczyt();
    wynik = funkcje.odejmowanie();
    System.out.println("Wynikiem odejmowania jest: "+wynik);
    break;
case "3":
    funkcje.odczyt();
    funkcje.mnozenie();
    break;
case "4":
    funkcje.odczyt();
    funkcje.dzielenie();
    break;
case "Autor":
    System.out.println("\n-------------------------");
    System.out.println("-Autor: Sebastian Koziol-");
    System.out.println("-------------------------");
    break;
case "Exit":
    System.exit(1);
default:
    System.out.println("Nie wykraczaj po za zakres interfejsu.");
      }
    }
  }
}
