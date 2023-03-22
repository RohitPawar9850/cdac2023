/*
Q.1
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

/*
class P1 
{
	public static void main (String args [])
	{
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1; j<= i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

------------------------------------------------------------------------------------------


/*Q.2
/*
A
A B
A B C
A B C D
A B C D E
A B C D E F

---------------------------------------------------------------------------------

class P2 
{
	public static void main (String args [])
	{
		for(char i =65;i<=70;i++)
		{
			for(char j =65; j<= i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

------------------------------------------------------------------------------
/*Q.3
/*
*
* *
* * *
* * * *
* * * * *



class P3 
{
	public static void main (String args [])
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

---------------------------------------------------------------------------------------------
Q.4
/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 

class P4 
{
	public static void main (String args [])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}

------------------------------------------------------------------------------------------------------------
Q.5

A
B B
C C C
D D D D
E E E E E
F F F F F F


class P5 
{
	public static void main (String args [])
	{
		for(char i=65;i<=70;i++)
		{
			for(char j=65;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

------------------------------------------------------------------------------------------------------
Q.7
           *
         * *
       * * *
     * * * *
   * * * * *

class P6
{
	public static void main (String args [])
	{
		int i,j,n=5;
		for(i=0;i<n;i++)
		{
			for(j=2*(n-i);j>=0;j--)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

----------------------------------------------------------------------------------------------------------

Q.7

class P7
{
public static void main(String args [])
{
for(int i=1;i<=5;i++){
	
	for(int k=4;k>=i;k--){
	System.out.print(" ");
	}
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");

		}
		
	System.out.println();
}
}
}
/*
   1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5


-----------------------------------------------------------------------------------------------------
Q.8
/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5


class  P8
{
	public static void main(String[]args)
	{
		for (int i= 5; i >= 1; i--)
		    {
			for (int  j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <=5; k++)
			{
				System.out.print(k + " ");
			} 
			System.out.println();
			
		    }
    }
}

---------------------------------------------------------------------------------------------------------------

Q9
/*
     A
    A B
   A B C
  A B C D
 A B C D E
 

class P9
{
	public static void main (String args [])
	{
		for (char a = 65;a<70;a++)
		{
			for(char b=69;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(char c=65;c<=a;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}

--------------------------------------------------------------------------------------------------------
Q10

/*
     E
    D E
   C D E
  B C D E
 A B C D E
 
 
 
class P10{
	 
	 public static void main(String[] args){
		 
		 int a = 70;
		 
		 for (int i=1;i<=5;i++)
		 {
			 
			 for( int k=5;k>=i;k--)
			 {
				 System.out.print(" ");
			 }
			 
			 for (int j=0;j<i;j++)
			 {
				 System.out.print((char)(a-i+j) + " ");
			 }
			 
			    System.out.println();
				
		 }
	 }
}


-----------------------------------------------------------------------------------------------------------
/*
Q11


    *
   ***
  *****
 *******
*********



class StarP5 
{
	public static void main (String args [])
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(j>i)
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

--------------------------------------------------------------------------------------------------
Q12

/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
 
 
class P12 
{
	public static void main (String args [])
	{
		int j;
		for(int i=1;i<=5;i++)
		{
			for( j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

-----------------------------------------------------------------------------------------------------------
Q13

    A
   B B
  C C C
 D D D D
E E E E E

class  P13
{
	public static void main(String[]args)
	{
		char a = 65;
		for (int i= 5; i >= 1; i--)
		{
			for (int  j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for (int k = i; k <=5; k++)
			{
				System.out.print(a+" ");
				
			} 
			System.out.println();
			a++;
			
		    }
    }
}
--------------------------------------------------------------------------------------------------------
Q14.
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

class P14
{
	public static void main (String args [])
	{
		int a=1;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

-------------------------------------------------------------------------------------------------------------
Q15.
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

class P15
{
	public static void main(String args[])
	{
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

-----------------------------------------------------------------------------------------------------------------
Q16
5
54
543
5432
54321

class P16 
{
	public static void main (String args[])
	{
		for(int a=5;a>=1;a--)
		{
			for(int b=5;b>=a;b--)
			{
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
-------------------------------------------------------------------------------------------------------

Q17 
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

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

-------------------------------------------------------------------------------------------------------------
Q18
A B C D E
A B C D
A B C
A B
A

class P18 
{
	public static void main (String args[])
	{
		char a=65;
		for(int i =1;i<=5;i++)
		{
			for(char j=65;j<=70-i;j++)
			{
				System.out.print(j+" ");
			
			}
			System.out.println();
			
		}
	}
}
*/
        