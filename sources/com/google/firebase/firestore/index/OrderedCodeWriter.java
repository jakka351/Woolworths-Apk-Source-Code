package com.google.firebase.firestore.index;

import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class OrderedCodeWriter {
    public static final byte[][] c = {new byte[]{0, 0}, new byte[]{-128, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, -128}, new byte[]{-1, -64}};

    /* renamed from: a, reason: collision with root package name */
    public byte[] f15479a;
    public int b;

    public final void a(int i) {
        int i2 = i + this.b;
        byte[] bArr = this.f15479a;
        if (i2 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i2) {
            i2 = length;
        }
        this.f15479a = Arrays.copyOf(bArr, i2);
    }

    public final void b(byte b) {
        if (b == 0) {
            d((byte) 0);
            d((byte) -1);
        } else if (b != -1) {
            d(b);
        } else {
            d((byte) -1);
            d((byte) 0);
        }
    }

    public final void c(byte b) {
        if (b == 0) {
            e((byte) 0);
            e((byte) -1);
        } else if (b != -1) {
            e(b);
        } else {
            e((byte) -1);
            e((byte) 0);
        }
    }

    public final void d(byte b) {
        a(1);
        byte[] bArr = this.f15479a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    public final void e(byte b) {
        a(1);
        byte[] bArr = this.f15479a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = (byte) (~b);
    }

    public final void f(long j) {
        int i;
        long j2 = j < 0 ? ~j : j;
        byte[][] bArr = c;
        if (j2 < 64) {
            a(1);
            byte[] bArr2 = this.f15479a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr2[i2] = (byte) (j ^ bArr[1][0]);
            return;
        }
        if (j2 < 0) {
            j2 = ~j2;
        }
        int iNumberOfLeadingZeros = 65 - Long.numberOfLeadingZeros(j2);
        RoundingMode roundingMode = RoundingMode.UP;
        int iA = IntMath.a(iNumberOfLeadingZeros, 7);
        a(iA);
        if (iA < 2) {
            throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(iA)));
        }
        byte b = j < 0 ? (byte) -1 : (byte) 0;
        int i3 = this.b;
        if (iA == 10) {
            i = i3 + 2;
            byte[] bArr3 = this.f15479a;
            bArr3[i3] = b;
            bArr3[i3 + 1] = b;
        } else if (iA == 9) {
            i = i3 + 1;
            this.f15479a[i3] = b;
        } else {
            i = i3;
        }
        for (int i4 = (iA - 1) + i3; i4 >= i; i4--) {
            this.f15479a[i4] = (byte) (255 & j);
            j >>= 8;
        }
        byte[] bArr4 = this.f15479a;
        int i5 = this.b;
        byte b2 = bArr4[i5];
        byte[] bArr5 = bArr[iA];
        bArr4[i5] = (byte) (b2 ^ bArr5[0]);
        int i6 = i5 + 1;
        bArr4[i6] = (byte) (bArr5[1] ^ bArr4[i6]);
        this.b = i5 + iA;
    }
}
