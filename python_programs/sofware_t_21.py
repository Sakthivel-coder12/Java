import calendar
from datetime import datetime,timedelta
day=int(input("Enter the date:"))

month = int(input("Enter the month:"))

year= int(input("Enter the year:"))
if 1<=day<=31 and 1<=month<=12 and 1900<= year <=2025:
    input_date = datetime (year, month, day)
    previous_date = input_date-timedelta (days=1)
    print("The privous date is:",previous_date.strftime("%d-%B-%Y"))

else:
    print("Invalid date")

