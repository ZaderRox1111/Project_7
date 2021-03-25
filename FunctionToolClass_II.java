package p7_package;

public class FunctionToolClass_II
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
      public static final int MENU_BLOCK_SIZE = 30;
      
      public static final int LOW_MENU_SELECTION = 1;
      public static final int HIGH_MENU_SELECTION = 3;
      
      public static final int FIND_NEXT_PRIME = 1;
      public static final int FIND_SINE = 2;
      public static final int FIND_SQUARE_ROOT = 3;

      public static final int SINE_ITERATIONS = 9;
      public static final double PRECISION = .000001;
      public static final int LONG_PRECISION = 6;
      public static final int TWO_ENDLINES = 2;

      //instantiate the conIO class
      public static Console_IO_Class conIO = new Console_IO_Class();
      
      public static void main(String[] args)
         {
            // TODO Auto-generated method stub
            
            //create the necessary variables
             //operationSelection, startValue, value, result
            double value, result;
            int operationSelection, startValue;
            
            //Get selection from the user, while displaying a menu with the three options
             //Method: getUserSelection
            operationSelection = getUserSelection();
                       
            //Check the user selection, and do different operations dependent on that selection
            //if 1, find the next prime given a starting number
            //Get the required input for the number they want to calculate
            //Change the input value into an integer instead of a double
             //Method: getUserInput, findNextPrime            
            value = getUserInput(operationSelection);
            
            if (operationSelection == 1) 
               {
                  
                  //turns the double value into an int. It reduces to the lower integer
                  //i.e. 3.8 becomes 3 instead of 4
                  startValue = (int) value;
                  
                  result = findNextPrime(startValue);
               
               }
            
            //Otherwise, if 2, find the estimated sine of the value inputed
            //Get the required input for the number they want to calculate
             //Method: getUserInput, findSine
            else if (operationSelection == 2) 
               {
                  
                  result = findSine(value);
                  
               }
            
            //Otherwise, find the square root of a value inputed by the user
            //Get the required input for the number to calculate
             //Method: getUserInput, findSquareRoot
            else 
               {
                  
                  result = findSquareRoot(value);
                  
               }
            
            //Use the user's initial selection to determine what results to display
            //Display the results
             //Method: showResults
            showResults(result, operationSelection);
            
            //End program
             //Method: printString
            conIO.printString("Program End");

         }
      
      public static int getUserSelection() 
         {
            //create selection variable for returning later
            int selection;
            
            //display the menu of options
            //Ask the user for the option that they want and store it as the selection
             //Method: displayMenu            
            //until the user gives 1-3, continue showing the menu and asking what option they want
             //Method: do/while loop
            do 
            {
            
               selection = displayMenu();
               conIO.printEndline();
               
            }
            while(selection < 1 || selection > 3);
            
            //return the selection
            return selection;
            
         }
      
      public static int displayMenu() 
         {
            //create a selection variable to be returned later
            int selection;
            
            //display the three options:
             //Find next prime, find sine, and find square root
            //store the choice as the selection
             //Method: printString, printEndlines, printEndline
            conIO.printString("MENU", MENU_BLOCK_SIZE, "CENTER");
            conIO.printEndlines(TWO_ENDLINES);
            conIO.printString("1. Find Next Prime");
            conIO.printEndlines(TWO_ENDLINES);
            conIO.printString("2. Find Sine");
            conIO.printEndlines(TWO_ENDLINES);
            conIO.printString("3. Find Square Root");
            conIO.printEndlines(TWO_ENDLINES);
            
            selection = conIO.promptForInt("Enter your selection choice: ");
            
            //return the selection
            return selection;
          
         }
      
      public static double getUserInput(int operationSelection) 
         {
            //create a value variable to be returned later
            double value;
            
            //check what selection the user gave
            //if it was 1, ask what the starting value to check for the next prime is
             //store the value as the value variable
            if (operationSelection == 1) 
               {
                  
                  value = conIO.promptForDouble("Enter start value for finding prime, must be greater than 1.0: ");
                  
               }
            
            //otherwise if it was 2, ask what value to calculate sine of
             //store the value as the value variable
            else if (operationSelection == 2) 
               {
                  
                  value = conIO.promptForDouble("Enter value to find sine, must be greater than 1.0: ");
                  
               }
            
            //otherwise ask what number to calculate the square root of
             //store the value as the value variable
            else 
               {
                  
                  value = conIO.promptForDouble("Enter value to find square root, must be greater than 1.0: ");
                  
               }
            
            //return the value
            return value;
            
         }
      
      public static int findNextPrime(int startValue) 
         {
            //create a variable for the result and intermediateValue
            int result = 0;
            int intermediateValue;
            
            //Add one to the starting value and store it as an intermediateValue
            //check to see if the value is a prime
             //Method: isPrime, if statement
            //until the intermediate value is a prime, add one and check again
             //Method: while loop
            intermediateValue = startValue + 1;
            
            if (isPrime(intermediateValue)) 
               {
                  
                  result = intermediateValue;
                  
               }
            
            while (isPrime(intermediateValue) == false) 
               {
                  
                  intermediateValue = intermediateValue + 1;
                  
                  if (isPrime(intermediateValue)) 
                     {
                        
                        result = intermediateValue;
                        
                     }
                  
               }
            
            //once the next prime is found, store it as the result
            
            //return the result
            return result;
          
         }
      
      public static boolean isPrime(int value) 
         {
            //create an index variable
            int index;
            
            //check every number from 2 until value - 1 to see if any of them evenly divide the value
            //If a number does evenly divide, return false
            //Otherwise, it will run through the loop and return true at the end
             //Method: modulo, for loop
            for (index = 2; index < value; index++) 
               {
                  
                  if (value % index == 0) 
                     {
                        
                        return false;
                        
                     }
                  
               }
            
            //return true to return that it is prime
            return true;
         }
      
      public static double findSine(double value) 
         {
            //create a result variable, oddCalc, and currentIteration variable
            double result = 0;
            double rightSide, leftSide;
            int currentIteration, oddCalc;
            
            //for 9 iterations, compute the taylor series of the sine
            //equation: (-1)^n * (x^(2n+1))/((2n+1)!)
            //n is the current iteration
            //2n + 1 is oddCalc
            //use a factorial method to calculate the factorial for each iteration
            //Add up each iteration, storing the accumulated number as the result
             //Method: for loop, Math.pow, findFactorial
            for (currentIteration = 0; currentIteration < SINE_ITERATIONS; currentIteration++) 
               {
                  
                  //making sure to keep oddCalc as an int so it can be used in findFactorial
                  oddCalc = (int) (2 * currentIteration + 1);
                  leftSide = Math.pow(-1, currentIteration);
                  rightSide = (Math.pow(value, oddCalc))/(findFactorial(oddCalc));
                  result = result + (leftSide * rightSide);
                  
               }
            
            //return the result
            return result;
          
         }
      
      public static long findFactorial(int value) 
         {
            //create a result and current iteration variable
            long result = 1;
            int currentIteration;
            
            //starting at 1, iterate through a series of multiplications, adding 1 to each new multiplication
            //multiply the result by the current iteration until the current iteration is greater than the value
             //Method: for loop
            for (currentIteration = 1; currentIteration <= value; currentIteration++) 
               {
                  
                  result = result * currentIteration;
                  
               }
            
            //return the final result
            return result;
          
         }
      
      public static double findSquareRoot(double value) 
         {
            //create variables, result, midValue, lowerValue, upperValue
            double result, midValue, midSquared, lowerValue, upperValue;
            
            //divide value and store as mid value
            //determine if mid^2 is greater, less than, or equal to the upper half (value)
            //If it is equal, return the result. Use the precision.
            //otherwise if its bigger, move the upper half to the mid value, and leave the lower value
            //otherwise, move the lower half to the mid value, and leave the upper value
            //repeat until it is equal
             //Method: while loop
            lowerValue = 0;
            upperValue = value;
            
            do 
               {
                  
                  midValue = lowerValue + (0.5 * (upperValue - lowerValue));
                  midSquared = midValue * midValue;
                  
                  if (midSquared > value) 
                     {
                     
                        upperValue = midValue;
                     
                     }
                  
                  else 
                     {
                        
                        lowerValue = midValue;
                        
                     }
                  
               }
            while (Math.abs((midSquared) - value) > PRECISION);
            
            result = midValue;
            
            //Return the result
            return result;
            
         }
      
      public static void showResults(double result, int inputSelection) 
         {
            //Creating integer result for option 1 primes
            int resultInteger;
            
            //check if the input selection is 1,2, or 3
            //if 1, display that the next prime value is, plus the result
             //Method: printString
            if (inputSelection == 1) 
               {
                  
                  //Converting the float to an integer
                  resultInteger = (int) result;
                  
                  conIO.printEndline();
                  conIO.printString("Next prime value is: ");
                  conIO.printInt(resultInteger);
                  conIO.printEndlines(TWO_ENDLINES);
                  
               }
            
            //otherwise if it is 2, display that the sine value is, plus the result
             //Method: printString
            else if (inputSelection == 2) 
               {
                  
                  conIO.printEndline();
                  conIO.printString("Sine value is: ");
                  conIO.printDouble(result, LONG_PRECISION);
                  conIO.printEndlines(TWO_ENDLINES);
                  
               }
            
            //otherwise, display that the square root is, plus the result           
             //Method: printString
            else 
               {
                  
                  conIO.printEndline();
                  conIO.printString("Square root is: ");
                  conIO.printDouble(result, LONG_PRECISION);
                  conIO.printEndlines(TWO_ENDLINES);
                  
               }
            
         }

   }