class ArrayDemo
{
	void twoDimension()
	{
		// two dimensional array
		int[][] x = {{1,2,3}, {4,5,6}};

			for(int j=0; j<2; j++){
				for(int i=0; i<4; i++){
					System.out.println(x[j][i]);
				}
			}
	}
}

class Array
{
	public static void main(String[] args) {
		// single dimension array
		int[] a = {1,2,3};

			for(int i=0; i<3; i++){
				System.out.println(a[i]);
			}

		ArrayDemo obj = new ArrayDemo();
			obj.twoDimension();
	}
}