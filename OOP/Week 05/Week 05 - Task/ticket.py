class TicketMachine:

    def __init__(self):
        self.price = 40
        self.balance = 0
        self.money_to_return = 0

        self.ticket_available = False
    
    def get_price(self):
        return self.price

    def set_price(self, price):
        self.price = price
    
    def get_balance(self):
        return self.balance

    def add_balance(self, balance):
        if type(balance) == str:
            print("Please enter coins/cash")
    
        else:
            self.balance += balance
            
    def set_return(self):
        self.money_to_return = self.balance - self.price

    def get_return(self):
        return self.money_to_return

    def get_ticket(self, tickets):
        total_ticket_price = self.price * tickets
        if self.balance >= total_ticket_price:
            for i in range(2):
                print("######################")
                print("Welcome to Orange Line")
                print("----------------------")
                print("Ticket price: ", self.price)
                print("Balance: ", self.balance)
        else:
            print("Please enter", total_ticket_price - self.balance, "more rupees!")

ticket_machine = TicketMachine()

ticket_machine.set_price(40)

ticket_machine.get_ticket(2)
