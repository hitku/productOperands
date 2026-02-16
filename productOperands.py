#productOperands

product=15431
a=0
b=0
x=0
y=1
extra=0
x=product
while x>y	:
	if a%2==1:
		extra+=b
	a=int(x)
	b=y
	x/=2
	y*=2
if y>a:
	if a%2==1:
		extra+=b
	a=int(x)
	b=y
else:
	temp=a
	a=b
	b=temp					
if extra>0 &&b%2==0:
	b-=1
	extra=extra+a
	while extra-b>=0:
		extra-=b
		a+=1
while extra>0&&b>a:
	b-=2
	extra=extra+a+a
	while extra-b>=0:
		extra-=b
		a+=1

print("HITKU:: Multiplier =", a, "Multiplicand =", b)
