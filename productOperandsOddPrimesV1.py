#productOperandsOddPrimesV1
hit=1
ku=1
d=529
if not d%2==0:
 print("HitKu:: Product =", d)
 while not d==0:
  while d>0:
   d-=hit
   hit+=2
  while d<0:
   d+=ku
   ku+=2
 print(" Multiplier =", (hit+ku-2)/2, " Multiplicand =", (hit-ku)/2)
else :
 print("INVALID INPUT: only product of odd prime operands")
