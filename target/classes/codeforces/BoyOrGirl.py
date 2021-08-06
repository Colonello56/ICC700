s = input()
uniques = []
for i in s:
	if i not in uniques:
		uniques.append(i)
 
if len(uniques) % 2 == 0:
	print('CHAT WITH HER!')
else:
	print('IGNORE HIM!')