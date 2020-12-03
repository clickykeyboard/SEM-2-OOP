class Demo:

    def __init__(self):
        print("New object created")
    
    def __del__(self):
        print("Object is deleted!")


demo = Demo()

del(demo)
