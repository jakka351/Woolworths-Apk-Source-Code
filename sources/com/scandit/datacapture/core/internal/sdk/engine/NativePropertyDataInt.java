package com.scandit.datacapture.core.internal.sdk.engine;

import YU.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativePropertyDataInt {
    final int defaultValue;
    final int maxValue;
    final int minValue;
    final int step;

    public NativePropertyDataInt(int i, int i2, int i3, int i4) {
        this.defaultValue = i;
        this.minValue = i2;
        this.maxValue = i3;
        this.step = i4;
    }

    public int getDefaultValue() {
        return this.defaultValue;
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public int getMinValue() {
        return this.minValue;
    }

    public int getStep() {
        return this.step;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativePropertyDataInt{defaultValue=");
        sb.append(this.defaultValue);
        sb.append(",minValue=");
        sb.append(this.minValue);
        sb.append(",maxValue=");
        sb.append(this.maxValue);
        sb.append(",step=");
        return a.m(sb, this.step, "}");
    }
}
