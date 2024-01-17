package project;
import java.lang.Object;
import java.util.Objects;
public class Hashcode {

	
		// TODO Auto-generated method stub
		
		int id=10;
		String name="jayakumar";
		 public Hashcode (int id,String name){
			this.id=id;
			this.name=name;
		}
		
		public int hashCode() {
			return Objects.hash(id+""+name);
			
			}
		public boolean equals(Object ref) {
			Hashcode  h=(Hashcode)ref;
			if(this.id==h.id&&this.name==h.name) { 
				return true;
				}
				else
				return false;
			}
		
		public static void main(String[] args) {
		Hashcode ref=new Hashcode(1,"fsg");
		Hashcode d1=new Hashcode(2,"sgsg");
		System.out.println(d1.hashCode());
		System.out.println(ref.hashCode());
		System.out.println(ref.equals(d1));

	}

}
