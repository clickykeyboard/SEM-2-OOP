from bank import Bank

class CurrentAccount(Bank):

    def __init__(self, balance):
        super().__init__(balance)
        self.account_type = "current"

    def annual_fee(self):

        year = super().get_year()
        year += 1
        super().set_year(year)
        
        current_balance = super().get_balance()
        current_balance -= 1000
        super().set_balance(current_balance)
       