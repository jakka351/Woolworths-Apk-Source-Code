package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
public final class q8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18823a;
    private final int b;
    private final int c;
    private final int d;

    public q8(int i, int i2, int i3, int i4) {
        this.f18823a = i;
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
        return this.f18823a;
    }

    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return this.f18823a == q8Var.f18823a && this.b == q8Var.b && this.c == q8Var.c && this.d == q8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f18823a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZoomControlDefaults(zoomedOutImage=");
        sb.append(this.f18823a);
        sb.append(", zoomedOutPressedImage=");
        sb.append(this.b);
        sb.append(", zoomedInImage=");
        sb.append(this.c);
        sb.append(", zoomedInPressedImage=");
        return YU.a.l(sb, this.d, ')');
    }

    public /* synthetic */ q8() {
        this(R.drawable.sc_ic_zoomed_out, R.drawable.sc_ic_zoomed_out_pressed, R.drawable.sc_ic_zoomed_in, R.drawable.sc_ic_zoomed_in_pressed);
    }
}
