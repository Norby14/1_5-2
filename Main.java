import java.util.*;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Liczby nie parzyste:");
		int i;
		for (i=50 ; i<101 ;i++)
			{
				if (i % 2==1)
				System.out.print(i + ", ");
			}
		System.out.println(" \n Podaj liczbe do sprawdzenia:");
		Scanner scan = new Scanner(System.in);
		int  liczba;
		boolean result = true;
		liczba = scan.nextInt();
		for(int k=0; k<200; k++)
          {
						 if (liczba%2==0)
              {
                  result = false;
                  break; 
          }
						}
          System.out.println("Liczba " + liczba + " " + (result == true ? "nie jest" : " jest") + " liczbą parzystą");
						}
		}


