1) What is Stream?
2) Why Streams?
3) Different ways to initialize Streams
3) Intermediate vs Terminal
4) Stream Operations
5) Stateful vs Stateless
6) Short-Circuiting
7) Collectors
8) Parallel Streams


Java 8 Features:
 - Lambdas
 - Method References
 - Default Methods
 - Functional Interface


What is Stream?
 - Stream is an abstraction that represents zero or more elements
 - Not a data structure
 - Pipes & Filter pattern

    ps -ef | grep java | cut -c 1-9 | sort -n | uniq


Properties of Streams:
 - Streams do not store elements ==> they are a view on top of a data structure
 - Operations provided by Streams... …are applied to the underlying data source elements
 - Stream Operations can take as a parameter…
    …Lambda expressions …Method references
 - Manipulating the underlying data source... …will yield a ConcurrentModificationException
 Pipelines A stream source Zero or more intermediate operations a terminal operations
 A pipeline can be executed in parallel