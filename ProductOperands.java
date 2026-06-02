public class productOperands{
 public static void main(String hitku[]){
  double hit=0,ku=0,d,j=529,hitO=1,kuO=1;
  d=j;
  if(d%2==0 && d%8!=0){
    j*=2;
  }
  while(j>0){
   hit++;
   j-=hitO;
   hitO+=2;
  }
  while(j<0){	
   ku++;
   j+=kuO;
   kuO+=2;
   while(j>0){
    hit++;
    j-=hitO;
    hitO+=2;
   }
  }
  if(d%2==0 && d%8!=0){
   System.out.println("HitKu:  "+d+" = "+((hit+ku)/2)+" x "+(hit-ku));
  }else{
   System.out.println("HitKu:  "+d+" = "+(hit+ku)+" x "+(hit-ku));	
  }
 }	
}
