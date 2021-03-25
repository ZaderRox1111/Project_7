 package p7_package;

public class FunctionToolClass_I
   {
      
      //The overall goal of the program is to to allow a user to select and input three different operations,
      //find next prime, estimate the sine, and find square root
      
      //Ask user for which method to do and display a menu
      //Get the correct input for the operation they want
      //find next prime iterates over the integers until the next prime is found
      //find sine will use a taylor series to estimate the sine of a value
      //find square root will use a divide and conquer algorithm to find the square root of a number
      //output a table with the results, dependent on the user's selection
      
      //Create constants
      
      //instantiate the conIO class

      public static void main(String[] args)
         {
            // TODO Auto-generated method stub
            
            //create the necessary variables
             //operationSelection, startValue, value, result
            
            //Get selection from the user, while displaying a menu with the three options
             //Method: getUserSelection
                       
            //Check the user selection, and do different operations dependent on that selection
            //if 1, find the next prime given a starting number
            //Get the required input for the number they want to calculate
            //Change the input value into an integer instead of a double
             //Method: getUserInput, findNextPrime            
            
            //Otherwise, if 2, find the estimated sine of the value inputed
            //Get the required input for the number they want to calculate
             //Method: getUserInput, findSine
            
            //Otherwise, find the square root of a value inputed by the user
            //Get the required input for the number to calculate
             //Method: getUserInput, findSquareRoot
            
            //Use the user's initial selection to determine what results to display
            //Display the results
             //Method: showResults
            
            //End program
             //Method: printString

         }
      
      public static int getUserSelection() 
         {
            //create selection variable for returning later
            
            //display the menu of options
            //Ask the user for the option that they want and store it as the selection
             //Method: displayMenu            
            //until the user gives 1-3, continue showing the menu and asking what option they want
             //Method: do/while loop
            
            //return the selection
            
          //return 0 for error correction on steps up to 5
            return 0;
         }
      
      public static int displayMenu() 
         {
            //create a selection variable to be returned later
            
            //display the three options:
             //Find next prime, find sine, and find square root
            //store the choice as the selection
             //Method: printString, printEndlines

            
            //return the selection
            
          //return 0 for error correction on steps up to 5
            return 0;
         }
      
      public static double getUserInput(int operationSelection) 
         {
            //create a value variable to be returned later
            
            //check what selection the user gave
            //if it was 1, ask what the starting value to check for the next prime is
             //store the value as the value variable
            
            //otherwise if it was 2, ask what value to calculate sine of
             //store the value as the value variable
            
            //otherwise ask what number to calculate the square root of
             //store the value as the value variable
            
            //return the value
            
          //return 0 for error correction on steps up to 5
            return 0;
         }
      
      public static int findNextPrime(int startValue) 
         {
            //create a variable for the result and intermediateValue
            
            //Add one to the starting value and store it as an intermediateValue
            //check to see if the value is a prime
             //Method: isPrime, if statement
            //until the intermediate value is a prime, add one and check again
             //Method: while loop
            
            //once the next prime is found, store it as the result
            
            //return the result
            
          //return 0 for error correction on steps up to 5
            return 0;
         }
      
      public boolean isPrime(int value) 
         {
            //create an index variable
            
            //check every number from 2 until value - 1 to see if any of them evenly divide the value
            //If a number does evenly divide, return false
            //Otherwise, it will run through the loop and return true at the end
             //Method: modulo, for loop
            
          //return true to return that it is prime
            return true;
         }
      
      public static double findSine(double value) 
         {
            //create a result variable, oddCalc, and currentIteration variable
            
            //for 9 iterations, compute the taylor series of the sine
            //equation: (-1)^n * (x^(2n+1))/((2n+1)!)
            //n is the current iteration
            //2n + 1 is oddCalc
            //use a factorial method to calculate the factorial for each iteration
            //Add up each iteration, storing the accumulated number as the result
             //Method: for loop, Math.pow, findFactorial
            
            //return the result
            
          //return 0 for error correction on steps up to 5
            return 0;
         }
      
      public long findFactorial(int value) 
         {
            //create a result and current iteration variable
            
            //starting at 1, iterate through a series of multiplications, adding 1 to each new multiplication
            //multiply the result by the current iteration until the current iteration is greater than the value
             //Method: for loop
            
            //return the final result
            
          //return 0 for error correction on steps up to 5
            return 0;
         }
      
      public static double findSquareRoot(double value) 
         {
            //create variables, result, midValue, lowerValue, upperValue
            
            //divide value and store as mid value
            //determine if mid^2 is greater, less than, or equal to the upper half (value)
            //If it is equal, return the result. Use the precision.
            //otherwise if its bigger, move the upper half to the mid value, and leave the lower value
            //otherwise, move the lower half to the mid value, and leave the upper value
            //repeat until it is equal
             //Method: while loop
            
          //return 0 for error correction on steps up to 5
            return 0;
         }
      
      public static void showResults(double result, int inputSelection) 
         {
            //check if the input selection is 1,2, or 3
            //if 1, display that the next prime value is, plus the result
             //Method: printString
            
            //otherwise if it is 2, display that the sine value is, plus the result
             //Method: printString
            
            //otherwise, display that the square root is, plus the result           
             //Method: printString
         }

   }
