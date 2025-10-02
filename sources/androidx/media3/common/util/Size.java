package androidx.media3.common.util;

@UnstableApi
/* loaded from: classes2.dex */
public final class Size {
    public static final Size c = new Size(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2923a;
    public final int b;

    static {
        new Size(0, 0);
    }

    public Size(int i, int i2) {
        Assertions.b((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f2923a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f2923a == size.f2923a && this.b == size.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f2923a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.f2923a + "x" + this.b;
    }
}
