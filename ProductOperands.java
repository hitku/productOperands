public class ProductOperands{
	public static void main(String hitku[]){
		double product=339347,a=0,b=1,x=0,y=1,extra=0;
		x=product;
		while(x>y){			
			if(a%2==1){
				extra+=b;
			}
			a=Math.floor(x);
			b=y;	
			x/=2;	
			y*=2;	
		}
		if(y>a){
			if(a%2==1){
				extra+=b;
			}
			a=Math.floor(x);
			b=y;
		}else{
			double temp =a;
			a=b;
			b=temp;
		}					
		if(extra>0 &&b%2==0){
			b--;
			extra=extra+a;
			while(extra-b>=0){
				extra-=b;
				a++;
			}
		}
		while(extra>0&&b>a){
			b-=2;
			extra=extra+a+a;
			while(extra-b>=0){
				extra-=b;
				a++;
			}
		}		
		System.out.println("\nHITKU: "+product+" = "+a+" * "+b);		
	}	
}
