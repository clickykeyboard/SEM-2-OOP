from tkinter import *

class WhatsApp:

    def __init__(self):

        self.main_window = Tk()
        self.main_window.title("WhatsApp")

        self.message_box_message = StringVar()
        self.message_box = Entry(textvariable=self.message_box_message)
        self.message_box.pack()

        self.send_button = Button(
            text="Send message",
            foreground="white",
            background="green",
            command=self.send_message
        )
        self.send_button.pack()

        self.video_button = Button(

        )
        
        self.main_window.mainloop()


    def send_message(self):
        new_message = Label(text=self.message_box_message.get())
        new_message.pack()
        self.message_box.delete(0, "end")


whatsapp = WhatsApp()
