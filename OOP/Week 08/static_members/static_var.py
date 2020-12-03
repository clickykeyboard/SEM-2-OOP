class Demo:

    variable = 10

    def __init__(self):
        self.count = 0

print(Demo.variable) # Static / Class variable

""" Demo.count will throw an error """

demo = Demo()

print(demo.count)
