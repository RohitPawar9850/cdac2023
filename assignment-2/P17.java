class P17
{
	public static void main (String args[])
	{
		int c =1;
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print((c++)+" ");
			}
			System.out.println();
		}
	}
}