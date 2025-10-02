package com.scandit.datacapture.core.common.geometry;

import androidx.compose.ui.input.pointer.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class FloatWithUnit {
    final MeasureUnit unit;
    final float value;

    public FloatWithUnit(float f, MeasureUnit measureUnit) {
        this.value = f;
        this.unit = measureUnit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FloatWithUnit)) {
            return false;
        }
        FloatWithUnit floatWithUnit = (FloatWithUnit) obj;
        return this.value == floatWithUnit.value && this.unit == floatWithUnit.unit;
    }

    public MeasureUnit getUnit() {
        return this.unit;
    }

    public float getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.unit.hashCode() + a.a(this.value, 527, 31);
    }

    public String toString() {
        return "FloatWithUnit{value=" + this.value + ",unit=" + this.unit + "}";
    }
}
