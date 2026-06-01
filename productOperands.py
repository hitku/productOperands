#productOperands
hit=0
ku=0
d=319
j=d
hitO=1
kuO=1
while j>0:
 hit+=1
 j-=hitO
 hitO+=2
while j<0:
 ku+=1
 j+=kuO
 kuO+=2
 while j>0:
  hit+=1
  j-=hitO
  hitO+=2
print("HitKu:: Product =", d, " Multiplier =", hit+ku, " Multiplicand =", hit-ku)
