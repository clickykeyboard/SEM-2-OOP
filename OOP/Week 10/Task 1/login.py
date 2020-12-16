class Login:

    def __init__(self):
        self.file = open("login.csv", 'w')
        self.file.write("username,passwords\n")
        self.file.close()

    def add_new_data(self):
        self.file = open("login.csv", 'a')

        username = input("Username: ")
        password = input("Password: ")

        self.file.write(username + ',' + password + '\n')

        self.file.close()

    def read_data(self):
        self.file = open("login.csv", 'r')

        print(self.file.read())
        self.file.close()

    def login(self):
        username = input("Username: ")
        password = input("Password: ")

        combination = username + ',' + password + '\n'

        self.file = open("login.csv", 'r')

        for line in self.file:
            if combination == line:
                print("Access granted")
                self.file.close()
                return combination

        print("Access denied")
        self.file.close()

file = Login()
file.add_new_data()
file.add_new_data()
file.read_data()
file.login()
