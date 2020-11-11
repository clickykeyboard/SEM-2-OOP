import cd_video_database

Database = cd_video_database.Database

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
    


class Movie:

    def __init__(self, title, director, playing_time):
        self.title = title
        self.director = director
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
        print("Movie name:", self.title, "\n",
            "Director name:", self.director)

song = CD("Song", "Song Artist", 7, 60)
song1 = CD("Song1", "Song Artist1", 6, 54)
song2 = CD("Song1", "Song Artist2", 8, 61)
song3 = CD("Song3", "Song Artist3", 6, 52)

movie = Movie("movie", "Director", 123)
movie1 = Movie("movie1", "Director1", 154)
movie2 = Movie("movie1", "Director2", 130)
movie3 = Movie("movie3", "Director3", 110)

songs = [song, song1, song2, song3]
movies = [movie, movie1, movie2, movie3]

database = Database()
database.add_cds(songs)
database.add_videos(movies)

print(database.get_cds())
print(database.get_videos())
