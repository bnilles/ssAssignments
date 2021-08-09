
def func() :
  print('hello world')

#func()

def func1(name) :
  print('hello my name is ' + name)
#func1('bob')

def func3(x,y,z):
  if(z):
    return x
  else:
    return y

def func4(x,y) :
  return x *y 

def is_even(x):
  if(x % 2 == 0) :
    return True
  return False

def greater(x,y) :
  if ( x > y ) :
    return True
  else :
    return False

def sum_of (*x) :
  result = 0
  for nums in x :
    result += nums
  return result
#print(sum_of(1,2,3,4,5,6,7,8))

def evens_only (*x) :
  return filter(lambda n: n % 2 == 0, x)
print(list(evens_only(1,2,3,4,5,6,7,8)))
q = 'sdfas'
q.lower
def ul (s) :
  result = ""
  i = 0
  for c in s :
    print (c)
    if(i %2 == 0) :
      result +=  c.lower()
    else:
      result += c.upper()
    i +=1
  return result
print(ul(q))


def prob10(x,y) :
  if(x %2 == 0 and y % 2 == 0 ):
    return x - y
  else :
    return x + y

def prob11(s1 , s2) :
  if(s1[0] == s2[0]) :
    return True
  return False
  