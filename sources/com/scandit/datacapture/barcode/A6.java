package com.scandit.datacapture.barcode;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class A6 {

    /* renamed from: a, reason: collision with root package name */
    private final float f17092a;
    private final float b;
    private final int c;

    public A6(float f, float f2, int i) {
        this.f17092a = f;
        this.b = f2;
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final float b() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.f17092a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A6)) {
            return false;
        }
        A6 a6 = (A6) obj;
        return Float.compare(this.f17092a, a6.f17092a) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.b, a6.b) == 0 && this.c == a6.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + android.support.v4.media.session.a.b(this.b, android.support.v4.media.session.a.b(BitmapDescriptorFactory.HUE_RED, Float.hashCode(this.f17092a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawDataShadow(radius=");
        sb.append(this.f17092a);
        sb.append(", dx=0.0, dy=");
        sb.append(this.b);
        sb.append(", color=");
        return YU.a.l(sb, this.c, ')');
    }
}
