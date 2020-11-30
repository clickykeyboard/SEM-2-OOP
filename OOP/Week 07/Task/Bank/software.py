from current import CurrentAccount
from saving import SavingAccount

class Software:

    def __init__(self, owner):
        self.owner = owner

        self.accounts = []

    def add_account(self, account):
        
        self.accounts.append(account)

    def get_account(self, account_number):
        return self.accounts[account_number]

    def get_customer_info(self):
        print("-------------------------")
        print("Account holder name:", self.owner)
        print("Accounts: ")
        for account in self.accounts:
            print("Account type: ", account.account_type)
            print("Account balance: ", account.get_balance())

        print("-------------------------")

bank_software = Software("Badr")

bank_software.add_account(CurrentAccount(1000000))
bank_software.add_account(SavingAccount(230000))

current_account = bank_software.get_account(0)
saving_account = bank_software.get_account(1)

current_account.withdraw_balance(10000)
saving_account.withdraw_balance(10000)


bank_software.get_customer_info()