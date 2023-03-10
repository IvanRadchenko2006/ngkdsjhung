public class Pet {
    private String tip;
    private String paroda;
    private String imya;
    private String cvet;
    public Pet(String tip, String paroda, String imya, String cvet) {
        this.tip=tip;
        this.paroda=paroda;
        this.imya=imya;
        this.cvet=cvet;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getParoda() {
        return paroda;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public String getImya() {
        return imya;
    }

    public void setImya(String imya) {
        this.imya = imya;
    }

    public String getCvet() {
        return cvet;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "tip='" + tip + '\'' +
                ", paroda='" + paroda + '\'' +
                ", imya='" + imya + '\'' +
                ", cvet='" + cvet + '\'' +
                '}';
    }
}
