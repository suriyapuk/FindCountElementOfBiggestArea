class FindCountElementOfBiggestArea
{
	public static void main(String[] args){
		int i,j=0;
		int row=7;
		int column=4;
		int pos_x=0,pos_y=0;
		int max=0,count=0;

		for(i=0;i<=row;i++)
		{
			for(j=0;j<=column;j++)
			{
				Matrix matrix = new Matrix();
				if(i==0 && j==0)
				{
					matrix.displayMatrix();
				}
				count=matrix.dfs(matrix,i,j);

				if(count>max)
				{
					max=count;
					pos_x=i;
					pos_y=j;
				}
				count=0;
			}
		}

		Matrix matrix = new Matrix();
		matrix.dfs(matrix,pos_x,pos_y);
		System.out.println("\nThe biggest area of ["+matrix.getValue(pos_x,pos_y)+"] is "+max+"\n");
		matrix.displayVisited();
	}
}

class Matrix
{
	int i,j=0;
	int row=7;
	int column=4;
	int count=1;
	int max=1;
	int[][] arr=new int[row+1][column+1];

	public int[][] matrixvalue = new int[][]
	{
		{ 0, 0, 0, 2, 2 },
                { 1, 1, 7, 2, 2 },
                { 2, 2, 7, 2, 1 },
                { 2, 1, 7, 4, 4 },
                { 2, 7, 7, 4, 4 },
                { 4, 6, 6, 0, 4 },
                { 4, 4, 6, 4, 4 },
                { 4, 4, 6, 4, 4 }
	};

	public int getValue(int x, int y)
	{
		return matrixvalue[x][y];
	}

	public void displayMatrix(){
		System.out.println("\n*************");
		System.out.println("*MATRIX DATA*");
		System.out.println("*************");

		for(i=0;i<=row;i++)
		{
			System.out.print("[ ");

			for(j=0;j<=column;j++)
			{
				System.out.print(this.getValue(i,j)+" ");
			}
			
			System.out.println("]");
		}
	}

	public void displayVisited()
	{
		System.out.println("**************");
		System.out.println("*BIGGEST AREA*");
		System.out.println("**************");

		for(i=0;i<=row;i++)
		{
			System.out.print("[ ");

			for(j=0;j<=column;j++)
			{
				if(arr[i][j]==1)
				{
					System.out.print(this.getValue(i,j)+" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			
			System.out.println("]");
		}
	}

	public int dfs(Matrix mt, int x, int y)
	{
		arr[x][y]=1;

		if(x<=6 && this.getValue(x,y)==this.getValue(x+1,y) && arr[x+1][y]!=1)
		{
			count++;
			arr[x+1][y]=1;
			dfs(mt, x+1, y);
		}
		if(x>=1 && this.getValue(x,y)==this.getValue(x-1,y) && arr[x-1][y]!=1)
		{
			count++;
			arr[x-1][y]=1;
			dfs(mt, x-1, y);
		}
		if(y<=3 && this.getValue(x,y)==this.getValue(x,y+1) && arr[x][y+1]!=1)
		{
			count++;
			arr[x][y+1]=1;
			dfs(mt, x, y+1);
		}
		if(y>=1 && this.getValue(x,y)==this.getValue(x,y-1) && arr[x][y-1]!=1)
		{
			count++;
			arr[x][y-1]=1;
			dfs(mt, x, y-1);
		}
		return count;
	}
}