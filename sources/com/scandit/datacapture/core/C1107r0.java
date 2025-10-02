package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1107r0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18825a;
    private final int b;
    private final int c;
    private final int d;

    public C1107r0(int i, int i2, int i3, int i4) {
        this.f18825a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.f18825a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1107r0)) {
            return false;
        }
        C1107r0 c1107r0 = (C1107r0) obj;
        return this.f18825a == c1107r0.f18825a && this.b == c1107r0.b && this.c == c1107r0.c && this.d == c1107r0.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f18825a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraControlDefaults(primaryImage=");
        sb.append(this.f18825a);
        sb.append(", primaryPressedImage=");
        sb.append(this.b);
        sb.append(", secondaryImage=");
        sb.append(this.c);
        sb.append(", secondaryPressedImage=");
        return YU.a.l(sb, this.d, ')');
    }

    public /* synthetic */ C1107r0() {
        this(R.drawable.sc_ic_camera_primary, R.drawable.sc_ic_camera_primary_pressed, R.drawable.sc_ic_camera_secondary, R.drawable.sc_ic_camera_secondary_pressed);
    }
}
