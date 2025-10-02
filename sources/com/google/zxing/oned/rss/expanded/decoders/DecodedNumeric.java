package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* loaded from: classes6.dex */
final class DecodedNumeric extends DecodedObject {
    public final int b;
    public final int c;

    public DecodedNumeric(int i, int i2, int i3) throws FormatException {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw FormatException.a();
        }
        this.b = i2;
        this.c = i3;
    }
}
