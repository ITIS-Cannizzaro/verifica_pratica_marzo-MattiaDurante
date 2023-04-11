import java.util.Scanner;
public class verifica_marzo {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		// Accordino: ti prego, la prossima volta scrivici i numeri o nomi!!!
		//esd();  // UgualiConsecutivi 
		//es3m(); // LancioRisiko
		//esm2(); // StampaZigZag
		esf1(); // MinimoDiArray
	}
	
	// Accordino: I nomi dei metodi devono far capire cosa fanno!
	// ok: 4pt
	static void esd()
	{
		int[] array = new int[20];
		random3(array);
		controllo(array);
	}
	static int[] random3 (int[]a)
	{
		for (int i = 0 ;  i < a.length; i++)	
		{
			a[i] = (int)((Math.random()*7) - 4);
			System.out.println(a[i]);
		}
		return a;
	}
	static void controllo (int[]a)
	{
		int c = 0;
		for(int i = 0 ; i < a.length-1; i++)
			if(a[i] == a[i+1])
			{
				System.out.println(a[i] + " nella posizione numero " + i + " e " + (i+1) );
				i++;
			}
		if (c == a.length)
			System.out.println("non ci sono numeri uguali");
	}
	
	// Accordino: ok 3 pt
	static void es3m()
	{
		int[] att = new int[3];
		random(att);
		System.out.println("attacco");
		ordine(att);
		int[] dif = new int[3];
		random(dif);
		System.out.println("difesa");
		ordine(dif);
		controllo2(att,dif);
	}
	static int[] random(int[]a)
	{
		for (int i = 0; i < a.length; i++)
			a[i] = (int) ((Math.random()*6)+1);
		return a;
	}
	static int[] ordine (int[]a)
	{
		int temp = 0; 
		for (int j = 0; j < a.length; j++)
			for (int i = 0; i < a.length; i++)
			{
				if(a[i] < a[j])
				{
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				}
			}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		return a;
	}
	static void controllo2 (int[]a, int[]b)
	{
		int pta = 0;
		int ptb = 0; 
		for(int i = 0; i < a.length; i++)
		if(a[i] > b[i])
			pta ++;
		else 
			ptb ++;
		System.out.println("i punti dell'attaccante sono : "+ pta + "\ni punti del difensore sono " + ptb);
	}
	static void esm2()
	{
	int[] a = new int[10];
	random10(a);
	int c = a.length-1;
	System.out.println();
	for(int i = 0; i < a.length/2; i++)
	{
		System.out.println(a[i]);
		System.out.println(a[c]);
		c--;
	}
	}
	static void random10(int[] a)
	{
	for (int i=0 ; i < a.length; i++)	
	{
		a[i] = (int)(Math.random()*11);
	System.out.println(a[i]);
	}
	}
	
	static void esf1()
	{
		int[] array = new int[10]; 
		random5(array);
		controllo3(array);
	}
	static int[] random5 (int[]a)
	{
		for(int i = 0; i < a.length; i++)
		a[i] = (int)((Math.random()*11)-6);
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		return a;
	}
	static void controllo3(int[]a)
	{
		int min = 0;
		for(int i = a.length-1; i > 0 ; i--)
			if(a[min] > a[i])
				min = i;
		System.out.println("il valore minimo � : " + a[min] + " alla posizione numero " + min);
	}
}

