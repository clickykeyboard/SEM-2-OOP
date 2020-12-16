file = open("login.csv", 'a')

username = input("Username: ")
password = input("Password: ")

file.write(username + "," + password + "\n")
file.close()

file = open("login.csv", 'r')
print(file.read())
file.close()