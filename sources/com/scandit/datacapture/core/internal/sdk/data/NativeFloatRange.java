package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeFloatRange {
    final float max;
    final float min;

    public NativeFloatRange(float f, float f2) {
        this.min = f;
        this.max = f2;
    }

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeFloatRange{min=");
        sb.append(this.min);
        sb.append(",max=");
        return android.support.v4.media.session.a.j(this.max, "}", sb);
    }
}
