public class ProductOperandsOddPrimesV1{
	public static void main(String... hitku){
		double hit=1,ku=1,d=529;
		if(hitku.length>0){
			try{	d=Double.parseDouble(hitku[0])
			}catch(NumberFormatException e){
				System.out.println("HITKU:  INVALID INPUT");	
			}
		}
		if(d%2!=0){
			System.out.print("HITKU:  "+d+" = ");
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
