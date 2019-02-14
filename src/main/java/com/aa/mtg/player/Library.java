package com.aa.mtg.player;

import com.aa.mtg.cards.CardInstance;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Library {
    private List<CardInstance> cards;

    public Library() {
        this.cards = new ArrayList<>();
    }

    public CardInstance draw() {
        return this.cards.remove(0);
    }
}
