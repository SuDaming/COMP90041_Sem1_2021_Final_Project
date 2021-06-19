/*
 * Student name: XXX
 * Student ID: YYY
 * LMS username: ZZZ
 */

public class Entry {
    private int entryId;
    private String billId;
    private String memberId;
	private int prize;

	public int getPrize(){
		return prize;
	}

	public boolean setPrize(int prize){
	    this.prize = prize;

		return true;
	}
}
