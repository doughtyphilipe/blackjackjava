# Blackjack

Blackjack is a simple game that was coded with Java in this example.


## Preview
![Blackjack](https://user-images.githubusercontent.com/123315352/224511882-09df92cb-b385-4f43-ac93-8db2ccb4dc9e.gif)


## Main function

This code revolves around the Math.random function from the Java Math library. We will draw a random card by generating a random number between 1 and 13, and then selecting a card from a enummerated list.

```java
    public static int drawRandomCard(){
        int randomNumber = (int)(Math.random()*13);
        randomNumber +=1;
        return randomNumber;
    }
```

