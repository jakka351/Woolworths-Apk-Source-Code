package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class HighLevelEncoder {
    public static String a(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int i = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.b = symbolShapeHint;
        encoderContext.c = dimension;
        encoderContext.d = dimension2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.d((char) 236);
            encoderContext.i = 2;
            encoderContext.f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.d((char) 237);
            encoderContext.i = 2;
            encoderContext.f += 7;
        }
        while (encoderContext.b()) {
            encoderArr[i].a(encoderContext);
            int i2 = encoderContext.g;
            if (i2 >= 0) {
                encoderContext.g = -1;
                i = i2;
            }
        }
        StringBuilder sb = encoderContext.e;
        int length = sb.length();
        encoderContext.c(sb.length());
        int i3 = encoderContext.h.b;
        if (length < i3 && i != 0 && i != 5 && i != 4) {
            encoderContext.d((char) 254);
        }
        if (sb.length() < i3) {
            sb.append((char) 129);
        }
        while (sb.length() < i3) {
            int length2 = ((sb.length() + 1) * 149) % 253;
            int i4 = length2 + 130;
            if (i4 > 254) {
                i4 = length2 - 124;
            }
            sb.append((char) i4);
        }
        return sb.toString();
    }

    public static int b(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static void c(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean d(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean e(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean f(char c) {
        if (c == '\r' || c == '*' || c == '>' || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a9, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b3, code lost:
    
        return 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.encoder.HighLevelEncoder.g(java.lang.CharSequence, int, int):int");
    }
}
