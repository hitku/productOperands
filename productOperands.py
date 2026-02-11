#productOperands

product=15431
a=0
b=0
newA=0
newB=1
extra=0

newA=product
while newA>newB:
 if a%2==1:
  extra+=b
 a=int(newA)
 b=newB
 newA/=2
 newB*=2
if newB<a:
 if a%2==1: 
  extra+=b
 a=newB
 b=int(newA)

n=1
diff=a-b
while extra>0:
 b-=1
 a+=1
 extra=extra+diff+n
 while extra-b>=0:
  extra-=b 
  a+=1
  diff+=1
 n+=2

print("Multiplier =", x, "Multiplicand =", y)

