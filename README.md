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
* [Date](#Date)

### Stream
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

### Date
Java 8 introduced new APIs for Date and Time to address the shortcomings of the older java.util.Date and java.util.Calendar.

```java
LocalDateTime currentTime = LocalDateTime.now();
System.out.println("Current DateTime: " + currentTime);
		
LocalDate date1 = currentTime.toLocalDate();
System.out.println("date1: " + date1);
```
