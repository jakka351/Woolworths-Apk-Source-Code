package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class TextBuffer {
    public static final char[] l = new char[0];

    /* renamed from: a, reason: collision with root package name */
    public final BufferRecycler f14221a;
    public char[] b;
    public int c;
    public int d;
    public ArrayList e;
    public boolean f;
    public int g;
    public char[] h;
    public int i;
    public String j;
    public char[] k;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this.f14221a = bufferRecycler;
    }

    public final void a(int i, int i2, String str) {
        if (this.c >= 0) {
            r(i2);
        }
        this.j = null;
        this.k = null;
        char[] cArr = this.h;
        int length = cArr.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            i();
            int iMin = Math.min(this.h.length, i2);
            int i6 = i + iMin;
            str.getChars(i, i6, this.h, 0);
            this.i += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public final void b(char[] cArr, int i, int i2) {
        if (this.c >= 0) {
            r(i2);
        }
        this.j = null;
        this.k = null;
        char[] cArr2 = this.h;
        int length = cArr2.length;
        int i3 = this.i;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.i += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            i();
            int iMin = Math.min(this.h.length, i2);
            System.arraycopy(cArr, i, this.h, 0, iMin);
            this.i += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final char[] c(int i) {
        BufferRecycler bufferRecycler = this.f14221a;
        return bufferRecycler != null ? bufferRecycler.b(2, i) : new char[Math.max(i, 500)];
    }

    public final void d() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final char[] e() {
        /*
            r7 = this;
            char[] r0 = r7.k
            if (r0 != 0) goto L5b
            java.lang.String r0 = r7.j
            if (r0 == 0) goto Ld
            char[] r0 = r0.toCharArray()
            goto L59
        Ld:
            int r0 = r7.c
            char[] r1 = com.fasterxml.jackson.core.util.TextBuffer.l
            r2 = 1
            if (r0 < 0) goto L2b
            int r3 = r7.d
            if (r3 >= r2) goto L1a
        L18:
            r0 = r1
            goto L59
        L1a:
            if (r0 != 0) goto L23
            char[] r0 = r7.b
            char[] r0 = java.util.Arrays.copyOf(r0, r3)
            goto L59
        L23:
            char[] r1 = r7.b
            int r3 = r3 + r0
            char[] r0 = java.util.Arrays.copyOfRange(r1, r0, r3)
            goto L59
        L2b:
            int r0 = r7.q()
            if (r0 >= r2) goto L32
            goto L18
        L32:
            char[] r0 = new char[r0]
            java.util.ArrayList r1 = r7.e
            r2 = 0
            if (r1 == 0) goto L51
            int r1 = r1.size()
            r3 = r2
            r4 = r3
        L3f:
            if (r3 >= r1) goto L52
            java.util.ArrayList r5 = r7.e
            java.lang.Object r5 = r5.get(r3)
            char[] r5 = (char[]) r5
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r4, r6)
            int r4 = r4 + r6
            int r3 = r3 + 1
            goto L3f
        L51:
            r4 = r2
        L52:
            char[] r1 = r7.h
            int r3 = r7.i
            java.lang.System.arraycopy(r1, r2, r0, r4, r3)
        L59:
            r7.k = r0
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.e():char[]");
    }

    public final int f(boolean z) {
        char[] cArr;
        int i = this.c;
        return (i < 0 || (cArr = this.b) == null) ? z ? -NumberInput.e(this.h, 1, this.i - 1) : NumberInput.e(this.h, 0, this.i) : z ? -NumberInput.e(cArr, i + 1, this.d - 1) : NumberInput.e(cArr, i, this.d);
    }

    public final String g() {
        if (this.j == null) {
            char[] cArr = this.k;
            if (cArr != null) {
                this.j = new String(cArr);
            } else {
                int i = this.c;
                if (i >= 0) {
                    int i2 = this.d;
                    if (i2 < 1) {
                        this.j = "";
                        return "";
                    }
                    this.j = new String(this.b, i, i2);
                } else {
                    int i3 = this.g;
                    int i4 = this.i;
                    if (i3 == 0) {
                        this.j = i4 != 0 ? new String(this.h, 0, i4) : "";
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = this.e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) this.e.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.h, 0, this.i);
                        this.j = sb.toString();
                    }
                }
            }
        }
        return this.j;
    }

    public final char[] h() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.j = null;
        this.k = null;
        if (this.f) {
            d();
        }
        char[] cArr = this.h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrC = c(0);
        this.h = cArrC;
        return cArrC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[PHI: r1
  0x0026: PHI (r1v8 int) = (r1v6 int), (r1v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.e
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.e = r0
        Lb:
            char[] r0 = r3.h
            r1 = 1
            r3.f = r1
            java.util.ArrayList r1 = r3.e
            r1.add(r0)
            int r1 = r3.g
            int r2 = r0.length
            int r1 = r1 + r2
            r3.g = r1
            r1 = 0
            r3.i = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L28
        L26:
            r0 = r1
            goto L2d
        L28:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r1) goto L2d
            goto L26
        L2d:
            char[] r0 = new char[r0]
            r3.h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.i():void");
    }

    public final char[] j() {
        char[] cArr = this.h;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i);
        this.h = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final char[] k() {
        /*
            r2 = this;
            java.util.ArrayList r0 = r2.e
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.e = r0
        Lb:
            r0 = 1
            r2.f = r0
            java.util.ArrayList r0 = r2.e
            char[] r1 = r2.h
            r0.add(r1)
            char[] r0 = r2.h
            int r0 = r0.length
            int r1 = r2.g
            int r1 = r1 + r0
            r2.g = r1
            r1 = 0
            r2.i = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L29
        L27:
            r0 = r1
            goto L2e
        L29:
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r0 <= r1) goto L2e
            goto L27
        L2e:
            char[] r0 = new char[r0]
            r2.h = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.k():char[]");
    }

    public final char[] l() {
        if (this.c >= 0) {
            r(1);
        } else {
            char[] cArr = this.h;
            if (cArr == null) {
                this.h = c(0);
            } else if (this.i >= cArr.length) {
                i();
            }
        }
        return this.h;
    }

    public final char[] m() {
        if (this.c >= 0) {
            return this.b;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        }
        if (this.f) {
            return e();
        }
        char[] cArr2 = this.h;
        return cArr2 == null ? l : cArr2;
    }

    public final int n() {
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public final void o() {
        char[] cArr;
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.k = null;
        if (this.f) {
            d();
        }
        BufferRecycler bufferRecycler = this.f14221a;
        if (bufferRecycler == null || (cArr = this.h) == null) {
            return;
        }
        this.h = null;
        bufferRecycler.b.set(2, cArr);
    }

    public final void p(char[] cArr, int i, int i2) {
        this.j = null;
        this.k = null;
        this.b = cArr;
        this.c = i;
        this.d = i2;
        if (this.f) {
            d();
        }
    }

    public final int q() {
        if (this.c >= 0) {
            return this.d;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        return str != null ? str.length() : this.g + this.i;
    }

    public final void r(int i) {
        int i2 = this.d;
        this.d = 0;
        char[] cArr = this.b;
        this.b = null;
        int i3 = this.c;
        this.c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = c(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    public final String toString() {
        return g();
    }

    public TextBuffer(char[] cArr) {
        this.f14221a = null;
        this.h = cArr;
        this.i = cArr.length;
        this.c = -1;
    }
}
