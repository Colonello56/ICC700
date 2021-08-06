word = str(input())
newWord = []
 
word = word.lower()
for i in word:
        if i not in ['a','o','y','e','u','i']:
        	newWord.append(i)
 
for i in newWord:
        print("."+i,end="")