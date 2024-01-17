import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_to_Array_convert {
	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		System.out.println(obj);
		
		Object [] res=obj.toArray();
		System.out.println(Arrays.toString(res));
		
		
		
		for(Object  o1 : res) {
			System.out.println(o1);

				
		
		
	}
	}

}
