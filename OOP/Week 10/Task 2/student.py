class Students:

    def __init__(self):
        self.file = open("students.csv", 'w')

        self.file.write("First Name,Last Name,Roll Number, Date of Birth, SSC Marks,HSCC Marks,Current Program,Phone Number,Father's Name,Father's Phone Number\n")

        self.file.close()

    def read_data(self):
        self.file = open("students.csv", 'r')

        print(self.file.read())
    
    def add_student_data(self):
        first_name = input("First name: ")
        last_name = input("Last name: ")
        roll_number = input("Roll number: ")
        birth_date = input("Birth date: ")
        ssc_marks = input("SSC Marks: ")
        hssc_marks = input("HSSC Marks: ")
        current_program = input("Current program: ")
        phone_number = input("Phone number: ")
        father_name = input("Father's name: ")
        father_phone_number = input("Father's phone number: ")
        
        self.file = open("students.csv", 'a')
        self.file.write(
            first_name + ',' +
            last_name + ',' +
            roll_number + ',' +
            birth_date + ',' +
            ssc_marks + ',' +
            hssc_marks + ',' +
            current_program + ',' +
            phone_number + ',' +
            father_name + ',' +
            father_phone_number + '\n'
        )

        self.file.close()


students = Students()
students.add_student_data()
students.read_data()