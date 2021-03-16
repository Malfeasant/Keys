package us.malfeasant.keys;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class KeyPanel extends GridPane {
	public KeyPanel() {
		Label topleft = new Label(" ");
		add(topleft, 0, 0, 1, 2);
		
		Button left = new Button("←");
		add(left, 1, 0, 4, 1);
		Button one = new Button("1");
		add(one, 5, 0, 4, 1);
		Button two = new Button("2");
		add(two, 9, 0, 4, 1);
		
		Button ctrl = new Button("CTRL");
		add(ctrl, 1, 1, 6, 1);
		Button q = new Button("Q");
		add(q, 7, 1, 4, 1);
		
		Button runstop = new Button("R/S");
		add(runstop, 0, 2, 4, 1);
		Button shiftlock = new Button("S/L");
		add(shiftlock, 4, 2, 4, 1);
		Button a = new Button("A");
		add(a, 8, 2, 4, 1);
	}
}
