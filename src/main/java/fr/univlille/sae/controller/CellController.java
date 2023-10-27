package fr.univlille.sae.controller;

import fr.univlille.sae.Main;
import javafx.scene.control.Button;

import java.io.File;

/**
 * Cette classe coorespond au bouton d'une cellule du labyrinthe
 * @Author Nathan Desmee, Valentin Thuillier, Armand Sady, Théo Lenglart
 * @Version 1.0
 */
public class CellController extends Button {
    private int x;
    private int y;
    public CellController(int x, int y){
        super(" ");
        this.x = x;
        this.y = y;
        setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #000000");
        setFont(Main.loadFont("arcade_classic_2" + File.separator + "ARCADECLASSIC.TTF", 20));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
