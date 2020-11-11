class Video:

    def __init__(self, title, director, playing_time):
        self.title = title
        self.director = director
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
        print("Video name:", self.title)
        print("Director name:", self.director)
        print("Playtime:", self.playing_time)
        print("Owned: ", self.owned)
        print("Comments: ", self.comments
