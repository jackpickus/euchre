package com.jackpickus.euchre.card;

import java.util.Objects;

import com.jackpickus.euchre.suit.Suit;

record Card(String name, int value, Suit suit) {
    public Card {
        Objects.requireNonNull(name);
        Objects.requireNonNull(value);
        Objects.requireNonNull(suit);
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }

}
