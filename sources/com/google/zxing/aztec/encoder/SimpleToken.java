package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
final class SimpleToken extends Token {
    public final short c;
    public final short d;

    public SimpleToken(Token token, int i, int i2) {
        super(token);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public final void a(BitArray bitArray, byte[] bArr) {
        bitArray.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((1 << s) | (((1 << s) - 1) & this.c) | (1 << s)).substring(1) + '>';
    }
}
