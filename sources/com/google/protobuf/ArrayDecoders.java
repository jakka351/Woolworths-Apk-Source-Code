package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;

@CheckReturnValue
/* loaded from: classes6.dex */
final class ArrayDecoders {

    /* renamed from: com.google.protobuf.ArrayDecoders$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16015a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f16015a = iArr;
            try {
                iArr[WireFormat.FieldType.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16015a[WireFormat.FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16015a[WireFormat.FieldType.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16015a[WireFormat.FieldType.i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16015a[WireFormat.FieldType.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16015a[WireFormat.FieldType.r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16015a[WireFormat.FieldType.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16015a[WireFormat.FieldType.u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16015a[WireFormat.FieldType.l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16015a[WireFormat.FieldType.t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16015a[WireFormat.FieldType.m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16015a[WireFormat.FieldType.v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16015a[WireFormat.FieldType.w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16015a[WireFormat.FieldType.s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16015a[WireFormat.FieldType.q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16015a[WireFormat.FieldType.n.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16015a[WireFormat.FieldType.o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16015a[WireFormat.FieldType.p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class Registers {

        /* renamed from: a, reason: collision with root package name */
        public int f16016a;
        public long b;
        public Object c;
        public final ExtensionRegistryLite d;
        public int e;

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.d = extensionRegistryLite;
        }
    }

    public static int A(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            registers.c = "";
            return iG;
        }
        registers.c = new String(bArr, iG, i2, Internal.f16059a);
        return iG + i2;
    }

    public static int B(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iG = G(bArr, i2, registers);
        int i4 = registers.f16016a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, iG, i4, Internal.f16059a));
            iG += i4;
        }
        while (iG < i3) {
            int iG2 = G(bArr, iG, registers);
            if (i != registers.f16016a) {
                break;
            }
            iG = G(bArr, iG2, registers);
            int i5 = registers.f16016a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iG, i5, Internal.f16059a));
                iG += i5;
            }
        }
        return iG;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iG = G(bArr, i2, registers);
        int i4 = registers.f16016a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 == 0) {
            protobufList.add("");
        } else {
            int i5 = iG + i4;
            if (!Utf8.f16094a.e(iG, i5, bArr)) {
                throw InvalidProtocolBufferException.c();
            }
            protobufList.add(new String(bArr, iG, i4, Internal.f16059a));
            iG = i5;
        }
        while (iG < i3) {
            int iG2 = G(bArr, iG, registers);
            if (i != registers.f16016a) {
                break;
            }
            iG = G(bArr, iG2, registers);
            int i6 = registers.f16016a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i6 == 0) {
                protobufList.add("");
            } else {
                int i7 = iG + i6;
                if (!Utf8.f16094a.e(iG, i7, bArr)) {
                    throw InvalidProtocolBufferException.c();
                }
                protobufList.add(new String(bArr, iG, i6, Internal.f16059a));
                iG = i7;
            }
        }
        return iG;
    }

    public static int D(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            registers.c = "";
            return iG;
        }
        registers.c = Utf8.f16094a.a(iG, i2, bArr);
        return iG + i2;
    }

    public static int E(int i, byte[] bArr, int i2, int i3, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int I = I(bArr, i2, registers);
            unknownFieldSetLite.d(i, Long.valueOf(registers.b));
            return I;
        }
        if (i4 == 1) {
            unknownFieldSetLite.d(i, Long.valueOf(i(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iG = G(bArr, i2, registers);
            int i5 = registers.f16016a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 > bArr.length - iG) {
                throw InvalidProtocolBufferException.h();
            }
            if (i5 == 0) {
                unknownFieldSetLite.d(i, ByteString.e);
            } else {
                unknownFieldSetLite.d(i, ByteString.j(iG, i5, bArr));
            }
            return iG + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            unknownFieldSetLite.d(i, Integer.valueOf(g(i2, bArr)));
            return i2 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteC = UnknownFieldSetLite.c();
        int i6 = (i & (-8)) | 4;
        int i7 = registers.e + 1;
        registers.e = i7;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iG2 = G(bArr, i2, registers);
            i8 = registers.f16016a;
            if (i8 == i6) {
                i2 = iG2;
                break;
            }
            i2 = E(i8, bArr, iG2, i3, unknownFieldSetLiteC, registers);
        }
        registers.e--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.g();
        }
        unknownFieldSetLite.d(i, unknownFieldSetLiteC);
        return i2;
    }

    public static int F(int i, byte[] bArr, int i2, Registers registers) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            registers.f16016a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            registers.f16016a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            registers.f16016a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            registers.f16016a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                registers.f16016a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int G(byte[] bArr, int i, Registers registers) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return F(b, bArr, i2, registers);
        }
        registers.f16016a = b;
        return i2;
    }

    public static int H(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iG = G(bArr, i2, registers);
        intArrayList.W1(registers.f16016a);
        while (iG < i3) {
            int iG2 = G(bArr, iG, registers);
            if (i != registers.f16016a) {
                break;
            }
            iG = G(bArr, iG2, registers);
            intArrayList.W1(registers.f16016a);
        }
        return iG;
    }

    public static int I(byte[] bArr, int i, Registers registers) {
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

    public static int J(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = I(bArr, i2, registers);
        longArrayList.d(registers.b);
        while (I < i3) {
            int iG = G(bArr, I, registers);
            if (i != registers.f16016a) {
                break;
            }
            I = I(bArr, iG, registers);
            longArrayList.d(registers.b);
        }
        return I;
    }

    public static int K(Object obj, Schema schema, byte[] bArr, int i, int i2, int i3, Registers registers) throws InvalidProtocolBufferException {
        MessageSchema messageSchema = (MessageSchema) schema;
        int i4 = registers.e + 1;
        registers.e = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iG = messageSchema.G(obj, bArr, i, i2, i3, registers);
        registers.e--;
        registers.c = obj;
        return iG;
    }

    public static int L(Object obj, Schema schema, byte[] bArr, int i, int i2, Registers registers) throws InvalidProtocolBufferException {
        int iF = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iF = F(i3, bArr, iF, registers);
            i3 = registers.f16016a;
        }
        int i4 = iF;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.h();
        }
        int i5 = registers.e + 1;
        registers.e = i5;
        if (i5 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        schema.f(obj, bArr, i4, i6, registers);
        registers.e--;
        registers.c = obj;
        return i6;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, Registers registers) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return I(bArr, i2, registers);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return G(bArr, i2, registers) + registers.f16016a;
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
            i2 = G(bArr, i2, registers);
            i6 = registers.f16016a;
            if (i6 == i5) {
                break;
            }
            i2 = M(i6, bArr, i2, i3, registers);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.g();
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int I = I(bArr, i2, registers);
        booleanArrayList.d(registers.b != 0);
        while (I < i3) {
            int iG = G(bArr, I, registers);
            if (i != registers.f16016a) {
                break;
            }
            I = I(bArr, iG, registers);
            booleanArrayList.d(registers.b != 0);
        }
        return I;
    }

    public static int b(byte[] bArr, int i, Registers registers) throws InvalidProtocolBufferException {
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 > bArr.length - iG) {
            throw InvalidProtocolBufferException.h();
        }
        if (i2 == 0) {
            registers.c = ByteString.e;
            return iG;
        }
        registers.c = ByteString.j(iG, i2, bArr);
        return iG + i2;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iG = G(bArr, i2, registers);
        int i4 = registers.f16016a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 > bArr.length - iG) {
            throw InvalidProtocolBufferException.h();
        }
        if (i4 == 0) {
            protobufList.add(ByteString.e);
        } else {
            protobufList.add(ByteString.j(iG, i4, bArr));
            iG += i4;
        }
        while (iG < i3) {
            int iG2 = G(bArr, iG, registers);
            if (i != registers.f16016a) {
                break;
            }
            iG = G(bArr, iG2, registers);
            int i5 = registers.f16016a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 > bArr.length - iG) {
                throw InvalidProtocolBufferException.h();
            }
            if (i5 == 0) {
                protobufList.add(ByteString.e);
            } else {
                protobufList.add(ByteString.j(iG, i5, bArr));
                iG += i5;
            }
        }
        return iG;
    }

    public static double d(int i, byte[] bArr) {
        return Double.longBitsToDouble(i(i, bArr));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.d(d(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iG = G(bArr, i4, registers);
            if (i != registers.f16016a) {
                break;
            }
            doubleArrayList.d(Double.longBitsToDouble(i(iG, bArr)));
            i4 = iG + 8;
        }
        return i4;
    }

    public static int f(int i, byte[] bArr, int i2, int i3, Object obj, MessageLite messageLite, UnknownFieldSchema unknownFieldSchema, Registers registers) throws InvalidProtocolBufferException {
        int I;
        int i4 = i >>> 3;
        GeneratedMessageLite.GeneratedExtension generatedExtensionA = registers.d.a(i4, messageLite);
        if (generatedExtensionA == null) {
            return E(i, bArr, i2, i3, MessageSchema.q(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        if (fieldSet.b) {
            extendableMessage.extensions = fieldSet.clone();
        }
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet2 = extendableMessage.extensions;
        GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = generatedExtensionA.d;
        MessageLite messageLite2 = generatedExtensionA.c;
        boolean z = extensionDescriptor.g;
        WireFormat.FieldType fieldType = extensionDescriptor.f;
        boolean z2 = extensionDescriptor.g;
        if (z && extensionDescriptor.h) {
            switch (fieldType.ordinal()) {
                case 0:
                    DoubleArrayList doubleArrayList = new DoubleArrayList(new double[10], 0, true);
                    int iQ = q(bArr, i2, doubleArrayList, registers);
                    fieldSet2.m(extensionDescriptor, doubleArrayList);
                    return iQ;
                case 1:
                    FloatArrayList floatArrayList = new FloatArrayList(new float[10], 0, true);
                    int iT = t(bArr, i2, floatArrayList, registers);
                    fieldSet2.m(extensionDescriptor, floatArrayList);
                    return iT;
                case 2:
                case 3:
                    LongArrayList longArrayList = new LongArrayList();
                    int iX = x(bArr, i2, longArrayList, registers);
                    fieldSet2.m(extensionDescriptor, longArrayList);
                    return iX;
                case 4:
                case 12:
                    IntArrayList intArrayList = new IntArrayList();
                    int iW = w(bArr, i2, intArrayList, registers);
                    fieldSet2.m(extensionDescriptor, intArrayList);
                    return iW;
                case 5:
                case 15:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iS = s(bArr, i2, longArrayList2, registers);
                    fieldSet2.m(extensionDescriptor, longArrayList2);
                    return iS;
                case 6:
                case 14:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iR = r(bArr, i2, intArrayList2, registers);
                    fieldSet2.m(extensionDescriptor, intArrayList2);
                    return iR;
                case 7:
                    BooleanArrayList booleanArrayList = new BooleanArrayList(new boolean[10], 0, true);
                    int iP = p(bArr, i2, booleanArrayList, registers);
                    fieldSet2.m(extensionDescriptor, booleanArrayList);
                    return iP;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + fieldType);
                case 13:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iW2 = w(bArr, i2, intArrayList3, registers);
                    SchemaUtil.j(extendableMessage, i4, intArrayList3, extensionDescriptor.d, null, unknownFieldSchema);
                    fieldSet2.m(extensionDescriptor, intArrayList3);
                    return iW2;
                case 16:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iU = u(bArr, i2, intArrayList4, registers);
                    fieldSet2.m(extensionDescriptor, intArrayList4);
                    return iU;
                case 17:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iV = v(bArr, i2, longArrayList3, registers);
                    fieldSet2.m(extensionDescriptor, longArrayList3);
                    return iV;
            }
        }
        Object objValueOf = null;
        if (fieldType != WireFormat.FieldType.s) {
            switch (fieldType.ordinal()) {
                case 0:
                    objValueOf = Double.valueOf(d(i2, bArr));
                    I = i2 + 8;
                    break;
                case 1:
                    objValueOf = Float.valueOf(k(i2, bArr));
                    I = i2 + 4;
                    break;
                case 2:
                case 3:
                    I = I(bArr, i2, registers);
                    objValueOf = Long.valueOf(registers.b);
                    break;
                case 4:
                case 12:
                    I = G(bArr, i2, registers);
                    objValueOf = Integer.valueOf(registers.f16016a);
                    break;
                case 5:
                case 15:
                    objValueOf = Long.valueOf(i(i2, bArr));
                    I = i2 + 8;
                    break;
                case 6:
                case 14:
                    objValueOf = Integer.valueOf(g(i2, bArr));
                    I = i2 + 4;
                    break;
                case 7:
                    I = I(bArr, i2, registers);
                    objValueOf = Boolean.valueOf(registers.b != 0);
                    break;
                case 8:
                    I = A(bArr, i2, registers);
                    objValueOf = registers.c;
                    break;
                case 9:
                    int i5 = (i4 << 3) | 4;
                    Schema schemaA = Protobuf.c.a(messageLite2.getClass());
                    if (!z2) {
                        Object objF = fieldSet2.f(extensionDescriptor);
                        if (objF == null) {
                            objF = schemaA.newInstance();
                            fieldSet2.m(extensionDescriptor, objF);
                        }
                        return K(objF, schemaA, bArr, i2, i3, i5, registers);
                    }
                    Object objNewInstance = schemaA.newInstance();
                    int iK = K(objNewInstance, schemaA, bArr, i2, i3, i5, registers);
                    schemaA.c(objNewInstance);
                    registers.c = objNewInstance;
                    fieldSet2.a(extensionDescriptor, objNewInstance);
                    return iK;
                case 10:
                    Schema schemaA2 = Protobuf.c.a(messageLite2.getClass());
                    if (z2) {
                        int iN = n(schemaA2, bArr, i2, i3, registers);
                        fieldSet2.a(extensionDescriptor, registers.c);
                        return iN;
                    }
                    Object objF2 = fieldSet2.f(extensionDescriptor);
                    if (objF2 == null) {
                        objF2 = schemaA2.newInstance();
                        fieldSet2.m(extensionDescriptor, objF2);
                    }
                    return L(objF2, schemaA2, bArr, i2, i3, registers);
                case 11:
                    I = b(bArr, i2, registers);
                    objValueOf = registers.c;
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 16:
                    I = G(bArr, i2, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.b(registers.f16016a));
                    break;
                case 17:
                    I = I(bArr, i2, registers);
                    objValueOf = Long.valueOf(CodedInputStream.c(registers.b));
                    break;
                default:
                    I = i2;
                    break;
            }
        } else {
            int iG = G(bArr, i2, registers);
            if (extensionDescriptor.d.a(registers.f16016a) == null) {
                SchemaUtil.n(extendableMessage, i4, registers.f16016a, null, unknownFieldSchema);
                return iG;
            }
            objValueOf = Integer.valueOf(registers.f16016a);
            I = iG;
        }
        if (z2) {
            fieldSet2.a(extensionDescriptor, objValueOf);
            return I;
        }
        fieldSet2.m(extensionDescriptor, objValueOf);
        return I;
    }

    public static int g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int h(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.W1(g(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iG = G(bArr, i4, registers);
            if (i != registers.f16016a) {
                break;
            }
            intArrayList.W1(g(iG, bArr));
            i4 = iG + 4;
        }
        return i4;
    }

    public static long i(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int j(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.d(i(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iG = G(bArr, i4, registers);
            if (i != registers.f16016a) {
                break;
            }
            longArrayList.d(i(iG, bArr));
            i4 = iG + 8;
        }
        return i4;
    }

    public static float k(int i, byte[] bArr) {
        return Float.intBitsToFloat(g(i, bArr));
    }

    public static int l(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.d(k(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iG = G(bArr, i4, registers);
            if (i != registers.f16016a) {
                break;
            }
            floatArrayList.d(Float.intBitsToFloat(g(iG, bArr)));
            i4 = iG + 4;
        }
        return i4;
    }

    public static int m(Schema schema, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int i4 = (i & (-8)) | 4;
        Object objNewInstance = schema.newInstance();
        int iK = K(objNewInstance, schema, bArr, i2, i3, i4, registers);
        schema.c(objNewInstance);
        registers.c = objNewInstance;
        protobufList.add(objNewInstance);
        while (iK < i3) {
            int iG = G(bArr, iK, registers);
            if (i != registers.f16016a) {
                break;
            }
            Object objNewInstance2 = schema.newInstance();
            iK = K(objNewInstance2, schema, bArr, iG, i3, i4, registers);
            schema.c(objNewInstance2);
            registers.c = objNewInstance2;
            protobufList.add(objNewInstance2);
        }
        return iK;
    }

    public static int n(Schema schema, byte[] bArr, int i, int i2, Registers registers) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        int iL = L(objNewInstance, schema, bArr, i, i2, registers);
        schema.c(objNewInstance);
        registers.c = objNewInstance;
        return iL;
    }

    public static int o(Schema schema, int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iN = n(schema, bArr, i2, i3, registers);
        protobufList.add(registers.c);
        while (iN < i3) {
            int iG = G(bArr, iN, registers);
            if (i != registers.f16016a) {
                break;
            }
            iN = n(schema, bArr, iG, i3, registers);
            protobufList.add(registers.c);
        }
        return iN;
    }

    public static int p(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            iG = I(bArr, iG, registers);
            booleanArrayList.d(registers.b != 0);
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int q(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            doubleArrayList.d(Double.longBitsToDouble(i(iG, bArr)));
            iG += 8;
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int r(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            intArrayList.W1(g(iG, bArr));
            iG += 4;
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int s(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            longArrayList.d(i(iG, bArr));
            iG += 8;
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int t(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            floatArrayList.d(Float.intBitsToFloat(g(iG, bArr)));
            iG += 4;
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int u(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            iG = G(bArr, iG, registers);
            intArrayList.W1(CodedInputStream.b(registers.f16016a));
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int v(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            iG = I(bArr, iG, registers);
            longArrayList.d(CodedInputStream.c(registers.b));
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int w(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            iG = G(bArr, iG, registers);
            intArrayList.W1(registers.f16016a);
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int x(byte[] bArr, int i, Internal.ProtobufList protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iG = G(bArr, i, registers);
        int i2 = registers.f16016a + iG;
        while (iG < i2) {
            iG = I(bArr, iG, registers);
            longArrayList.d(registers.b);
        }
        if (iG == i2) {
            return iG;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int y(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iG = G(bArr, i2, registers);
        intArrayList.W1(CodedInputStream.b(registers.f16016a));
        while (iG < i3) {
            int iG2 = G(bArr, iG, registers);
            if (i != registers.f16016a) {
                break;
            }
            iG = G(bArr, iG2, registers);
            intArrayList.W1(CodedInputStream.b(registers.f16016a));
        }
        return iG;
    }

    public static int z(int i, byte[] bArr, int i2, int i3, Internal.ProtobufList protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int I = I(bArr, i2, registers);
        longArrayList.d(CodedInputStream.c(registers.b));
        while (I < i3) {
            int iG = G(bArr, I, registers);
            if (i != registers.f16016a) {
                break;
            }
            I = I(bArr, iG, registers);
            longArrayList.d(CodedInputStream.c(registers.b));
        }
        return I;
    }
}
