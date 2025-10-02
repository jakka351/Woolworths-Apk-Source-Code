package com.google.zxing.datamatrix.encoder;

/* loaded from: classes6.dex */
final class X12Encoder extends C40Encoder {
    @Override // com.google.zxing.datamatrix.encoder.C40Encoder, com.google.zxing.datamatrix.encoder.Encoder
    public final void a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.b()) {
                break;
            }
            char cA = encoderContext.a();
            encoderContext.f++;
            b(cA, sb);
            if (sb.length() % 3 == 0) {
                C40Encoder.e(encoderContext, sb);
                if (HighLevelEncoder.g(encoderContext.f16164a, encoderContext.f, 3) != 3) {
                    encoderContext.g = 0;
                    break;
                }
            }
        }
        d(encoderContext, sb);
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public final int b(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
            return 1;
        }
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c == '*') {
            sb.append((char) 1);
            return 1;
        }
        if (c == '>') {
            sb.append((char) 2);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c < 'A' || c > 'Z') {
            HighLevelEncoder.c(c);
            throw null;
        }
        sb.append((char) (c - '3'));
        return 1;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public final int c() {
        return 3;
    }

    @Override // com.google.zxing.datamatrix.encoder.C40Encoder
    public final void d(EncoderContext encoderContext, StringBuilder sb) {
        StringBuilder sb2 = encoderContext.e;
        encoderContext.c(sb2.length());
        int length = encoderContext.h.b - sb2.length();
        encoderContext.f -= sb.length();
        String str = encoderContext.f16164a;
        if ((str.length() - encoderContext.i) - encoderContext.f > 1 || length > 1 || (str.length() - encoderContext.i) - encoderContext.f != length) {
            encoderContext.d((char) 254);
        }
        if (encoderContext.g < 0) {
            encoderContext.g = 0;
        }
    }
}
