package org.ludo.gameLogic;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.ludo.gameRendering.DieAnimator;

import java.util.Timer;
import java.util.TimerTask;

public class Die {
    private Text dieTextOutput;
    private Button dieBtn;

    public Die(Text dieTextOutput, Button dieBtn) {
        this.dieTextOutput = dieTextOutput;
        this.dieBtn = dieBtn;
    }

    public int roll() {
        int result = (int)(Math.random() * 6 + 1);
        return result;
    }
}
