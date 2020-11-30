from bank import Bank

class SavingAccount(Bank):

    def __init__(self, balance):
        super().__init__(balance)
        self.account_type = "saving"

    def add_profit(self):
        year = super().get_year()
        year += 1
        super().set_year(year)

        balance = super().get_balance()
        balance += 1000

        super().set_balance(balance)

    def withdraw_balance(self, balance):
        balance = super().get_balance()

        if super().get_year() == 1:
            balance -= 20
            print("Fee charged of 20 rupees!")
            super().set_balance(balance)

            return balance