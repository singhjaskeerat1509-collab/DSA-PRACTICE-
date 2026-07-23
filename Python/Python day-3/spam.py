a=input("Enter your spam message:").lower()
spam=["make a lot of money","buy now","click this link","subscribe this channel","win a lottery"]
if(a in spam):
    print("This is a spam message.")

else:
    print("This is not a spam message.")        