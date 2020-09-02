 package colorcoder;
 
 
public class Main {
	public static void main(String[] args) {
		Util.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
		Util.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

		Util.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
		Util.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
		
	}
}
