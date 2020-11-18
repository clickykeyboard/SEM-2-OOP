class Number:

    def __init__(self, limit):
        self.value = 0
        self.limit = limit

    def get_value(self):
        return self.value

    def get_limit(self):
        return self.limit

    def set_value(self, value):
        if value <= 60:
            self.value = value
        else:
            print("Error")

    def set_limit(self, limit):
        if limit < 24:
            self.limit = limit
        else:
            print("Error")

    def update(self):
        self.value += 1


