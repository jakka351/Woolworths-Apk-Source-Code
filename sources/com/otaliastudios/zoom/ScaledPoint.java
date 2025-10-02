package com.otaliastudios.zoom;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/ScaledPoint;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ScaledPoint {

    /* renamed from: a, reason: collision with root package name */
    public float f16812a;
    public float b;

    public /* synthetic */ ScaledPoint() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public static AbsolutePoint b(ScaledPoint scaledPoint, float f) {
        AbsolutePoint absolutePoint = new AbsolutePoint();
        scaledPoint.getClass();
        absolutePoint.c(Float.valueOf(scaledPoint.f16812a / f), Float.valueOf(scaledPoint.b / f));
        return absolutePoint;
    }

    public final void a(Float f, Float f2) {
        this.f16812a = f.floatValue();
        this.b = f2.floatValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledPoint)) {
            return false;
        }
        ScaledPoint scaledPoint = (ScaledPoint) obj;
        return Float.valueOf(this.f16812a).equals(Float.valueOf(scaledPoint.f16812a)) && Float.valueOf(this.b).equals(Float.valueOf(scaledPoint.b));
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f16812a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScaledPoint(x=");
        sb.append(this.f16812a);
        sb.append(", y=");
        return android.support.v4.media.session.a.r(sb, this.b, ')');
    }

    public ScaledPoint(float f, float f2) {
        this.f16812a = f;
        this.b = f2;
    }
}
