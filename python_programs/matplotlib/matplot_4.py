import matplotlib.pyplot as plt
labels = ["Tamil","English","maths","Science","social"]
usage = [79.8,67.3,77.8,68.5,70.2]
y_pos = range(len(labels))
plt.bar(y_pos,usage)
plt.xticks(y_pos,labels)
plt.ylabel("RANGE")
plt.title("MARKS")
plt.show()
