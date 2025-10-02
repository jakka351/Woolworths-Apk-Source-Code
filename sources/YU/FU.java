package YU;

import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes.dex */
public class FU {
    public static String c = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&CGWhX[\\IOSN\\UuYS[@");
    public static String d = CircleProgressBar.a("Z\\YIBJYXaIAqaAoBDX_R\\");

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7a = new HashMap();
    public final P b;

    /* loaded from: classes2.dex */
    public class FF implements Observer {
        public static String e = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&TPLI\\KDGS[\u001bt^SZE\u0015W[{Gob\u001dLznlu");
        public static String f = CircleProgressBar.a("Z\\YIBJYXaIAqaAoBDX_R\\");

        public FF() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            HashMap map = FU.this.f7a;
            if (obj != null) {
                try {
                    if (obj instanceof UO) {
                        UO uo = (UO) obj;
                        int i = uo.f21a;
                        if (!map.containsKey(Integer.valueOf(i)) && map.size() >= 15) {
                            return;
                        }
                        map.put(Integer.valueOf(i), new UO(uo.f21a, uo.b, uo.c, uo.d, uo.e));
                    }
                } catch (Exception e2) {
                    O.e(f, e, e2);
                    UB.a(e2);
                }
            }
        }
    }

    public FU() {
        FF ff = new FF();
        P p = new P();
        this.b = p;
        p.addObserver(ff);
    }
}
