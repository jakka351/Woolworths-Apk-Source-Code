package com.dynatrace.android.ragetap.detection;

import androidx.camera.core.impl.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class TapEventData {

    /* renamed from: a, reason: collision with root package name */
    public final float f14176a;
    public final float b;
    public final long c;
    public final long d;

    public TapEventData(long j, float f, float f2, long j2) {
        this.f14176a = f;
        this.b = f2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TapEventData tapEventData = (TapEventData) obj;
            if (Float.compare(tapEventData.f14176a, this.f14176a) == 0 && Float.compare(tapEventData.b, this.b) == 0 && this.c == tapEventData.c && this.d == tapEventData.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f = this.f14176a;
        int iFloatToIntBits = (f != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.b;
        int iFloatToIntBits2 = f2 != BitmapDescriptorFactory.HUE_RED ? Float.floatToIntBits(f2) : 0;
        long j = this.c;
        int i = (((iFloatToIntBits + iFloatToIntBits2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TapEventData{x=");
        sb.append(this.f14176a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", eventTime=");
        return b.q(sb, this.d, '}');
    }
}
