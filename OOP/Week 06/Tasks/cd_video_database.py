import cd
import video

class Database:

    def __init__(self):
        self.cds_and_dvds = []

    def add(self, name):

        title = input("Enter title: ")
        if name == "cd":
            artist = input("Enter artist: ") 
        else:
            director = input("Enter director: ")
        if name == "cd":
            tracks = int(input("Enter tracks: "))
        
        playtime = int(input("Enter playtime: "))
        comment = input("Enter comment 1: ")
        comment1 = input("Enter comment 2: ")
        comment2 = input("Enter comment 3: ")
        owned = bool(input("Do you own the CD/DVD?: (True/False)"))

        if name == "cd":
            obj = cd.CD(title, artist, tracks, playtime)
        else:
            obj = video.Video(title, director, playtime)

        obj.set_comments([comment, comment1, comment2])
        obj.set_owned(owned)
        self.cds_and_dvds.append(obj)

    def all_cds_and_dvds(self):
        for cd_dvd in self.cds_and_dvds:
            print(cd_dvd.print())
            print("--------")

database = Database()
database.add("cd")
database.add("video")

database.all_cds_and_dvds()
