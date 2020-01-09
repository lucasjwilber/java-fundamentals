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
  -calculates the average value of the numbers in the given array

 ### arrayWithLowestAverage(**int[][]**)
  -calculates the average value of each array in the given matrix
  -returns the array with the lowest average value


##linter:

  ##mapTemperatures(**int[][]**)
    -creates a hashSet of the given matrix of temperature data
    -converts the hashSet to an arrayList to then sort it
    -checks for any missing temperatures within the given range
    -returns a string for each missing temperature

  ##tally(**List<String>**)
    -accepts a list of strings
    -creates a hashMap with the string as the key and the number of occurrences as the value
    -returns which string had the most occurences

  ##linter(**file path string**)
    -scans the inputted file
    -checks each line for missing semi-colons
    -returns a string of each line with a missing semi-colon



