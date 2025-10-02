package androidx.core.view.insets;

/* loaded from: classes2.dex */
public class ColorProtection extends Protection {
    public int b;

    @Override // androidx.core.view.insets.Protection
    public final void a(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        throw null;
    }
}
