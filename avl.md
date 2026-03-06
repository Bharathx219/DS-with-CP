AVL Tree Insertion Demo

--- Inserting 50 ---
Inserted: 50

--- Inserting 70 ---
Inserted: 70
Checking node 50 | BF = -1

--- Inserting 80 ---
Inserted: 80
Checking node 70 | BF = -1
Checking node 50 | BF = -2
Case: RR Imbalance at node 50
Performing LEFT Rotation on node 50

--- Inserting 105 ---
Inserted: 105
Checking node 80 | BF = -1
Checking node 70 | BF = -1

--- Inserting 120 ---
Inserted: 120
Checking node 105 | BF = -1
Checking node 80 | BF = -2
Case: RR Imbalance at node 80
Performing LEFT Rotation on node 80
Checking node 70 | BF = -1

--- Inserting 90 ---
Inserted: 90
Checking node 80 | BF = -1
Checking node 105 | BF = 1
Checking node 70 | BF = -2
Case: RL Imbalance at node 70
Performing RIGHT Rotation on node 105
Performing LEFT Rotation on node 70

Inorder (Sorted): 50 70 80 90 105 120 
=== Code Execution Successful ===

=== Code Execution Successful ===
