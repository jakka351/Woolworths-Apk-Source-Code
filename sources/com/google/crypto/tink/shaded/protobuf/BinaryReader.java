package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
abstract class BinaryReader implements Reader {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.BinaryReader$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15079a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15079a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15079a[WireFormat.FieldType.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15079a[WireFormat.FieldType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15079a[WireFormat.FieldType.s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15079a[WireFormat.FieldType.l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15079a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15079a[WireFormat.FieldType.g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15079a[WireFormat.FieldType.j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15079a[WireFormat.FieldType.h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15079a[WireFormat.FieldType.p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15079a[WireFormat.FieldType.t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15079a[WireFormat.FieldType.u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15079a[WireFormat.FieldType.v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15079a[WireFormat.FieldType.w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15079a[WireFormat.FieldType.n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15079a[WireFormat.FieldType.r.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15079a[WireFormat.FieldType.i.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeHeapReader extends BinaryReader {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f15080a;
        public int b;
        public int c;
        public int d;
        public int e;

        public SafeHeapReader(ByteBuffer byteBuffer) {
            this.f15080a = byteBuffer.array();
            this.b = byteBuffer.position() + byteBuffer.arrayOffset();
            this.c = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void A(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            W(list, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return X();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void C(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof LongArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 1) {
                    do {
                        list.add(Long.valueOf(u()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.b;
                        }
                    } while (X() == this.d);
                    this.b = i;
                    return;
                }
                if (i3 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = X();
                e0(iX);
                int i4 = this.b + iX;
                while (this.b < i4) {
                    list.add(Long.valueOf(T()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.d & 7;
            if (i5 == 1) {
                do {
                    longArrayList.d(u());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.b;
                    }
                } while (X() == this.d);
                this.b = i2;
                return;
            }
            if (i5 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = X();
            e0(iX2);
            int i6 = this.b + iX2;
            while (this.b < i6) {
                longArrayList.d(T());
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void D(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof IntArrayList)) {
                int i3 = this.d & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.b + X();
                    while (this.b < iX) {
                        list.add(Integer.valueOf(X()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(d()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i4 = this.d & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.b + X();
                while (this.b < iX2) {
                    intArrayList.W1(X());
                }
                return;
            }
            do {
                intArrayList.W1(d());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int E() throws InvalidProtocolBufferException {
            c0(5);
            a0(4);
            return S();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long F() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return CodedInputStream.c(Y());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final String G() {
            return V(false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int H() throws InvalidProtocolBufferException {
            c0(5);
            a0(4);
            return S();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final String I() {
            return V(true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final Object J(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(3);
            return R(schema, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final Object K(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(3);
            return R(Protobuf.c.a(cls), extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void L(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i;
            int i2 = this.d;
            if ((i2 & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(U(schema, extensionRegistryLite));
                if (Q()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (X() == i2);
            this.b = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final Object M(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(2);
            return U(schema, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void N(Map map, MapEntryLite.Metadata metadata) throws InvalidProtocolBufferException {
            c0(2);
            int iX = X();
            a0(iX);
            int i = this.c;
            this.c = this.b + iX;
            try {
                metadata.getClass();
                while (true) {
                    int iN = n();
                    if (iN == Integer.MAX_VALUE) {
                        map.put(null, null);
                        return;
                    }
                    if (iN == 1) {
                        throw null;
                    }
                    if (iN == 2) {
                        throw null;
                    }
                    try {
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!q()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                    if (!q()) {
                        throw new InvalidProtocolBufferException("Unable to parse map entry.");
                    }
                }
            } finally {
                this.c = i;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final Object O(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(2);
            return U(Protobuf.c.a(cls), extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void P(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i;
            int i2 = this.d;
            if ((i2 & 7) != 3) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(R(schema, extensionRegistryLite));
                if (Q()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (X() == i2);
            this.b = i;
        }

        public final boolean Q() {
            return this.b == this.c;
        }

        public final Object R(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            int i = this.e;
            this.e = ((this.d >>> 3) << 3) | 4;
            try {
                Object objNewInstance = schema.newInstance();
                schema.g(objNewInstance, this, extensionRegistryLite);
                schema.c(objNewInstance);
                if (this.d == this.e) {
                    return objNewInstance;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.e = i;
            }
        }

        public final int S() {
            int i = this.b;
            this.b = i + 4;
            byte[] bArr = this.f15080a;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long T() {
            this.b = this.b + 8;
            byte[] bArr = this.f15080a;
            return ((bArr[r0 + 7] & 255) << 56) | (bArr[r0] & 255) | ((bArr[r0 + 1] & 255) << 8) | ((bArr[r0 + 2] & 255) << 16) | ((bArr[r0 + 3] & 255) << 24) | ((bArr[r0 + 4] & 255) << 32) | ((bArr[r0 + 5] & 255) << 40) | ((bArr[r0 + 6] & 255) << 48);
        }

        public final Object U(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int iX = X();
            a0(iX);
            int i = this.c;
            int i2 = this.b + iX;
            this.c = i2;
            try {
                Object objNewInstance = schema.newInstance();
                schema.g(objNewInstance, this, extensionRegistryLite);
                schema.c(objNewInstance);
                if (this.b == i2) {
                    return objNewInstance;
                }
                throw InvalidProtocolBufferException.g();
            } finally {
                this.c = i;
            }
        }

        public final String V(boolean z) throws InvalidProtocolBufferException {
            c0(2);
            int iX = X();
            if (iX == 0) {
                return "";
            }
            a0(iX);
            byte[] bArr = this.f15080a;
            if (z) {
                int i = this.b;
                if (!Utf8.f15122a.e(i, i + iX, bArr)) {
                    throw InvalidProtocolBufferException.c();
                }
            }
            String str = new String(bArr, this.b, iX, Internal.f15103a);
            this.b += iX;
            return str;
        }

        public final void W(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i;
            int i2;
            if ((this.d & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            if (!(list instanceof LazyStringList) || z) {
                do {
                    list.add(V(z));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.P0(h());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        public final int X() throws InvalidProtocolBufferException {
            int i;
            int i2 = this.b;
            int i3 = this.c;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.i();
            }
            int i4 = i2 + 1;
            byte[] bArr = this.f15080a;
            byte b = bArr[i2];
            if (b >= 0) {
                this.b = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) Z();
            }
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
                                            if (bArr[i7] < 0) {
                                                throw InvalidProtocolBufferException.e();
                                            }
                                            i5 = i12;
                                            i = i11;
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
            this.b = i5;
            return i;
        }

        public final long Y() throws InvalidProtocolBufferException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.b;
            int i2 = this.c;
            if (i2 == i) {
                throw InvalidProtocolBufferException.i();
            }
            int i3 = i + 1;
            byte[] bArr = this.f15080a;
            byte b = bArr[i];
            if (b >= 0) {
                this.b = i3;
                return b;
            }
            if (i2 - i3 < 9) {
                return Z();
            }
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
                                            if (bArr[i4] < 0) {
                                                throw InvalidProtocolBufferException.e();
                                            }
                                            i4 = i10;
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
            this.b = i4;
            return j;
        }

        public final long Z() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.b;
                if (i2 == this.c) {
                    throw InvalidProtocolBufferException.i();
                }
                this.b = i2 + 1;
                j |= (r3 & 127) << i;
                if ((this.f15080a[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void a(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof LongArrayList)) {
                int i3 = this.d & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.b + X();
                    while (this.b < iX) {
                        list.add(Long.valueOf(CodedInputStream.c(Y())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(F()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i4 = this.d & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.b + X();
                while (this.b < iX2) {
                    longArrayList.d(CodedInputStream.c(Y()));
                }
                return;
            }
            do {
                longArrayList.d(F());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        public final void a0(int i) throws InvalidProtocolBufferException {
            if (i < 0 || i > this.c - this.b) {
                throw InvalidProtocolBufferException.i();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int b() {
            return this.d;
        }

        public final void b0(int i) throws InvalidProtocolBufferException {
            if (this.b != i) {
                throw InvalidProtocolBufferException.i();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long c() throws InvalidProtocolBufferException {
            c0(1);
            a0(8);
            return T();
        }

        public final void c0(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if ((this.d & 7) != i) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int d() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return X();
        }

        public final void d0(int i) throws InvalidProtocolBufferException {
            a0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int e() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return X();
        }

        public final void e0(int i) throws InvalidProtocolBufferException {
            a0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.g();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int f() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return CodedInputStream.b(X());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void g(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof BooleanArrayList)) {
                int i3 = this.d & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.b + X();
                    while (this.b < iX) {
                        list.add(Boolean.valueOf(X() != 0));
                    }
                    b0(iX);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(w()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int i4 = this.d & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.b + X();
                while (this.b < iX2) {
                    booleanArrayList.d(X() != 0);
                }
                b0(iX2);
                return;
            }
            do {
                booleanArrayList.d(w());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final ByteString h() throws InvalidProtocolBufferException {
            c0(2);
            int iX = X();
            if (iX == 0) {
                return ByteString.e;
            }
            a0(iX);
            int i = this.b;
            ByteString byteString = ByteString.e;
            ByteString.BoundedByteString boundedByteString = new ByteString.BoundedByteString(this.f15080a, i, iX);
            this.b += iX;
            return boundedByteString;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void i(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof IntArrayList)) {
                int i3 = this.d & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.b + X();
                    while (this.b < iX) {
                        list.add(Integer.valueOf(CodedInputStream.b(X())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(f()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i4 = this.d & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.b + X();
                while (this.b < iX2) {
                    intArrayList.W1(CodedInputStream.b(X()));
                }
                return;
            }
            do {
                intArrayList.W1(f());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return Y();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void k(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof LongArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 1) {
                    do {
                        list.add(Long.valueOf(c()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.b;
                        }
                    } while (X() == this.d);
                    this.b = i;
                    return;
                }
                if (i3 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = X();
                e0(iX);
                int i4 = this.b + iX;
                while (this.b < i4) {
                    list.add(Long.valueOf(T()));
                }
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i5 = this.d & 7;
            if (i5 == 1) {
                do {
                    longArrayList.d(c());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.b;
                    }
                } while (X() == this.d);
                this.b = i2;
                return;
            }
            if (i5 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = X();
            e0(iX2);
            int i6 = this.b + iX2;
            while (this.b < i6) {
                longArrayList.d(T());
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void l(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof IntArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 0) {
                    do {
                        list.add(Integer.valueOf(B()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.b;
                        }
                    } while (X() == this.d);
                    this.b = i;
                    return;
                }
                if (i3 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = this.b + X();
                while (this.b < iX) {
                    list.add(Integer.valueOf(X()));
                }
                b0(iX);
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i4 = this.d & 7;
            if (i4 == 0) {
                do {
                    intArrayList.W1(B());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.b;
                    }
                } while (X() == this.d);
                this.b = i2;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = this.b + X();
            while (this.b < iX2) {
                intArrayList.W1(X());
            }
            b0(iX2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void m(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof IntArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 2) {
                    int iX = X();
                    d0(iX);
                    int i4 = this.b + iX;
                    while (this.b < i4) {
                        list.add(Integer.valueOf(S()));
                    }
                    return;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(E()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.d & 7;
            if (i5 == 2) {
                int iX2 = X();
                d0(iX2);
                int i6 = this.b + iX2;
                while (this.b < i6) {
                    intArrayList.W1(S());
                }
                return;
            }
            if (i5 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                intArrayList.W1(E());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int n() throws InvalidProtocolBufferException {
            if (Q()) {
                return Integer.MAX_VALUE;
            }
            int iX = X();
            this.d = iX;
            if (iX == this.e) {
                return Integer.MAX_VALUE;
            }
            return iX >>> 3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void o(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            W(list, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void p(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof FloatArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 2) {
                    int iX = X();
                    d0(iX);
                    int i4 = this.b + iX;
                    while (this.b < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(S())));
                    }
                    return;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int i5 = this.d & 7;
            if (i5 == 2) {
                int iX2 = X();
                d0(iX2);
                int i6 = this.b + iX2;
                while (this.b < i6) {
                    floatArrayList.d(Float.intBitsToFloat(S()));
                }
                return;
            }
            if (i5 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                floatArrayList.d(readFloat());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final boolean q() throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (Q() || (i = this.d) == (i2 = this.e)) {
                return false;
            }
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 == 1) {
                    a0(8);
                    this.b += 8;
                    return true;
                }
                if (i3 == 2) {
                    int iX = X();
                    a0(iX);
                    this.b += iX;
                    return true;
                }
                if (i3 != 3) {
                    if (i3 != 5) {
                        throw InvalidProtocolBufferException.d();
                    }
                    a0(4);
                    this.b += 4;
                    return true;
                }
                this.e = ((i >>> 3) << 3) | 4;
                while (n() != Integer.MAX_VALUE && q()) {
                }
                if (this.d != this.e) {
                    throw InvalidProtocolBufferException.g();
                }
                this.e = i2;
                return true;
            }
            int i4 = this.c;
            int i5 = this.b;
            int i6 = i4 - i5;
            byte[] bArr = this.f15080a;
            if (i6 >= 10) {
                int i7 = 0;
                while (i7 < 10) {
                    int i8 = i5 + 1;
                    if (bArr[i5] >= 0) {
                        this.b = i8;
                        return true;
                    }
                    i7++;
                    i5 = i8;
                }
            }
            for (int i9 = 0; i9 < 10; i9++) {
                int i10 = this.b;
                if (i10 == this.c) {
                    throw InvalidProtocolBufferException.i();
                }
                this.b = i10 + 1;
                if (bArr[i10] >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.e();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void r(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            int i;
            if ((this.d & 7) != 2) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(h());
                if (Q()) {
                    return;
                } else {
                    i = this.b;
                }
            } while (X() == this.d);
            this.b = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final double readDouble() throws InvalidProtocolBufferException {
            c0(1);
            a0(8);
            return Double.longBitsToDouble(T());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final float readFloat() throws InvalidProtocolBufferException {
            c0(5);
            a0(4);
            return Float.intBitsToFloat(S());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void s(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof DoubleArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.b;
                        }
                    } while (X() == this.d);
                    this.b = i;
                    return;
                }
                if (i3 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = X();
                e0(iX);
                int i4 = this.b + iX;
                while (this.b < i4) {
                    list.add(Double.valueOf(Double.longBitsToDouble(T())));
                }
                return;
            }
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int i5 = this.d & 7;
            if (i5 == 1) {
                do {
                    doubleArrayList.d(readDouble());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.b;
                    }
                } while (X() == this.d);
                this.b = i2;
                return;
            }
            if (i5 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = X();
            e0(iX2);
            int i6 = this.b + iX2;
            while (this.b < i6) {
                doubleArrayList.d(Double.longBitsToDouble(T()));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return Y();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long u() throws InvalidProtocolBufferException {
            c0(1);
            a0(8);
            return T();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void v(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof IntArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 2) {
                    int iX = X();
                    d0(iX);
                    int i4 = this.b + iX;
                    while (this.b < i4) {
                        list.add(Integer.valueOf(S()));
                    }
                    return;
                }
                if (i3 != 5) {
                    throw InvalidProtocolBufferException.d();
                }
                do {
                    list.add(Integer.valueOf(H()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i5 = this.d & 7;
            if (i5 == 2) {
                int iX2 = X();
                d0(iX2);
                int i6 = this.b + iX2;
                while (this.b < i6) {
                    intArrayList.W1(S());
                }
                return;
            }
            if (i5 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                intArrayList.W1(H());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final boolean w() throws InvalidProtocolBufferException.InvalidWireTypeException {
            c0(0);
            return X() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void x(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof LongArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 0) {
                    do {
                        list.add(Long.valueOf(j()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.b;
                        }
                    } while (X() == this.d);
                    this.b = i;
                    return;
                }
                if (i3 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = this.b + X();
                while (this.b < iX) {
                    list.add(Long.valueOf(Y()));
                }
                b0(iX);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i4 = this.d & 7;
            if (i4 == 0) {
                do {
                    longArrayList.d(j());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.b;
                    }
                } while (X() == this.d);
                this.b = i2;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = this.b + X();
            while (this.b < iX2) {
                longArrayList.d(Y());
            }
            b0(iX2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void y(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof LongArrayList)) {
                int i3 = this.d & 7;
                if (i3 == 0) {
                    do {
                        list.add(Long.valueOf(t()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.b;
                        }
                    } while (X() == this.d);
                    this.b = i;
                    return;
                }
                if (i3 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX = this.b + X();
                while (this.b < iX) {
                    list.add(Long.valueOf(Y()));
                }
                b0(iX);
                return;
            }
            LongArrayList longArrayList = (LongArrayList) list;
            int i4 = this.d & 7;
            if (i4 == 0) {
                do {
                    longArrayList.d(t());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.b;
                    }
                } while (X() == this.d);
                this.b = i2;
                return;
            }
            if (i4 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iX2 = this.b + X();
            while (this.b < iX2) {
                longArrayList.d(Y());
            }
            b0(iX2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void z(List list) throws InvalidProtocolBufferException {
            int i;
            int i2;
            if (!(list instanceof IntArrayList)) {
                int i3 = this.d & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw InvalidProtocolBufferException.d();
                    }
                    int iX = this.b + X();
                    while (this.b < iX) {
                        list.add(Integer.valueOf(X()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(e()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.b;
                    }
                } while (X() == this.d);
                this.b = i;
                return;
            }
            IntArrayList intArrayList = (IntArrayList) list;
            int i4 = this.d & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw InvalidProtocolBufferException.d();
                }
                int iX2 = this.b + X();
                while (this.b < iX2) {
                    intArrayList.W1(X());
                }
                return;
            }
            do {
                intArrayList.W1(e());
                if (Q()) {
                    return;
                } else {
                    i2 = this.b;
                }
            } while (X() == this.d);
            this.b = i2;
        }
    }
}
