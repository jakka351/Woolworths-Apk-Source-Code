package com.scandit.datacapture.core.common.geometry;

import android.support.v4.media.session.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class SizeWithAspect {
    final float aspect;
    final FloatWithUnit size;

    public SizeWithAspect(FloatWithUnit floatWithUnit, float f) {
        this.size = floatWithUnit;
        this.aspect = f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SizeWithAspect)) {
            return false;
        }
        SizeWithAspect sizeWithAspect = (SizeWithAspect) obj;
        return this.size.equals(sizeWithAspect.size) && this.aspect == sizeWithAspect.aspect;
    }

    public float getAspect() {
        return this.aspect;
    }

    public FloatWithUnit getSize() {
        return this.size;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.aspect) + ((this.size.hashCode() + 527) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SizeWithAspect{size=");
        sb.append(this.size);
        sb.append(",aspect=");
        return a.j(this.aspect, "}", sb);
    }
}
