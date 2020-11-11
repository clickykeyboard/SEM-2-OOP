class Database:

    def __init__(self):
        self.cds = []
        self.videos = []

    def add_cds(self, cds):
        for cd in cds:
            self.cds.append(cd)

    def add_videos(self, videos):
        for video in videos:
            self.videos.append(videos)

    def get_cds(self):
        return self.cds

    def get_videos(self):
        return self.videos
