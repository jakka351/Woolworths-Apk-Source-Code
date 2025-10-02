package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes4.dex */
public final class UTF8Writer extends Writer {
    public ByteArrayBuilder d;
    public byte[] e;
    public int f;
    public int g;

    public static void b(int i) throws IOException {
        throw new IOException(c(i));
    }

    public static String c(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + Integer.toHexString(i) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + Integer.toHexString(i) + ")";
    }

    public final int a(int i) throws IOException {
        int i2 = this.g;
        this.g = 0;
        if (i >= 56320 && i <= 57343) {
            return (i - 56320) + ((i2 - 55296) << 10) + 65536;
        }
        throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i) + "; illegal combination");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) throws IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ByteArrayBuilder byteArrayBuilder = this.d;
        if (byteArrayBuilder != null) {
            int i = this.f;
            if (i > 0) {
                byteArrayBuilder.write(this.e, 0, i);
                this.f = 0;
            }
            ByteArrayBuilder byteArrayBuilder2 = this.d;
            this.d = null;
            if (this.e != null) {
                this.e = null;
                throw null;
            }
            byteArrayBuilder2.getClass();
            int i2 = this.g;
            this.g = 0;
            if (i2 <= 0) {
                return;
            }
            b(i2);
            throw null;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        ByteArrayBuilder byteArrayBuilder = this.d;
        if (byteArrayBuilder != null) {
            int i = this.f;
            if (i > 0) {
                byteArrayBuilder.write(this.e, 0, i);
                this.f = 0;
            }
            this.d.getClass();
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        write(c);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0023, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(char[] r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.UTF8Writer.write(char[], int, int):void");
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        int i2;
        if (this.g > 0) {
            i = a(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i <= 56319) {
                this.g = i;
                return;
            } else {
                b(i);
                throw null;
            }
        }
        int i3 = this.f;
        if (i3 >= 0) {
            this.d.write(this.e, 0, i3);
            this.f = 0;
        }
        if (i < 128) {
            byte[] bArr = this.e;
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.f;
        if (i < 2048) {
            byte[] bArr2 = this.e;
            int i6 = i5 + 1;
            bArr2[i5] = (byte) ((i >> 6) | BERTags.PRIVATE);
            i2 = i5 + 2;
            bArr2[i6] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.e;
            bArr3[i5] = (byte) ((i >> 12) | BERTags.FLAGS);
            int i7 = i5 + 2;
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i7] = (byte) ((i & 63) | 128);
        } else if (i <= 1114111) {
            byte[] bArr4 = this.e;
            bArr4[i5] = (byte) ((i >> 18) | 240);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            int i8 = i5 + 3;
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i8] = (byte) ((i & 63) | 128);
        } else {
            b(i);
            throw null;
        }
        this.f = i2;
    }

    @Override // java.io.Writer
    public final void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0027, code lost:
    
        continue;
     */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(java.lang.String r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.UTF8Writer.write(java.lang.String, int, int):void");
    }
}
