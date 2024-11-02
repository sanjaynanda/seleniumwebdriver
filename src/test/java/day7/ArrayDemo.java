package day7;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[][]= { {100,200},
					{300,400},
					{500,600},
					{700,800}
					};
		
		/*for(int Arr[]:a)
		{
			for(int x:Arr)
				{System.out.print(x+" ");
				}
			System.out.println();
				}
				*/
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			
			}	
			System.out.println();
		}
		}
		}




