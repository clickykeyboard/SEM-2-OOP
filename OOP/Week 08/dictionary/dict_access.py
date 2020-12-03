dictionary = {
    "key_1": "value1",
    "key_2": "value2"
}


for i in dictionary:
    print(i)

for x, y in dictionary.items():
    print(x, y)

for x in dictionary.values():
    print(x)

dictionary["key_3"] = "value3"
dictionary.popitem()
print(dictionary)

dictionary.pop("key_1")
print(dictionary)
