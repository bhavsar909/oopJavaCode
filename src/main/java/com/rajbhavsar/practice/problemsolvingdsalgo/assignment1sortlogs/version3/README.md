**Requirements:**

You have an array of logs. Each log is a space delimited string of words.

For each log, the first word in each log is an alphanumeric identifier. Then, either:

Each word after the identifier will consist only of lowercase letters, or;
Each word after the identifier will consist only of digits.
We will call these two varieties of logs letter-logs and digit-logs. It is guaranteed that each log has at least one word after its identifier.

Reorder the logs so that all of the letter-logs come before any digit-log. The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties. The digit-logs should be put in their original order.

Return the final order of the logs.



Example 1:

Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]


Constraints:

0 <= logs.length <= 100
3 <= logs[i].length <= 100
logs[i] is guaranteed to have an identifier, and a word after the identifier.

Test Cases:

TestCase1:

inputLogs=[es1004 abc def ghi,es1001 abc def ghi,es1003 abc def ghij, es1002 zabc def ghi  ]

outputLogs=[es1001 abc def ghi, es1004 abc def ghi, es1003 abc def ghij, es1002 zabc def ghi]

TestCase2:

inputLogs=[es1004 abc def ghi,es1001 abc def ghi,es1003 555 000 222, es1002 111 999 666]

outputLogs=[es1001 abc def ghi, es1004 abc def ghi, es1003 555 000 222, es1002 111 999 666]

TestCase3:

inputLogs=[es1004 432 543 543,es1001 543 534 543,es1003 555 000 222, es1002 111 999 666]

outputLogs=[es1004 432 543 543, es1001 543 534 543, es1003 555 000 222, es1002 111 999 666]

TestCase4: -ve(Invalid Indentifier)+(Invalid log)

inputLogs=[es 432 543 543,es1001 543vr 534 543,es1003 555 000 222, es1002 111 999 666]

expected outputLogs=[es1003 555 000 222, es1002 111 999 666]

Actual output:

before Sort: [es1001 543vr 534 543, es1003 555 000 222, es1002 111 999 666]

After Procession: [es1003 555 000 222, es1002 111 999 666]

TestCase5:

Inputlogs = [fwrn23 gwrejn24 fgw4 grFE, rnjn42 grnj vrjn vrds, rvnj43 435 2435 542 , nvjrn24 25 jjrn njn 42, nvjern43 ver
 ver grwasc]
 
Output logs = [rnjn42 grnj vrjn vrds, nvjern43 ver ver grwasc, rvnj43 435 2435 542 ]

TestCase6:
Constraints Satisfied or not?:

**Constraint1**:

Actual output:

`Enter the number of logs which you want to filter:

101

The Size of the logs Array should be less than or equal 100 and grater than or equals to 0 only`

**Constraint2**:

Actual Output:

`Enter the number of logs which you want to filter:

2

Enter the 0th log:

fr23 frfer

The Constraint is not satisfied :  3 <= logs[i].length <= 100

Enter the 1th log:

fe43 gf f g

before processing: [fe43 gf f g]

After Processing: [fe43 gf f g]`


**23-Jan2020 version3**

Mistakes in Version2:
- try to use the interface so different logic can be implement those interface and follow the contract.
- all constraints should be satisfied and if any of the constraint is violated then ask user to correct those
 violated logs(with the details of what's wrong with their logs)
- the validation messages should be simple and easily understandable by the users.

New Points added:
- Option for the automatically generated logs will be processed.