package ra.statics;

public class Test {
    public static void main(String[] args) {
        Viewer v1 = new Viewer();
        v1.visitedWeb();
        Viewer v2 = new Viewer();
        v2.visitedWeb();
        Viewer v3 = new Viewer();
        v3.visitedWeb();

        //Nếu có biến static thì không cần thông qua đối tượng
        System.out.println(Viewer.getCountView());
    }
}
