## [5 ,2 ,4, 1, 6]

## operation

- pick some coin from a pile
- put some coin in a pile

## Understanding
- we can guess we can pick or put any no of coins in any order
- which means we need to change all values except 1
    - now here two conditions are there 
        - what if number is duplicate 
            - then we need to get the no of time a value occured
            - then we need to find the max no of occurance of a value
        - what is the there is no duplicacy
            - so we will intialze max with default 1 (so it will perfrom n-1 operation)
    - return the result

## Logic - 
- (use hashmap)
- get count of number of occurance of value give default one to every value;
- intialize max with 1
- find max duplicate of a number from map 
- return length - max
