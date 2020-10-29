class Employee:

    def __init__(self, name, id_number, department, job_title):
        self.name = name
        self.id_number = id_number
        self.department = department
        self.job_title = job_title

    def get_name(self):
        return self.name

    def get_id_number(self):
        return self.id_number

    def get_department(self):
        return self.department

    def get_job_title(self):
        return self.job_title

    def set_name(self, name):
        self.name = name

    def set_id_number(self, id_number):
        self.id_number = id_number

    def set_department(self, department):
        self.department = department

    def set_job_title(self, job_title):
        self.job_title = job_title


employee1 = Employee("ABC", 47899, "Accounting", "Vice President")
employee2 = Employee("DEF", 39119, "IT", "Programmer")
employee3 = Employee("GHI", 81774, "Manufacturing", "Engineer")
