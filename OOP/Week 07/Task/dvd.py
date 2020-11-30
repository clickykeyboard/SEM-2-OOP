from item import Item

class DVD(Item):
    
    def __init__(self, title, director, playing_time):
        self.director = director
        super().__init__(title, playing_time)

    def get_director(self):
        return self.director
        
    def set_director(self, director):
        self.director = director

    def set_owned(self, owned):
        super().set_owned(owned)

    def get_owned(self):
        return super().get_owned()

    def info(self):
        print("Director:", self.director)
        super().info()

dvd = DVD("Title", "Director", 100)
dvd.info()