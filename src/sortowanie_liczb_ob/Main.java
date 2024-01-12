package sortowanie_liczb_ob;

import java.io.*;

class Sortowanie {
    public void czytajDane(int[] liczby, int n) {
        int i;

        liczby[0] = 43;
        liczby[1] = 324;
        liczby[2] = 53;
        liczby[3] = 62;
        liczby[4] = 19;
        liczby[5] = 3;

        System.out.println("\nLiczby nieposotrowane to: ");

        for (i = 0; i < n; i++) {
            if (i < n - 1)
                System.out.print(liczby[i] + ",");
            else
                System.out.print(liczby[i] + ".");
        }
        System.out.println("\n");
    }


    public void przetworzDane(int[] liczby, int n) {
        int i, j, x;

        for (i = 1; i <=n ;i ++)
        {
            for (j = n-1; j >= i; j--)
            {
                if (liczby[j-1] > liczby[j])
                {
                    x = liczby[j-1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            }//koniec petli j
        }//konec petlil i
    }


    public void wyswietlWynik(int [] liczby, int n)
    {
        int i;

        System.out.print("Liczby posortowanie to: \n");

        for(i = 0; i < n; i++)
        {
            if (i < n-1)
                System.out.print(liczby[i] + ",");
            else
                System.out.print(liczby[i] + ".");
        }
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args)
    {
        int n = 6;
        int [] liczby = new int[n];

        Sortowanie babelki = new Sortowanie();

        babelki.czytajDane(liczby, n);
        babelki.przetworzDane(liczby, n);
        babelki.wyswietlWynik(liczby, n);
    }
}
