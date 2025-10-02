package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* loaded from: classes6.dex */
class DetectionResultColumn {

    /* renamed from: a, reason: collision with root package name */
    public final BoundingBox f16206a;
    public final Codeword[] b;

    public DetectionResultColumn(BoundingBox boundingBox) {
        this.f16206a = new BoundingBox(boundingBox);
        this.b = new Codeword[(boundingBox.i - boundingBox.h) + 1];
    }

    public final Codeword a(int i) {
        Codeword codeword;
        Codeword codeword2;
        int iB = b(i);
        Codeword[] codewordArr = this.b;
        Codeword codeword3 = codewordArr[iB];
        if (codeword3 != null) {
            return codeword3;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iB2 = b(i) - i2;
            if (iB2 >= 0 && (codeword2 = codewordArr[iB2]) != null) {
                return codeword2;
            }
            int iB3 = b(i) + i2;
            if (iB3 < codewordArr.length && (codeword = codewordArr[iB3]) != null) {
                return codeword;
            }
        }
        return null;
    }

    public final int b(int i) {
        return i - this.f16206a.h;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (Codeword codeword : this.b) {
                if (codeword == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(codeword.e), Integer.valueOf(codeword.d));
                    i++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    formatter.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
