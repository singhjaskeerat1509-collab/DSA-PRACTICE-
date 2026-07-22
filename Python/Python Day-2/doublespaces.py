a=input("Enter a string with double spaces: ")
if "  " in a:
    print("The string contains double spaces.")
    b=a.replace("  ", " ")
    print("The string after replacing double spaces with single space is:", b)
else:
    print("The string does not contain double spaces.")

print("Thanks for using the program. Have a great day!")