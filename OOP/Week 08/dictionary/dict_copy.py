
dictionary = {
    "key_1": "value1",
    "key_2": "value2"
}

dictionary_2 = dictionary.copy()
dictionary_2["key_4"] = "value4"
print(dictionary_2)

print(dictionary)

dictionary_3 = dict(dictionary_2)
print(dictionary_2)
dictionary_3["key5"] = "value5"
print(dictionary_3)