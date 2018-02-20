# Comments

The proper use of comments is to compensate for our failure to express ourself in code. Before writing comments re-read our code and make sure you cannot express more.

Inaccurate comments are far worse than no comments at all.

The truth can only be found a one place, the code.

### Comments Do not make Up for Bad Code

Rather than spend your time writing comments, spend it cleaning that mess.

### Explain yourself in Code

```java
// Bad exemple

// Check to see if the employee is eligible for full benefits.
if ((employee.flags & HOURLY_FLAG) && (employee.age > 65))

// Better way

if (employee.iseligibleForFullBenefits())
```

