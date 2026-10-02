# 7. Smart Grocery Checkout

```
Difficulty: Medium
Es mated Time Limit: 30 minutes

Problem Statement
A supermarket wants to implement a smart billing system.
A customer purchases N products. For each product, the program receives its price and quan ty. The
system calculates the subtotal.
The supermarket provides discounts based on the subtotal:
     Below ₹1,000 → No discount
     ₹1,000–₹4,999 → 5% discount
     ₹5,000–₹9,999 → 10% discount
     ₹10,000 or more → 15% discount
A er applying the discount, an addi onal 5% tax is charged on the discounted amount.

Input Format
First line contains N.
Next N lines contain:
Price Quan ty

Output Format
Print:
Subtotal: <amount>
Discount: <amount>
Tax: <amount>
Final Amount: <amount>
Print monetary values up to 2 decimal places.

Constraints
    1 ≤ N ≤ 100
    1 ≤ Price ≤ 100000
    1 ≤ Quan ty ≤ 100

Example
 Input                                               Output
 3                                                   Subtotal: 3000.00
 500 2                                               Discount: 150.00
 1000 1                                              Tax: 142.50
 200 5                                               Final Amount: 2992.50

Explana on
Subtotal:
500×2 + 1000×1 + 200×5 = 3000
₹3000 falls into the 5% discount category.
Discount:
3000 × 5% = 150
Discounted amount:
3000 - 150 = 2850
Tax:
2850 × 5% = 142.50
Final amount:
2992.50

Test Cases
 Input:                                              Output:
 2                                                   Subtotal: 900.00
 500 1                                               Discount: 0.00
 400 1                                               Tax: 45.00
                                                     Final Amount: 945.00

 Input:                                              Output:
 2                                                   Subtotal: 11000.00
 5000 1                                              Discount: 1650.00
 6000 1                                              Tax: 467.50
                                                     Final Amount: 9817.50
```

Note: text extracted from the PDF; some ligature characters ("ti", "tt") may be missing. See the original PDF in the repo root.
