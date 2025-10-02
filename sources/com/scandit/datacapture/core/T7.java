package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public final class T7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18377a;
    private final int b;
    private final int c;
    private final int d;

    public T7(int i, int i2, int i3, int i4) {
        this.f18377a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f18377a;
    }

    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T7)) {
            return false;
        }
        T7 t7 = (T7) obj;
        return this.f18377a == t7.f18377a && this.b == t7.b && this.c == t7.c && this.d == t7.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f18377a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TorchControlDefaults(torchOnImage=");
        sb.append(this.f18377a);
        sb.append(", torchOnPressedImage=");
        sb.append(this.b);
        sb.append(", torchOffImage=");
        sb.append(this.c);
        sb.append(", torchOffPressedImage=");
        return YU.a.l(sb, this.d, ')');
    }

    public /* synthetic */ T7() {
        this(R.drawable.sc_ic_torch_on, R.drawable.sc_ic_torch_on_pressed, R.drawable.sc_ic_torch_off, R.drawable.sc_ic_torch_off_pressed);
    }
}
