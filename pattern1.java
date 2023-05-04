public class pattern1 {
    public static void main(String[] args) {
    int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(j==1||j==i||i==5)
			{
				System.out.print(" * ");
			}
			else
			{
            System.out.print("   ");
        }
    }
    System.out.println();
} 
}
}
