/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7ex1;

/**
 *
 * @author Alekya Billakanti
 */
public enum Color {
    BLACK("#000000"), WHITE("#FFFFFF"), RED("#FF0000"), BLUE("#0000FF");
    private String Color;

    private Color(String Color) {
        this.Color = Color;
    }

    public String getColor() {
        return Color;
    }

}
