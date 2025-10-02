package com.google.zxing.datamatrix.encoder;

/* loaded from: classes6.dex */
class C40Encoder implements Encoder {
    public static void e(EncoderContext encoderContext, StringBuilder sb) {
        int iCharAt = (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + sb.charAt(2) + 1;
        encoderContext.e.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void a(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.b()) {
                break;
            }
            char cA = encoderContext.a();
            encoderContext.f++;
            int iB = b(cA, sb);
            int length = encoderContext.e.length() + ((sb.length() / 3) << 1);
            encoderContext.c(length);
            int i = encoderContext.h.b - length;
            if (!encoderContext.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && i != 2) {
                    int length2 = sb.length();
                    sb.delete(length2 - iB, length2);
                    encoderContext.f--;
                    iB = b(encoderContext.a(), sb2);
                    encoderContext.h = null;
                }
                while (sb.length() % 3 == 1 && (iB > 3 || i != 1)) {
                    int length3 = sb.length();
                    sb.delete(length3 - iB, length3);
                    encoderContext.f--;
                    iB = b(encoderContext.a(), sb2);
                    encoderContext.h = null;
                }
            } else if (sb.length() % 3 == 0 && HighLevelEncoder.g(encoderContext.f16164a, encoderContext.f, c()) != c()) {
                encoderContext.g = 0;
                break;
            }
        }
        d(encoderContext, sb);
    }

    public int b(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c > 127) {
            sb.append("\u0001\u001e");
            return b((char) (c - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c - '`'));
        return 2;
    }

    public int c() {
        return 1;
    }

    public void d(EncoderContext encoderContext, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int length3 = encoderContext.e.length() + length;
        encoderContext.c(length3);
        int i = encoderContext.h.b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                e(encoderContext, sb);
            }
            if (encoderContext.b()) {
                encoderContext.d((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                e(encoderContext, sb);
            }
            if (encoderContext.b()) {
                encoderContext.d((char) 254);
            }
            encoderContext.f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb.length() >= 3) {
                e(encoderContext, sb);
            }
            if (i > 0 || encoderContext.b()) {
                encoderContext.d((char) 254);
            }
        }
        encoderContext.g = 0;
    }
}
