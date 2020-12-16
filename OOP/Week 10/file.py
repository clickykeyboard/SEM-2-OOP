file = open("file.txt", 'w')
data = input("Enter your data: ")

file.write(data)
file.close()

file = open("file.txt", 'r')
print(file.read())
file.close()