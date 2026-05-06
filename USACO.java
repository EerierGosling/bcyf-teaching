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

    for (int i = 0; i < N; i++) {
      cows[i] = sc.nextInt();
    }

    int max = 0;

    for (int i = 0; i < N; i++) {
      if (cows[i] > max) {
        max = cows[i];
      }
    }

    int profitMax = 0;
    int maxCost = max;

    for (int i = max; i > 0; i--) {
      int iProfit = profit(i, cows);
      if (iProfit >= profitMax) {
        profitMax = iProfit;
        maxCost = i;
      }
    }

    System.out.print(profitMax + " " + maxCost);

  }

  public static int profit(int cost, int[] cows) {
    int totalProfit = 0;
    for (int cow : cows) {
      if (cost <= cow) {
        totalProfit += cost;
      }
    }
    return totalProfit;
  }
}