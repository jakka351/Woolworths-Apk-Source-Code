package com.scandit.datacapture.core.internal.module.device;

import YU.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeBatteryData {
    final int percentage;

    public NativeBatteryData(int i) {
        this.percentage = i;
    }

    public int getPercentage() {
        return this.percentage;
    }

    public String toString() {
        return a.m(new StringBuilder("NativeBatteryData{percentage="), this.percentage, "}");
    }
}
