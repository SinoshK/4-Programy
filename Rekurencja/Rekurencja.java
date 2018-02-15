import java.util.Scanner;

public class Rekurencja {

  static int silnia(int i){
    if (i<1)
      return 1;
    else
      return i*silnia(i-1);
  }

  static int newton (int a, int b){
    if (b==0 || a==b)
      return 1;
    else
      return ((newton (a-1, b-1))+(newton(a-1, b)));
  }

  public static void main(String[] args){

    Scanner take = new Scanner(System.in);
    int n;
    int k;

    System.out.println("Symbol Newtona \nPodaj n i k:");
    n = take.nextInt();
    k = take.nextInt();
    System.out.println(silnia(n));
    System.out.println(silnia(k));
    System.out.println(silnia(n)/(silnia(k)*silnia(n-k)));
    System.out.println(newton(n, k));
  }
}
