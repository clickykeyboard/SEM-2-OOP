class CD:

    def __init__(self, title, artist, number_of_tracks, playing_time):
        self.title = title
        self.artist = artist
        self.number_of_tracks = number_of_tracks
        self.playing_time = playing_time

        self.owned = True
        self.comments = []

    def set_comments(self, new_comment):
        for comment in new_comment:
            self.comments.append(comment)

    def get_comments(self):
        return self.comments

    def set_owned(self, owned):
        self.owned = owned

    def get_owned(self):
        print("You currently own", self.owned)
        return self.owned

    def print(self):
        print("CD name:", self.title)
        print("Artist name:", self.artist)
        print("Playing time:", self.playing_time)
        print("Owned: ", self.owned)
        print("Comments: ", self.comments)

