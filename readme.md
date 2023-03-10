# Blackjack

Blackjack is a simple game that was coded with Java in this example.


## Preview
![usage](https://github.com/doughtyphilipe/Blackjack/blob/main/Blackjack.gif)

## Main function

This code revolves around the Math.random function from the Java Math library. We will draw a random card by generating a random number between 1 and 13, and then selecting a card from a enummerated list.

```java
    public static int drawRandomCard(){
        int randomNumber = (int)(Math.random()*13);
        randomNumber +=1;
        return randomNumber;
    }
```

