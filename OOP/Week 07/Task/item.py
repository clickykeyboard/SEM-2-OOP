class Item:

    def __init__(self, title, playing_time):
        self.title = title
        self.playing_time = playing_time
        self.got_it = False
        self.comment = ''

    def set_comment(self, comment):
        self.comment = comment

    def get_comment(self):
        return self.comment
    
    def set_owned(self, owned):
        self.got_it = owned

    def get_owned(self):
        return self.got_it

    def info(self):
        print("Title:", self.title)
        print("Playing time:", self.playing_time)
        print("Comment:", self.comment)
        print("Owned:", self.got_it)