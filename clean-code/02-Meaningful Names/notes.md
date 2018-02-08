# Meaningful Names

### Use Intention-Revealing Names

- Choosing good names take time but daves more than it takes.
- Change them when you find better ones.
- Name should answer all the big questions.
  - Why it exists?
  - What it does ?
  - How it is used
- If name requires a comment, then the name does not reveal it's indent

### Avoid disinformation

Dont use name who mean more than one thing, like hp etc. Don't use the name `accountList` unless it's actually a `List`. Cause list mean something in programming. Replace that with `accountGroup` `bunchOfAccounts` or just plain `accounts`

### Make Meaningful Distinctions

We have a `Product` class, if we have another called `ProductInfo` or `ProductData` we made the names different without making them mean anything different. `Info` or `Data` are indisting noise.

Noise words are redundant, the word variable should never appear in a variable, like table in a tablename.

### Use Pronounceable Names

Can't pronounce it ? Dont use it.

### Use searchable Names

Signle-Letter name can ONLY be used as local variable inside short methods.

*The length of a name should correspond to the size of its scope*

### Avoid Mental Mapping

Shouldn't have to mentally translate name.

### Class Names

Classed and objects should have noun or noun phrase names like `Customer`, `WikiPage`, `Account`, `AddressParser`. Avoid `Data`, `Info`, `Processor`, `Manager`. A class name should not be a verb.

### Method Names

Should have verb or verb phrase name like `postPayment`, `deletePage`, `save`.

### Pick One Word per Concept

Pick one word for one abstract concept and stick with it. It's confusing to have `fetch`, `retrieve` or `get`. Stick with one.

### Don't Pun

Avoid using the same word for two purposed.

Our goal, as authors is to make our code as easy as possible to understand.

### Use Solution Domain Names

Don't hesitate to use name or term programmer gonna understand.

### Add Meaningful Context

Place names in context for your reader by enclosing them in well-named classes, functions or namespace.