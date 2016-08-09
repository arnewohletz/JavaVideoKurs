package aufgaben_enums;

import java.awt.Color;

public enum SpielsteinFarbe {

	RED(Color.RED), BLUE(Color.BLUE), GREEN(Color.GREEN), YELLOW(Color.YELLOW);

	private final Color farbe;

	SpielsteinFarbe(Color farbe) {
		this.farbe = farbe;
	}

	public Color getFarbe() {
		return farbe;
	}

}
