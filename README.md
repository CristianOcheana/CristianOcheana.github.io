"# CristianOcheana.github.io" 

what it does:
I made two methods to iterate a given array and find all the pairs of numbers that if subtracted will result in a specific given number M. 

 - one method "findPairsInSortedArray" which sorts the given array and then iterate him, and returns a list of indexes pairs.
   -this method is more efficient (because the number of iterations is smaller) but changes the default position of the elements (giving us new indexes)

 - one method "findPairsInUnsortedArray" which iterate the given array and returns a list of indexes pairs.
    - this method is less efficient (because the number of iterations is higher), but we get the default indexes of the elements 