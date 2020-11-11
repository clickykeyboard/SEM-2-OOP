from number import Number

class Clock:

    def __init__(self, day_time):
        self.hours = Number(12)
        self.minutes = Number(60)
        self.time = ""
        self.day_time = False
        self.cycle = 0

    def print_time(self):
        print(self.time)

    def update_time(self):
        self.time = self.add_value(self.hours.get_value(
        )) + ":" + self.add_value(self.minutes.get_value())
        self.time += " " + str()

    def add_value(self, value):
        self.value = value
        if self.value < 10:
            return "0" + str(self.value)

        return str(self.value)

    def time_tick(self):
        self.minutes.update()

        if self.minutes.get_value() % self.minutes.get_limit() == 0:
            self.minutes.set_value(0)
            self.hours.update()
            if self.hours.get_value() % self.hours.get_limit() == 0:
                self.hours.set_value(0)
                self.cycle += 1
                self.day_time = not self.day_time

        self.update_time()


clock = Clock("PM")
clock.hours.set_value(0)
clock.minutes.set_value(0)

for i in range(1200):
    clock.time_tick()
    clock.print_time()
