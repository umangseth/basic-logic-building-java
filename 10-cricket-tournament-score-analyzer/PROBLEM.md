# 10. Cricket Tournament Score Analyzer

```
Difficulty: Hard
Es mated Time Limit: 45 minutes

Scenario
A college is conduc ng a cricket tournament. Each team plays mul ple matches, and the organizers want to
generate a basic performance report.
For every match, the program receives the runs scored by the team and the runs scored by the opponent.
The result is determined as follows:
     Team score > opponent score → Win
     Team score < opponent score → Loss
     Equal scores → Tie
The tournament awards:
     Win → 2 points
     Tie → 1 point
     Loss → 0 points
The program must process all matches and calculate total wins, losses, es, points, total runs scored, and
highest score.

Input Format
First line contains integer N, the number of matches.
Next N lines contain:
TeamRuns OpponentRuns

Output Format
Print:
Wins: <wins>p
Losses: <losses>
Ties: < es>
Points: <points>
Total Runs: <runs>
Highest Score: <score>

Constraints
    1 ≤ N ≤ 1000
    0 ≤ TeamRuns, OpponentRuns ≤ 1000

Example
 Input                                   Output
 5                                       Wins: 2
 180 150                                 Losses: 2
 120 120                                 Ties: 1
 95 110                                  Points: 5
 210 200                                 Total Runs: 765
 160 170                                 Highest Score: 210

Explana on
Match 1:
180 > 150 → Win → 2 points
Match 2:
120 = 120 → Tie → 1 point
Match 3:
95 < 110 → Loss → 0 points
Match 4:
210 > 200 → Win → 2 points
Match 5:
160 < 170 → Loss → 0 points
Therefore:
     Wins = 2
     Losses = 2
     Ties = 1
     Points = 5
     Total Runs = 765
     Highest Score = 210
Test Cases
 Input:      Output:
 3           Wins: 1
 100 90      Losses: 1
 120 130     Ties: 1
 150 150     Points: 3
             Total Runs: 370
             Highest Score: 150

 Input:      Output:
 4           Wins: 4
 200 100     Losses: 0
 250 180     Ties: 0
 175 120     Points: 8
 300 299     Total Runs: 925
             Highest Score: 300
```

Note: text extracted from the PDF; some ligature characters ("ti", "tt") may be missing. See the original PDF in the repo root.
