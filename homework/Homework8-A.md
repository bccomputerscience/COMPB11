## Homework 6-A

Write a program called homework5.java

The purpose of this lab is to handle file I/O. In this lab, you will read in a data text file containing integer values. For each read integer, you will keep track of the minimum value, maximum value, and a running total. Once the data file has been read, you will calculate the average, and then write to an output file the count, maximum, minimum, total, and average (up to 3 decimal places).

Lab 5 input file:
use a wget command to download or a copy cp command to copy

wget http://www.cs.csubak.edu/~derrick/cs2010/Labs/input_lab5.txt . 

```console
pseudocode:

declare your input and output file stream objects
declare your variables for input, max, min, total, count, and avg

open input file stream
check for failure, if so, alert the user and exit the program

loop:
  read in input value
  update running total
  update count
  compare and update max if input is greater than max
  compare and update min if input is lesser than min
end loop

close input file stream

open output file stream
check for failure, if so, alert the user and exit the program

write the count, maximum, minimum, total, and average up to 3 decimal places
close output file stream

end

```

### Expected output

```console
Program Execution:

-------------------------------------- 
Reading input file... done.
Writing to output_data.txt... done.
-------------------------------------- 


output_data.txt:
-------------------------------------- 
Count: 26
Max: 9663
Min: 662
Total: 140808
Average: 5415.692
-------------------------------------- 
```



### Due 10/18 before 8am

Sumbit homework5.java to canvas under Homework 5 by 7:59 am on October 18.

