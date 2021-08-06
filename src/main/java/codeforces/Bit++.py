n = int(input())
 
x = 0
 
for i in range(n):
	o = input()
	if '+' in o:
		x+=1
	else:
		x-=1
 
print(x)