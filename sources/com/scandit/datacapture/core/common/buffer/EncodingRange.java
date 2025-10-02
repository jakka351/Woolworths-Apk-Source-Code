package com.scandit.datacapture.core.common.buffer;

import YU.a;
import androidx.camera.core.impl.b;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class EncodingRange {
    final int endIndex;
    final String ianaName;
    final int startIndex;

    public EncodingRange(String str, int i, int i2) {
        this.ianaName = str;
        this.startIndex = i;
        this.endIndex = i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EncodingRange)) {
            return false;
        }
        EncodingRange encodingRange = (EncodingRange) obj;
        return this.ianaName.equals(encodingRange.ianaName) && this.startIndex == encodingRange.startIndex && this.endIndex == encodingRange.endIndex;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    public String getIanaName() {
        return this.ianaName;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return ((b.c(527, 31, this.ianaName) + this.startIndex) * 31) + this.endIndex;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EncodingRange{ianaName=");
        sb.append(this.ianaName);
        sb.append(",startIndex=");
        sb.append(this.startIndex);
        sb.append(",endIndex=");
        return a.m(sb, this.endIndex, "}");
    }
}
