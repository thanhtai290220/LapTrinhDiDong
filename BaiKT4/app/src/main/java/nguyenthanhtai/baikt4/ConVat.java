package nguyenthanhtai.baikt4;

public class ConVat {
    private String tenConVat;  // Tên CV
    private int IDconvat;     // ID
    private String dacDiem;

    public ConVat(String tenConVat, int iDconvat, String dacDiem){
        this.tenConVat=tenConVat;
        IDconvat=iDconvat;
        this.dacDiem=dacDiem;
    }
    public String getTenConVat() {
        return tenConVat;
    }

    public void setTenConVat(String tenConVat) {
        this.tenConVat = tenConVat;
    }

    public int getIDconvat() {
        return IDconvat;
    }

    public void setIDconvat(int IDconvat) {
        this.IDconvat = IDconvat;
    }

    public String getdacDiem() {
        return dacDiem;
    }

    public void setdacDiem(String dacDiem) {
        this.dacDiem = dacDiem;
    }

}
