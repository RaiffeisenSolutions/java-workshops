#Notes

# Method toString()
* Returns String representation of the object
* Should be used for debugging purposes only
* Can be generated with ALT + INSERT -> generate toString
* Can be customized (from generated version) or written from scratch

# Getters and setters
* Can be generated with ALT + INSERT -> generate toString
* Are used as accessors for private fields

# Static methods
* Can be used without instantiating object of a class eg `RandomNumbersGenerator.getRandomBetween(from, to);`

# Non-static methods
* Require an instance to be created, eg. **`new RandomCurrencyRateGenerator()`**`.getRandomCurrencyRate(...)`

# Mutable and immutable data structures
* Mutable data structures can be modified
* Immutable data structures require instantiation of new objects because all the fields are constants. They have no setters provided
* Immutable data structures can be helpful to avoid many popular mistakes

# Shortcuts
* CTRL + ALT + P - extract parameter
* ALT + INSERT - generate (getters, setters, toString, contructor etc.)
* F6 - move (method, class somewhere)
* CTRL + SHIFT + R - rename