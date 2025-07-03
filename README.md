Java SE
-------------------------------------------------------------------

    Objectives
    ----------------------------------

        1. Java Intro
        2. OOP
        3. Working with Strings, Math, System and Object classes
        4. Exception Handling
        5. Generics And Collections
        6. Functional Interfaces, Lambda Expressions and Stream API 
        7. Multi-Threading and Concurrency
        8. Java Database Connectivity
        9. Java 9 to 17 Features

    Lab Setup
    -----------------------------------

        JDK 8
        Eclipse IDE
        MySQL or any other RDBMS

    Java Into
    -----------------------------------

        is a high level strictly but partially object oriented general purpose programming language.

        Features
            Simple
            Robust
            Multi-Threaded
            Distributed
            Secure
            Self Documented
            Arch., Neutral
            Platform Independent
                
                JRE         Java Runtime Env.,          JVM - JAva Virtual Machine, 
                                                        JIT - Just In Time interpreter
                                                        Class Loaders, Garbbage Collector ...etc.,

                JDK         Java Development Kit        JRE + development tools like java compiler ...etc.,

                Prog.java   ----javac------>    Prog.class (is a intermediate byte code understood only to JVM)

                this 'Prog.class' can be executed on any OS in the world provided the respective JVM is installed on it.
                
        Characteristics
            1. Case Senstitive
            2. C, C++ sytax similarity
            
        Evolution
            Editions
                JSE     Java Standard Edition       offers basic language support needed for 
                                                    any console base applications
                                                    JDK - installs JSE
                                                    
                JEE     Java Enterprise Edition     offers all that is needed to develop distributed enterprise level 
                                                    app like web-apps, web-services ...etc.,

                JME     Java Micro Edition          used for mobile app development and for programming IoTs

            Industry Adopted Versions
                Java 2
                Java 4
                Java 5
                Java 8
                Java 9
                Java 11
                Java 17

        Tokens
            is the msot indivisible piece of code.

            Identifiers
                is a name given any resource like variables, objects, methods, classes ....etc.,

                Rules
                    1. an identifier can be alpha numberic but can not start with a number
                    2. it can not match with any keyword
                    3. no two resources can have the same identifier
                    4. no special symbol except _ (Underscore) are allowed in a identifer

                Naming Concentions
                    Varaibles, Objects, Method          identfiers of these resources must start in lower case
                                                        and continue in lower case , but from second word onwards
                                                        init-capital are observed.

                                                        age
                                                        dateOfBirth
                                                        length
                                                        totalSurfaceArea

                                                        display()
                                                        toString()

                    Classes, Enums, Interfaces          identfiers of these resources must observe init-caps

                                                        String
                                                        Exception
                                                        ArithmeticException
                                                        ArrayIndexOutOfBoundsException

                    Constants                           identfiers of these resources must be all upper case
                                                        and we use '_' to seperate words.

                                                        PI
                                                        MIN_LIMIT
                                                        MAX_LIMIT


            Operators
                Binary
                    Arithmetic      +   -   *   /   %
                    Assignment      =   +=  -=  *=  /=  %=
                    Relational      ==  <   >   <=  >=  !=
                    Logical         &&  ||  !
                Ternary Pair        cond ? true_exp : false_exp;        g = a>b ? a : b;
                Unary               ++  --  -
                BitWise             &   |   ^   ~
                Misc                .   ,   [ ] ( ) { } ; ->  ....etc.,

            Keywords
                are reserved words in a programming language - 53 keywords

            Comments
                // end-of-line comment

                /*
                    block comment
                */

            Literals
                is a hard-coded value in to the source code

                    circumfrence  = 2 * Math.PI * radius;

                    identifiers     circumfrence    radius  Math    PI
                    operators       =   *   .   ;
                    literal         2

                Integer - Decimal (0 to 9)              int x = 90;     int num = 1_23_456;
                Integer - Octal   (0 to 7)              int y = 077;           
                Integer - HexDecimal (0 to 9, A to F)   int z = 0xA1;

                Floating Point                          3.14

                Boolean                                 true, false

                Reference                               null

                String                                  "hello world"

                Charecter                               'p' '%'

        Language Fundamentals

            Data Types            
                Primitive Data Types
                    byte
                    short
                    int
                    long
                    double
                    float

                    boolean
                    char
                    void

                User Defiend Data Types
                    class
                    interface
                    enum
                    annotation

            Variable Scope

                class MyClass{

                    int field;  //fields are allocated as and when an object is created for the class, 
                                //all fields are initialized with their default values based on the data type.
                                //byte,short,int,long = 0
                                //double,float = 0.0
                                //boolean = false
                                //char = ' '
                                //any object = null

                    public void method(int parameterOrArgument){
                        int localVariable; //these variable are not allocated until they are assigned with a value
                                             
                        while(true){
                            boolean blockScopedVariable;  //these variable are not allocated until they are assigned with a value
                        }
                    }

                }
            
            Control Structures

                Decision Making / Branching Control Structures
                    if
                        Simple If:
                            if(cond){
                                //statements that execute only when the cond is true
                            }

                        If-Else:
                            if(cond){
                                //statements that execute only when the cond is true
                            }else {
                                //statements that execute only when the cond is false
                            }

                        If-Ladder:
                            if(cond1){
                                //statements that execute only when the cond1 is true
                            }else if(cond2){
                                //statements that execute only when the cond2 is true
                            }else if(cond3){
                                //statements that execute only when the cond3 is true
                            }......
                            ..else {
                                //statements that execute only when all the given conds are false
                            }

                        Nested If:
                            if inside another if

                    switch
                        switch(expr) {
                            case value1: 
                                //statements that execute when expr==value1
                                break;
                            case value2: 
                                //statements that execute when expr==value2
                                break;
                            case value3: 
                                //statements that execute when expr==value3
                                break;
                            ....
                            ..
                            default:                            
                                //statements that execute when expr does not equals to any given value                                
                        }

                        switch supports expr that return either a char / int / string / enum

                Loops / Iterative Control Structures

                    do..while
                        do {
                            //these statements are executed surely once
                            //the next iteration happens only whent the cond is true
                            //this loop is called indefinite exit-check loop.
                        }while(cond);

                    while
                        while(cond) {
                            //these statements are execute repeatedly as long as the cond is true                         
                            //this loop is called indefinite entry-check loop.
                        }

                    for
                        for(initialization;cond;inc/dec){
                            //these statements are execute repeatedly as long as the cond is true                         
                            //this loop is called finite entry-check loop
                        }

                    enhanced-for / for-each :
                        for(loopingVar : arrayOrListorSetorAnyOtherCollection) {

                        }
                
                Non Conditional Control Structures

                    break           used for premeture exit of a loop
                    continue        used for cancelling the current iteration and skip to next iteration of a loop
                    return          used to return a value from a method or even to exit from a method abruptly.

            Arrays

                an array is a homoginous lienar fixed-in-size collection of elements.

                datatype[] arrName;                         //declaration
                arrName = new datatype[size];               //instantiation

                int[] nums;
                nums = new int[10];
                
                datatype[] arrName = new datatype[size];    //declaration and instantiation
                datatype arrName[] = new datatype[size];    //declaration and instantiation

                String[] names = new String[10];
                double data[] = new double[10];

                datatype[] arrName = new datatype[]{vale1,val2,val3,...};   //initialization
                datatype arrName[] = new datatype[]{vale1,val2,val3,...};   //initialization

                String[] friends = new String[] {"Vamsy","Latha","Sita","Prem"};

                1. index is zero-based
                2. every array has 'length' property to find out the size of the array

                for(int i=0;i<friends.length;i++){
                    System.out.println(friends[i]);
                }

                for(String f : friends){
                    System.out.println(f);
                }

                multi-dimenssioned array:

                    int[][] matrix = new int[5][3];
                    int[][][] array3d = new int[5][5][5];

                jagged arrays:
                    
                    int[][] jagged = new int[4][];
                    jagged[0] = new int[2];
                    jagged[1] = new int[4];
                    jagged[2] = new int[3];
                    jagged[3] = new int[5];

                    for(int r=0;r<jagged.length;r++){
                        for(int c=0;c<jagged[r].length;c++){
                            System.out.println(jagged[r][c]);
                        }
                    }

        Object Oriented Programming

            this is a coding concept that brough the real-time very near to the programming-world.

            Class And Object
            Encapsulation
            Inheretence
            Polymorphisim
            Abstraction

            Class
                    is a user-defined data type to represent a real-time entity
                    in terms of its properties and behaviours. Properties are 
                    represented by variables called fields, behaviours are represented
                    by functions called methods.

                    class Student {
                        int admNo;
                        String fullName;
                        int[] scores;

                        int getTotal(){
                            int total = 0;
                            for(int score : scores){
                                total += score;
                            }
                            return total;
                        }
                    }

            Object
                    is a variable of class-type.

                    Student s;                  //declaration and is not allocted in the memory
                    s = new Student();          //instantiation , here memory is allocated

                    Student s2 = new Student();

                    Student[] students = new Student[10];

                    for(int i=0;i<students.length;i++){
                        students[i] = new Student();
                    }

                    Java Objects are reference type.