package com.example.android.mycourtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int player1Score = 0;
    int player2Score = 0;
    int player1Card = 0;
    int player2Card = 0;
    String winner = "";
    String end = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the player 1 score value on the screen.
     */
    private void displayPlayer1(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.player1Score);
        scoreTextView.setText("" + number);
    }

    /**
     * This method displays the player 1 card value on the screen.
     */
    private void displayPlayer1card(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.player1Card);
        scoreTextView.setText("" + number);
    }

    /**
     * This method displays the player 2 score value on the screen.
     */
    private void displayPlayer2(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.player2Score);
        scoreTextView.setText("" + number);
    }

    /**
     * This method displays the player 2 card value on the screen.
     */
    private void displayPlayer2card(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.player2Card);
        scoreTextView.setText("" + number);
    }

    /**
     * This method displays the winner on the screen.
     */
    private void displayWinner(String winner) {
        TextView winnerTextView = (TextView) findViewById(R.id.winner);
        winnerTextView.setText("" + winner);
    }

    /**
     * This method displays the end of the set/game on the screen.
     */
    private void displayEnd(String winner) {
        TextView winnerTextView = (TextView) findViewById(R.id.end);
        winnerTextView.setText("" + winner);
    }

    /**
     * This method resets the scores at the end of a set.
     */
    public void resetScores(View view) {
        player1Score = 0;
        player2Score = 0;
        winner = "";
        end = "";
        displayPlayer1(player1Score);
        displayPlayer2(player2Score);
        displayWinner(winner);
        displayEnd(end);
    }

    /**
     * This method resets the scores and the cards at the end of a set.
     */

    public void resetGame(View view) {
        player1Score = 0;
        player2Score = 0;
        player1Card = 0;
        player2Card = 0;
        winner = "";
        end = "";
        displayPlayer1(player1Score);
        displayPlayer2(player2Score);
        displayPlayer1card(player1Card);
        displayPlayer2card(player2Card);
        displayWinner(winner);
        displayEnd(end);
    }

    /**
     * This method checks if there is a winner. If yes, displays the winner, the appropriate end message and updates the number of cards.
     */

    private void checkWinner() {
        if (player1Score >= 66) {
            winner = "Player 1";
            end = "End of the set.";
            if (player2Score == 0) {
                player1Card += 3;
            } else if (player2Score <= 33) {
                player1Card += 2;
            } else {
                player1Card += 1;
            }
            displayPlayer1card(player1Card);
            if (player1Card >= 7) {
                end = "End of the game.";
            }
            displayWinner(winner);
            displayEnd(end);
        }

        if (player2Score >= 66) {
            winner = "Player 2";
            end = "End of the set.";
            if (player1Score == 0) {
                player2Card += 3;
            } else if (player1Score <= 33) {
                player2Card += 2;
            } else {
                player2Card += 1;
            }
            displayPlayer2card(player2Card);
            if (player2Card >= 7) {
                end = "End of the game.";
            }
            displayWinner(winner);
            displayEnd(end);
        }

    }

    public void addPointsPlayer1(int point) {
        player1Score += point;
        displayPlayer1(player1Score);
        checkWinner();
    }

    public void addPointsPlayer2(int point) {
        player2Score += point;
        displayPlayer2(player2Score);
        checkWinner();
    }

    /**
     * This method is called when Player 1 Under button is tapped.
     */
    public void add2Player1(View view) {
        addPointsPlayer1(2);
    }

    /**
     * This method is called when Player 1 Over button is tapped.
     */
    public void add3Player1(View view) {
        addPointsPlayer1(3);
    }

    /**
     * This method is called when Player 1 King button is tapped.
     */
    public void add4Player1(View view) {
        addPointsPlayer1(4);
    }

    /**
     * This method is called when Player 1 10 button is tapped.
     */
    public void add10Player1(View view) {
        addPointsPlayer1(10);
    }

    /**
     * This method is called when Player 1 Ace button is tapped.
     */
    public void add11Player1(View view) {
        addPointsPlayer1(11);
    }

    /**
     * This method is called when Player 1 20 bonus button is tapped.
     */
    public void add20Player1(View view) {
        addPointsPlayer1(20);
    }

    /**
     * This method is called when Player 1 40 bonus button is tapped.
     */
    public void add40Player1(View view) {
        addPointsPlayer1(40);
    }

    /**
     * This method is called when Player 2 Under button is tapped.
     */
    public void add2Player2(View view) {
        addPointsPlayer2(2);
    }

    /**
     * This method is called when Player 2 Over button is tapped.
     */
    public void add3Player2(View view) {
        addPointsPlayer2(3);
    }

    /**
     * This method is called when Player 2 King button is tapped.
     */
    public void add4Player2(View view) {
        addPointsPlayer2(4);
    }

    /**
     * This method is called when Player 2 10 button is tapped.
     */
    public void add10Player2(View view) {
        addPointsPlayer2(10);
    }

    /**
     * This method is called when Player 2 Ace button is tapped.
     */
    public void add11Player2(View view) {
        addPointsPlayer2(11);
    }

    /**
     * This method is called when Player 2 20 bonus button is tapped.
     */
    public void add20Player2(View view) {
        addPointsPlayer2(20);
    }

    /**
     * This method is called when Player 2 40 bonus button is tapped.
     */
    public void add40Player2(View view) {
        addPointsPlayer2(40);
    }

}
