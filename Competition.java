/*
 * Student name: XXX
 * Student ID: YYY
 * LMS username: ZZZ
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Competition {
    protected String name; //competition name
    protected int id; //competition identifier

    public abstract void addEntries();

    public abstract void drawWinners();

	public abstract boolean getIsTestingMode();

	public abstract int getId();//competition identifier

    public void report() {
    }
}
