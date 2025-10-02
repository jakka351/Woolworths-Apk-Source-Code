package com.google.protobuf;

import YU.a;
import com.google.protobuf.ByteString;
import com.google.protobuf.UnsafeUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f16023a;
    public int b = 100;
    public CodedInputStreamReader c;

    public static final class ArrayDecoder extends CodedInputStream {
        public final byte[] d;
        public int e;
        public int f;
        public int g;
        public final int h;
        public int i;
        public int j = Integer.MAX_VALUE;

        public ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            this.d = bArr;
            this.e = i2 + i;
            this.g = i;
            this.h = i;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    J(8);
                    return true;
                }
                if (i2 == 2) {
                    J(F());
                    return true;
                }
                if (i2 == 3) {
                    C();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                J(4);
                return true;
            }
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i3 < 10) {
                int i6 = this.g;
                if (i6 == this.e) {
                    throw InvalidProtocolBufferException.h();
                }
                this.g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final int D() throws InvalidProtocolBufferException {
            int i = this.g;
            if (this.e - i < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.g = i + 4;
            byte[] bArr = this.d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long E() throws InvalidProtocolBufferException {
            int i = this.g;
            if (this.e - i < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.g = i + 8;
            byte[] bArr = this.d;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int F() {
            int i;
            int i2 = this.g;
            int i3 = this.e;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.d;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.g = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.g = i5;
                    return i;
                }
            }
            return (int) H();
        }

        public final long G() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.g;
            int i2 = this.e;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.d;
                byte b = bArr[i];
                if (b >= 0) {
                    this.g = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i8] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.g = i4;
                    return j;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.g;
                if (i2 == this.e) {
                    throw InvalidProtocolBufferException.h();
                }
                this.g = i2 + 1;
                j |= (r3 & 127) << i;
                if ((this.d[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void I() {
            int i = this.e + this.f;
            this.e = i;
            int i2 = i - this.h;
            int i3 = this.j;
            if (i2 <= i3) {
                this.f = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f = i4;
            this.e = i - i4;
        }

        public final void J(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.e;
                int i3 = this.g;
                if (i <= i2 - i3) {
                    this.g = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.i != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return this.g - this.h;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return this.g == this.e;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i) {
            this.j = i;
            I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD = i + d();
            if (iD < 0) {
                throw InvalidProtocolBufferException.g();
            }
            int i2 = this.j;
            if (iD > i2) {
                throw InvalidProtocolBufferException.h();
            }
            this.j = iD;
            I();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return G() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.protobuf.ByteString k() throws com.google.protobuf.InvalidProtocolBufferException {
            /*
                r4 = this;
                int r0 = r4.F()
                byte[] r1 = r4.d
                if (r0 <= 0) goto L19
                int r2 = r4.e
                int r3 = r4.g
                int r2 = r2 - r3
                if (r0 > r2) goto L19
                com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.j(r3, r0, r1)
                int r2 = r4.g
                int r2 = r2 + r0
                r4.g = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.e
                return r0
            L1e:
                if (r0 <= 0) goto L2f
                int r2 = r4.e
                int r3 = r4.g
                int r2 = r2 - r3
                if (r0 > r2) goto L2f
                int r0 = r0 + r3
                r4.g = r0
                byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
                goto L35
            L2f:
                if (r0 > 0) goto L42
                if (r0 != 0) goto L3d
                byte[] r0 = com.google.protobuf.Internal.b
            L35:
                com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.e
                com.google.protobuf.ByteString$LiteralByteString r1 = new com.google.protobuf.ByteString$LiteralByteString
                r1.<init>(r0)
                return r1
            L3d:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.f()
                throw r0
            L42:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.ArrayDecoder.k():com.google.protobuf.ByteString");
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(E());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(D());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(F());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                int i = this.e;
                int i2 = this.g;
                if (iF <= i - i2) {
                    String str = new String(this.d, i2, iF, Internal.f16059a);
                    this.g += iF;
                    return str;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                int i = this.e;
                int i2 = this.g;
                if (iF <= i - i2) {
                    String strA = Utf8.f16094a.a(i2, iF, this.d);
                    this.g += iF;
                    return strA;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.i = 0;
                return 0;
            }
            int iF = F();
            this.i = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return F();
        }
    }

    /* loaded from: classes6.dex */
    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        public final Iterator d;
        public ByteBuffer e;
        public int f;
        public int g;
        public int i;
        public long k;
        public long l;
        public long m;
        public int h = Integer.MAX_VALUE;
        public int j = 0;

        public IterableDirectByteBufferDecoder(int i, ArrayList arrayList) {
            this.f = i;
            this.d = arrayList.iterator();
            if (i != 0) {
                N();
                return;
            }
            this.e = Internal.c;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            if (i2 == 0) {
                for (int i3 = 0; i3 < 10; i3++) {
                    if (E() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            if (i2 == 1) {
                M(8);
                return true;
            }
            if (i2 == 2) {
                M(I());
                return true;
            }
            if (i2 == 3) {
                C();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            M(4);
            return true;
        }

        public final long D() {
            return this.m - this.k;
        }

        public final byte E() throws InvalidProtocolBufferException {
            if (D() == 0) {
                if (!this.d.hasNext()) {
                    throw InvalidProtocolBufferException.h();
                }
                N();
            }
            long j = this.k;
            this.k = 1 + j;
            return UnsafeUtil.c.f(j);
        }

        public final void F(int i, byte[] bArr) throws InvalidProtocolBufferException {
            if (i < 0 || i > L()) {
                if (i > 0) {
                    throw InvalidProtocolBufferException.h();
                }
                if (i != 0) {
                    throw InvalidProtocolBufferException.f();
                }
                return;
            }
            int i2 = i;
            while (i2 > 0) {
                if (D() == 0) {
                    if (!this.d.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    N();
                }
                int iMin = Math.min(i2, (int) D());
                long j = iMin;
                UnsafeUtil.c.c(this.k, bArr, i - i2, j);
                i2 -= iMin;
                this.k += j;
            }
        }

        public final int G() {
            if (D() < 4) {
                return (E() & 255) | ((E() & 255) << 8) | ((E() & 255) << 16) | ((E() & 255) << 24);
            }
            long j = this.k;
            this.k = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
            return ((memoryAccessor.f(j + 3) & 255) << 24) | (memoryAccessor.f(j) & 255) | ((memoryAccessor.f(1 + j) & 255) << 8) | ((memoryAccessor.f(2 + j) & 255) << 16);
        }

        public final long H() {
            if (D() < 8) {
                return (E() & 255) | ((E() & 255) << 8) | ((E() & 255) << 16) | ((E() & 255) << 24) | ((E() & 255) << 32) | ((E() & 255) << 40) | ((E() & 255) << 48) | ((E() & 255) << 56);
            }
            this.k = 8 + this.k;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
            return (memoryAccessor.f(r13) & 255) | ((memoryAccessor.f(r13 + 1) & 255) << 8) | ((memoryAccessor.f(r13 + 2) & 255) << 16) | ((memoryAccessor.f(3 + r13) & 255) << 24) | ((memoryAccessor.f(4 + r13) & 255) << 32) | ((memoryAccessor.f(5 + r13) & 255) << 40) | ((memoryAccessor.f(6 + r13) & 255) << 48) | ((memoryAccessor.f(r13 + 7) & 255) << 56);
        }

        public final int I() {
            int i;
            long j = this.k;
            if (this.m != j) {
                long j2 = j + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
                byte bF = memoryAccessor.f(j);
                if (bF >= 0) {
                    this.k++;
                    return bF;
                }
                if (this.m - this.k >= 10) {
                    long j3 = 2 + j;
                    int iF = (memoryAccessor.f(j2) << 7) ^ bF;
                    if (iF < 0) {
                        i = iF ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iF2 = (memoryAccessor.f(j3) << 14) ^ iF;
                        if (iF2 >= 0) {
                            i = iF2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iF3 = iF2 ^ (memoryAccessor.f(j4) << 21);
                            if (iF3 < 0) {
                                i = (-2080896) ^ iF3;
                            } else {
                                j4 = 5 + j;
                                byte bF2 = memoryAccessor.f(j5);
                                int i2 = (iF3 ^ (bF2 << 28)) ^ 266354560;
                                if (bF2 < 0) {
                                    j5 = 6 + j;
                                    if (memoryAccessor.f(j4) < 0) {
                                        j4 = 7 + j;
                                        if (memoryAccessor.f(j5) < 0) {
                                            j5 = 8 + j;
                                            if (memoryAccessor.f(j4) < 0) {
                                                j4 = 9 + j;
                                                if (memoryAccessor.f(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (memoryAccessor.f(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.k = j3;
                    return i;
                }
            }
            return (int) K();
        }

        public final long J() {
            long j;
            long j2;
            long j3;
            long j4 = this.k;
            if (this.m != j4) {
                long j5 = j4 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
                byte bF = memoryAccessor.f(j4);
                if (bF >= 0) {
                    this.k++;
                    return bF;
                }
                if (this.m - this.k >= 10) {
                    long j6 = 2 + j4;
                    int iF = (memoryAccessor.f(j5) << 7) ^ bF;
                    if (iF < 0) {
                        j = iF ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int iF2 = (memoryAccessor.f(j6) << 14) ^ iF;
                        if (iF2 >= 0) {
                            j = iF2 ^ 16256;
                        } else {
                            long j8 = 4 + j4;
                            int iF3 = iF2 ^ (memoryAccessor.f(j7) << 21);
                            if (iF3 < 0) {
                                j = (-2080896) ^ iF3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long jF = (memoryAccessor.f(j8) << 28) ^ iF3;
                                if (jF >= 0) {
                                    j3 = 266354560;
                                } else {
                                    j7 = 6 + j4;
                                    long jF2 = jF ^ (memoryAccessor.f(j9) << 35);
                                    if (jF2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        jF = jF2 ^ (memoryAccessor.f(j7) << 42);
                                        if (jF >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j7 = 8 + j4;
                                            jF2 = jF ^ (memoryAccessor.f(j9) << 49);
                                            if (jF2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long jF3 = (jF2 ^ (memoryAccessor.f(j7) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j10 = j4 + 10;
                                                    if (memoryAccessor.f(j9) >= 0) {
                                                        j6 = j10;
                                                        j = jF3;
                                                    }
                                                } else {
                                                    j = jF3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jF2;
                                }
                                j = j3 ^ jF;
                                j6 = j9;
                            }
                        }
                        j6 = j7;
                    }
                    this.k = j6;
                    return j;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & 127) << i;
                if ((E() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final int L() {
            return (int) (((this.f - this.j) - this.k) + this.l);
        }

        public final void M(int i) throws InvalidProtocolBufferException {
            if (i < 0 || i > ((this.f - this.j) - this.k) + this.l) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.h();
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i > 0) {
                if (D() == 0) {
                    if (!this.d.hasNext()) {
                        throw InvalidProtocolBufferException.h();
                    }
                    N();
                }
                int iMin = Math.min(i, (int) D());
                i -= iMin;
                this.k += iMin;
            }
        }

        public final void N() {
            ByteBuffer byteBuffer = (ByteBuffer) this.d.next();
            this.e = byteBuffer;
            this.j += (int) (this.k - this.l);
            long jPosition = byteBuffer.position();
            this.k = jPosition;
            this.l = jPosition;
            this.m = this.e.limit();
            long jB = UnsafeUtil.b(this.e);
            this.k += jB;
            this.l += jB;
            this.m += jB;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.i != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return (int) ((this.j + this.k) - this.l);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return (((long) this.j) + this.k) - this.l == ((long) this.f);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i) {
            this.h = i;
            int i2 = this.f + this.g;
            this.f = i2;
            if (i2 <= i) {
                this.g = 0;
                return;
            }
            int i3 = i2 - i;
            this.g = i3;
            this.f = i2 - i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD = i + d();
            int i2 = this.h;
            if (iD > i2) {
                throw InvalidProtocolBufferException.h();
            }
            this.h = iD;
            int i3 = this.f + this.g;
            this.f = i3;
            if (i3 <= iD) {
                this.g = 0;
                return i2;
            }
            int i4 = i3 - iD;
            this.g = i4;
            this.f = i3 - i4;
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return J() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            int I = I();
            if (I > 0) {
                long j = I;
                long j2 = this.m;
                long j3 = this.k;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[I];
                    UnsafeUtil.c.c(j3, bArr, 0L, j);
                    this.k += j;
                    ByteString byteString = ByteString.e;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (I > 0 && I <= L()) {
                byte[] bArr2 = new byte[I];
                F(I, bArr2);
                ByteString byteString2 = ByteString.e;
                return new ByteString.LiteralByteString(bArr2);
            }
            if (I == 0) {
                return ByteString.e;
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(H());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(I());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(J());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int I = I();
            if (I > 0) {
                long j = I;
                long j2 = this.m;
                long j3 = this.k;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[I];
                    UnsafeUtil.c.c(j3, bArr, 0L, j);
                    String str = new String(bArr, Internal.f16059a);
                    this.k += j;
                    return str;
                }
            }
            if (I > 0 && I <= L()) {
                byte[] bArr2 = new byte[I];
                F(I, bArr2);
                return new String(bArr2, Internal.f16059a);
            }
            if (I == 0) {
                return "";
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int I = I();
            if (I > 0) {
                long j = I;
                long j2 = this.m;
                long j3 = this.k;
                if (j <= j2 - j3) {
                    String strC = Utf8.c(this.e, (int) (j3 - this.l), I);
                    this.k += j;
                    return strC;
                }
            }
            if (I >= 0 && I <= L()) {
                byte[] bArr = new byte[I];
                F(I, bArr);
                return Utf8.f16094a.a(0, I, bArr);
            }
            if (I == 0) {
                return "";
            }
            if (I <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.i = 0;
                return 0;
            }
            int I = I();
            this.i = I;
            if ((I >>> 3) != 0) {
                return I;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return I();
        }
    }

    /* loaded from: classes6.dex */
    public static final class StreamDecoder extends CodedInputStream {
        public final InputStream d;
        public final byte[] e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public interface RefillCallback {
        }

        public class SkippedDataSink implements RefillCallback {
        }

        public StreamDecoder(InputStream inputStream) {
            Charset charset = Internal.f16059a;
            this.d = inputStream;
            this.e = new byte[4096];
            this.f = 0;
            this.h = 0;
            this.j = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    N(8);
                    return true;
                }
                if (i2 == 2) {
                    N(I());
                    return true;
                }
                if (i2 == 3) {
                    C();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                N(4);
                return true;
            }
            int i4 = this.f - this.h;
            byte[] bArr = this.e;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i3 < 10) {
                if (this.h == this.f) {
                    M(1);
                }
                int i6 = this.h;
                this.h = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final byte[] D(int i) throws IOException {
            byte[] bArrE = E(i);
            if (bArrE != null) {
                return bArrE;
            }
            int i2 = this.h;
            int i3 = this.f;
            int length = i3 - i2;
            this.j += i3;
            this.h = 0;
            this.f = 0;
            ArrayList arrayListF = F(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.e, i2, bArr, 0, length);
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] E(int i) throws IOException {
            if (i == 0) {
                return Internal.b;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.j;
            int i3 = this.h;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.k;
            if (i4 > i5) {
                N((i5 - i2) - i3);
                throw InvalidProtocolBufferException.h();
            }
            int i6 = this.f - i3;
            int i7 = i - i6;
            InputStream inputStream = this.d;
            if (i7 >= 4096) {
                try {
                    if (i7 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.d = true;
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.e, this.h, bArr, 0, i6);
            this.j += this.f;
            this.h = 0;
            this.f = 0;
            while (i6 < i) {
                try {
                    int i8 = inputStream.read(bArr, i6, i - i6);
                    if (i8 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.j += i8;
                    i6 += i8;
                } catch (InvalidProtocolBufferException e2) {
                    e2.d = true;
                    throw e2;
                }
            }
            return bArr;
        }

        public final ArrayList F(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.h();
                    }
                    this.j += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int G() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 4) {
                M(4);
                i = this.h;
            }
            this.h = i + 4;
            byte[] bArr = this.e;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long H() throws InvalidProtocolBufferException {
            int i = this.h;
            if (this.f - i < 8) {
                M(8);
                i = this.h;
            }
            this.h = i + 8;
            byte[] bArr = this.e;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int I() {
            int i;
            int i2 = this.h;
            int i3 = this.f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.e;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.h = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.h = i5;
                    return i;
                }
            }
            return (int) K();
        }

        public final long J() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.h;
            int i2 = this.f;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.e;
                byte b = bArr[i];
                if (b >= 0) {
                    this.h = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i8] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.h = i4;
                    return j;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.h == this.f) {
                    M(1);
                }
                int i2 = this.h;
                this.h = i2 + 1;
                j |= (r3 & 127) << i;
                if ((this.e[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void L() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = this.j + i;
            int i3 = this.k;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        public final void M(int i) throws InvalidProtocolBufferException {
            if (O(i)) {
                return;
            }
            if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
                throw InvalidProtocolBufferException.h();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void N(int i) throws InvalidProtocolBufferException {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3 && i >= 0) {
                this.h = i3 + i;
                return;
            }
            InputStream inputStream = this.d;
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i4 = this.j;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.k;
            if (i6 > i7) {
                N((i7 - i4) - i3);
                throw InvalidProtocolBufferException.h();
            }
            this.j = i5;
            int i8 = i2 - i3;
            this.f = 0;
            this.h = 0;
            while (i8 < i) {
                long j = i - i8;
                try {
                    try {
                        long jSkip = inputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i8 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.d = true;
                        throw e;
                    }
                } catch (Throwable th) {
                    this.j += i8;
                    L();
                    throw th;
                }
            }
            this.j += i8;
            L();
            if (i8 >= i) {
                return;
            }
            int i9 = this.f;
            int i10 = i9 - this.h;
            this.h = i9;
            M(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.f;
                if (i11 <= i12) {
                    this.h = i11;
                    return;
                } else {
                    i10 += i12;
                    this.h = i12;
                    M(1);
                }
            }
        }

        public final boolean O(int i) throws IOException {
            InputStream inputStream = this.d;
            int i2 = this.h;
            int i3 = i2 + i;
            int i4 = this.f;
            if (i3 <= i4) {
                throw new IllegalStateException(a.e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i5 = this.j;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.k) {
                byte[] bArr = this.e;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.j += i2;
                    this.f -= i2;
                    this.h = 0;
                }
                int i6 = this.f;
                try {
                    int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                    if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i7 > 0) {
                        this.f += i7;
                        L();
                        if (this.f >= i) {
                            return true;
                        }
                        return O(i);
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.d = true;
                    throw e;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.i != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return this.j + this.h;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return this.h == this.f && !O(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i) {
            this.k = i;
            L();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.j + this.h + i;
            int i3 = this.k;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.h();
            }
            this.k = i2;
            L();
            return i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return J() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString k() throws IOException {
            int I = I();
            int i = this.f;
            int i2 = this.h;
            int i3 = i - i2;
            byte[] bArr = this.e;
            if (I <= i3 && I > 0) {
                ByteString byteStringJ = ByteString.j(i2, I, bArr);
                this.h += I;
                return byteStringJ;
            }
            if (I == 0) {
                return ByteString.e;
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            byte[] bArrE = E(I);
            if (bArrE != null) {
                return ByteString.j(0, bArrE.length, bArrE);
            }
            int i4 = this.h;
            int i5 = this.f;
            int length = i5 - i4;
            this.j += i5;
            this.h = 0;
            this.f = 0;
            ArrayList arrayListF = F(I - length);
            byte[] bArr2 = new byte[I];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.e;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(H());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return J();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return H();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(I());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(J());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int I = I();
            byte[] bArr = this.e;
            if (I > 0) {
                int i = this.f;
                int i2 = this.h;
                if (I <= i - i2) {
                    String str = new String(bArr, i2, I, Internal.f16059a);
                    this.h += I;
                    return str;
                }
            }
            if (I == 0) {
                return "";
            }
            if (I < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (I > this.f) {
                return new String(D(I), Internal.f16059a);
            }
            M(I);
            String str2 = new String(bArr, this.h, I, Internal.f16059a);
            this.h += I;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws IOException {
            int I = I();
            int i = this.h;
            int i2 = this.f;
            int i3 = i2 - i;
            byte[] bArrD = this.e;
            if (I <= i3 && I > 0) {
                this.h = i + I;
            } else {
                if (I == 0) {
                    return "";
                }
                if (I < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                i = 0;
                if (I <= i2) {
                    M(I);
                    this.h = I;
                } else {
                    bArrD = D(I);
                }
            }
            return Utf8.f16094a.a(i, I, bArrD);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.i = 0;
                return 0;
            }
            int I = I();
            this.i = I;
            if ((I >>> 3) != 0) {
                return I;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return I();
        }
    }

    /* loaded from: classes6.dex */
    public static final class UnsafeDirectNioDecoder extends CodedInputStream {
        public final ByteBuffer d;
        public final long e;
        public long f;
        public long g;
        public final long h;
        public int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public UnsafeDirectNioDecoder(ByteBuffer byteBuffer) {
            this.d = byteBuffer;
            long jB = UnsafeUtil.b(byteBuffer);
            this.e = jB;
            this.f = byteBuffer.limit() + jB;
            long jPosition = jB + byteBuffer.position();
            this.g = jPosition;
            this.h = jPosition;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long A() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean B(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    J(8);
                    return true;
                }
                if (i2 == 2) {
                    J(F());
                    return true;
                }
                if (i2 == 3) {
                    C();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                J(4);
                return true;
            }
            if (((int) (this.f - this.g)) >= 10) {
                while (i3 < 10) {
                    long j = this.g;
                    this.g = j + 1;
                    if (UnsafeUtil.c.f(j) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i3 < 10) {
                long j2 = this.g;
                if (j2 == this.f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.g = j2 + 1;
                if (UnsafeUtil.c.f(j2) < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }

        public final int D() throws InvalidProtocolBufferException {
            long j = this.g;
            if (this.f - j < 4) {
                throw InvalidProtocolBufferException.h();
            }
            this.g = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
            return ((memoryAccessor.f(j + 3) & 255) << 24) | (memoryAccessor.f(j) & 255) | ((memoryAccessor.f(1 + j) & 255) << 8) | ((memoryAccessor.f(2 + j) & 255) << 16);
        }

        public final long E() throws InvalidProtocolBufferException {
            long j = this.g;
            if (this.f - j < 8) {
                throw InvalidProtocolBufferException.h();
            }
            this.g = 8 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
            return ((memoryAccessor.f(j + 7) & 255) << 56) | (memoryAccessor.f(j) & 255) | ((memoryAccessor.f(1 + j) & 255) << 8) | ((memoryAccessor.f(2 + j) & 255) << 16) | ((memoryAccessor.f(3 + j) & 255) << 24) | ((memoryAccessor.f(4 + j) & 255) << 32) | ((memoryAccessor.f(5 + j) & 255) << 40) | ((memoryAccessor.f(6 + j) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int F() {
            /*
                r12 = this;
                long r0 = r12.g
                long r2 = r12.f
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                com.google.protobuf.UnsafeUtil$MemoryAccessor r4 = com.google.protobuf.UnsafeUtil.c
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.g = r2
                return r5
            L18:
                long r6 = r12.f
                long r6 = r6 - r2
                r8 = 9
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 >= 0) goto L23
                goto L93
            L23:
                r6 = 2
                long r6 = r6 + r0
                byte r2 = r4.f(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r5
                if (r2 >= 0) goto L33
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto La0
            L33:
                r10 = 3
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r3 = r3 << 14
                r2 = r2 ^ r3
                if (r2 < 0) goto L43
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r10
                goto La0
            L43:
                r5 = 4
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L55
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto La0
            L55:
                r10 = 5
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                int r5 = r3 << 28
                r2 = r2 ^ r5
                r5 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r5
                if (r3 >= 0) goto L9e
                r5 = 6
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                r10 = 7
                long r10 = r10 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9e
                r5 = 8
                long r6 = r0 + r5
                byte r3 = r4.f(r10)
                if (r3 >= 0) goto L99
                long r8 = r8 + r0
                byte r3 = r4.f(r6)
                if (r3 >= 0) goto L9b
                r5 = 10
                long r6 = r0 + r5
                byte r0 = r4.f(r8)
                if (r0 >= 0) goto L99
            L93:
                long r0 = r12.H()
                int r0 = (int) r0
                return r0
            L99:
                r0 = r2
                goto La0
            L9b:
                r0 = r2
                r6 = r8
                goto La0
            L9e:
                r0 = r2
                goto L41
            La0:
                r12.g = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.F():int");
        }

        public final long G() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.g;
            if (this.f != j4) {
                long j5 = 1 + j4;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.c;
                byte bF = memoryAccessor.f(j4);
                if (bF >= 0) {
                    this.g = j5;
                    return bF;
                }
                if (this.f - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iF = (memoryAccessor.f(j5) << 7) ^ bF;
                    if (iF >= 0) {
                        long j7 = 3 + j4;
                        int iF2 = iF ^ (memoryAccessor.f(j6) << 14);
                        if (iF2 >= 0) {
                            j = iF2 ^ 16256;
                        } else {
                            j6 = j4 + 4;
                            int iF3 = iF2 ^ (memoryAccessor.f(j7) << 21);
                            if (iF3 < 0) {
                                i = (-2080896) ^ iF3;
                            } else {
                                j7 = 5 + j4;
                                long jF = iF3 ^ (memoryAccessor.f(j6) << 28);
                                if (jF < 0) {
                                    long j8 = 6 + j4;
                                    long jF2 = jF ^ (memoryAccessor.f(j7) << 35);
                                    if (jF2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = 7 + j4;
                                        jF = jF2 ^ (memoryAccessor.f(j8) << 42);
                                        if (jF >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = 8 + j4;
                                            jF2 = jF ^ (memoryAccessor.f(j7) << 49);
                                            if (jF2 >= 0) {
                                                long j9 = j4 + 9;
                                                long jF3 = (jF2 ^ (memoryAccessor.f(j8) << 56)) ^ 71499008037633920L;
                                                if (jF3 < 0) {
                                                    long j10 = j4 + 10;
                                                    if (memoryAccessor.f(j9) >= 0) {
                                                        j6 = j10;
                                                        j = jF3;
                                                    }
                                                } else {
                                                    j = jF3;
                                                    j6 = j9;
                                                }
                                                this.g = j6;
                                                return j;
                                            }
                                            j2 = -558586000294016L;
                                        }
                                    }
                                    j = j2 ^ jF2;
                                    j6 = j8;
                                    this.g = j6;
                                    return j;
                                }
                                j3 = 266354560;
                                j = j3 ^ jF;
                            }
                        }
                        j6 = j7;
                        this.g = j6;
                        return j;
                    }
                    i = iF ^ (-128);
                    j = i;
                    this.g = j6;
                    return j;
                }
            }
            return H();
        }

        public final long H() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                long j2 = this.g;
                if (j2 == this.f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.g = 1 + j2;
                j |= (r3 & 127) << i;
                if ((UnsafeUtil.c.f(j2) & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void I() {
            long j = this.f + this.i;
            this.f = j;
            int i = (int) (j - this.h);
            int i2 = this.k;
            if (i <= i2) {
                this.i = 0;
                return;
            }
            int i3 = i - i2;
            this.i = i3;
            this.f = j - i3;
        }

        public final void J(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                long j = this.f;
                long j2 = this.g;
                if (i <= ((int) (j - j2))) {
                    this.g = j2 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.j != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int d() {
            return (int) (this.g - this.h);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean e() {
            return this.g == this.f;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void h(int i) {
            this.k = i;
            I();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int i(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iD = i + d();
            int i2 = this.k;
            if (iD > i2) {
                throw InvalidProtocolBufferException.h();
            }
            this.k = iD;
            I();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean j() {
            return G() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ByteString k() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j = this.f;
                long j2 = this.g;
                if (iF <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iF];
                    long j3 = iF;
                    UnsafeUtil.c.c(j2, bArr, 0L, j3);
                    this.g += j3;
                    ByteString byteString = ByteString.e;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iF == 0) {
                return ByteString.e;
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double l() {
            return Double.longBitsToDouble(E());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int m() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int n() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long o() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float p() {
            return Float.intBitsToFloat(D());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int q() {
            return F();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long r() {
            return G();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int s() {
            return D();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long t() {
            return E();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int u() {
            return CodedInputStream.b(F());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long v() {
            return CodedInputStream.c(G());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String w() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j = this.f;
                long j2 = this.g;
                if (iF <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iF];
                    long j3 = iF;
                    UnsafeUtil.c.c(j2, bArr, 0L, j3);
                    String str = new String(bArr, Internal.f16059a);
                    this.g += j3;
                    return str;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String x() throws InvalidProtocolBufferException {
            int iF = F();
            if (iF > 0) {
                long j = this.f;
                long j2 = this.g;
                if (iF <= ((int) (j - j2))) {
                    String strC = Utf8.c(this.d, (int) (j2 - this.e), iF);
                    this.g += iF;
                    return strC;
                }
            }
            if (iF == 0) {
                return "";
            }
            if (iF <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.h();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int y() throws InvalidProtocolBufferException {
            if (e()) {
                this.j = 0;
                return 0;
            }
            int iF = F();
            this.j = iF;
            if ((iF >>> 3) != 0) {
                return iF;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int z() {
            return F();
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream f(InputStream inputStream) {
        return new StreamDecoder(inputStream);
    }

    public static CodedInputStream g(byte[] bArr, int i, int i2, boolean z) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i, i2, z);
        try {
            arrayDecoder.i(i2);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract long A();

    public abstract boolean B(int i);

    public final void C() throws InvalidProtocolBufferException {
        int iY;
        do {
            iY = y();
            if (iY == 0) {
                return;
            }
            int i = this.f16023a;
            if (i >= this.b) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f16023a = i + 1;
            this.f16023a--;
        } while (B(iY));
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void h(int i);

    public abstract int i(int i);

    public abstract boolean j();

    public abstract ByteString k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();
}
