public class ConvertTemperature {
    private float temperNum;

    private float convertC2F() {
        return  (float) (temperNum * 1.8 + 32);
    }

    private float convertF2C() {
        return (float) ((temperNum - 32)/1.8);
    }

    /**
     *
     * @param nhietDo chi so nhiet do muon chuyen doi
     * @param isToC true neu muon chuyen doi tu F sang C. false neu muon tu C sang F
     *
     */
    public void convert(float nhietDo, boolean isToC) {
        this.temperNum = nhietDo;
        if (isToC) {
            System.out.println("Nhiet do "+nhietDo+"  C = "+convertC2F()+" F");
        } else {
            System.out.println("Nhiet do "+nhietDo+"  F = "+convertF2C()+" C");
        }
    }
}
