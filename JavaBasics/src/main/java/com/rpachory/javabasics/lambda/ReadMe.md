# Lambda Expressions
1. A Java lambda expression is essentially an object that can be assigned to a variable and passed around.

    <pre>
    public interface LambdaComparator{ 
        public boolean compare(int a1, int a2);
    }

    LambdaComparator myComparator = (a1, a2) -> return a1 > a2;
    boolean result = myComparator.compare(2, 5);
    </pre>

2. Java lambda expression can access variables declared outside the lambda function body under certain circumstances.
    1. Local variables
    2. Instance variables
    3. Static variables

3. Method References
    1. Static method reference
    2. Parameter method reference
    3. Instance method reference
    4, Constructor method reference