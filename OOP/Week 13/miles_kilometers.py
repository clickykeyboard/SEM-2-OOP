from tkinter import *
from tkinter import messagebox

class KilometerToMiles:

    def __init__(self):

        self.main_window = Tk()


        self.label = Label(text="Enter kilometers: ")
        self.label.pack(side=LEFT)

        self.quit = Button(text="Quit", command=self.main_window.destroy)
        self.quit.pack(side=RIGHT)
        
        self.convert = Button(text="Convert", command=self.convert_function)
        self.convert.pack(side=RIGHT)


        self.kilometers = DoubleVar()
        self.input_box = Entry(textvariable=self.kilometers)
        self.input_box.pack(side=RIGHT)
        self.input_box.delete(0, END)

        self.main_window.mainloop()

    def convert_function(self):
        conversion = self.kilometers.get() * 0.621371
        self.input_box.delete(0, END)
        messagebox.showinfo("Kilometer to Miles", f"{conversion}")

kilometer_to_miles = KilometerToMiles()
