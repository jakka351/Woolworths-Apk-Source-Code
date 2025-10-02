package com.scandit.datacapture.core.internal.sdk.common.graphics;

import androidx.compose.ui.input.pointer.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class NativeColor {

    /* renamed from: a, reason: collision with root package name */
    final float f18688a;
    final float b;
    final float g;
    final float r;

    public NativeColor(float f, float f2, float f3, float f4) {
        this.r = f;
        this.g = f2;
        this.b = f3;
        this.f18688a = f4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeColor)) {
            return false;
        }
        NativeColor nativeColor = (NativeColor) obj;
        return this.r == nativeColor.r && this.g == nativeColor.g && this.b == nativeColor.b && this.f18688a == nativeColor.f18688a;
    }

    public float getA() {
        return this.f18688a;
    }

    public float getB() {
        return this.b;
    }

    public float getG() {
        return this.g;
    }

    public float getR() {
        return this.r;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f18688a) + a.a(this.b, a.a(this.g, a.a(this.r, 527, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NativeColor{r=");
        sb.append(this.r);
        sb.append(",g=");
        sb.append(this.g);
        sb.append(",b=");
        sb.append(this.b);
        sb.append(",a=");
        return android.support.v4.media.session.a.j(this.f18688a, "}", sb);
    }
}
