package com.example.test;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import ch.mbaumeler.jass.core.Game;
import ch.mbaumeler.jass.core.JassEngine;
import ch.mbaumeler.jass.core.Match;
import ch.mbaumeler.jass.core.card.Card;
import ch.mbaumeler.jass.core.game.PlayerToken;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.helloWorld);
        JassEngine jassEngine = new JassEngine();
        Game game = jassEngine.createJassGame();
        Match currentMatch = game.getCurrentMatch();
		PlayerToken activePlayer = currentMatch.getActivePlayer();
		List<Card> cards = currentMatch.getCards(activePlayer);
        textView.setText("Active Player " + activePlayer + " with cards: " + cards);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
