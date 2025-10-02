package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class K6 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18338a;
    private final boolean b;
    private final boolean c;
    private final float d;
    private final boolean e;
    private final boolean f;
    private final int g;

    public /* synthetic */ K6() {
        this(false, true, true, BitmapDescriptorFactory.HUE_RED, false, false, -1);
    }

    public static K6 a(K6 k6, boolean z, float f, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = k6.f18338a;
        }
        boolean z4 = z;
        boolean z5 = (i2 & 2) != 0 ? k6.b : false;
        boolean z6 = (i2 & 4) != 0 ? k6.c : false;
        if ((i2 & 8) != 0) {
            f = k6.d;
        }
        float f2 = f;
        if ((i2 & 16) != 0) {
            z2 = k6.e;
        }
        boolean z7 = z2;
        if ((i2 & 32) != 0) {
            z3 = k6.f;
        }
        boolean z8 = z3;
        if ((i2 & 64) != 0) {
            i = k6.g;
        }
        k6.getClass();
        return new K6(z4, z5, z6, f2, z7, z8, i);
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.f;
    }

    public final float e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K6)) {
            return false;
        }
        K6 k6 = (K6) obj;
        return this.f18338a == k6.f18338a && this.b == k6.b && this.c == k6.c && Float.compare(this.d, k6.d) == 0 && this.e == k6.e && this.f == k6.f && this.g == k6.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f18338a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r3 = this.b;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r32 = this.c;
        int i4 = r32;
        if (r32 != 0) {
            i4 = 1;
        }
        int iB = android.support.v4.media.session.a.b(this.d, (i3 + i4) * 31, 31);
        ?? r33 = this.e;
        int i5 = r33;
        if (r33 != 0) {
            i5 = 1;
        }
        int i6 = (iB + i5) * 31;
        boolean z2 = this.f;
        return Integer.hashCode(this.g) + ((i6 + (z2 ? 1 : z2 ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Settings(disableTorch=");
        sb.append(this.f18338a);
        sb.append(", disableContinuous=");
        sb.append(this.b);
        sb.append(", disableMacro=");
        sb.append(this.c);
        sb.append(", minExposureTargetBias=");
        sb.append(this.d);
        sb.append(", disableCustomMeteringAndFocusArea=");
        sb.append(this.e);
        sb.append(", hasBrokenFullCropZoom=");
        sb.append(this.f);
        sb.append(", defaultSharpnessStrength=");
        return YU.a.l(sb, this.g, ')');
    }

    public K6(boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5, int i) {
        this.f18338a = z;
        this.b = z2;
        this.c = z3;
        this.d = f;
        this.e = z4;
        this.f = z5;
        this.g = i;
    }

    public final int a() {
        return this.g;
    }
}
