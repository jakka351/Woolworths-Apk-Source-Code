package com.google.crypto.tink.shaded.protobuf;

import YU.a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.UnsafeUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class CodedInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f15084a;
    public CodedInputStreamReader b;

    public static final class ArrayDecoder extends CodedInputStream {
        public final byte[] c;
        public int d;
        public int e;
        public int f;
        public final int g;
        public int h;
        public int i = Integer.MAX_VALUE;

        public ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            this.c = bArr;
            this.d = i2 + i;
            this.f = i;
            this.g = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long A() {
            return CodedInputStream.c(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String B() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                int i = this.d;
                int i2 = this.f;
                if (iW <= i - i2) {
                    String str = new String(this.c, i2, iW, Internal.f15103a);
                    this.f += iW;
                    return str;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String C() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                int i = this.d;
                int i2 = this.f;
                if (iW <= i - i2) {
                    String strA = Utf8.f15122a.a(i2, iW, this.c);
                    this.f += iW;
                    return strA;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int D() throws InvalidProtocolBufferException {
            if (f()) {
                this.h = 0;
                return 0;
            }
            int iW = w();
            this.h = iW;
            if ((iW >>> 3) != 0) {
                return iW;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int E() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long F() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean G(int i) throws InvalidProtocolBufferException {
            int iD;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.d - this.f;
                byte[] bArr = this.c;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.f;
                        this.f = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i3 < 10) {
                    int i6 = this.f;
                    if (i6 == this.d) {
                        throw InvalidProtocolBufferException.i();
                    }
                    this.f = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i2 == 1) {
                M(8);
                return true;
            }
            if (i2 == 2) {
                M(w());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                M(4);
                return true;
            }
            do {
                iD = D();
                if (iD == 0) {
                    break;
                }
            } while (G(iD));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final int H() throws InvalidProtocolBufferException {
            int i = this.f;
            if (this.d - i < 4) {
                throw InvalidProtocolBufferException.i();
            }
            this.f = i + 4;
            byte[] bArr = this.c;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long I() throws InvalidProtocolBufferException {
            int i = this.f;
            if (this.d - i < 8) {
                throw InvalidProtocolBufferException.i();
            }
            this.f = i + 8;
            byte[] bArr = this.c;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final long J() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.f;
            int i2 = this.d;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.c;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f = i3;
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
                    this.f = i4;
                    return j;
                }
            }
            return K();
        }

        public final long K() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.f;
                if (i2 == this.d) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f = i2 + 1;
                j |= (r3 & 127) << i;
                if ((this.c[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void L() {
            int i = this.d + this.e;
            this.d = i;
            int i2 = i - this.g;
            int i3 = this.i;
            if (i2 <= i3) {
                this.e = 0;
                return;
            }
            int i4 = i2 - i3;
            this.e = i4;
            this.d = i - i4;
        }

        public final void M(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.d;
                int i3 = this.f;
                if (i <= i2 - i3) {
                    this.f = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.h != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int d() {
            int i = this.i;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int e() {
            return this.f - this.g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean f() {
            return this.f == this.d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void j(int i) {
            this.i = i;
            L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int k(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iE = i + e();
            int i2 = this.i;
            if (iE > i2) {
                throw InvalidProtocolBufferException.i();
            }
            this.i = iE;
            L();
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean l() {
            return J() != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.crypto.tink.shaded.protobuf.ByteString m() throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            /*
                r4 = this;
                int r0 = r4.w()
                byte[] r1 = r4.c
                if (r0 <= 0) goto L19
                int r2 = r4.d
                int r3 = r4.f
                int r2 = r2 - r3
                if (r0 > r2) goto L19
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.i(r3, r0, r1)
                int r2 = r4.f
                int r2 = r2 + r0
                r4.f = r2
                return r1
            L19:
                if (r0 != 0) goto L1e
                com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.e
                return r0
            L1e:
                if (r0 <= 0) goto L2f
                int r2 = r4.d
                int r3 = r4.f
                int r2 = r2 - r3
                if (r0 > r2) goto L2f
                int r0 = r0 + r3
                r4.f = r0
                byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
                goto L35
            L2f:
                if (r0 > 0) goto L42
                if (r0 != 0) goto L3d
                byte[] r0 = com.google.crypto.tink.shaded.protobuf.Internal.b
            L35:
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = com.google.crypto.tink.shaded.protobuf.ByteString.e
                com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString r1 = new com.google.crypto.tink.shaded.protobuf.ByteString$LiteralByteString
                r1.<init>(r0)
                return r1
            L3d:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
                throw r0
            L42:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.CodedInputStream.ArrayDecoder.m():com.google.crypto.tink.shaded.protobuf.ByteString");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final double n() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int o() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int p() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long q() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final float r() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void s(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int i2 = this.f15084a;
            if (i2 >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            this.f15084a = i2 + 1;
            builder.Y1(this, extensionRegistryLite);
            a((i << 3) | 4);
            this.f15084a--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int t() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long u() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int iW = w();
            if (this.f15084a >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            int iK = k(iW);
            this.f15084a++;
            builder.Y1(this, extensionRegistryLite);
            a(0);
            this.f15084a--;
            j(iK);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int w() {
            int i;
            int i2 = this.f;
            int i3 = this.d;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.c;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f = i4;
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
                    this.f = i5;
                    return i;
                }
            }
            return (int) K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int x() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long y() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int z() {
            return CodedInputStream.b(w());
        }
    }

    /* loaded from: classes6.dex */
    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        public int c;
        public int d;
        public int e;
        public int f;
        public long g;

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long A() {
            return CodedInputStream.c(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String B() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                long j = iW;
                long j2 = this.g;
                if (j <= 0 - j2) {
                    byte[] bArr = new byte[iW];
                    UnsafeUtil.d.c(j2, bArr, 0L, j);
                    String str = new String(bArr, Internal.f15103a);
                    this.g += j;
                    return str;
                }
            }
            if (iW > 0 && iW <= ((int) (this.c - this.g))) {
                byte[] bArr2 = new byte[iW];
                J(iW, bArr2);
                return new String(bArr2, Internal.f15103a);
            }
            if (iW == 0) {
                return "";
            }
            if (iW < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String C() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                long j = iW;
                long j2 = this.g;
                if (j <= 0 - j2) {
                    String strC = Utf8.c(null, (int) j2, iW);
                    this.g += j;
                    return strC;
                }
            }
            if (iW >= 0 && iW <= ((int) (this.c - this.g))) {
                byte[] bArr = new byte[iW];
                J(iW, bArr);
                return Utf8.f15122a.a(0, iW, bArr);
            }
            if (iW == 0) {
                return "";
            }
            if (iW <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int D() throws InvalidProtocolBufferException {
            if (f()) {
                this.f = 0;
                return 0;
            }
            int iW = w();
            this.f = iW;
            if ((iW >>> 3) != 0) {
                return iW;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int E() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long F() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean G(int i) throws InvalidProtocolBufferException {
            int iD;
            int i2 = i & 7;
            if (i2 == 0) {
                for (int i3 = 0; i3 < 10; i3++) {
                    if (I() >= 0) {
                        return true;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(w());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                O(4);
                return true;
            }
            do {
                iD = D();
                if (iD == 0) {
                    break;
                }
            } while (G(iD));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final long H() {
            return 0 - this.g;
        }

        public final byte I() {
            if (H() == 0) {
                throw null;
            }
            long j = this.g;
            this.g = 1 + j;
            return UnsafeUtil.d.f(j);
        }

        public final void J(int i, byte[] bArr) throws InvalidProtocolBufferException {
            if (i < 0 || i > ((int) (this.c - this.g))) {
                if (i > 0) {
                    throw InvalidProtocolBufferException.i();
                }
                if (i != 0) {
                    throw InvalidProtocolBufferException.f();
                }
                return;
            }
            int i2 = i;
            while (i2 > 0) {
                if (H() == 0) {
                    throw null;
                }
                int iMin = Math.min(i2, (int) H());
                long j = iMin;
                UnsafeUtil.d.c(this.g, bArr, i - i2, j);
                i2 -= iMin;
                this.g += j;
            }
        }

        public final int K() {
            if (H() < 4) {
                return (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16) | ((I() & 255) << 24);
            }
            long j = this.g;
            this.g = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return ((memoryAccessor.f(j + 3) & 255) << 24) | (memoryAccessor.f(j) & 255) | ((memoryAccessor.f(1 + j) & 255) << 8) | ((memoryAccessor.f(2 + j) & 255) << 16);
        }

        public final long L() {
            if (H() < 8) {
                return (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16) | ((I() & 255) << 24) | ((I() & 255) << 32) | ((I() & 255) << 40) | ((I() & 255) << 48) | ((I() & 255) << 56);
            }
            this.g = 8 + this.g;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return (memoryAccessor.f(r13) & 255) | ((memoryAccessor.f(r13 + 1) & 255) << 8) | ((memoryAccessor.f(r13 + 2) & 255) << 16) | ((memoryAccessor.f(3 + r13) & 255) << 24) | ((memoryAccessor.f(4 + r13) & 255) << 32) | ((memoryAccessor.f(5 + r13) & 255) << 40) | ((memoryAccessor.f(6 + r13) & 255) << 48) | ((memoryAccessor.f(r13 + 7) & 255) << 56);
        }

        public final long M() {
            long j;
            long j2;
            long j3 = this.g;
            if (0 != j3) {
                long j4 = j3 + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte bF = memoryAccessor.f(j3);
                if (bF >= 0) {
                    this.g++;
                    return bF;
                }
                if (0 - this.g >= 10) {
                    long j5 = 2 + j3;
                    int iF = (memoryAccessor.f(j4) << 7) ^ bF;
                    if (iF < 0) {
                        j = iF ^ (-128);
                    } else {
                        long j6 = 3 + j3;
                        int iF2 = (memoryAccessor.f(j5) << 14) ^ iF;
                        if (iF2 >= 0) {
                            j = iF2 ^ 16256;
                            j5 = j6;
                        } else {
                            long j7 = 4 + j3;
                            int iF3 = iF2 ^ (memoryAccessor.f(j6) << 21);
                            if (iF3 < 0) {
                                j = (-2080896) ^ iF3;
                                j5 = j7;
                            } else {
                                long j8 = j3 + 5;
                                long jF = (memoryAccessor.f(j7) << 28) ^ iF3;
                                if (jF >= 0) {
                                    j = 266354560 ^ jF;
                                    j5 = j8;
                                } else {
                                    long j9 = 6 + j3;
                                    long jF2 = (memoryAccessor.f(j8) << 35) ^ jF;
                                    if (jF2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j5 = 7 + j3;
                                        long jF3 = jF2 ^ (memoryAccessor.f(j9) << 42);
                                        if (jF3 >= 0) {
                                            j = 4363953127296L ^ jF3;
                                        } else {
                                            j9 = 8 + j3;
                                            jF2 = jF3 ^ (memoryAccessor.f(j5) << 49);
                                            if (jF2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j5 = 9 + j3;
                                                long jF4 = (jF2 ^ (memoryAccessor.f(j9) << 56)) ^ 71499008037633920L;
                                                if (jF4 < 0) {
                                                    long j10 = j3 + 10;
                                                    if (memoryAccessor.f(j5) >= 0) {
                                                        j5 = j10;
                                                    }
                                                }
                                                j = jF4;
                                            }
                                        }
                                    }
                                    j = j2 ^ jF2;
                                    j5 = j9;
                                }
                            }
                        }
                    }
                    this.g = j5;
                    return j;
                }
            }
            return N();
        }

        public final long N() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & 127) << i;
                if ((I() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void O(int i) throws InvalidProtocolBufferException {
            if (i < 0 || i > this.c - this.g) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.i();
                }
                throw InvalidProtocolBufferException.f();
            }
            while (i > 0) {
                if (H() == 0) {
                    throw null;
                }
                int iMin = Math.min(i, (int) H());
                i -= iMin;
                this.g += iMin;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.f != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int d() {
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int e() {
            return (int) (0 + this.g);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean f() {
            return ((long) 0) + this.g == ((long) this.c);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void j(int i) {
            this.e = i;
            int i2 = this.c + this.d;
            this.c = i2;
            if (i2 <= i) {
                this.d = 0;
                return;
            }
            int i3 = i2 - i;
            this.d = i3;
            this.c = i2 - i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int k(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iE = i + e();
            int i2 = this.e;
            if (iE > i2) {
                throw InvalidProtocolBufferException.i();
            }
            this.e = iE;
            int i3 = this.c + this.d;
            this.c = i3;
            if (i3 <= iE) {
                this.d = 0;
                return i2;
            }
            int i4 = i3 - iE;
            this.d = i4;
            this.c = i3 - i4;
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean l() {
            return M() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final ByteString m() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                long j = iW;
                long j2 = this.g;
                if (j <= 0 - j2) {
                    byte[] bArr = new byte[iW];
                    UnsafeUtil.d.c(j2, bArr, 0L, j);
                    this.g += j;
                    ByteString byteString = ByteString.e;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iW > 0 && iW <= ((int) (this.c - this.g))) {
                byte[] bArr2 = new byte[iW];
                J(iW, bArr2);
                ByteString byteString2 = ByteString.e;
                return new ByteString.LiteralByteString(bArr2);
            }
            if (iW == 0) {
                return ByteString.e;
            }
            if (iW < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final double n() {
            return Double.longBitsToDouble(L());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int o() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int p() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long q() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final float r() {
            return Float.intBitsToFloat(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void s(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int i2 = this.f15084a;
            if (i2 >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            this.f15084a = i2 + 1;
            builder.Y1(this, extensionRegistryLite);
            a((i << 3) | 4);
            this.f15084a--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int t() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long u() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int iW = w();
            if (this.f15084a >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            int iK = k(iW);
            this.f15084a++;
            builder.Y1(this, extensionRegistryLite);
            a(0);
            this.f15084a--;
            j(iK);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int w() {
            int i;
            long j = this.g;
            if (0 != j) {
                long j2 = j + 1;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte bF = memoryAccessor.f(j);
                if (bF >= 0) {
                    this.g++;
                    return bF;
                }
                if (0 - this.g >= 10) {
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
                    this.g = j3;
                    return i;
                }
            }
            return (int) N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int x() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long y() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int z() {
            return CodedInputStream.b(w());
        }
    }

    /* loaded from: classes6.dex */
    public static final class StreamDecoder extends CodedInputStream {
        public final InputStream c;
        public final byte[] d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j = Integer.MAX_VALUE;

        public interface RefillCallback {
        }

        public class SkippedDataSink implements RefillCallback {
        }

        public StreamDecoder(InputStream inputStream) {
            Internal.a(inputStream, "input");
            this.c = inputStream;
            this.d = new byte[4096];
            this.e = 0;
            this.g = 0;
            this.i = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long A() {
            return CodedInputStream.c(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String B() throws InvalidProtocolBufferException {
            int iW = w();
            byte[] bArr = this.d;
            if (iW > 0) {
                int i = this.e;
                int i2 = this.g;
                if (iW <= i - i2) {
                    String str = new String(bArr, i2, iW, Internal.f15103a);
                    this.g += iW;
                    return str;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW > this.e) {
                return new String(H(iW), Internal.f15103a);
            }
            P(iW);
            String str2 = new String(bArr, this.g, iW, Internal.f15103a);
            this.g += iW;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String C() throws IOException {
            int iW = w();
            int i = this.g;
            int i2 = this.e;
            int i3 = i2 - i;
            byte[] bArrH = this.d;
            if (iW <= i3 && iW > 0) {
                this.g = i + iW;
            } else {
                if (iW == 0) {
                    return "";
                }
                i = 0;
                if (iW <= i2) {
                    P(iW);
                    this.g = iW;
                } else {
                    bArrH = H(iW);
                }
            }
            return Utf8.f15122a.a(i, iW, bArrH);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int D() throws InvalidProtocolBufferException {
            if (f()) {
                this.h = 0;
                return 0;
            }
            int iW = w();
            this.h = iW;
            if ((iW >>> 3) != 0) {
                return iW;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int E() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long F() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean G(int i) throws InvalidProtocolBufferException {
            int iD;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
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
                    if (this.g == this.e) {
                        P(1);
                    }
                    int i6 = this.g;
                    this.g = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i2 == 1) {
                Q(8);
                return true;
            }
            if (i2 == 2) {
                Q(w());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                Q(4);
                return true;
            }
            do {
                iD = D();
                if (iD == 0) {
                    break;
                }
            } while (G(iD));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final byte[] H(int i) throws IOException {
            byte[] bArrI = I(i);
            if (bArrI != null) {
                return bArrI;
            }
            int i2 = this.g;
            int i3 = this.e;
            int length = i3 - i2;
            this.i += i3;
            this.g = 0;
            this.e = 0;
            ArrayList arrayListJ = J(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.d, i2, bArr, 0, length);
            Iterator it = arrayListJ.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] I(int i) throws IOException {
            if (i == 0) {
                return Internal.b;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.j;
            if (i4 > i5) {
                Q((i5 - i2) - i3);
                throw InvalidProtocolBufferException.i();
            }
            int i6 = this.e - i3;
            int i7 = i - i6;
            InputStream inputStream = this.c;
            if (i7 >= 4096 && i7 > inputStream.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.d, this.g, bArr, 0, i6);
            this.i += this.e;
            this.g = 0;
            this.e = 0;
            while (i6 < i) {
                int i8 = inputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.i();
                }
                this.i += i8;
                i6 += i8;
            }
            return bArr;
        }

        public final ArrayList J(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.c.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.i();
                    }
                    this.i += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int K() throws InvalidProtocolBufferException {
            int i = this.g;
            if (this.e - i < 4) {
                P(4);
                i = this.g;
            }
            this.g = i + 4;
            byte[] bArr = this.d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long L() throws InvalidProtocolBufferException {
            int i = this.g;
            if (this.e - i < 8) {
                P(8);
                i = this.g;
            }
            this.g = i + 8;
            byte[] bArr = this.d;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final long M() {
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
            return N();
        }

        public final long N() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.g == this.e) {
                    P(1);
                }
                int i2 = this.g;
                this.g = i2 + 1;
                j |= (r3 & 127) << i;
                if ((this.d[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void O() {
            int i = this.e + this.f;
            this.e = i;
            int i2 = this.i + i;
            int i3 = this.j;
            if (i2 <= i3) {
                this.f = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f = i4;
            this.e = i - i4;
        }

        public final void P(int i) throws InvalidProtocolBufferException {
            if (R(i)) {
                return;
            }
            if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
                throw InvalidProtocolBufferException.i();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void Q(int i) throws InvalidProtocolBufferException {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3 && i >= 0) {
                this.g = i3 + i;
                return;
            }
            InputStream inputStream = this.c;
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i4 = this.i;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.j;
            if (i6 > i7) {
                Q((i7 - i4) - i3);
                throw InvalidProtocolBufferException.i();
            }
            this.i = i5;
            int i8 = i2 - i3;
            this.e = 0;
            this.g = 0;
            while (i8 < i) {
                long j = i - i8;
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
                } finally {
                    this.i += i8;
                    O();
                }
            }
            if (i8 >= i) {
                return;
            }
            int i9 = this.e;
            int i10 = i9 - this.g;
            this.g = i9;
            P(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.e;
                if (i11 <= i12) {
                    this.g = i11;
                    return;
                } else {
                    i10 += i12;
                    this.g = i12;
                    P(1);
                }
            }
        }

        public final boolean R(int i) throws IOException {
            int i2 = this.g;
            int i3 = i2 + i;
            int i4 = this.e;
            if (i3 <= i4) {
                throw new IllegalStateException(a.e(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i5 = this.i;
            if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
                byte[] bArr = this.d;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.i += i2;
                    this.e -= i2;
                    this.g = 0;
                }
                int i6 = this.e;
                int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.i) - i6);
                InputStream inputStream = this.c;
                int i7 = inputStream.read(bArr, i6, iMin);
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.e += i7;
                    O();
                    if (this.e >= i) {
                        return true;
                    }
                    return R(i);
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.h != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int d() {
            int i = this.j;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.i + this.g);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int e() {
            return this.i + this.g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean f() {
            return this.g == this.e && !R(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void j(int i) {
            this.j = i;
            O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int k(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int i2 = this.i + this.g + i;
            int i3 = this.j;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.i();
            }
            this.j = i2;
            O();
            return i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean l() {
            return M() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final ByteString m() throws IOException {
            int iW = w();
            int i = this.e;
            int i2 = this.g;
            int i3 = i - i2;
            byte[] bArr = this.d;
            if (iW <= i3 && iW > 0) {
                ByteString byteStringI = ByteString.i(i2, iW, bArr);
                this.g += iW;
                return byteStringI;
            }
            if (iW == 0) {
                return ByteString.e;
            }
            byte[] bArrI = I(iW);
            if (bArrI != null) {
                return ByteString.i(0, bArrI.length, bArrI);
            }
            int i4 = this.g;
            int i5 = this.e;
            int length = i5 - i4;
            this.i += i5;
            this.g = 0;
            this.e = 0;
            ArrayList arrayListJ = J(iW - length);
            byte[] bArr2 = new byte[iW];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            Iterator it = arrayListJ.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.e;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final double n() {
            return Double.longBitsToDouble(L());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int o() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int p() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long q() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final float r() {
            return Float.intBitsToFloat(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void s(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int i2 = this.f15084a;
            if (i2 >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            this.f15084a = i2 + 1;
            builder.Y1(this, extensionRegistryLite);
            a((i << 3) | 4);
            this.f15084a--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int t() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long u() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int iW = w();
            if (this.f15084a >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            int iK = k(iW);
            this.f15084a++;
            builder.Y1(this, extensionRegistryLite);
            a(0);
            this.f15084a--;
            j(iK);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int w() {
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
            return (int) N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int x() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long y() {
            return L();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int z() {
            return CodedInputStream.b(w());
        }
    }

    /* loaded from: classes6.dex */
    public static final class UnsafeDirectNioDecoder extends CodedInputStream {
        public final ByteBuffer c;
        public final long d;
        public long e;
        public long f;
        public final long g;
        public int h;
        public int i;
        public int j = Integer.MAX_VALUE;

        public UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z) {
            this.c = byteBuffer;
            long jL = UnsafeUtil.d.l(UnsafeUtil.h, byteBuffer);
            this.d = jL;
            this.e = byteBuffer.limit() + jL;
            long jPosition = jL + byteBuffer.position();
            this.f = jPosition;
            this.g = jPosition;
        }

        public static boolean H() {
            return UnsafeUtil.e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long A() {
            return CodedInputStream.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String B() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                long j = this.e;
                long j2 = this.f;
                if (iW <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iW];
                    long j3 = iW;
                    UnsafeUtil.d.c(j2, bArr, 0L, j3);
                    String str = new String(bArr, Internal.f15103a);
                    this.f += j3;
                    return str;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final String C() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                long j = this.e;
                long j2 = this.f;
                if (iW <= ((int) (j - j2))) {
                    String strC = Utf8.c(this.c, (int) (j2 - this.d), iW);
                    this.f += iW;
                    return strC;
                }
            }
            if (iW == 0) {
                return "";
            }
            if (iW <= 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int D() throws InvalidProtocolBufferException {
            if (f()) {
                this.i = 0;
                return 0;
            }
            int iW = w();
            this.i = iW;
            if ((iW >>> 3) != 0) {
                return iW;
            }
            throw InvalidProtocolBufferException.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int E() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long F() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean G(int i) throws InvalidProtocolBufferException {
            int iD;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                if (((int) (this.e - this.f)) >= 10) {
                    while (i3 < 10) {
                        long j = this.f;
                        this.f = j + 1;
                        if (UnsafeUtil.d.f(j) < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.e();
                }
                while (i3 < 10) {
                    long j2 = this.f;
                    if (j2 == this.e) {
                        throw InvalidProtocolBufferException.i();
                    }
                    this.f = j2 + 1;
                    if (UnsafeUtil.d.f(j2) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.e();
                return true;
            }
            if (i2 == 1) {
                N(8);
                return true;
            }
            if (i2 == 2) {
                N(w());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                N(4);
                return true;
            }
            do {
                iD = D();
                if (iD == 0) {
                    break;
                }
            } while (G(iD));
            a(((i >>> 3) << 3) | 4);
            return true;
        }

        public final int I() throws InvalidProtocolBufferException {
            long j = this.f;
            if (this.e - j < 4) {
                throw InvalidProtocolBufferException.i();
            }
            this.f = 4 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return ((memoryAccessor.f(j + 3) & 255) << 24) | (memoryAccessor.f(j) & 255) | ((memoryAccessor.f(1 + j) & 255) << 8) | ((memoryAccessor.f(2 + j) & 255) << 16);
        }

        public final long J() throws InvalidProtocolBufferException {
            long j = this.f;
            if (this.e - j < 8) {
                throw InvalidProtocolBufferException.i();
            }
            this.f = 8 + j;
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            return ((memoryAccessor.f(j + 7) & 255) << 56) | (memoryAccessor.f(j) & 255) | ((memoryAccessor.f(1 + j) & 255) << 8) | ((memoryAccessor.f(2 + j) & 255) << 16) | ((memoryAccessor.f(3 + j) & 255) << 24) | ((memoryAccessor.f(4 + j) & 255) << 32) | ((memoryAccessor.f(5 + j) & 255) << 40) | ((memoryAccessor.f(6 + j) & 255) << 48);
        }

        public final long K() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f;
            if (this.e != j4) {
                long j5 = 1 + j4;
                UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
                byte bF = memoryAccessor.f(j4);
                if (bF >= 0) {
                    this.f = j5;
                    return bF;
                }
                if (this.e - j5 >= 9) {
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
                                                this.f = j6;
                                                return j;
                                            }
                                            j2 = -558586000294016L;
                                        }
                                    }
                                    j = j2 ^ jF2;
                                    j6 = j8;
                                    this.f = j6;
                                    return j;
                                }
                                j3 = 266354560;
                                j = j3 ^ jF;
                            }
                        }
                        j6 = j7;
                        this.f = j6;
                        return j;
                    }
                    i = iF ^ (-128);
                    j = i;
                    this.f = j6;
                    return j;
                }
            }
            return L();
        }

        public final long L() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                long j2 = this.f;
                if (j2 == this.e) {
                    throw InvalidProtocolBufferException.i();
                }
                this.f = 1 + j2;
                j |= (r3 & 127) << i;
                if ((UnsafeUtil.d.f(j2) & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        public final void M() {
            long j = this.e + this.h;
            this.e = j;
            int i = (int) (j - this.g);
            int i2 = this.j;
            if (i <= i2) {
                this.h = 0;
                return;
            }
            int i3 = i - i2;
            this.h = i3;
            this.e = j - i3;
        }

        public final void N(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                long j = this.e;
                long j2 = this.f;
                if (i <= ((int) (j - j2))) {
                    this.f = j2 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.i != i) {
                throw InvalidProtocolBufferException.a();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int d() {
            int i = this.j;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int e() {
            return (int) (this.f - this.g);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean f() {
            return this.f == this.e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void j(int i) {
            this.j = i;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int k(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.f();
            }
            int iE = i + e();
            int i2 = this.j;
            if (iE > i2) {
                throw InvalidProtocolBufferException.i();
            }
            this.j = iE;
            M();
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final boolean l() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final ByteString m() throws InvalidProtocolBufferException {
            int iW = w();
            if (iW > 0) {
                long j = this.e;
                long j2 = this.f;
                if (iW <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iW];
                    long j3 = iW;
                    UnsafeUtil.d.c(j2, bArr, 0L, j3);
                    this.f += j3;
                    ByteString byteString = ByteString.e;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iW == 0) {
                return ByteString.e;
            }
            if (iW < 0) {
                throw InvalidProtocolBufferException.f();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final double n() {
            return Double.longBitsToDouble(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int o() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int p() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long q() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final float r() {
            return Float.intBitsToFloat(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void s(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int i2 = this.f15084a;
            if (i2 >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            this.f15084a = i2 + 1;
            builder.Y1(this, extensionRegistryLite);
            a((i << 3) | 4);
            this.f15084a--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int t() {
            return w();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final void v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int iW = w();
            if (this.f15084a >= 100) {
                throw InvalidProtocolBufferException.h();
            }
            int iK = k(iW);
            this.f15084a++;
            builder.Y1(this, extensionRegistryLite);
            a(0);
            this.f15084a--;
            j(iK);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        
            if (r4.f(r8) < 0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[PHI: r6
  0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int w() {
            /*
                r12 = this;
                long r0 = r12.f
                long r2 = r12.e
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L93
            La:
                r2 = 1
                long r2 = r2 + r0
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil$MemoryAccessor r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.d
                byte r5 = r4.f(r0)
                if (r5 < 0) goto L18
                r12.f = r2
                return r5
            L18:
                long r6 = r12.e
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
                long r0 = r12.L()
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
                r12.f = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.CodedInputStream.UnsafeDirectNioDecoder.w():int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int x() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final long y() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public final int z() {
            return CodedInputStream.b(w());
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream g(InputStream inputStream) {
        if (inputStream != null) {
            return new StreamDecoder(inputStream);
        }
        byte[] bArr = Internal.b;
        return i(bArr, 0, bArr.length, false);
    }

    public static CodedInputStream h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return i(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.H()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return i(bArr, 0, iRemaining, true);
    }

    public static CodedInputStream i(byte[] bArr, int i, int i2, boolean z) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i, i2, z);
        try {
            arrayDecoder.k(i2);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract long A();

    public abstract String B();

    public abstract String C();

    public abstract int D();

    public abstract int E();

    public abstract long F();

    public abstract boolean G(int i);

    public abstract void a(int i);

    public abstract int d();

    public abstract int e();

    public abstract boolean f();

    public abstract void j(int i);

    public abstract int k(int i);

    public abstract boolean l();

    public abstract ByteString m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract void s(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract int t();

    public abstract long u();

    public abstract void v(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract int z();
}
