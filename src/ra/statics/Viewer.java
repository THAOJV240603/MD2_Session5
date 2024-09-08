package ra.statics;

public class Viewer {
    private static int countView;

    public void visitedWeb(){
        countView++;
    }

    public static int getCountView() {
        return countView;
    }
}
