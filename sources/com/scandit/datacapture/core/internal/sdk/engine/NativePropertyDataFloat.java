package com.scandit.datacapture.core.internal.sdk.engine;

import android.support.v4.media.session.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativePropertyDataFloat {
    final float defaultValue;
    final float maxValue;
    final float minValue;

    public NativePropertyDataFloat(float f, float f2, float f3) {
        this.defaultValue = f;
        this.minValue = f2;
        this.maxValue = f3;
    }

    public float getDefaultValue() {
        return this.defaultValue;
    }

    public float getMaxValue() {
        return this.maxValue;
    }

    public float getMinValue() {
        return this.minValue;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativePropertyDataFloat{defaultValue=");
        sb.append(this.defaultValue);
        sb.append(",minValue=");
        sb.append(this.minValue);
        sb.append(",maxValue=");
        return a.j(this.maxValue, "}", sb);
    }
}
