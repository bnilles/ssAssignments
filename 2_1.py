print('Hello World'[8])
print('thinker'[2:5])
# S=’hello’,what is the output of h[1] 
# out put is e

#	S=’Sammy’ what is the output of s[2:]”
s = "Sammy"
print(s[2:])
# mmy
m = 'Mississippi' 
print(set(m))

#"".join(x.lower() for x in m if x.isalpha() )
def pal_check(amount, *words):
  result = []
  for w in range(amount):
    word =  "".join(x.lower() for x in words[w] if x.isalpha() )
    if(word == word[::-1]):
      result.append("y")
      print('y')
    else: 
      result.append('n')
      print("n")
  return result
print(pal_check(3, "test , , sdf", "asd, asd", 'asd, ??dsa'))