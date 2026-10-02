# 4. Student Result Analyzer

```
Difficulty: Easy
Es mated Time Limit: 20 minutes

Problem Statement
A college wants to automa cally generate results for students.
Each student has marks in N subjects. A student passes a subject only if the marks are at least 40.
The student passes overall only when they pass every subject and their average marks are at least 50.
Write a program to calculate the total marks, average marks, number of failed subjects, and final result.

Input Format
First line contains integer N, the number of subjects.
Second line contains N integers represen ng marks.

Output Format
Print:
Total: <total>
Average: <average>
Failed Subjects: <count>
Result: PASS/FAIL
Print the average up to 2 decimal places.

Constraints
    1 ≤ N ≤ 20
    0 ≤ marks ≤ 100
Example
 Input                                                   Output
 5                                                       Total: 340
 65 72 55 80 68                                          Average: 68.00
                                                         Failed Subjects: 0
                                                         Result: PASS
Explana on
Total:
65 + 72 + 55 + 80 + 68 = 340
Average:
340 / 5 = 68
No subject has marks below 40, and the average is above 50.

Test Cases
 Input:                                              Output:
 4                                                   Total: 330
 80 75 90 85                                         Average: 82.50
                                                     Failed Subjects: 0
                                                     Result: PASS

 Input:                                              Output:
 5                                                   Total: 325
 80 35 70 65 75                                      Average: 65.00
                                                     Failed Subjects: 1
                                                     Result: FAIL
```

Note: text extracted from the PDF; some ligature characters ("ti", "tt") may be missing. See the original PDF in the repo root.
