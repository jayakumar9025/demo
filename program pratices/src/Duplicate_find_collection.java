import java.util.LinkedHashSet;

public class Duplicate_find_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,8,5,3,5,2};
	
		
		LinkedHashSet<Integer> obj=new LinkedHashSet<Integer>();
		
		for(Integer in : a) {
			obj.add(in);
		}
		System.out.println(obj);

	}

}
