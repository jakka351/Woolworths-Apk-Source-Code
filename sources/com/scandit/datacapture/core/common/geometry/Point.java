package com.scandit.datacapture.core.common.geometry;

import androidx.compose.ui.input.pointer.a;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class Point {
    final float x;
    final float y;

    public Point(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.y) + a.a(this.x, 527, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Point{x=");
        sb.append(this.x);
        sb.append(",y=");
        return android.support.v4.media.session.a.j(this.y, "}", sb);
    }
}
