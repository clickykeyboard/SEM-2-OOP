class CD:

    def __init__(self, title, artist, number_of_tracks, playing_time):
        self.title = title
        self.artist = artist
        self.number_of_tracks = number_of_tracks
        self.playing_time = playing_time

        self.owned = True
        self.comment = ''

    def set_comment(self, new_comment):
        self.comment = new_comment

    def get_comment(self):
        return self.comment

    def set_owned(self, owned):
        self.owned = owned

    def get_owned(self, owned):
        print("You currently own", self.owned)
        return self.owned

    def print(self):
        print("Song name:", self.title, "\n",
              "Artist name:", self.artist)

