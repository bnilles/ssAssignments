list1 = [12, 'hi', 12.24]
print(list1)

list2 = [1,1,[1,2]]
print(list2[2][1])

lst=['a','b','c'] 
#b c
print(lst[1:])

dict1  = {'monday':1,'tuesday' : 2, 'wedensday': 3, 'thursday': 4, 'friday': 5}

D={'k1':[1,2,3]} #2
print(D['k1'][1])

l = [1,[2,3]] 
t = tuple(l)

m = 'Mississippi' 
setm = set(m)
print(setm)

setm.add('X')
print(set(setm))

print(set([1,1,2,3]))
result = ""
for x in range(2000, 3201):
  
  if(x % 7 == 0 and x % 5 != 0) :
    result += str(x) + ', '
print(result)


def fact(x):
	    if x == 0:
	        return 1
	    return x * fact(x - 1)

print(fact(10))

d=dict()
x = 10
for i in range(1,x+1):
    d[i]=i*i

data = input()
l=data.split(",")
t=tuple(l)
print (l)
print (t)


