class TwistInTaleNumberSystems{
    public static void main(String[] args) {
        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;

	System.out.println("baseDecimal = " + baseDecimal);
	System.out.println("octVal = " + octVal);
	System.out.println("hexVal = " + hexVal);
	System.out.println("binVal = " + binVal);

	System.out.println(baseDecimal + octVal);
	System.out.println(hexVal + binVal);
    }
}
