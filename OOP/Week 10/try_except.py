x = 10

try:
    print(x)
except NameError:
    print("Variable 'x' is not defined")
else:
    print("Successfully executed")
finally:
    print("Printed")