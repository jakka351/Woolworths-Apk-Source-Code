package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;

/* loaded from: classes6.dex */
final class BinaryShiftToken extends Token {
    public final short c;
    public final short d;

    public BinaryShiftToken(Token token, int i, int i2) {
        super(token);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public final void a(BitArray bitArray, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                bitArray.b(31, 5);
                if (s > 62) {
                    bitArray.b(s - 31, 16);
                } else if (i == 0) {
                    bitArray.b(Math.min((int) s, 31), 5);
                } else {
                    bitArray.b(s - 31, 5);
                }
            }
            bitArray.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.c);
        sb.append("::");
        sb.append((r1 + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
