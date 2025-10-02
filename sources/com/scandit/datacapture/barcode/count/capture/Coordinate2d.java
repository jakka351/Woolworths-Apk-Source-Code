package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes6.dex */
public final class Coordinate2d {
    final int x;
    final int y;

    public Coordinate2d(int i, int i2) {
        this.x = i;
        this.y = i2;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Coordinate2d{x=");
        sb.append(this.x);
        sb.append(",y=");
        return YU.a.m(sb, this.y, "}");
    }
}
