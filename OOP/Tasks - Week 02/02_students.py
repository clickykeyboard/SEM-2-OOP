test_1 = float(input("Enter your marks for the first test: "))
test_2 = float(input("Enter your marks for the second test: "))
test_3 = float(input("Enter your marks for the third test: "))

average = (test_1 + test_2 + test_3) / 3

print(average)

if average > 95:
    print("Congratulations for scoring a good score!")
