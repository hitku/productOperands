public class productOperands{
 public static void main(String hitku[]){
  double hit=1,ku=1,d,j=529,h=0,k=0;
  d=j;
  if(d%2==0 && d%8!=0){
    j*=2;
  }
  while(j!=0){
   while(j>0){
    j-=hit;
    hit+=2;
   }
   while(j<0){	
    j+=ku;
    ku+=2;
   }
  }
  h=hit+ku-2;
  k=hit-ku;
  if(h>0){
   h/=2;
   if(d%2==0 && d%8!=0){
       h/=2;
   }
  }
  if(k>0){
   k/=2;
  }
   System.out.println("HitKu:  "+d+" = "+h+" x "+k);
 }	
}
