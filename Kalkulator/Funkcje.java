import java.util.Scanner;

public class Funkcje {
    double a;
    double b;

   void odczyt(){
      Scanner take = new Scanner(System.in);
      System.out.println ("Podaj liczbe a oraz b:");
      a = take.nextDouble();
      b = take.nextDouble();
    }

    double dodawanie(){
        return a+b;
    }

    double odejmowanie(){
        return a-b;
    }

    void mnozenie(){
        System.out.println ("Wynikiem mnozenia jest: "+a*b);
    }

    void dzielenie(){
        System.out.println ("Wynikiem dzielenia jest: "+a/b+" natomiast reszta to: "+a%b);
    }
}
