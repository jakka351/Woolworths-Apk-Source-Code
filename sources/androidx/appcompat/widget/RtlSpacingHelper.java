package androidx.appcompat.widget;

/* loaded from: classes2.dex */
class RtlSpacingHelper {

    /* renamed from: a, reason: collision with root package name */
    public int f181a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public final void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f181a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f181a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2;
        }
    }
}
