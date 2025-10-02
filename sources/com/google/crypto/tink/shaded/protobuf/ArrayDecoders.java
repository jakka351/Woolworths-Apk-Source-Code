package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.WireFormat;

/* loaded from: classes.dex */
final class ArrayDecoders {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ArrayDecoders$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15077a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15077a = iArr;
            try {
                iArr[WireFormat.FieldType.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15077a[WireFormat.FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15077a[WireFormat.FieldType.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15077a[WireFormat.FieldType.i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15077a[WireFormat.FieldType.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15077a[WireFormat.FieldType.r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15077a[WireFormat.FieldType.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15077a[WireFormat.FieldType.u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15077a[WireFormat.FieldType.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15077a[WireFormat.FieldType.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15077a[WireFormat.FieldType.m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15077a[WireFormat.FieldType.v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15077a[WireFormat.FieldType.w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15077a[WireFormat.FieldType.s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15077a[WireFormat.FieldType.q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15077a[WireFormat.FieldType.n.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15077a[WireFormat.FieldType.o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15077a[WireFormat.FieldType.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class Registers {

        /* renamed from: a, reason: collision with root package name */
        public int f15078a;
        public long b;
        public Object c;
        public final ExtensionRegistryLite d;

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.d = extensionRegistryLite;
        }
    }

    public static int a(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 > bArr.length - iS) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 == 0) {
            registers.c = ByteString.e;
            return iS;
        }
        registers.c = ByteString.i(iS, i2, bArr);
        return iS + i2;
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int d(Schema schema, byte[] bArr, int i, int i2, int i3, Registers registers) {
        MessageSchema messageSchema = (MessageSchema) schema;
        Object objNewInstance = messageSchema.newInstance();
        int iE = messageSchema.E(objNewInstance, bArr, i, i2, i3, registers);
        messageSchema.c(objNewInstance);
        registers.c = objNewInstance;
        return iE;
    }

    public static int e(Schema schema, byte[] bArr, int i, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iR = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iR = r(i3, bArr, iR, registers);
            i3 = registers.f15078a;
        }
        int i4 = iR;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.i();
        }
        Object objNewInstance = schema.newInstance();
        int i5 = i4 + i3;
        schema.a(objNewInstance, bArr, i4, i5, registers);
        schema.c(objNewInstance);
        registers.c = objNewInstance;
        return i5;
    }

    public static int f(Schema schema, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iE = e(schema, bArr, i2, i3, registers);
        protobufList.add(registers.c);
        while (iE < i3) {
            int iS = s(bArr, iE, registers);
            if (i != registers.f15078a) {
                break;
            }
            iE = e(schema, bArr, iS, i3, registers);
            protobufList.add(registers.c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            iS = u(bArr, iS, registers);
            booleanArrayList.d(registers.b != 0);
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int h(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            doubleArrayList.d(Double.longBitsToDouble(c(iS, bArr)));
            iS += 8;
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int i(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            intArrayList.W1(b(iS, bArr));
            iS += 4;
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int j(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            longArrayList.d(c(iS, bArr));
            iS += 8;
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int k(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            floatArrayList.d(Float.intBitsToFloat(b(iS, bArr)));
            iS += 4;
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int l(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            iS = s(bArr, iS, registers);
            intArrayList.W1(CodedInputStream.b(registers.f15078a));
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int m(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            iS = u(bArr, iS, registers);
            longArrayList.d(CodedInputStream.c(registers.b));
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int n(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a + iS;
        while (iS < i2) {
            iS = s(bArr, iS, registers);
            intArrayList.W1(registers.f15078a);
        }
        if (iS == i2) {
            return iS;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int o(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            registers.c = "";
            return iS;
        }
        registers.c = new String(bArr, iS, i2, Internal.f15103a);
        return iS + i2;
    }

    public static int p(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iS = s(bArr, i, registers);
        int i2 = registers.f15078a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            registers.c = "";
            return iS;
        }
        registers.c = Utf8.f15122a.a(iS, i2, bArr);
        return iS + i2;
    }

    public static int q(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iU = u(bArr, i2, registers);
            unknownFieldSetLite.d(i, Long.valueOf(registers.b));
            return iU;
        }
        if (i4 == 1) {
            unknownFieldSetLite.d(i, Long.valueOf(c(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iS = s(bArr, i2, registers);
            int i5 = registers.f15078a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 > bArr.length - iS) {
                throw InvalidProtocolBufferException.i();
            }
            if (i5 == 0) {
                unknownFieldSetLite.d(i, ByteString.e);
            } else {
                unknownFieldSetLite.d(i, ByteString.i(iS, i5, bArr));
            }
            return iS + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            unknownFieldSetLite.d(i, Integer.valueOf(b(i2, bArr)));
            return i2 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iS2 = s(bArr, i2, registers);
            i7 = registers.f15078a;
            if (i7 == i6) {
                i2 = iS2;
                break;
            }
            i2 = q(i7, bArr, iS2, i3, unknownFieldSetLite2, registers);
        }
        if (i2 > i3 || i7 != i6) {
            throw InvalidProtocolBufferException.g();
        }
        unknownFieldSetLite.d(i, unknownFieldSetLite2);
        return i2;
    }

    public static int r(int i, byte[] bArr, int i2, Registers registers) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.f15078a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            registers.f15078a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            registers.f15078a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            registers.f15078a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                registers.f15078a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int s(byte[] bArr, int i, Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return r(b, bArr, i2, registers);
        }
        registers.f15078a = b;
        return i2;
    }

    public static int t(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iS = s(bArr, i2, registers);
        intArrayList.W1(registers.f15078a);
        while (iS < i3) {
            int iS2 = s(bArr, iS, registers);
            if (i != registers.f15078a) {
                break;
            }
            iS = s(bArr, iS2, registers);
            intArrayList.W1(registers.f15078a);
        }
        return iS;
    }

    public static int u(byte[] bArr, int i, Registers registers) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            registers.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        registers.b = j2;
        return i3;
    }

    public static int v(int i, byte[] bArr, int i2, int i3, Registers registers) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return u(bArr, i2, registers);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return s(bArr, i2, registers) + registers.f15078a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.b();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = s(bArr, i2, registers);
            i6 = registers.f15078a;
            if (i6 == i5) {
                break;
            }
            i2 = v(i6, bArr, i2, i3, registers);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.g();
        }
        return i2;
    }
}
