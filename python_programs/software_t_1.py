x = int(input("Enter the x vlue:"))
y = int(input("Enter the y value:"))
z = int(input("Enter the z value:"))

if 0< x <= 100 and 0< y <=100 and 0< z <=100:
    if x == y == z:
        print("Equilateral")
    elif x == y or y == z or x == z:
        print("Isosceles")
    else:
        print("Scalene")
else:
    print("Not a triangle")
