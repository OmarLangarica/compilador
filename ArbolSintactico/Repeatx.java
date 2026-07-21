package ArbolSintactico;

public class Repeatx extends Statx {

    private Statx s1;
    private Expx s2;

    public Repeatx(Statx st1, Expx st2) {
        s1 = st1;
        s2 = st2;
    }

    public Object[] getVariables() {
        Object obj[] = new Object[2];
        obj[0] = s1;
        obj[1] = s2;
        return obj;
    }

}
