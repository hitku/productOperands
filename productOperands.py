#productOperands
hit=0
ku=0
d=31923
j=d
hitO=1
kuO=1
if d%2==0 and not d%8==0:
 j*=2
while not j==0:
 while j>0:
  hit+=1
  j-=hitO
  hitO+=2
 while j<0:
  ku+=1
  j+=kuO
  kuO+=2
if d%2==0 and not d%8==0:
 print("HitKu:: Product =", d, " Multiplier =", (hit+ku)/2, " Multiplicand =", hit-ku)
else:
 print("HitKu:: Product =", d, " Multiplier =", hit+ku, " Multiplicand =", hit-ku)
