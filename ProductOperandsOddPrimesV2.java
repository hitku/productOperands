public class ProductOperandsOddPrimesV2{
	public static void main(String... hitku){
		double hit=1,ku=1,d=529,j;
		if(hitku.length>0){
			try{
				d=Double.parseDouble(hitku[0]);
			}catch(NumberFormatException e){
				System.out.println("HITKU:  INVALID INPUT");	
			}
		}
		if(d%2!=0){
			System.out.print("HITKU:  "+d+" = ");
			j=Math.floor(Math.sqrt(d));		
			d-=j*j;
			hit=j*2+1;
			if(d>0){
				d-=hit;
				hit+=2;
			}
			j=Math.floor(Math.sqrt(-d));
			d+=j*j;
			ku=j*2+1;
			while(d!=0){
				while(d>0){
					d-=hit;
					hit+=2;
				}
				while(d<0){	
					d+=ku;
					ku+=2;
				}
			}
			System.out.print((hit+ku-2)/2+" x "+(hit-ku)/2);
		}else{
			System.out.print("INVALID INPUT: only product of odd prime operands");
		}	
	}	
}
