fruit_set = { "apple", "banana", "cherry" }
fruit_list = [ "apple", "banana", "cherry" ]

fruit_set.add("pear")
print(fruit_set)

fruit_set.update(fruit_list)
print(fruit_set)

fruit_set.add(("watermelon", "grapes"))
print(fruit_set)

fruit_set.remove(("watermelon", "grapes"))
print(fruit_set)

fruit_set.pop()
print(fruit_set)

del fruit_set
