# 6. Parking Fee Calculator

```
Difficulty: Medium
Es mated Time Limit: 25 minutes

Problem Statement
A shopping mall wants to automate its parking system.
The parking fee depends on the vehicle type:
     C — Car
     B — Bike
     T — Truck
The charges are:
Car
     First 2 hours → ₹30/hour
     Addi onal hours → ₹20/hour
Bike
       First 2 hours → ₹15/hour
       Addi onal hours → ₹10/hour
Truck
      First 2 hours → ₹50/hour
      Addi onal hours → ₹40/hour
Given mul ple vehicles, calculate the total parking collec on.

Input Format
First line contains integer N, the number of vehicles.
Next N lines contain:
VehicleType Hours

Output Format
Print:
Total Collec on: <amount>

Constraints
    1 ≤ N ≤ 1000
    1 ≤ Hours ≤ 100

Example
 Input                                                   Output
 3                                                       Total Collec on: 290
 C3
 B2
 T4

Explana on
Car:
2 × 30 + 1 × 20 = 80
Bike:
2 × 15 = 30
Truck:
2 × 50 + 2 × 40 = 180
Total:
80 + 30 + 180 = 290

Test Cases
 Input:                                                  Output:
 2                                                       Total Collec on: 90
 C2
 B5
 Input:                                              Output:
 4                                                   Total Collec on: 210
 T1
 C4
 B3
 C2
```

Note: text extracted from the PDF; some ligature characters ("ti", "tt") may be missing. See the original PDF in the repo root.
