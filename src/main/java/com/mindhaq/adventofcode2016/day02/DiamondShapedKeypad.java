package com.mindhaq.adventofcode2016.day02;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author Rüdiger Schulz &lt;rs@mindhaq.com&gt;
 */
public class DiamondShapedKeypad implements Keypad {

	private final Logger logger = getLogger(DiamondShapedKeypad.class);

	private Key selectedKey;

	public DiamondShapedKeypad() {
		Key k1 = new Key("1");
		k1.setLeft(k1);
		k1.setUp(k1);
		k1.setRight(k1);

		Key k2 = new Key("2");
		k2.setLeft(k2);
		k2.setUp(k2);

		Key k3 = new Key("3");
		k3.setLeft(k2);
		k3.setUp(k1);

		Key k4 = new Key("4");
		k4.setLeft(k3);
		k4.setUp(k4);
		k4.setRight(k4);

		Key k5 = new Key("5");
		k5.setLeft(k5);
		k5.setUp(k5);
		k5.setDown(k5);

		Key k6 = new Key("6");
		k6.setLeft(k5);
		k6.setUp(k2);

		Key k7 = new Key("7");
		k7.setLeft(k6);
		k7.setUp(k3);

		Key k8 = new Key("8");
		k8.setLeft(k7);
		k8.setUp(k4);

		Key k9 = new Key("9");
		k9.setLeft(k8);
		k9.setUp(k9);
		k9.setRight(k9);
		k9.setDown(k9);

		Key kA = new Key("A");
		kA.setLeft(kA);
		kA.setUp(k6);
		kA.setDown(kA);

		Key kB = new Key("B");
		kB.setLeft(kA);
		kB.setUp(k7);

		Key kC = new Key("C");
		kC.setLeft(kB);
		kC.setUp(k8);
		kC.setRight(kC);
		kC.setDown(kC);

		Key kD = new Key("D");
		kD.setLeft(kD);
		kD.setUp(kB);
		kD.setRight(kD);
		kD.setDown(kD);

		selectedKey = k5;
	}

	@Override
	public String getSelectedKey() {
		return selectedKey.getCode();
	}

	@Override
	public void moveLeft() {
		selectedKey = selectedKey.getLeft();
		logger.debug("Moved left to {}", getSelectedKey());
	}

	@Override
	public void moveRight() {
		selectedKey = selectedKey.getRight();
		logger.debug("Moved right to {}", getSelectedKey());
	}

	@Override
	public void moveUp() {
		selectedKey = selectedKey.getUp();
		logger.debug("Moved up to {}", getSelectedKey());
	}

	@Override
	public void moveDown() {
		selectedKey = selectedKey.getDown();
		logger.debug("Moved down to {}", getSelectedKey());
	}
}
