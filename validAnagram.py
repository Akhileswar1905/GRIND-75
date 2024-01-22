s = input()
t = input()

li = [_ for _ in s]
lis = [_ for _ in t]
lis.sort()
li.sort()
if lis == li:
    print("true")
else:
    print("false")
