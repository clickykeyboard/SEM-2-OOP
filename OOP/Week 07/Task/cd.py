from item import Item

class CD(Item):

    def __init__(self, title, artist, playing_time, number_of_tracks):
        self.artist = artist
        self.number_of_tracks = number_of_tracks
        super().__init__(title, playing_time)

    def get_artist(self):
        return self.artist

    def set_artist(self, artist):
        self.artist = artist

    def get_number_of_tracks(self):
        return self.number_of_tracks

    def set_owned(self, owned):
        super().set_owned(owned)

    def get_owned(self):
        return super().get_owned()

    def info(self):
        print("Artist:", self.artist)
        super().info()
        print("Number of tracks:", self.number_of_tracks)

cd = CD("title", "Artist", 100, 12)
cd.info()