package YU;

/* loaded from: classes.dex */
public final class Z<A, B, C> {
    public static char[] d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f38a;
    public final Number b;
    public final Long c;

    public Z(Object obj, Number number, Long l) {
        this.f38a = obj;
        this.b = number;
        this.c = l;
    }

    public static /* synthetic */ String a(String str) {
        if (d == null) {
            d = new char[32767];
            int i = 3;
            for (int i2 = 0; i2 < 32767; i2++) {
                i = ((i + (i ^ i2)) + 19) % 63;
                d[i2] = (char) i;
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ d[i3])));
        }
        return new String(cArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z = (Z) obj;
        return z.f38a.equals(this.f38a) && z.b.equals(this.b) && z.c.equals(this.c);
    }

    public final int hashCode() {
        return (this.f38a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
    }
}
