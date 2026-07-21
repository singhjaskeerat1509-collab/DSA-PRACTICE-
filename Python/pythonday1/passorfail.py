a=int(input("Enter your marks: "))
b=int(input("Enter your marks: "))
c=int(input("Enter your marks: "))
total=((a+b+c)/300)*100
print("Your total percentage is:",total,"%")

if a>=33 and b>=33 and c>=33 and total>=40:
    print("You have passed the exam.")
else:       
    print("You have failed the exam.")