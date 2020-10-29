class Binary():

    def __init__(self, binary):
        self.__binary = binary
        self.__odd = None
        self.__check_odd(binary)
        print(self.__odd)

    def __check_odd(self, binary):
        if len(binary) % 2 == 0:
            self.__odd = False
            return False

        self.__odd = True
        return True

    def __binarify(self):


binary = Binary("010101000")
