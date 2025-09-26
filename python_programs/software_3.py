str1 = input("Enter the string: ")
char = input("Enter the character: ")
if len(str1)>=5 and len(str1)<=20:
    if(char in str1):
        print("present")
    else:
        print("Not present")
    
