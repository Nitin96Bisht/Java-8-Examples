## Java-8-Examples
Java 8 is the most awaited and is a major feature release of Java programming language. This is an introductory tutorial that explains the basic features of Java 8 and their usage in a simple way.

## Table of Contents
* [Stream](#Stream)
  * [Generating streams](#generating-streams)
  * [Filter](#filter)
  * [Sorted](#sorted)
  * [Map](#map)
  * [Match](#match)
  * [Count](#count)
  * [Reduce](#reduce)
* [Optional](#Optional)
* [Lambda Expression](#lambda-expression)
* [Functional Interface](#functional-interface)
* [Default Method](#default-method)
* [Date](#Date)

## Stream
Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
Streams are an update to the Java API that lets you manipulate collections of data in a declarative way (you express a query rather than code an ad hoc implementation for it). For now you can think of them as fancy iterators over a collection of data. In addition, streams can be processed in parallel transparently, without you having to write any multithreaded code.

### Generating streams

With Java 8, Collection interface has two methods to generate a Stream.

•	<b>stream()</b> − Returns a sequential stream considering collection as its source.

•	<b>parallelStream()</b> − Returns a parallel Stream considering collection as its source.

```java
List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
```

### Filter
Java 8 Stream interface introduces filter() method which can be used to filter out some elements from object collection based on a particular condition. This condition should be specified as a predicate which the filter() method accepts as an argument.

```java
List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
Stream<String> allNames = names.stream();
Stream<String> longNames = allNames.filter(str -> str.length() > 6);	
```

### Sorted
Stream sorted() returns a stream consisting of the elements of this stream, sorted according to natural order. For ordered streams, the sort method is stable but for unordered streams, no stability is guaranteed. It is a stateful intermediate operation.

```java
List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
list.stream().sorted().forEach(System.out::println); 
```

### Map
Stream map(Function mapper) is an intermediate operation. These operations are always lazy. Intermediate operations are invoked on a Stream instance and after they finish their processing, they give a Stream instance as output.

```java
List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 
list.stream().map(number -> number * 3).forEach(System.out::println); 
```

### Match
Java 8 Matching with Streams tutorial explains how to match elements in a stream using the allMatch(), anyMatch() and noneMatch() methods provided by the Streams API with examples to show their usage.

### Count
long count() returns the count of elements in the stream.

```java
List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10, 12);  
long total = list.stream().count(); 
```

### Reduce
Many times, we need to perform operations where a stream reduces to single resultant value, for example, maximum, minimum, sum, product, etc. Reducing is the repeated process of combining all elements.

```java
List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8); 
int sum = array.stream().reduce(0, (element1, element2) -> element1 + element2); 
```
## Optional
Every Java Programmer is familiar with NullPointerException. It can crash your code. And it is very hard to avoid it without using too many null checks.
Java 8 has introduced a new class Optional in java.util package. It can help in writing neat code without using too many null checks. By using Optional, we can specify alternate values to return or alternate code to run. This makes the code more readable because the facts which were hidden are now visible to the developer.

```java
List<String> listOfStrings = Arrays.asList("Mark", "Howard", "Anthony D'Cornian");
Optional<String> largeString = listOfStrings.stream().filter(str -> str.length() > 10).findAny();
largeString.ifPresent(System.out::println);
```

## Lambda Expression
Lambda expressions are introduced in Java 8 and are touted to be the biggest feature of Java 8. Lambda expression facilitates functional programming, and simplifies the development a lot.

The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

```java
List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

Collections.sort(names, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return b.compareTo(a);
    }
});
```

Here instead of creating anonymous object, Java 8 comes with the lambda expression:

```java
Collections.sort(names, (String a, String b) -> {
    return b.compareTo(a);
});
```

## Functional Interface
An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method.

Before Java 8, we had to create anonymous inner class objects or implement these interfaces.

```java
class Test 
{ 
    public static void main(String args[]) 
    { 
        // create anonymous inner class object 
        new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                System.out.println("New thread created"); 
            } 
        }).start(); 
    } 
} 
```

Java 8 onwards, we can assign lambda expression to its functional interface object like this:

```java
class Test 
{ 
  public static void main(String args[]) 
  { 
  
    // lambda expression to create the object 
    new Thread(()-> 
       {System.out.println("New thread created");}).start(); 
  } 
} 
```

## Default Method
Before Java 8, interfaces could have only abstract methods. The implementation of these methods has to be provided in a separate class. So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface. To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.

```java
interface TI
{ 
    // default method 
    default void show() 
    { 
      System.out.println("Default Method"); 
    } 
} 
```

## Date
Java 8 introduced new APIs for Date and Time to address the shortcomings of the older java.util.Date and java.util.Calendar.

```java
LocalDateTime currentTime = LocalDateTime.now();
System.out.println("Current DateTime: " + currentTime);
		
LocalDate date1 = currentTime.toLocalDate();
System.out.println("date1: " + date1);
```
