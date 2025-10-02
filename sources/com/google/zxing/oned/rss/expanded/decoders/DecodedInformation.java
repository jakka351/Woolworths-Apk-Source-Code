package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
final class DecodedInformation extends DecodedObject {
    public final String b;
    public final int c;
    public final boolean d;

    public DecodedInformation(int i, String str) {
        super(i);
        this.b = str;
        this.d = false;
        this.c = 0;
    }

    public DecodedInformation(int i, String str, int i2) {
        super(i);
        this.d = true;
        this.c = i2;
        this.b = str;
    }
}
