class TicketMachine:

    def __init__(self):
        self.__price = 40
        self.__balance = 10

    def get_price(self):
        return self.__price

    def set_price(self, price):
        self.__price = price

ticket_machine = TicketMachine()

print(ticket_machine.get_price())
ticket_machine.set_price(100)

print(ticket_machine.get_price())