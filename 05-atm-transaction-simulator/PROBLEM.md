# 5. ATM Transac on Simulator

```
Difficulty: Medium
Es mated Time Limit: 25 minutes

Scenario
A bank wants to create a simple ATM simula on. The ATM starts with a par cular account balance.
The customer can perform mul ple transac ons. For every transac on, the customer enters an opera on:
     D → Deposit
     W → Withdraw
     B → Check Balance
     E → Exit
For withdrawal, the amount must not exceed the current balance. Invalid withdrawal requests must not
change the balance.
The program should con nue accep ng transac ons un l the customer selects E.

Input Format
First line: ini al balance.
Then mul ple lines containing:
Opera on Amount
For B and E, no amount is provided.
Output Format
For every transac on, print the corresponding result.
At the end print:
Final Balance: <balance>

Constraints
    0 ≤ ini al balance ≤ 10^6
    0 < transac on amount ≤ 10^6
    Maximum 100 transac ons

Example
 Input                                                  Output
 5000                                                   Deposit Successful
 D 2000                                                 Withdrawal Successful
 W 1500                                                 Insuﬃcient Balance
 W 7000                                                 Balance: 5500
 B                                                      Final Balance: 5500
 E

Explana on
Ini al balance = 5000
A er deposit:
5000 + 2000 = 7000
A er withdrawal:
7000 - 1500 = 5500
Withdrawal of 7000 is rejected because the balance is only 5500.
```

Note: text extracted from the PDF; some ligature characters ("ti", "tt") may be missing. See the original PDF in the repo root.
