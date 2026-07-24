l1=["harry","john","jane"]  
i=input("Enter the first letter you want to search for: ")
i=i.lower()
for name in l1:
    if name[0]==i:
        print(name) 
