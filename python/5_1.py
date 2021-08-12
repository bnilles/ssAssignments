
def bmiCalc (weight, height) :
  return (weight / height**2)


def bmi(weight, height) :
  x = bmiCalc(weight,height)
  if(x < 18.5): 
    return ('underweight')
  elif (18.5 <= x <= 25.0):
    return 'normal weight'
  elif (25.0 <= x <= 30.0):
    return 'overweight'
  else :
    return 'obesity'
print(bmi(80,1.73))
