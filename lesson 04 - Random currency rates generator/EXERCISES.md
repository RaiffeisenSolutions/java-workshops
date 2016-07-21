# Exercise 1
Create your own repository on github and publish your solutions of all the exercises there. Keep it clean and tidy. Add `.gitignore` file int the root ignoring your IDE project files and gradle files. Make sure they are not going to be committed before pushing to the server. You can find gitignore generators on the Internet.

# Exercise 2
Create class `MutablePerson` and `ImmutablePerson` with fields `firstName`, `lastName` and `age`. The classes should be created in mutable and immutable way respectively.

The mutable version should contain getters and setters. The immutable one should provide methods `withFirstName(String firstName)`, `withLastName(String lastName)` and `withAge(age)` returning new version of person with new field values.

Show the usage of the classes.

# Exercise 3
Create **compund interest calculator**. It should provide the following method:
`BigDecimal getAccumulatedValue(BigDecimal principalSum, BigDecimal nominalInterestRate, BigDecimal compoundingFrequency, BigDecimal numberOfYear)`. The formula can be found in [Wikipedia](https://en.wikipedia.org/wiki/Compound_interest)