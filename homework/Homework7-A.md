## Homework 7-A

Write a program called homework7A.java

The purpose of this assignment is to handle file I/O. In this program, you will read in a 
data text file containing integer values. For each read integer, you will keep track of the 
minimum value, maximum value, and a running total. Once the data file has been read, you will 
calculate the average, and then write to an output file the count, maximum, minimum, total, and 
average (up to 3 decimal places).

### Psuedocode

 ```console

declare you input and output file objects
declare your variables for input, maximum, minimum, total, count, and average

open input file 
check for failure, if so, alert the user and exit the program

loop:
  read in input value
  update running total
  update count
  compare and update maximum if input is greater than max
  compare and update minimum if input is lesser than min
end loop

close input file stream

open output file stream
check for failure, if so, alert the user and exit the program

write the count, maximum, minimum, total, and average up to 3 decimal places
close output file stream

end
 ```
### Expected Output

#### homework7A
 ```console
-------------------------------------- 
Reading input file input.txt... done.
Writing to output.txt... done.
-------------------------------------- 
```

#### output.txt:
```console
-------------------------------------- 
Count: 26
Max: 9663
Min: 662
Total: 140808
Average: 5415.692
-------------------------------------- 
 ```

### Due 11/3 before 8am

Sumbit homework7A.java to canvas under Homework 7 by 7:59 am on November 3.

