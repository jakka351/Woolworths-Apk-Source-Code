package YU;

import YU.Um;

/* loaded from: classes2.dex */
public class Un {
    public static final Un c = new Un();

    /* renamed from: a, reason: collision with root package name */
    public Fi f28a;
    public float b;

    class Al implements Um.Fn {
        public Al() {
        }

        public final void a(float f) {
            Un un = Un.this;
            un.b = f;
            un.f28a.a(f);
        }
    }

    public interface Fi {
        void a(float f);
    }

    public final void a(Fi fi) {
        this.f28a = fi;
        Al al = new Al();
        Um um = Um.J;
        um.D = al;
        int i = um.b;
        if (i != 1 && i != 3) {
            um.F = "";
            um.d(1, 100L);
        }
        this.f28a.a(this.b);
    }
}
