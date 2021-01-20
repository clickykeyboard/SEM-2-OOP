from tkinter import *
from tkinter import messagebox

class Average:

    def __init__(self):

        self.main_window = Tk()

        # Frame 1
        self.frame_one = Frame()
        self.frame_one.pack()
        self.mark_one = Label(self.frame_one, text="Enter the score for test 1: ")
        self.mark_one.pack(side=LEFT)

        self.mark_one_variable = DoubleVar()
        self.mark_one_input = Entry(self.frame_one, textvariable=self.mark_one_variable)
        self.mark_one_input.pack()

        # Frame 2
        self.frame_two = Frame()
        self.frame_two.pack()
        self.mark_two = Label(self.frame_two, text="Enter the score for test 2: ")
        self.mark_two.pack(side=LEFT)


        self.mark_two_variable = DoubleVar()
        self.mark_two_input = Entry(self.frame_two, textvariable=self.mark_two_variable)
        self.mark_two_input.pack()


        # Frame 3
        self.frame_three = Frame()
        self.frame_three.pack()
        self.mark_three = Label(self.frame_three, text="Enter the score for test 3: ")
        self.mark_three.pack(side=LEFT)


        self.mark_three_variable = DoubleVar()
        self.mark_three_input = Entry(self.frame_three, textvariable=self.mark_three_variable)
        self.mark_three_input.pack()

        # Frame 4 (Average)
        self.frame_four = Frame()
        self.frame_four.pack()
        self.average = Label(self.frame_four, text="Average: ")
        self.average_value = Label(self.frame_four)
        self.average_value.pack(side=RIGHT)
        self.average.pack(side=RIGHT)

        # Frame 5 (Calculation)
        self.frame_five = Frame()
        self.frame_five.pack()
        self.calculate_average = Button(self.frame_five, text="Average", command=self.calculate)

        self.quit = Button(self.frame_five, text="Quit", command=self.main_window.destroy)
        self.quit.pack(side=RIGHT)
        self.calculate_average.pack(side=RIGHT)
    
        self.main_window.mainloop()
    
    def calculate(self):

        marks_one = self.mark_one_variable.get()
        marks_two = self.mark_two_variable.get()
        marks_three = self.mark_three_variable.get()

        average = (marks_one + marks_two + marks_three) / 3

        self.average_value.config(text=f"{average}")

average = Average()
