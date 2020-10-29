class Information:

    def __init__(self, name, address, age, phone_number):
        self.name = name
        self.address = address
        self.age = age
        self.phone_number = phone_number

    def get_name(self):
        return self.name

    def get_address(self):
        return self.address

    def get_age(self):
        return self.age

    def get_phone_number(self):
        return self.phone_number

    def set_name(self, name):
        self.name = name

    def set_address(self, address):
        self.address = address

    def set_age(self, age):
        self.age = age

    def set_phone_number(self, phone_number):
        self.phone_number = phone_number


info1 = Information("Badr", "Lahore, Pakistan", 20, "+92 1234567890")
info2 = Information("Adeen", "Karachi, Pakistan", 21, "+92 234567890")
info3 = Information("Azan", "Islamabad, Pakistan", 20, "+ 92234567890")
