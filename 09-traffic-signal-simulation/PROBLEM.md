# 9. Traﬃc Signal Simula on

```
Difficulty: Hard
Es mated Time Limit: 40 minutes

Scenario
A city traﬃc department wants to simulate vehicles passing through a traﬃc signal.
The signal operates in three states:
     R → Red
     Y → Yellow
     G → Green
During a red signal, vehicles must stop. During yellow, vehicles slow down, and during green, vehicles can
pass.
For each signal cycle, the system receives the signal and number of vehicles wai ng. The number of
vehicles that can pass depends on the signal:
     Red → 0 vehicles
     Yellow → 2 vehicles
     Green → 10 vehicles
If more vehicles are wai ng than the allowed number, the remaining vehicles stay in the queue for the next
cycle.

Input Format
First line contains N, number of signal cycles.
Next N lines contain:
Signal VehiclesWai ng

Output Format
For every cycle print:
Cycle i: Passed = X, Remaining = Y
At the end print:
Total Passed: X
Final Queue: Y

Constraints
    1 ≤ N ≤ 1000
    0 ≤ VehiclesWai ng ≤ 100000
    Signal is one of R, Y, G

Example
 Input                                                Output
 4                                                    Cycle 1: Passed = 8, Remaining = 0
 G8                                                   Cycle 2: Passed = 0, Remaining = 5
 R5                                                   Cycle 3: Passed = 2, Remaining = 5
 Y7                                                     Cycle 4: Passed = 10, Remaining = 7
 G 12                                                   Total Passed: 20
                                                        Final Queue: 7

Explana on
Cycle 1:
Green allows 10 vehicles, but only 8 are wai ng.
Passed = 8, Remaining = 0.
Cycle 2:
Red allows no vehicles.
Passed = 0, Remaining = 5.
Cycle 3:
7 vehicles are wai ng. Yellow allows 2.
Passed = 2, Remaining = 5.
Cycle 4:
5 previous vehicles + 12 new vehicles = 17.
Green allows 10.
Passed = 10, Remaining = 7.
```

Note: text extracted from the PDF; some ligature characters ("ti", "tt") may be missing. See the original PDF in the repo root.
