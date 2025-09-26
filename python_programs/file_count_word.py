total_words = 0
file_handler = open(r"C:\Users\sakth\OneDrive\Desktop\python_programs\sakthivel.txt.txt")
for each_line in file_handler:
    word = each_line.rstrip().split()
    total_words += len(word)

print("The total number of words are : " ,total_words)
