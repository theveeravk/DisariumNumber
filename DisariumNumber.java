
public class DisariumNumber {

	public static void main(String[] args) 
	{
		int no =135;
		int rem =0;
		int total =0;
		int result =0;
		int num =no;
		
		while(no>0)
		{
			 rem = no%10;
			 
			 
		
			 int count= Integer.toString(no).length();
			  total = (int)Math.pow(rem,count );
			 
			  result =result +total;
			  
			  no = no/10;
			  
			  count--;
		}
		System.out.println(result);
		
		if(result ==num)
		{
			System.out.println("this is a DisariumNumber");
		}
		else
		{
			System.out.println("this is a not DisariumNumber");
		}


	}

}
