# Threads-1
1 del af threads opgaverne

##Exercise 1
  The relevant content is in Exercise 1/Threads.java
  
  
##Exercise 2
  The relevant content is in Exercise 2/Exercise2.java

#####Explain what happens?
  When 2 threads try and increment a value at almost the exact time, one thread might read the value and increment it 
  while the other thread has just read the value. Since they both read the same value only the last one thread will increment it.
  This means that the value only get incremented by 1 insted of 2
  
#####How common is the problem?
  This depends on a number of things but can be quite frequent 
 
  
##Exercise 3
  The relevant content is in Bounce (Exercise 3)
  
  
##Exercise 4
  The relevant content is in turnstile (Exercise 4)
  
  Code changes can be found in TurnstileCounter.java
  

##Exercise 5
  The relevant content is in BancAccountUnsynchronized (Exercise 5)

  
##Exercise 6
  The relevant content is in Exercise 6 / MainWindow.java
  
  Tests are done using [Fest](https://code.google.com/p/fest/)
