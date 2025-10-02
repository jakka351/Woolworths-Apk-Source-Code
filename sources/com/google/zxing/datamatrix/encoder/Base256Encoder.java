package com.google.zxing.datamatrix.encoder;

/* loaded from: classes6.dex */
final class Base256Encoder implements Encoder {
    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public final void a(EncoderContext encoderContext) {
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            boolean zB = encoderContext.b();
            sb = encoderContext.e;
            if (!zB) {
                break;
            }
            sb2.append(encoderContext.a());
            int i = encoderContext.f + 1;
            encoderContext.f = i;
            if (HighLevelEncoder.g(encoderContext.f16164a, i, 5) != 5) {
                encoderContext.g = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        int length2 = sb.length() + length + 1;
        encoderContext.c(length2);
        boolean z = encoderContext.h.b - length2 > 0;
        if (encoderContext.b() || z) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb2.length();
        for (int i2 = 0; i2 < length3; i2++) {
            int length4 = (((sb.length() + 1) * 149) % 255) + 1 + sb2.charAt(i2);
            if (length4 > 255) {
                length4 -= 256;
            }
            encoderContext.d((char) length4);
        }
    }
}
