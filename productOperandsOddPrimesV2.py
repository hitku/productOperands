#productOperandsOddPrimesV2
hit=1
ku=1
d=529
if not d%2==0:
 print("HitKu:: Product =", d)
 j=int(d**0.5)
 d-=j**2
 hit=j*2+1
 if d>0:
  d-=hit
  hit+=2
 j=int((-d)**0.5)
 d+=j**2
 ku=j*2+1
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
