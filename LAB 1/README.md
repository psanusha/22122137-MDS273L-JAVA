This Java program collects basic user details such as name, age, gender, address, and phone number, and displays them on the console. It also checks the gender of the user and displays "MALE" or "FEMALE" accordingly. If the user is from the southern part of India, it displays a message using a switch statement.

EXPLANATION
We first import the Scanner class from the java.util package to read user input from the console.
We create a Scanner object to read input from the console.
We prompt the user to enter their name and age, and read their input using the nextLine() and nextInt() methods respectively.
We prompt the user to enter their gender and read their input using the next().charAt(0) method, which reads a single character from the input.
We prompt the user to enter their address and phone number, and read their input using the nextLine() and nextLong() methods respectively. Note that we need to call nextLine() twice to consume the newline character left in the input buffer after reading the gender input.
We display the user's details using System.out.println() statements. We use a ternary operator to display "MALE" or "FEMALE" depending on the user's gender.
We extract the state from the address using the split() method and a regular expression. We then use a switch statement to check if the state is one of the southern states of India, and display a message if it is.

![image](https://user-images.githubusercontent.com/118505694/235341780-5d2d276b-a0d4-4bc7-9bd9-442d11bdd58c.png)
