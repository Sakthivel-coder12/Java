#UNIT 6
#PROGRAM TO ILLUSTRATE THE USE OF NESTED IF STATEMENT
m1=int(input("Enter tamil mark"))
m2=int(input("Enter english mark"))
m3=int(input("Enter maths mark"))
m4=int(input("Enter science mark"))
m5=int(input("Enter sicial science mark"))
avg=(m1+m2+m3+m4+m5)/5
if avg>=80:
    print("Grade A:")
elif avg>=70 and avg<80:
    print("Grade B:")
elif avg>=60 and avg<70:
    print("Grade C:")
elif avg>=50 and avg>60:
    print("Grade D:")
else:
    print("Grade E:")
