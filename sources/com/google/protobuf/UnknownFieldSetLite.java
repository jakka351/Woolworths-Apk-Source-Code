package com.google.protobuf;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.protobuf.Writer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class UnknownFieldSetLite {
    public static final UnknownFieldSetLite f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f16091a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f16091a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static UnknownFieldSetLite c() {
        return new UnknownFieldSetLite(0, new int[8], new Object[8], true);
    }

    public static void e(int i, Object obj, Writer writer) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            writer.E(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            writer.m(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            writer.K(i2, (ByteString) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            writer.c(i2, ((Integer) obj).intValue());
        } else if (writer.B() == Writer.FieldOrder.d) {
            writer.p(i2);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.r(i2);
        } else {
            writer.r(i2);
            ((UnknownFieldSetLite) obj).f(writer);
            writer.p(i2);
        }
    }

    public final void a(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.f16091a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final int b() {
        int iV;
        int iX;
        int iV2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.f16091a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iV2 = CodedOutputStream.V(i4) + 8;
                } else if (i5 == 2) {
                    ByteString byteString = (ByteString) this.c[i2];
                    int iV3 = CodedOutputStream.V(i4);
                    int size = byteString.size();
                    iB = c.B(size, size, iV3, iB);
                } else if (i5 == 3) {
                    iV = CodedOutputStream.V(i4) * 2;
                    iX = ((UnknownFieldSetLite) this.c[i2]).b();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.d());
                    }
                    ((Integer) this.c[i2]).getClass();
                    iV2 = CodedOutputStream.V(i4) + 4;
                }
                iB = iV2 + iB;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iV = CodedOutputStream.V(i4);
                iX = CodedOutputStream.X(jLongValue);
            }
            iB = iX + iV + iB;
        }
        this.d = iB;
        return iB;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.f16091a + 1);
        int[] iArr = this.b;
        int i2 = this.f16091a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.f16091a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.f16091a;
        if (i == unknownFieldSetLite.f16091a) {
            int[] iArr = this.b;
            int[] iArr2 = unknownFieldSetLite.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = unknownFieldSetLite.c;
                    int i3 = this.f16091a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void f(Writer writer) {
        if (this.f16091a == 0) {
            return;
        }
        if (writer.B() == Writer.FieldOrder.d) {
            for (int i = 0; i < this.f16091a; i++) {
                e(this.b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.f16091a - 1; i2 >= 0; i2--) {
            e(this.b[i2], this.c[i2], writer);
        }
    }

    public final int hashCode() {
        int i = this.f16091a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.f16091a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
