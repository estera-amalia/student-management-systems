#this program gives the user a design to choose from and it shows it on the screen
#showing menu options to the user
print("                                                                                             ")
print("                                                                                             ")
print("                                       Hello and Welcome                                     ")
print("                                     to Portofolio Item 2!                                   ")
print("                                                                                             ")
def body():
    print("                                                                                             ")
    print("         Please choose from the following options a structure you would prefer! Thank you!   ")
    print("                                                                                             ")
    print("                                       The options are:                                      ")
    print("                                                                                             ")
    print("    a)    *                       b)        *******               c)       *                 ")
    print("          **                                ******                        *  *               ")
    print("          ***                               *****                        *    *              ")
    print("          ****                              ****                        *      *             ")
    print("          *****                             ***                        *        *            ")
    print("          ******                            **                        *          *           ")
    print("          *******                           *                        *            *          ")
    print("                                                                                             ")
    print("  d) Exit                                                                                    ")
    print("                                                                                             ")
    choice=str(input("     Please type your answer here then press the 'Enter' key : ")) # this is where the user types their choice
    print("                                                                                             ")
    print("                                                                                             ")
    print("                                                                                             ")
    n=8  #the number of rows the pattern has
    if choice.isalpha: #verifying if the user put in the correct choice, a character between 'a' and 'c'
        if choice=="a": #the code for pattern a
            for i in range(0,n):
                print("*"*i)
            input(body())#re-displaying the menu
        else:
            if choice=="b":  #the code for pattern b
                j=1
                for j in range(n):
                    print("*"*(n-j))
                input(body())
            else:
                if choice=="c": #the code for pattern c
                    k = 0
                    for k in range(2 * (n - 1)):
                        if k == 1:
                            print(" " * (n - k-1) + "*" + " " * (n - k))
                        else:
                            if (k > 1) and (k < n):
                                print(" " * (n - k - 1) + "*" + (" " * (2 * (k - 1))) + "*" + (" " * (n - k - 1)))
                    input(body())
                else:
                    if choice=="d":#exit option
                        print("                                                                                       ")
                        print("                                                                                       ")
                        print("                      Thank you very much for your time!                               ")
                        print("                                                                                       ")
                        print("                              Have a lovely day!                                       ")
                        print("                                                                                       ")
                        print("                                                                                       ")
                        print("                                                                                       ")
                        print("           Please press the 'Enter' key to close the program. Thank you!               ")
                        input()
                        exit()
                    else:
                        print("Invalid option! Please insert a *lowercase* letter: a, b or c! Thank you!")  # in case the user inserts values that are not letters
                        input(body())
body()

