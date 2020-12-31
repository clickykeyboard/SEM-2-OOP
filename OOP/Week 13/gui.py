import tkinter

class GUI:

    def __init__(self):
        self.count = 0
        self.main_window = tkinter.Tk()
        self.input_string = tkinter.StringVar()
        self.main_window.title("My window")

        self.name = tkinter.Label(text="Badr ", foreground="red", background="yellow")
        self.name.pack()

        self.age = tkinter.Label(text="20")
        self.age.pack()

        self.button = tkinter.Button(
            text="Click me",
            background="yellow", 
            foreground="black",
            command=self.on_button_click
            )
        
        self.button.pack()
        
        self.entry = tkinter.Entry(textvariable=self.input_string)
        self.entry.pack()

        self.quit = tkinter.Button(
            text="Quit",
            command=self.quit_window
        )
        self.quit.pack()

        self.main_window.mainloop()

    def on_button_click(self):
        print("Button clicked")
        self.age.config(text=self.input_string.get())

    def quit_window(self):
        self.main_window.destroy()

gui = GUI()