#What you need to start
1. Open git bash in root of project
2. 
    ```
   $ gradle build
   $ gradle jmh
    ```
3. Your results been in ` build/results/jmh/result.txt`
4. Example result:
```
Benchmark                         Mode  Cnt   Score    Error  Units
TestArrayList.init                  ss    9  10,413 ± 15,076  ms/op
TestArrayList.testAddToEnd          ss    9   0,004 ±  0,001  ms/op
TestArrayList.testAddToStart        ss    9   0,188 ±  0,283  ms/op
TestArrayList.testContains          ss    9   0,164 ±  0,256  ms/op
TestArrayList.testGet               ss    9   0,119 ±  0,034  ms/op
TestArrayList.testRemoveElement     ss    9   0,810 ±  0,464  ms/op
TestArrayList.testRemoveIndex       ss    9   0,213 ±  0,448  ms/op
TestLinkedList.init                 ss    9   1,770 ±  0,249  ms/op
TestLinkedList.testAddToEnd         ss    9   0,005 ±  0,002  ms/op
TestLinkedList.testAddToStart       ss    9   0,011 ±  0,002  ms/op
TestLinkedList.testContains         ss    9   0,013 ±  0,004  ms/op
TestLinkedList.testGet              ss    9   0,009 ±  0,002  ms/op
TestLinkedList.testRemoveElement    ss    9   0,646 ±  0,150  ms/op
TestLinkedList.testRemoveIndex      ss    9   0,010 ±  0,001  ms/op

```