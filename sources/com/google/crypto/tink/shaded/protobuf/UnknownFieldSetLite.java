package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class UnknownFieldSetLite {
    public static final UnknownFieldSetLite f = new UnknownFieldSetLite(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f15119a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    public static UnknownFieldSetLite c(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.f15119a + unknownFieldSetLite2.f15119a;
        int[] iArrCopyOf = Arrays.copyOf(unknownFieldSetLite.b, i);
        System.arraycopy(unknownFieldSetLite2.b, 0, iArrCopyOf, unknownFieldSetLite.f15119a, unknownFieldSetLite2.f15119a);
        Object[] objArrCopyOf = Arrays.copyOf(unknownFieldSetLite.c, i);
        System.arraycopy(unknownFieldSetLite2.c, 0, objArrCopyOf, unknownFieldSetLite.f15119a, unknownFieldSetLite2.f15119a);
        return new UnknownFieldSetLite(i, iArrCopyOf, objArrCopyOf, true);
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
            writer.P(i2, (ByteString) obj);
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

    public final int a() {
        int iZ;
        int iC0;
        int iV;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f15119a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iV = CodedOutputStream.V(i5);
                } else if (i6 == 2) {
                    iV = CodedOutputStream.S(i5, (ByteString) this.c[i3]);
                } else if (i6 == 3) {
                    iZ = CodedOutputStream.Z(i5) * 2;
                    iC0 = ((UnknownFieldSetLite) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.d());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iV = CodedOutputStream.U(i5);
                }
                i2 = iV + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iZ = CodedOutputStream.Z(i5);
                iC0 = CodedOutputStream.c0(jLongValue);
            }
            i2 = iC0 + iZ + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean b(int i, CodedInputStream codedInputStream) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iD;
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            d(i, Long.valueOf(codedInputStream.u()));
            return true;
        }
        if (i3 == 1) {
            d(i, Long.valueOf(codedInputStream.q()));
            return true;
        }
        if (i3 == 2) {
            d(i, codedInputStream.m());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            d(i, Integer.valueOf(codedInputStream.p()));
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
        do {
            iD = codedInputStream.D();
            if (iD == 0) {
                break;
            }
        } while (unknownFieldSetLite.b(iD, codedInputStream));
        codedInputStream.a((i2 << 3) | 4);
        d(i, unknownFieldSetLite);
        return true;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f15119a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
        int[] iArr2 = this.b;
        int i4 = this.f15119a;
        iArr2[i4] = i;
        this.c[i4] = obj;
        this.f15119a = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i = this.f15119a;
        if (i == unknownFieldSetLite.f15119a) {
            int[] iArr = this.b;
            int[] iArr2 = unknownFieldSetLite.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = unknownFieldSetLite.c;
                    int i3 = this.f15119a;
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
        if (this.f15119a == 0) {
            return;
        }
        if (writer.B() == Writer.FieldOrder.d) {
            for (int i = 0; i < this.f15119a; i++) {
                e(this.b[i], this.c[i], writer);
            }
            return;
        }
        for (int i2 = this.f15119a - 1; i2 >= 0; i2--) {
            e(this.b[i2], this.c[i2], writer);
        }
    }

    public final int hashCode() {
        int i = this.f15119a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.f15119a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public UnknownFieldSetLite(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.f15119a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
