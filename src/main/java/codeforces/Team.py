n = int(input())
s = []
count = 0
 
for i in range(n):
	s.append(input())
 
for i in range(len(s)):
	if s[i].count('1') >= 2:
		count+=1
 
print(count)