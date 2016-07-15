# Exercise 1
## Learn how to create, manipulate and display dates and timestamps.
  * Create an object representing some date and time (eg. 30 January 2011, 15:14:15)
  * Add four days to this date
  * Read about ISO 8601 and print the date in this format

# Exercise 2
Write a program where you add money to bank account. The initial balance should be 0.00 zł. Add 100 times 0.01 zł to it and print how much money client customer has.
```java
double accountBalance = 0.0; // The initial account balance is 0.00 zł

// Add 100 times 0.01 zł
for (int x = 0; x < 100; x++) {
    accountBalance += 0.01;
}

// The customer should have 1.00 zł. Does he?
System.out.println("Account balance: " + accountBalance + " zł");
```