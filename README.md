# Basic Logic Building - Java solutions

Solutions to the 10 practice problems in "Basic Logic Building-1" (4 Easy, 3 Medium, 3 Hard), written in Java.

| # | Problem | Level | Folder |
|---|---------|-------|--------|
| 1 | Electricity Bill Calculator | Easy | `01-electricity-bill-calculator` |
| 2 | Number Classification | Easy | `02-number-classification` |
| 3 | Digital Sum and Product | Easy | `03-digital-sum-and-product` |
| 4 | Student Result Analyzer | Easy | `04-student-result-analyzer` |
| 5 | ATM Transaction Simulator | Medium | `05-atm-transaction-simulator` |
| 6 | Parking Fee Calculator | Medium | `06-parking-fee-calculator` |
| 7 | Smart Grocery Checkout | Medium | `07-smart-grocery-checkout` |
| 8 | Bank Loan Eligibility & EMI Schedule | Hard | `08-bank-loan-eligibility-emi` |
| 9 | Traffic Signal Simulation | Hard | `09-traffic-signal-simulation` |
| 10 | Cricket Tournament Score Analyzer | Hard | `10-cricket-tournament-score-analyzer` |

Each folder has `Main.java` (the solution) and `PROBLEM.md` (the problem statement, with the examples and test cases from the sheet).

## Run

```
cd 01-electricity-bill-calculator
javac Main.java
echo 250 | java Main
```

All solutions were compiled and checked against every example and test case in the sheet.

## Notes on the problem sheet

- Problem 6: two of the PDF's test cases (C2 B5 -> 90, T1 C4 B3 C2 -> 210) do not follow the stated rates. The rates give 120 and 250, and the solution and tests use those. The PDF's main example (290) matches.
- Problem 8: the PDF example prints ELIGIBLE with an EMI above the maximum EMI, and also says to report when the EMI exceeds the maximum. The solution prints the three lines from the example, then an extra line when the EMI is over the maximum.
- Problem 9: the PDF example is inconsistent in cycle 3 (7 vehicles shown as the total waiting) and cycle 4 (12 added to the carry-over queue). The solution adds new vehicles to the queue every cycle, as the cycle 4 explanation does.
