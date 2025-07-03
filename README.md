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
            
            

