class Employee:

    count = 0

    def __init__(self, name):
        self.name = name
        Employee.count += 1

    def number_of_employees():
        print("Number of employees: ", Employee.count)

employee = Employee("Employee")

Employee.number_of_employees()

employee2 = Employee("Employee")

Employee.number_of_employees()
