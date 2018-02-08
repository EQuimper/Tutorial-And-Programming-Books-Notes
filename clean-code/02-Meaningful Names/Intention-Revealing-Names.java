// Bad name cause need comment

int d; // elapsed time in days

// Would be better if that was

int elapsedTimeInDays;
int daysSinceCreation;
int daysSinceModification;
int fileAgeInDays;

// ==============================

// What is the purpose of this code ?

public List<int[]> getThem() {
  List<int[]> list1 = new ArrayList<int[]>();
  for (int[] x : theList)
    if (x[0] === 4)
      list1.add(x);
  return list1;
}

// The problem here is not the simplicity of the code, but the implicity. Context is not explicit

// What kind of thing is theList ? name is bad, we dont know which type theList element are
// What is the significance of the value 4 ? Why came with this number ? Why 4 and not 17
// How should we use the list returned ? getThem() is a poor choose name, getThem mean so many thing

// Good example

public List<int[]> getFlaggedCells() {
  List<int[]> flaggedCells = new ArrayList<int[]>();
  for (int[] cell : gameBoard)
    if (cell[STATUS_VALUE] == FLAGGED)
      flaggedCells.add(cell);
  return flaggedCells;
}

// Simplicity didn't change, but the code is more explicit

// we can improve it again by writing a simple class for cells insteans of using an array of ints

public List<int[]> getFlaggedCells() {
  List<Cell> flaggedCells = new ArrayList<Cell>();
  for (Cell cell : gameBoard)
    if (cell.isFlagged())
      flaggedCells.add(cell);
  return flaggedCells;
}