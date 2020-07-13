package methodReference;
 

// Reference to Instance method 

interface getFact{
	int gFact(int n);
}
public class Assignment {

	public int fact(int n) {
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac=fac*i;
		}
		return fac;
	}
	
	public static void main(String args[]) {
		Assignment a=new Assignment();
		getFact f=a::fact;
		int m=f.gFact(5);
		System.out.println(m);
	}
}
