class Employee:

    def __init__(self, name, id, department, job_title):
        self.name = name
        self.id = id
        self.department = department
        self.job_title = job_title

employee_1 = Employee("Ahmed", "12345", "Management", "Manager")
employee_2 = Employee("Abbas", "54321", "Creative Team", "Designer")
employee_3 = Employee("Ahsan", "67891", "Management", "Senior Manager")

employees = {
    employee_1.id: employee_1,
    employee_2.id: employee_2,
    employee_3.id: employee_3
}

while True:
    print("""
    Welcome to our system\n
    Press 1 to look up an employee\n
    Press 2 to add a new employee\n
    Press 3 to change an existing employees name, department, or job title in the dictionary\n
    Press 4 to delete an employee from the dictionary\n
    Press 5 to exit\n
    """)

    print(employees)

    choices = [1, 2, 3, 4, 5]
    choice = int(input("> "))

    if choice not in choices:
        print("Please enter a valid choice")

    elif choice == 1:
        employee_id = input("Which employee do you want to look up?\n> ")
        query = employees.get(employee_id)

        if query is None:
            print("Could not find employee!")
        else:
            print(query.id, query.name, query.department, query.job_title)

    elif choice == 2:
        print("Add a new employee: ")
        employee_name = input("Enter employee name: ")
        employee_id = input("Enter employee id: ")
        employee_department = input("Enter employee department: ")
        employee_job_title = input("Enter employee job title: ")

        new_employee = Employee(employee_name, employee_id, employee_department, employee_job_title)
        employees[new_employee.id] = new_employee
    
    elif choice == 3:
        print("Which employee information do you want to change?")
        employee_choice = input("> ")

        query = employees.get(employee_choice)

        if query is None:
            print("Could not find employee!")
        else:
            employee_name = input("Enter employee name: ")
            employee_id = input("Enter employee id: ")
            employee_department = input("Enter employee department: ")
            employee_job_title = input("Enter employee job title: ")
            

            query.name = employee_name
            query.id = employee_id
            query.department = employee_department
            query.job_title = employee_job_title

            employees.pop(query.id)
            employees[query.id] = query

    elif choice == 4:
        print("Which employee information do you want to delete?")
        employee_choice = input("> ")

        query = employees.get(employee_choice)

        if query is None:
            print("Could not find employee!")
        else:
            employees.pop(query.id)
            print("Deleted employee!")
            
    elif choice == 5:
        print("Exiting...")
        exit()
    
    