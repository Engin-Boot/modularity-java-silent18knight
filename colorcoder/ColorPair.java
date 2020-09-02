package colorcoder;


public class ColorPair {
	private MajorColor majorColor;
    private MinorColor minorColor;
    
    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
   public  String toString() {
        String colorPairStr = Util.MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += Util.MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
}
