package com.scandit.datacapture.core.internal.sdk.ui.style;

import android.support.v4.media.session.a;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeBrush {
    final NativeColor fillColor;
    final NativeColor strokeColor;
    final float strokeWidth;

    public NativeBrush(NativeColor nativeColor, NativeColor nativeColor2, float f) {
        this.fillColor = nativeColor;
        this.strokeColor = nativeColor2;
        this.strokeWidth = f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeBrush)) {
            return false;
        }
        NativeBrush nativeBrush = (NativeBrush) obj;
        return this.fillColor.equals(nativeBrush.fillColor) && this.strokeColor.equals(nativeBrush.strokeColor) && this.strokeWidth == nativeBrush.strokeWidth;
    }

    public NativeColor getFillColor() {
        return this.fillColor;
    }

    public NativeColor getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.strokeWidth) + ((this.strokeColor.hashCode() + ((this.fillColor.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeBrush{fillColor=");
        sb.append(this.fillColor);
        sb.append(",strokeColor=");
        sb.append(this.strokeColor);
        sb.append(",strokeWidth=");
        return a.j(this.strokeWidth, "}", sb);
    }
}
