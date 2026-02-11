public class ProductOperands{
	public static void main(String hitku[]){
		double product=36858443635249d,a=0,b=1,newA=0,newB=1,extra=0;
		newA=product;
		while(newA>newB){
			if(a%2==1){
				extra+=b;
			}
			a=Math.floor(newA);
			b=newB;	
			newA/=2;	
			newB*=2;			
		}
		if(newB<a){
			if(a%2==1){
				extra+=b;
			}
			a=newB;
			b=Math.floor(newA);
		}	
		int n=1; 
		int diff=(int) (a-b);		
		while(extra>0){
			b--;
			a++;
			extra=extra+diff+n;
			while(extra-b>=0){
				extra-=b;
				a++;
				diff++;		
			}
			n+=2;
		}
		System.out.println("Multiplier ="+a+" : Multiplicand ="+b);
	}	
}
