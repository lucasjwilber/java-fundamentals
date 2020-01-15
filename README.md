# java-fundamentals
Used for the first several java-401d7 labs.

# Files/Methods: 

## basics:

  ### pluralize(**String**, **int**)
    -if the int argument is 0 or 1, returns the string argument with an 's' appended

  ### flipNheads(**int**)
    -simulates coin flips until the given int of consecutive 'heads' is achieved
    -returns the string "It took [flips] flips to flip [int] heads in a row."

  ### clock()
    -continuously checks the local time
    -prints the local time once per second
    -logs how many checks were performed between each println statement
    

## basiclibrary:

 ### roll(**int**)
  -returns an array of integers representing rolls of a 6-sided dice
  -the argument is the number of 'rolls' performed

 ### containsDuplicates(**int[]**)
  -checks the given array for duplicate values
  -returns true/false whether or not duplicates are found

 ### calculatesAverages(**int[]**)
  -Calculates the average value of the numbers in the given array

 ### arrayWithLowestAverage(**int[][]**)
  -Calculates the average value of each array in the given matrix
  -Returns the array with the lowest average value


## linter:

  ## mapTemperatures(**int[][]**)
    -Creates a hashSet of the given matrix of temperature data
    -Converts the hashSet to an arrayList to then sort it
    -Checks for any missing temperatures within the given range
    -Returns a string for each missing temperature

  ## tally(**List<String>**)
    -Accepts a list of strings
    -Creates a hashMap with the string as the key and the number of occurrences as the value
    -Returns which string had the most occurences

  ## linter(**file path string**)
    -Scans the inputted file
    -Checks each line for missing semi-colons
    -Returns a string of each line with a missing semi-colon


## inheritance:

  ### Reviewable
    -This is the base class for Restaurant, Shop, and Theater
    -Contains name, price, rating, and reviews properties.
    -Implements ReviewableInterface

  ### Review
    -Contains properties for a review rating, body, and author
    -Contains a toString() method

  ### MovieReview
    -Inherits rating, body, and author from Review
    -Adds a movies property
    -Redefines the constructor and toString() to include the movies property

  ### ReviewableInterface
    -Declares addReview() which creates a Review object and adds it to the target class' reviews ArrayList
    -Declares toString() which returns a string including the name, rating, and price of the target class.

  ### Restaurant
    -Inherits the name, price, rating, and reviews properties from Reviewable
    -Inherits addReview() and toString() from Reviewable
    -New restaurants can be instantiated with `new Restaurant(String name, int price)` and have a default rating of 1.

  ### Shop
    -Inherits the name, price, rating, and reviews properties from Reviewable
    -Inherits addReview() and toString() from Reviewable
    -New Shops can be instantiated with `new Shop(String name, int price)` and have a default rating of 1.

  ### Theater
    -Inherits the name, price, rating, and reviews properties from Reviewable
    -Contains an ArrayList movies property
    -Contains addMovie() and removeMovie() to modify the movies ArrayList
    -Redefines addReview() and toString() to use the MovieReview class 
