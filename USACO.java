/*
    I would write a for loop that counts 
  the number of cpows willing to pay. Then, 
  I would observe their payments and list their 
  payments horizontally according to their 
  potential payments.

    From 
*/

import java.util.Scanner;

class USACO { // cow college - 2022 bronze problem 1

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();

    int[] cows = new int[N];

    String[] cowsString = sc.nextLine().split(" ");

    for (int i = 0; i < N; i++) {
      cows[i] = cowsString[i];
    }
    int n = cows[0];

    for (int i = 0; i < N; i++) {
      if (cows[i] > n) {
        n = cows[i];   
      }
    }

  }
}