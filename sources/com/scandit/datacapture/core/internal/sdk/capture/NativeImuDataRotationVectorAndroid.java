package com.scandit.datacapture.core.internal.sdk.capture;

import android.support.v4.media.session.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeImuDataRotationVectorAndroid {
    final long timestampNanos;
    final float w;
    final float x;
    final float y;
    final float z;

    public NativeImuDataRotationVectorAndroid(float f, float f2, float f3, float f4, long j) {
        this.w = f;
        this.x = f2;
        this.y = f3;
        this.z = f4;
        this.timestampNanos = j;
    }

    public long getTimestampNanos() {
        return this.timestampNanos;
    }

    public float getW() {
        return this.w;
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
        StringBuilder sb = new StringBuilder("NativeImuDataRotationVectorAndroid{w=");
        sb.append(this.w);
        sb.append(",x=");
        sb.append(this.x);
        sb.append(",y=");
        sb.append(this.y);
        sb.append(",z=");
        sb.append(this.z);
        sb.append(",timestampNanos=");
        return a.l(this.timestampNanos, "}", sb);
    }
}
