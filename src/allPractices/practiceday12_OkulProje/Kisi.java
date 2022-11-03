package allPractices.practiceday12_OkulProje;

public class Kisi {

    private String adSoyad;
    private String kimlikNo;
    private int yas;//herkesin ortak ozelligi

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;

    }

    public Kisi() {
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {//yas kontrolu yapiniz
        this.yas = yas;
    }

    @Override
    public String toString() {
        return " " + adSoyad +
                " " + kimlikNo +
                " " + yas;
    }
}