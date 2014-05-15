
Test Plan of 2048 Game |
=======================|


Overview |
=========|
This document provides a complete test plan for famous 2048 game.
Main goal of 2048 game is to tilt board left, right, up, or down to move numbers accordingly, then if there are 2 numbers that matches each other 
they are combined in one tile with value of double the original tile, each time board is tilted in any direction a new tile is randomly added to an empty tile,
new tile has randomly value of 2 or 4.
The goal is to get a tile of value 2048; initially board will have two tiles with value of 2 randomly distributed on the board. 
When there is no room to add any new tile, the game is over and user score is displayed.


System Requirements |
====================|
-	Java JDK version 6
-	Github account and repository
-	Any text editor
-	Internet connection to push files to github repository


Test Types | 
===========|
-	Unit  test, JUnit test cases is developed to test all program methods separately
-	Regression test
-	User acceptance test


Test Scenarios and Success Criteria  |
=====================================|
Validate user input
-	User can only enter L, R, U, P, or Q "case insensitive”.
-	System should display proper error message when any other input is entered

Tilt right feature
-	Number should not move if they are already right positioned
-	Numbers should not move if there is no empty tile in the row
-	All numbers should move to the right if the rightmost tile is empty
-	If any empty tile, all tiles at its left should move to the right

Tilt left feature
-	Number should not move if they are already left positioned
-	Numbers should not move if there is no empty tile in the row
-	All numbers should move to the left if the leftmost tile is empty
-	If any empty tile, all tiles at its right should move to the left

Tilt up feature
-	Number should not move if they are already up positioned
-	Numbers should not move if there is no empty tile in the column
-	All numbers should move to the up direction if the topmost tile is empty
-	If any empty tile, all tiles below it should move up

Tilt down feature
-	Number should not move if they are already down positioned
-	Numbers should not move if there is no empty tile in the column
-	All numbers should move to the down direction if the downmost tile is empty
-	If any empty tile, all tiles above it should move down

Merging feature
-	Any 2 matched tiles next to each other should be merged into one tile with value equals to sum of original 2 tiles.
-	Any 2 matched tiles that have empty tiles separating them should be merged into one tile with value equals to sum of original 2 tiles

User score calculation
-	User score is initially 0, so if no merge is achieved user score should remains 0
-	User score should be incremented by the value of the merged cells
-	When game is over, or user quits game, user score should be displayed

Game over 
-	When all board tiles are not empty, there is no room to add any new tile, it is game over, 
so system should display "Game over” message and inform user with his/her score.

Quit game
-	When user enters "Q” game should quit, and system should display "Game over” message and inform user with his/her score.

Board drawing
-	Initially board should be displayed as grid of 4 x 4, with all empty cells, only 2 cells are randomly populated with value of two.
-	After each tilt, a new tile should randomly positioned in an empty cell, with value of 2 or 4

Handle user input
-	Board should be tilted to the left direction when user enters l or L
-	Board should be tilted to the right direction when user enters r or R
-	Board should be tilted to the up direction when user enters u or U
-	Board should be tilted to the down direction when user enters d or D
-	Game should quit when user enters q or Q

Out of scope scenarios/features
-	Game has no settings to be changed, and no different difficulties
-	Game is not multiplayer
-	Game is not available online.


Dependencies and risks |
=======================|
Dependencies:
-	Strong understanding of the rules of the 2048 game
-	Compiled sample game to be available to be used as reference

Risks:
-	Poor or misunderstanding of game rules
-	Game is developed using java, however provided skeleton is in C, student may not make good structure to start developing the game.
