- introduce a new of thinking on how to solve algorithms
- what is recursion?
  Recursion occurs when a function calls itself.
  good thing or bad thing
  what do you know about recursion?
  example of the negative way recursion can work
  stackoverflow
  helloWorld() with no parameters
  static void HelloWorld() {
  System.out.println("Hello World");
  HelloWorld();
  }
  VIDEO (first explain what factorial is)
- base case
- forward progress
- calling back into itself as if it were the original problem

MAKE rSigma
rFactorial
rReverseString

IF WE HAVE TIME
Import java.util.Scanner;

    Scanner scan = new Scanner(System.in);
    	System.out.println("How far do you want to walk (meters)?: ");
    	int distance = scan.nextInt();

    	takeAStep(0,distance);

    }

    static void takeAStep(int i,int distance) {
    	if(i<distance) {
    		i++;
    		System.out.println("*you take a step* : "+i+" meter/s");
    		takeAStep(i,distance);
    	}
    	else {
    		System.out.println("You are done walking!");
    	}
