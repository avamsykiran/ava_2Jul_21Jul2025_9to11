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

                    Constructor

                        is a method of a class that gets invoked immidiately
                        after the memory allocation of an object.

                        Constructors are mostly used for initialization of fields of a class.

                        1. Constructors must have the same name as that of a class
                        2. Constructors should not return any value.

                        class Student {
                            int admNo;              //defaults to 0 being an int
                            String fullName;        //defaults to null being an object of String class
                            int[] scores;           //defaults to null as arrays are also objects

                            Student(){
                                scores = new int[4];    //initializing the array to accomidate 4 ints.
                            }

                            int getTotal(){
                                int total = 0;
                                for(int score : scores){
                                    total += score;
                                }
                                return total;
                            }
                        }
                        
                        1. If a class is not written with any constructor , java compiler adds a default-constructor to it.
                        2. A class can have any number of constructors as long as they havce different parameters.
                        3. A constructor having no parameters is called a default-constructor.
                        4. A constructor having atleast one parameter is called a paramatrized constructor.
                        5. If atleast one of the parameters of a parametrized-constructor is an object of the same class,
                            then it is called a copy-constructor

            Encapsulation

                is also called data-hiding.

                is the way of providing an indirect access to the fields and a few methods of a class.

                encapsulation in java is implemented with the help of access specifiers and setters / getters.

                access-specifiers

                    default         if a field or method is not given any of the keywords like
                                    public / private / protected, then it is said to have default access
                                    specifier. Fields and mehtods with default access specifier are accessable
                                    within the host-class and within any other class that belongs to
                                    the package of the host-class 

                    public          Fields and methods that are marked with public access specifier are accessable
                                    any where through out the application.

                    protected       Fields and methods that are marked with protected access specifier are accessable
                                    within the host-class and within the sub-classes of the host-class.

                    private         Fields and methods that are marked with priovate access specifier are accessable
                                    only within the host-class.

                setter      is a method that can accept and assign a value into a field

                getter      is a method that returns a value of a field

                    if a field is marked private and has
                    no-setter and no-getter         then it is an in-accessable field
                    only setter                        then it is a write-only field
                    only getter                        then it is a read-only field
                    both setter and getter          then it is a fully accessable field

                    class Circle {
                        private double radius;

                        public void setRadius(int radius){
                            this.radius=radius;
                        }

                        public double getRadius(){
                            return this.radius;
                        }

                        public double getDiameter(){
                            return this.radius*2;
                        }
                    }

                    Circle c1 = new Circle();

                    c1.setRadius(90.9);
                    System.out.println(c1.getRadius());
                    System.out.println(c1.getDiameter());

                    Circle c2 = new Circle();

                    c2.setRadius(9.9);
                    System.out.println(c2.getRadius());
                    System.out.println(c2.getDiameter());
                   
                this keyword        refers to the object that is accessing a method.
                                    'this' can also be used to invoke one constructor 
                                    from another of the same class.

                static keyword      static can be applied on 
                                    a field         static fields are also called class variables because
                                                    every object of the class shares the same copy of these
                                                    fields

                                                    non-static fields are also called instance variables, as
                                                    each object of class is allocated its
                                                    own copy of these fields

                                    a method        a static method can access only other static fields.
                                                    a static method is never associated with an object but
                                                    is invoked associating it with the class name.

                                    a class         a static class can be created only inside another class.

                                                    a class inside another class is called
                                                        Inner Class     are non-static
                                                                        these have access to all fields
                                                                        and methods of the outer class

                                                        Nested Class    are static 
                                                                        do not have access to non-static members 
                                                                        of the out class

                                    static blocks    

                                                    static {
                                                        //the code written here is executed jsut before the class
                                                        //is accessed for the first time.
                                                    }

            Inheretence

                is about creating a class class from an exiting clasx.

                class Pen {
                    Nib nib;
                    Barrel barrel;
                    Refill refill;

                    void write(Paper paper,String text) {

                    }
                }

                class Marker extends Pen {
                    void write(WhiteBoard board,String text) {

                    }
                }

                We are deriving MArker from Pen, and in this case Pen is called super-class
                and the Marker is the sub-class.

                Objects of super class will be allocated with all the fields in the super class.
                Objects of sub class will be allocated with all the fields in super and sub classes.

                Simple Inheretence / Single Inheretence

                    Employee (empId,fullName,sal)   <------------ Manager (..,allowence)

                Multi-level Inheretence
                    
                    Employee (empId,fullName,sal)   <--- Manager (..,allowence) <--- Director (..,share)

                Hirarchial Inheretence

                    Employee (empId,fullName,sal)   
                        |
                        |<------------ ContractEmployee (..,contractDuration)
                        |
                        |<------------ Manager (..,allowence)

                Hybrid Inheretence

                    Employee (empId,fullName,sal)   
                        |
                        |<------------ ContractEmployee (..,contractDuration)
                        |
                        |<------------ Manager (..,allowence)
                                        |
                                        |<---- Director (..,share)

                Multiple Inheretence

                    is where two or more super-types commonly are derived into one sub-type
                    java classes do not support multiple inheeretence due to ambiguity issues.

                Points to rememebr
                    
                    1. When ever an object of a sub-class is allocated, the construcotrs of all the super classes are
                        invoked from top to bottom.

                        for instance, in the above hybrid ionheretenc,
                            crewating an object to Direcotr will invoke constructors of 
                                Employee(), Manager() , Director()

                    2. A reference of a super type can refer to an object of its sub-type

                        Employee e1 = new ContractEmployee();
                        Employee e2 = new Manager();
                        Employee e3 = new Director();

                        Manager m1 = new Director();

                    4. Object type cassting

                        ContactEmployee c1 = (ContractEmployee) e1;
                        ContactEmployee c2 = (ContractEmployee) e2; //raises a ClassCastException as e2 is a Manager

            Polymorphisism

                is where we can define more than one method in the same scope with the same name.

                Overloading 
                    two methods are said to be overlaoded if
                            (a) both of them belong to the same class or to a super and a sub class
                        and (b) both of them have same name
                        and (c) they have different number of parameters or different types of parameters

                    class HumanBeing {
                        void eat(Fruit fruit) {
                            wash(fruit);
                            peel(fruit);
                            Piece ps[] = cut(fruit);
                            for(Piece p : ps){
                                chewAndSwallow(p);
                            }
                        }

                        void eat(IceCream iceCream){
                            while(iceCream.exists()) {
                                lickAndSwallow(iceCream);
                            }
                        }
                    }

                Overriding
                    two methods are said to be overriden if
                            (a) both of them belong to a super and a sub class
                        and (b) both of them have same name, same number of parameters and same type of parameters
                        
                    class Monkey {
                        void eat(IceCream iceCream){
                            while(iceCream.exists()) {
                                lickAndSwallow(iceCream);
                            }
                        }

                        void eat(Fruit fruit) {
                            while(fruit.exists(){
                                byteAndChewAndSwallow(p);
                            }
                        }
                    }

                    class HumanBeing extends Monkey {
                        void eat(Fruit fruit) {     //overloades Monkey::eat(IceCream) and overrides Monkey:eat(Fruit)
                            wash(fruit);
                            peel(fruit);
                            Piece ps[] = cut(fruit);
                            for(Piece p : ps){
                                chewAndSwallow(p);
                            }
                        }
                    }

            Abstraction

                is also called behaviour hiding.

                is a practise of declaring an method and implementing it at a later stage.

                (a) abstract class
                        if a class is marked abstract we can not create objects to that class.

                        Let's conseder a school automation app:

                            abstract class Person       id,name,dob,bloodGroup,gender,height
                                |<-- Student                 .., clazz,section,
                                |<-- Teacher                 .., subject, salary
                                |<-- NonTeachingStaff        .., designation, salary   
                                |<-- Principal              
                                |<-- Parent

                (b) abstract function
                        If a function can not be implemented right away then it is marked as abstract.
                        
                        Only abstract classes and interface can accomidate abstract functions.

                        Any sub class deriving an abstract class or an interface must implement all abstract
                        methods in them, orelse the sub class is also to be marked as abstract.

                        abstract class GeometricShape {                            
                            protected int[] sides;

                            public int getPerimeter(){
                                int p = 0;
                                for(int s : sides){
                                    p +=s;
                                }
                                return p;
                            }

                            public abstract double getArea();
                        }

                        class Rectangle extends GeometricShape {
                            public Rectangle(){
                                this.sides = new int[4];
                            }

                            public double getArea(){
                                return sides[0]*sides[1];
                            }
                        }

                        class Circle extends GeometricShape {
                            public Circle(){
                                this.sides = new int[1];
                            }

                            public double getArea(){
                                return 3.14*sides[0]*sides[0];
                            }
                        }

                (c) interfaces
                    are user defiend data type that do not have fields and support multiple inheretence.

                        interface GeometricShape {                                                        
                            int getPerimeter();
                            double getArea();

                            public default double estimatePaintingCost(double paintingRate){
                                return getArea() * paintingRate;
                            }
                        }

                        class Rectangle implements GeometricShape {
                            private int length;
                            private int breadth;                           

                            public double getPerimeter(){
                                return 2*(length+breadth);
                            }

                            public double getArea(){
                                return length*breadth;
                            }
                        }

                        class Circle implements GeometricShape {
                            private double radius;
                            
                            public double getPerimeter(){
                                return 2*3.14*radius;
                            }

                            public double getArea(){
                                return 3.14*radius*radius;
                            }
                        }

                'final'

                        is used on 
                            a variable      to make that variable a constant.
                            a method        to make that method non-overridable.
                            a class         to make that class non-inheretable.

                the final and abstract keywords can not be used at a time, as they are contradictory.


        Java Packages And Modules
        -----------------------------

            package is a collection of classes, interfaces, enums, annotations and sub-packages.

                in java, packages are used to represent different layers of an application.

                    Repositories / DAOs
                    Services
                    UserInterfaces
                    Library
                    Utility

            modules , was introduced from java 9, is a collection of packages. A module is described
            by a module descriptor file that names the module and gives th lsit of exposed packages
            and also gives the lsit of outside packages that are required by the current module.

        Nava Built-in Packages
        ---------------------------------

            java.lang       is said to be implicit package as it need not be formally imported to access any of its classes.

                            Object, System, Math, String, StringBuffer, StringBuilder, Wrapper-Classes
                            concept of Excpetions, concept of Threads 

            java.time       is a date-time api    

            java.regexp     is a regular expression utility package

            java.util       Random, StringTokenizer
                            concept of Collections     

            java.util.function      Functional interfaces
            java.util.stream        Streams API

            java.io         input output streams
            java.nio        non-blocking input output streams

            java.sql        Java ddatabase connectivity

        java.lang.Object
        --------------------

            this class is a implicit super-class for all java classes.

            this class offers
                int hashcode()
                boolean equals(Object)
                String toString()

        Working with Strings
        ------------------------

            java.lang.String

                Strings are immutable (non-editable).
                Everytime we modify a string, a new string object is created. This makes
                modifing string very costly.

            java.lang.StringBuilder     is not thread-safe
            java.lang.StringBuffer      is thread-safe

                These two classes are used to manipualte or modify a string without
                creating multiple new objects, relativly less costlier.

        java.lang.System
        -----------------

            public static InputStream in;   //rerpesents the standard input stream (keyboard)
            public static PrintWriter out;  //rerpesents the standard output stream (monitor)
            public static PrintWriter err;  //rerpesents the standard error stream (monitor)

            public static void gc();        //used to request garbbage collection
            public static int nativeHashcode(Object); //this returns the hashcaode of an object based on its memory address.

        java.lang.Math
        ----------------
            this class offers a list of public static methods repreenting a variety of
            arithemtic and trignometric operations.

        java.util
        ---------------

            Scanner
                    is used scan different types of values from any InputStream.

                    Scanner(InputStream)            
                        Scanner kbin = new Scanner(System.in);

                    int nextInt()
                    flaot nextflaot()
                    double nextDouble()
                    String next()
                    ....etc.,

            Random
                    is used to generate psuedo random numbers.

                    Random()
                    Random(int seed)

                    int nextInt(upperLimit);    //generates a random int between zero and the givne upperLimit

        Assignment#1

            write a java application that generates 15 random numbers and prints them. Analyze and print
            the min, max, sum and avg of the generted random numbers.

        Wrapper-Classes, AutoBoxing and AutoUnBoxing
        

    Exception Handling
    -------------------------------

        Exception refers to a senario of mis-fed inputs or mis-managed operations that lead to
        abornmal termination of the program.

        Exception Handling refers to react when an exception occurs, avoiding the abnormal termination of the program.

        java.lang.Throwable (i)
                    |
                    |<- java.lang.Error         represents a system level error like stack-overflow ...etc.,
                    |
                    |<- java.lang.Exception                         
                                    |
                                    |<- java.lang.RuntimeException

        sub-Classes of Exception are called CHECKED-EXCEPTIONS
        EXCEPTIONS are verified by the compiler wheather they are handled or not, and if not handled a compile-time
        error is raised. It means it is compulsory to handle CHECKED-EXCEPTIONS

        sub-Classes of RuntimeException are called UNCHECKED-EXCEPTIONS
        UNCHECKED-EXCEPTIONS are not verified by the compiler wheather they are handled or not.
        UNCHECKED-EXCEPTIONS are not supposed to be handled , but they are supposed to avoided.

            class EmployeeService {
                public double computeTotalPay(Employee emp){
                    double tPay = emp.getBasic() + emp.getHra() + emp.getTa() - emp.getTax(); //there is a chance of NullPointerException
                    return tPay;
                }
            }

            class EmployeeService {
                public double computeTotalPay(Employee emp){
                    double tPay = 0;
                    
                    if(emp!=null){ //avoiding NullPointerException
                        tPasy = emp.getBasic() + emp.getHra() + emp.getTa() - emp.getTax(); 
                    }

                    return tPay;
                }
            }

        Hanlding Checked-Exceptions

            try-catch Statement

                try {
                    //the statement that may throw an exception are written here
                }catch(ExceptionType1 e){
                    //the alternate code that has to execute when an exception of ExceptionType1 occurs
                }catch(ExceptionType2 e){
                    //the alternate code that has to execute when an exception of ExceptionType2 occurs
                }catch(ExceptionType3 e){
                    //the alternate code that has to execute when an exception of ExceptionType3 occurs
                }finally {
                    //the code that ahs to execute irrespective of an exception occuring or not is written here.
                    //finally block is designed to close any connectiosn or stream or other closables.
                }

            try-with-resources

                try(
                    //all closables are declared here.
                ) {
                    //the statement that may throw an exception are written here
                }catch(ExceptionType1 e){
                    //the alternate code that has to execute when an exception of ExceptionType1 occurs
                }catch(ExceptionType2 e){
                    //the alternate code that has to execute when an exception of ExceptionType2 occurs
                }catch(ExceptionType3 e){
                    //the alternate code that has to execute when an exception of ExceptionType3 occurs
                }

            try-with-multiCatch

                try(
                    //all closables are declared here.
                ) {
                    //the statement that may throw an exception are written here
                }catch(ExceptionType1 | ExceptionType2 | ExceptionType3 e){
                    //the alternate code that has to execute when an exception of 
                    // ExceptionType1 or ExceptionType2 or ExceptionType3 occurs
                }

        User Defined Exceptions

            We will have to create a sub-class to Exceptiofn or RuntimeException classes to
            create our own exceptions.

            throw       is a keyword used to raise a exception programatically.

                        throw new InsufficientBalanceException();

            throws      is a keyword used to transfer an exception from its a method to the caller method
