from library import Library
from patron import Patron
from book import Book


class Manager(Library):

    def __init__(self):

        self.choices = [1, 2]
        self.__init__()

    def run_menu(self):
        while True:

            print("""
---------------------
Welcome to the Library
1 - Borrow a book
2 - Return a book
---------------------     
                """)

            choice = int(input("Enter your choice: "))

            if choice not in self.choices:
                print("Please enter a valid choice")

            if choice == 1:

                print("\nBorrowing a book...")
                patron_name = input("Enter your name: ")
                patron = Patron(patron_name)
                self.add_patron(patron)

                book_name = input("Enter book name: ")
                book_author = input("Enter book author: ")

                for book in self.get_books():
                    if book.is_checked_out():
                        print("Book already checked out")
                        print("Adding to waitlist...")
                        book.add_to_waitlist(patron)
                        break

                book = Book(book_name, book_author)
                self.add_book(book)

                print(
                    f"-----\n"
                    f"Book borrowed: \nName: {book_name}\nBook author: {book_author}"
                )

            elif choice == 2:

                print("\nReturning a book...")
                patron_name = input("Enter your name: ")
                book_name = input("Enter book name: ")

                for patron in self.get_patrons():
                    if patron.get_name() == patron_name:

                        for book in self.get_books():
                            if book.get_book_name() == book_name:
                                patron.return_book(book)
                                print("Book returned successfully")
                                break
                            else:
                                print("Could not find your book")
                    else:
                        print(
                            "You have not registered as a patron yet\nPlease try again")


manager = Manager()
manager.run_menu()
