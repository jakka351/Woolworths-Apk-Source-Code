package com.scandit.datacapture.barcode;

/* renamed from: com.scandit.datacapture.barcode.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0527b {

    /* renamed from: a, reason: collision with root package name */
    private final float f17381a;
    private final float b;
    private final float c;
    private final float d;

    public C0527b(float f, float f2, float f3, float f4) {
        this.f17381a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static C0527b a(C0527b c0527b, float f, float f2) {
        return new C0527b(f, c0527b.b, c0527b.c, f2);
    }

    public final float b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0527b)) {
            return false;
        }
        C0527b c0527b = (C0527b) obj;
        return Float.compare(this.f17381a, c0527b.f17381a) == 0 && Float.compare(this.b, c0527b.b) == 0 && Float.compare(this.c, c0527b.c) == 0 && Float.compare(this.d, c0527b.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f17381a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationSpec(alpha=");
        sb.append(this.f17381a);
        sb.append(", elevation=");
        sb.append(this.b);
        sb.append(", scale=");
        sb.append(this.c);
        sb.append(", translationY=");
        return android.support.v4.media.session.a.r(sb, this.d, ')');
    }

    public final float a() {
        return this.f17381a;
    }
}
