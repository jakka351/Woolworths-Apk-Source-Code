package com.google.zxing.datamatrix.encoder;

/* loaded from: classes6.dex */
final class ASCIIEncoder implements Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public final void a(EncoderContext encoderContext) {
        int i;
        String str = encoderContext.f16164a;
        int i2 = encoderContext.f;
        int length = str.length();
        if (i2 < length) {
            char cCharAt = str.charAt(i2);
            i = 0;
            while (HighLevelEncoder.d(cCharAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    cCharAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char cCharAt2 = str.charAt(encoderContext.f);
            char cCharAt3 = str.charAt(encoderContext.f + 1);
            if (HighLevelEncoder.d(cCharAt2) && HighLevelEncoder.d(cCharAt3)) {
                encoderContext.d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                encoderContext.f += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = encoderContext.a();
        int iG = HighLevelEncoder.g(str, encoderContext.f, 0);
        if (iG == 0) {
            if (!HighLevelEncoder.e(cA)) {
                encoderContext.d((char) (cA + 1));
                encoderContext.f++;
                return;
            } else {
                encoderContext.d((char) 235);
                encoderContext.d((char) (cA - 127));
                encoderContext.f++;
                return;
            }
        }
        if (iG == 1) {
            encoderContext.d((char) 230);
            encoderContext.g = 1;
            return;
        }
        if (iG == 2) {
            encoderContext.d((char) 239);
            encoderContext.g = 2;
            return;
        }
        if (iG == 3) {
            encoderContext.d((char) 238);
            encoderContext.g = 3;
        } else if (iG == 4) {
            encoderContext.d((char) 240);
            encoderContext.g = 4;
        } else {
            if (iG != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iG)));
            }
            encoderContext.d((char) 231);
            encoderContext.g = 5;
        }
    }
}
