package Study_4;

public class Study4
{
	public static void main(String[] args) 
	{
		int i = 2;
		while(i < 10)
		{
			int k = 1;
			while(k < 10)
			{
				System.out.println(i + " x " + k + " = " + i*k);
				k++;
			}
			i++;
		}
	}
}
