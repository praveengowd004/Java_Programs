package ForLoop;

public class Continue_Statement {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				System.out.println(" ");
				continue;
			}
			
			System.out.println(i);
		}

	}

}
