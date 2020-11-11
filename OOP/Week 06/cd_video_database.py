import cd
import video


class Database:

    def __init__(self):
        self.cds = []
        self.dvds = []

    def add_cd(self):
        title = input("Enter title: ")
        artist = input("Enter artist: ")
        tracks = int(input("Enter tracks: "))
        playtime = int(input("Enter playtime: "))

        cd1 = cd.CD(title, artist, tracks, playtime)
        self.cds.append(cd1)

    def add_video(self):
        title = input("Enter title: ")
        director = input("Enter director: ")
        playtime = int(input("Enter playtime: "))

        video1 = video.Video(title, director, playtime)
        self.dvds.append(video1)

    def print_cd(self, i):
        self.cds[i].print()

    def print_dvd(self, i):
        self.dvds[i].print()

    def all_cds(self):
        for cd in self.cds:
            print(cd.print())
            print("--------")

    def all_dvds(self):
        for dvd in self.dvds:
            print(dvd.print())
            print("--------")


database = Database()
database.add_cd()
database.add_video()

database.all_cds()
database.all_dvds()
