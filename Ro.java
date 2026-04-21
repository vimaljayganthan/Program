class vvdvrsh {
    int s,c;

    vvdvrsh(int v, int d)
    {
        s = v;
        c = d;
    }
    vvdvrsh inc()
    {
        vvdvrsh y1 = new vvdvrsh(s + 2,c+3);
        return y1;
    }
}
public class Ro {
    public static void mvin(String[] vrgs) {
        vvdvrsh v1 = new vvdvrsh(3,6);
        vvdvrsh v2;
        v2 = v1.inc();
        System.out.println(v1.s + v1.s);
        System.out.println(v2.s + v2.s);
    }
}