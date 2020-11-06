from datetime import date, datetime

class Notebook:

    def __init__(self, name):
        self.name = name
        self.pages = 0
        self.notes = []
    
    def get_author(self):
        return self.name

    def get_pages(self):
        return self.pages

    def make_new_note(self, note):
        self.pages += 1
        page_number = self.pages
        note_date = datetime.now().strftime("%d/%m/%Y %H:%M:%S")
        new_note = Note(note, note_date, page_number)

        self.notes.append(new_note)

        return new_note

    def get_note(self, page_number):
        if page_number <= self.pages:
            return self.notes[page_number]

    def get_notes(self):
        return self.notes

class Note:

    def __init__(self, note, time, page):
        self.note = note
        self.time = time
        self.page = page

    def get_note_time(self):
        return self.time

    def get_note_text(self):
        return self.note

    def get_note_page_number(self):
        return self.page


notebook = Notebook("Badr")
page1 = notebook.make_new_note("Notebook page 1")
page2 = notebook.make_new_note("Notebook page 2")
page3 = notebook.make_new_note("Notebook page 3")


print("Number of notebook pages: ", notebook.get_pages())

for note in notebook.get_notes():
    print(note.get_note_text())



     
