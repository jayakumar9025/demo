import java.util.LinkedHashSet;

public class Print_dupicate_ele_collection {
	
	public static void main(String[] args) {
		
		int a[]= {1,3,2,5,2,7,5,3};
		
		LinkedHashSet<Integer> obj=new LinkedHashSet<Integer>();
		for (Integer a1: a) {
			
			if(!obj.add(a1)) {
				System.out.print(a1+" : ");
			}
		}
	}
}
