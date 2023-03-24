# ABB2

# Client: Jorge Reyes
Binary Search Tree Deletion.

If the element is located in a leaf node, simply delete it.
If the node has only one left or right branch, replace it with that branch.
If it has both left and right children, apply any of the following criteria:
  - Replace it with the node farthest to the left of the right subtree.
  - Replace it with the node farthest to the right of the left subtree.
 
 ## Notes:
### Case 1: Deleting the number 60
  - Search for 60 in the binary search tree.
  60 is located in a leaf node, so it can be deleted directly.
  
### Case 2: Deleting the number 75
  - Search for 75 in the binary search tree.
  75 has both left and right children, so we need to apply one of the criteria.
  Replace it with the node farthest to the left of the right subtree.
  The farthest left node in the right subtree of 75 is 80.
  Replace 75 with 80.

### Case 3: Deleting the number 90
  - Search for 90 in the binary search tree.
  90 has both left and right children, so we need to apply one of the criteria.
  Replace it with the node farthest to the right of the left subtree.
  The farthest right node in the left subtree of 90 is 85.
  Replace 90 with 85.

## Diagram:
