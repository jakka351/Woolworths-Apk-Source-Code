package com.scandit.datacapture.core.internal.sdk.capture;

import android.support.v4.media.session.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeInertialMeasurementAndroid {
    final long timestampNanos;
    final float x;
    final float y;
    final float z;

    public NativeInertialMeasurementAndroid(float f, float f2, float f3, long j) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.timestampNanos = j;
    }

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeInertialMeasurementAndroid{x=");
        sb.append(this.x);
        sb.append(",y=");
        sb.append(this.y);
        sb.append(",z=");
        sb.append(this.z);
        sb.append(",timestampNanos=");
        return a.l(this.timestampNanos, "}", sb);
    }
}
