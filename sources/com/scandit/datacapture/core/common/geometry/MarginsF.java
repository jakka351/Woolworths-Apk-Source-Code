package com.scandit.datacapture.core.common.geometry;

import androidx.compose.ui.input.pointer.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class MarginsF {
    final float bottom;
    final float left;
    final float right;
    final float top;

    public MarginsF(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MarginsF)) {
            return false;
        }
        MarginsF marginsF = (MarginsF) obj;
        return this.left == marginsF.left && this.top == marginsF.top && this.right == marginsF.right && this.bottom == marginsF.bottom;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.bottom) + a.a(this.right, a.a(this.top, a.a(this.left, 527, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MarginsF{left=");
        sb.append(this.left);
        sb.append(",top=");
        sb.append(this.top);
        sb.append(",right=");
        sb.append(this.right);
        sb.append(",bottom=");
        return android.support.v4.media.session.a.j(this.bottom, "}", sb);
    }
}
