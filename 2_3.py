peoples = ['fred', 'john', 'bob', 'bill']
def testCrowded(p):
  if(len(p) > 3) :
    print('room is crowded')
testCrowded(peoples)
peoples.pop()
testCrowded(peoples)

def test_Crowded(p):
  if(len(p) > 3) :
    print('room is crowded')
  else :
    print('room is not crowded')

peoples.append('jim')
peoples.append('george')
peoples.append('jack')
def test_Mob(p):
  if(len(p) > 5) :
    print('room is a mob')
  elif(len(p) >= 3 and len(p)  <= 5) :
    print('room is crowded')
  elif(len(p) >= 1 and len(p)  <= 2) :
    print('room is not crowded')
  else:
    print('there is noone in the room')
test_Mob(peoples)