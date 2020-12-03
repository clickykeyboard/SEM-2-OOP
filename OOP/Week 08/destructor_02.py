class Employee:

    def __init__(self):
        print("Employee created!")

    def __del__(self):
        print("Destructor called!")


def create_object():
    print("Making object...")
    new_object = Employee()
    print("Function end...")
    return new_object

print("Calling create_object() function...")
new_object = create_object()
print("Program end..")
