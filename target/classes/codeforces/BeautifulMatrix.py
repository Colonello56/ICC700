m = []
a = []
for i in range(5):
	m.append(input().split())
 
for i in m:
	if '1' in i:
		x = 3-(m.index(i)+1)
		y = 3-(i.index('1')+1)
		print(abs(x)+abs(y))