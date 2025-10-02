package com.otaliastudios.zoom;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/AbsolutePoint;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AbsolutePoint {

    /* renamed from: a, reason: collision with root package name */
    public float f16808a;
    public float b;

    public /* synthetic */ AbsolutePoint() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public final AbsolutePoint a(AbsolutePoint absolutePoint) {
        Intrinsics.h(absolutePoint, "absolutePoint");
        return new AbsolutePoint(this.f16808a + absolutePoint.f16808a, this.b + absolutePoint.b);
    }

    public final void b(AbsolutePoint absolutePoint) {
        c(Float.valueOf(absolutePoint.f16808a), Float.valueOf(absolutePoint.b));
    }

    public final void c(Float f, Float f2) {
        this.f16808a = f.floatValue();
        this.b = f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbsolutePoint)) {
            return false;
        }
        AbsolutePoint absolutePoint = (AbsolutePoint) obj;
        return Float.valueOf(this.f16808a).equals(Float.valueOf(absolutePoint.f16808a)) && Float.valueOf(this.b).equals(Float.valueOf(absolutePoint.b));
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f16808a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbsolutePoint(x=");
        sb.append(this.f16808a);
        sb.append(", y=");
        return android.support.v4.media.session.a.r(sb, this.b, ')');
    }

    public AbsolutePoint(float f, float f2) {
        this.f16808a = f;
        this.b = f2;
    }
}
