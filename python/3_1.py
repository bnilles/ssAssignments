result = ""
for x in range(2000, 3201):
  
  if(x % 7 == 0 and x % 5 != 0) :
    result += str(x) + ', '
print(result)



def convertor (temp, type) :
  if( type == "c"):
    return temp * (9/5) + 32
  else :
    return (temp - 32) * (5/9)

print(convertor(80,'f'))
print(convertor(24,'c'))


# number = 7
# x= True
# while x:
#   guess = int(input('guess a number between 1-9?'))
#   print(guess)
#   print(number)
#   print(guess == number)
#   if(guess == number ) :
#     print('congrats guess was correct')
#     break
#   else :
#     print('guess wrong try again')

l = []
for x in range(6):
  for y in range(x):
    print('*', end= '')
  print()
for x in range(4,0,-1):
  for y in range(x):
    print('*', end= '')
  print()
  
  

# user_input = input('enter a word to reverse')
# print(user_input[::-1])

numbers = (1, 2, 3, 4, 5, 6, 7, 8, 9) 
odd = 0
even = 0
for n in numbers: 
  if(n % 2 == 0):
    even += 1
  else :
    odd += 1
  
print (odd)
print (even)


datalist = [1452, 11.23, 1+2j, True, 'w3resource', (0, -1), [5, 12], {"class":'V', "section":'A'}]

for d in datalist:
  print (type(d), end= " ")
  print(d)

for x in range(0,7) : 
  if(x == 3 or x == 6) :
    continue
  print(x)