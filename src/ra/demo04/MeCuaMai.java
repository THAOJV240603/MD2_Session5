package ra.demo04;

public class MeCuaMai {
    private String keo;
    public final String mk = "123456";

    public MeCuaMai() {
    }

    public MeCuaMai(String keo) {
        this.keo = keo;
    }

    public String getKeo() {
        return keo;
    }

    public void setKeo(String keo) {
        this.keo = keo;
    }

    public String getMk() {
        return mk;
    }
}
