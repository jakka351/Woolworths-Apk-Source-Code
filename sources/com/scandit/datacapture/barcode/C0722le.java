package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.le, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0722le {

    /* renamed from: a, reason: collision with root package name */
    private final int f17843a;
    private final boolean b;
    private final Point c;
    private final float d;

    public C0722le(int i, boolean z, Point position, float f) {
        Intrinsics.h(position, "position");
        this.f17843a = i;
        this.b = z;
        this.c = position;
        this.d = f;
    }

    public final int a() {
        return this.f17843a;
    }

    public final Point b() {
        return this.c;
    }

    public final float c() {
        return this.d;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0722le)) {
            return false;
        }
        C0722le c0722le = (C0722le) obj;
        return this.f17843a == c0722le.f17843a && this.b == c0722le.b && Intrinsics.c(this.c, c0722le.c) && Float.compare(this.d, c0722le.d) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f17843a) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Float.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + i) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackedBarcodeInfo(identifier=");
        sb.append(this.f17843a);
        sb.append(", isRecognised=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", scale=");
        return android.support.v4.media.session.a.r(sb, this.d, ')');
    }
}
