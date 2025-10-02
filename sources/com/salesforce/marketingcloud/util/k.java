package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

@SuppressLint
/* loaded from: classes6.dex */
public class k implements Closeable {
    private static final byte f = 13;
    private static final byte g = 10;

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f17082a;
    final Charset b;
    private byte[] c;
    private int d;
    private int e;

    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            return new String(((ByteArrayOutputStream) this).buf, 0, i, k.this.b);
        }
    }

    public k(InputStream inputStream) {
        this(inputStream, 8192);
    }

    private void a() throws IOException {
        InputStream inputStream = this.f17082a;
        byte[] bArr = this.c;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = i;
    }

    public boolean b() {
        return this.e == -1;
    }

    public int c() throws IOException {
        String strD = d();
        try {
            return Integer.parseInt(strD);
        } catch (NumberFormatException unused) {
            throw new IOException(YU.a.h("expected an int but was \"", strD, "\""));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f17082a) {
            try {
                if (this.c != null) {
                    this.c = null;
                    this.f17082a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String d() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f17082a
            monitor-enter(r0)
            byte[] r1 = r7.c     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L7f
            int r1 = r7.d     // Catch: java.lang.Throwable -> L11
            int r2 = r7.e     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.a()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L87
        L14:
            int r1 = r7.d     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.e     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L41
            byte[] r2 = r7.c     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L3e
            int r3 = r7.d     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.b     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.d = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L3e:
            int r1 = r1 + 1
            goto L16
        L41:
            com.salesforce.marketingcloud.util.k$a r1 = new com.salesforce.marketingcloud.util.k$a     // Catch: java.lang.Throwable -> L11
            int r2 = r7.e     // Catch: java.lang.Throwable -> L11
            int r4 = r7.d     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L4d:
            byte[] r2 = r7.c     // Catch: java.lang.Throwable -> L11
            int r4 = r7.d     // Catch: java.lang.Throwable -> L11
            int r5 = r7.e     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.e = r2     // Catch: java.lang.Throwable -> L11
            r7.a()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.d     // Catch: java.lang.Throwable -> L11
        L5f:
            int r4 = r7.e     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L4d
            byte[] r4 = r7.c     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L7c
            int r3 = r7.d     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L72
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L72:
            int r2 = r2 + 1
            r7.d = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L7c:
            int r2 = r2 + 1
            goto L5f
        L7f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.util.k.d():java.lang.String");
    }

    public k(InputStream inputStream, int i) {
        this(inputStream, i, g.f17080a);
    }

    public k(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null) {
            throw new NullPointerException("in == null");
        }
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(g.f17080a) && !charset.equals(g.c) && !charset.equals(g.b)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f17082a = inputStream;
        this.b = charset;
        this.c = new byte[i];
    }

    public k(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
