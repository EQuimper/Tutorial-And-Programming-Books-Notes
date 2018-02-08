// Accessors, mutators and predicated should be named for their value and prefixed with get, set, is.

string name = employee.getName();
customer.setName("mike");
if (paycheck.isPosted())

// ==================

// When constructors are overloaded, use static factory methods with name that describe the arguments

// Example

Complex fulcrumPoint = Complex.FromRealNumber(23.0);

// is better than

Complex fulcrumPoint = new Complex(23.0);

// Consider enforcing their use by making the corresponding construtor private.