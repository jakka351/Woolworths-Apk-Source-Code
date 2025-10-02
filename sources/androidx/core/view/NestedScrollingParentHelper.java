package androidx.core.view;

/* loaded from: classes2.dex */
public class NestedScrollingParentHelper {

    /* renamed from: a, reason: collision with root package name */
    public int f2480a;
    public int b;

    public final int a() {
        return this.f2480a | this.b;
    }

    public final void b(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.f2480a = i;
        }
    }

    public final void c(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.f2480a = 0;
        }
    }
}
