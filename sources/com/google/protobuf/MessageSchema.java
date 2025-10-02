package com.google.protobuf;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes.dex */
final class MessageSchema<T> implements Schema<T> {
    public static final int[] p = new int[0];
    public static final Unsafe q = UnsafeUtil.k();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16070a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final MessageLite e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final NewInstanceSchema k;
    public final ListFieldSchema l;
    public final UnknownFieldSchema m;
    public final ExtensionSchema n;
    public final MapFieldSchema o;

    /* renamed from: com.google.protobuf.MessageSchema$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16071a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f16071a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16071a[WireFormat.FieldType.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16071a[WireFormat.FieldType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16071a[WireFormat.FieldType.l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16071a[WireFormat.FieldType.t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16071a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16071a[WireFormat.FieldType.u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16071a[WireFormat.FieldType.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16071a[WireFormat.FieldType.s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16071a[WireFormat.FieldType.j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16071a[WireFormat.FieldType.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16071a[WireFormat.FieldType.h.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16071a[WireFormat.FieldType.i.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16071a[WireFormat.FieldType.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16071a[WireFormat.FieldType.v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16071a[WireFormat.FieldType.w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16071a[WireFormat.FieldType.n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f16070a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = messageLite instanceof GeneratedMessageLite;
        this.f = extensionSchema != null && extensionSchema.e(messageLite);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = newInstanceSchema;
        this.l = listFieldSchema;
        this.m = unknownFieldSchema;
        this.n = extensionSchema;
        this.e = messageLite;
        this.o = mapFieldSchema;
    }

    public static MessageSchema A(MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return B((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.protobuf.MessageSchema B(com.google.protobuf.RawMessageInfo r36, com.google.protobuf.NewInstanceSchema r37, com.google.protobuf.ListFieldSchema r38, com.google.protobuf.UnknownFieldSchema r39, com.google.protobuf.ExtensionSchema r40, com.google.protobuf.MapFieldSchema r41) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.B(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    public static long C(int i) {
        return i & 1048575;
    }

    public static int D(long j, Object obj) {
        return ((Integer) UnsafeUtil.c.m(j, obj)).intValue();
    }

    public static long E(long j, Object obj) {
        return ((Long) UnsafeUtil.c.m(j, obj)).longValue();
    }

    public static java.lang.reflect.Field K(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbU = a.u("Field ", str, " for ");
            androidx.constraintlayout.core.state.a.x(cls, sbU, " not found. Known fields are ");
            sbU.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbU.toString());
        }
    }

    public static int Q(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void T(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.d(i, (String) obj);
        } else {
            writer.K(i, (ByteString) obj);
        }
    }

    public static void k(Object obj) {
        if (!t(obj)) {
            throw new IllegalArgumentException(b.m(obj, "Mutating immutable message: "));
        }
    }

    public static int l(byte[] bArr, int i, int i2, WireFormat.FieldType fieldType, Class cls, ArrayDecoders.Registers registers) {
        switch (fieldType.ordinal()) {
            case 0:
                registers.c = Double.valueOf(ArrayDecoders.d(i, bArr));
                return i + 8;
            case 1:
                registers.c = Float.valueOf(ArrayDecoders.k(i, bArr));
                return i + 4;
            case 2:
            case 3:
                int I = ArrayDecoders.I(bArr, i, registers);
                registers.c = Long.valueOf(registers.b);
                return I;
            case 4:
            case 12:
            case 13:
                int iG = ArrayDecoders.G(bArr, i, registers);
                registers.c = Integer.valueOf(registers.f16016a);
                return iG;
            case 5:
            case 15:
                registers.c = Long.valueOf(ArrayDecoders.i(i, bArr));
                return i + 8;
            case 6:
            case 14:
                registers.c = Integer.valueOf(ArrayDecoders.g(i, bArr));
                return i + 4;
            case 7:
                int I2 = ArrayDecoders.I(bArr, i, registers);
                registers.c = Boolean.valueOf(registers.b != 0);
                return I2;
            case 8:
                return ArrayDecoders.D(bArr, i, registers);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return ArrayDecoders.n(Protobuf.c.a(cls), bArr, i, i2, registers);
            case 11:
                return ArrayDecoders.b(bArr, i, registers);
            case 16:
                int iG2 = ArrayDecoders.G(bArr, i, registers);
                registers.c = Integer.valueOf(CodedInputStream.b(registers.f16016a));
                return iG2;
            case 17:
                int I3 = ArrayDecoders.I(bArr, i, registers);
                registers.c = Long.valueOf(CodedInputStream.c(registers.b));
                return I3;
        }
    }

    public static UnknownFieldSetLite q(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteC = UnknownFieldSetLite.c();
        generatedMessageLite.unknownFields = unknownFieldSetLiteC;
        return unknownFieldSetLiteC;
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).A();
        }
        return true;
    }

    public final int F(Object obj, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iL;
        Unsafe unsafe = q;
        Object objO = o(i3);
        Object object = unsafe.getObject(obj, j);
        MapFieldSchema mapFieldSchema = this.o;
        if (mapFieldSchema.h(object)) {
            MapFieldLite mapFieldLiteG = mapFieldSchema.g();
            mapFieldSchema.a(mapFieldLiteG, object);
            unsafe.putObject(obj, j, mapFieldLiteG);
            object = mapFieldLiteG;
        }
        MapEntryLite.Metadata metadataB = mapFieldSchema.b(objO);
        MapFieldLite mapFieldLiteE = mapFieldSchema.e(object);
        int iG = ArrayDecoders.G(bArr, i, registers);
        int i4 = registers.f16016a;
        if (i4 < 0 || i4 > i2 - iG) {
            throw InvalidProtocolBufferException.h();
        }
        int i5 = iG + i4;
        metadataB.getClass();
        Object obj2 = metadataB.c;
        Object obj3 = "";
        Object obj4 = obj2;
        while (iG < i5) {
            int iF = iG + 1;
            int i6 = bArr[iG];
            if (i6 < 0) {
                iF = ArrayDecoders.F(i6, bArr, iF, registers);
                i6 = registers.f16016a;
            }
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i7 != 1) {
                if (i7 == 2) {
                    WireFormat.FieldType fieldType = metadataB.b;
                    if (i8 == fieldType.e) {
                        iL = l(bArr, iF, i2, fieldType, obj2.getClass(), registers);
                        obj4 = registers.c;
                        iG = iL;
                    }
                }
                iG = ArrayDecoders.M(i6, bArr, iF, i2, registers);
            } else {
                WireFormat.FieldType fieldType2 = metadataB.f16067a;
                if (i8 == fieldType2.e) {
                    iL = l(bArr, iF, i2, fieldType2, null, registers);
                    obj3 = registers.c;
                    iG = iL;
                } else {
                    iG = ArrayDecoders.M(i6, bArr, iF, i2, registers);
                }
            }
        }
        if (iG != i5) {
            throw InvalidProtocolBufferException.g();
        }
        mapFieldLiteE.put(obj3, obj4);
        return i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x00a8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0497  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int G(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.G(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Unsafe unsafe = q;
        long j2 = this.f16070a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(ArrayDecoders.d(i, bArr)));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(ArrayDecoders.k(i, bArr)));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int I = ArrayDecoders.I(bArr, i, registers);
                unsafe.putObject(obj, j, Long.valueOf(registers.b));
                unsafe.putInt(obj, j2, i4);
                return I;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iG = ArrayDecoders.G(bArr, i, registers);
                unsafe.putObject(obj, j, Integer.valueOf(registers.f16016a));
                unsafe.putInt(obj, j2, i4);
                return iG;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(ArrayDecoders.i(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(ArrayDecoders.g(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int I2 = ArrayDecoders.I(bArr, i, registers);
                unsafe.putObject(obj, j, Boolean.valueOf(registers.b != 0));
                unsafe.putInt(obj, j2, i4);
                return I2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iG2 = ArrayDecoders.G(bArr, i, registers);
                int i13 = registers.f16016a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!Utf8.f16094a.e(iG2, iG2 + i13, bArr)) {
                            throw InvalidProtocolBufferException.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iG2, i13, Internal.f16059a));
                    iG2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iG2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objZ = z(i4, i8, obj);
                int iL = ArrayDecoders.L(objZ, p(i8), bArr, i, i2, registers);
                P(obj, i4, i8, objZ);
                return iL;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iB = ArrayDecoders.b(bArr, i, registers);
                unsafe.putObject(obj, j, registers.c);
                unsafe.putInt(obj, j2, i4);
                return iB;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iG3 = ArrayDecoders.G(bArr, i, registers);
                int i14 = registers.f16016a;
                Internal.EnumVerifier enumVerifierN = n(i8);
                if (enumVerifierN != null && !enumVerifierN.a(i14)) {
                    q(obj).d(i3, Long.valueOf(i14));
                    return iG3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iG3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iG4 = ArrayDecoders.G(bArr, i, registers);
                unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.b(registers.f16016a)));
                unsafe.putInt(obj, j2, i4);
                return iG4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int I3 = ArrayDecoders.I(bArr, i, registers);
                unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.c(registers.b)));
                unsafe.putInt(obj, j2, i4);
                return I3;
            case 68:
                if (i5 == 3) {
                    Object objZ2 = z(i4, i8, obj);
                    int iK = ArrayDecoders.K(objZ2, p(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    P(obj, i4, i8, objZ2);
                    return iK;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int I(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int iH;
        Unsafe unsafe = q;
        Internal.ProtobufList protobufListA = (Internal.ProtobufList) unsafe.getObject(obj, j2);
        if (!protobufListA.r()) {
            int size = protobufListA.size();
            protobufListA = protobufListA.a(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, protobufListA);
        }
        Internal.ProtobufList protobufList = protobufListA;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return ArrayDecoders.q(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.e(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return ArrayDecoders.t(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.l(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return ArrayDecoders.x(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.J(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return ArrayDecoders.w(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.H(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return ArrayDecoders.s(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return ArrayDecoders.j(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return ArrayDecoders.r(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return ArrayDecoders.h(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return ArrayDecoders.p(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.a(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    return (j & llqqqql.cc00630063006300630063) == 0 ? ArrayDecoders.B(i3, bArr, i, i2, protobufList, registers) : ArrayDecoders.C(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return ArrayDecoders.o(p(i6), i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return ArrayDecoders.c(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iH = ArrayDecoders.H(i3, bArr, i, i2, protobufList, registers);
                    }
                    return i;
                }
                iH = ArrayDecoders.w(bArr, i, protobufList, registers);
                SchemaUtil.k(obj, i4, protobufList, n(i6), null, this.m);
                return iH;
            case 33:
            case 47:
                if (i5 == 2) {
                    return ArrayDecoders.u(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.y(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return ArrayDecoders.v(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return ArrayDecoders.z(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return ArrayDecoders.m(p(i6), i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            default:
                return i;
        }
    }

    public final void J(int i, Reader reader, Object obj) {
        if ((536870912 & i) != 0) {
            UnsafeUtil.r(obj, i & 1048575, reader.I());
        } else if (this.g) {
            UnsafeUtil.r(obj, i & 1048575, reader.G());
        } else {
            UnsafeUtil.r(obj, i & 1048575, reader.h());
        }
    }

    public final void L(int i, Object obj) {
        int i2 = this.f16070a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.p(obj, (1 << (i2 >>> 20)) | UnsafeUtil.c.j(j, obj), j);
    }

    public final void M(int i, int i2, Object obj) {
        UnsafeUtil.p(obj, i, this.f16070a[i2 + 2] & 1048575);
    }

    public final int N(int i, int i2) {
        int[] iArr = this.f16070a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void O(int i, Object obj, Object obj2) {
        q.putObject(obj, R(i) & 1048575, obj2);
        L(i, obj);
    }

    public final void P(Object obj, int i, int i2, Object obj2) {
        q.putObject(obj, R(i2) & 1048575, obj2);
        M(i, i2, obj);
    }

    public final int R(int i) {
        return this.f16070a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(java.lang.Object r21, com.google.protobuf.Writer r22) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.S(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.a(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.protobuf.Schema
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i6 < this.i) {
                int i7 = this.h[i6];
                int[] iArr = this.f16070a;
                int i8 = iArr[i7];
                int iR = R(i7);
                int i9 = iArr[i7 + 2];
                int i10 = i9 & 1048575;
                int i11 = 1 << (i9 >>> 20);
                if (i10 != i4) {
                    if (i10 != 1048575) {
                        i5 = q.getInt(obj, i10);
                    }
                    i2 = i7;
                    i3 = i5;
                    i = i10;
                } else {
                    int i12 = i5;
                    i = i4;
                    i2 = i7;
                    i3 = i12;
                }
                if ((268435456 & iR) != 0 && !s(obj, i2, i, i3, i11)) {
                    break;
                }
                int iQ = Q(iR);
                if (iQ == 9 || iQ == 17) {
                    if (s(obj, i2, i, i3, i11)) {
                        if (!p(i2).b(UnsafeUtil.c.m(iR & 1048575, obj))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (iQ != 27) {
                        if (iQ == 60 || iQ == 68) {
                            if (u(i8, i2, obj)) {
                                if (!p(i2).b(UnsafeUtil.c.m(iR & 1048575, obj))) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (iQ != 49) {
                            if (iQ != 50) {
                                continue;
                            } else {
                                Object objM = UnsafeUtil.c.m(iR & 1048575, obj);
                                MapFieldSchema mapFieldSchema = this.o;
                                MapFieldLite mapFieldLiteF = mapFieldSchema.f(objM);
                                if (!mapFieldLiteF.isEmpty() && mapFieldSchema.b(o(i2)).b.d == WireFormat.JavaType.MESSAGE) {
                                    Schema schemaA = null;
                                    for (Object obj2 : mapFieldLiteF.values()) {
                                        if (schemaA == null) {
                                            schemaA = Protobuf.c.a(obj2.getClass());
                                        }
                                        if (!schemaA.b(obj2)) {
                                            break loop0;
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) UnsafeUtil.c.m(iR & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        Schema schemaP = p(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (!schemaP.b(list.get(i13))) {
                                break loop0;
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            } else if (!this.f || this.n.c(obj).h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = t(r9)
            if (r0 != 0) goto L8
            goto L8f
        L8:
            boolean r0 = r9 instanceof com.google.protobuf.GeneratedMessageLite
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r9
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.p(r2)
            r0.memoizedHashCode = r1
            r0.B()
        L1b:
            int[] r0 = r8.f16070a
            int r2 = r0.length
        L1e:
            if (r1 >= r2) goto L81
            int r3 = r8.R(r1)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = Q(r3)
            r6 = 9
            if (r3 == r6) goto L6b
            r6 = 60
            if (r3 == r6) goto L55
            r6 = 68
            if (r3 == r6) goto L55
            switch(r3) {
                case 17: goto L6b;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L7e
        L3d:
            sun.misc.Unsafe r3 = com.google.protobuf.MessageSchema.q
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7e
            com.google.protobuf.MapFieldSchema r7 = r8.o
            java.lang.Object r6 = r7.c(r6)
            r3.putObject(r9, r4, r6)
            goto L7e
        L4f:
            com.google.protobuf.ListFieldSchema r3 = r8.l
            r3.a(r4, r9)
            goto L7e
        L55:
            r3 = r0[r1]
            boolean r3 = r8.u(r3, r1, r9)
            if (r3 == 0) goto L7e
            com.google.protobuf.Schema r3 = r8.p(r1)
            sun.misc.Unsafe r6 = com.google.protobuf.MessageSchema.q
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.c(r4)
            goto L7e
        L6b:
            boolean r3 = r8.r(r1, r9)
            if (r3 == 0) goto L7e
            com.google.protobuf.Schema r3 = r8.p(r1)
            sun.misc.Unsafe r6 = com.google.protobuf.MessageSchema.q
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.c(r4)
        L7e:
            int r1 = r1 + 3
            goto L1e
        L81:
            com.google.protobuf.UnknownFieldSchema r0 = r8.m
            r0.j(r9)
            boolean r0 = r8.f
            if (r0 == 0) goto L8f
            com.google.protobuf.ExtensionSchema r0 = r8.n
            r0.f(r9)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r13, com.google.protobuf.Writer r14) {
        /*
            Method dump skipped, instructions count: 1650
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.d(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0372  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.protobuf.AbstractMessageLite r18) {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.e(com.google.protobuf.AbstractMessageLite):int");
    }

    @Override // com.google.protobuf.Schema
    public final void f(Object obj, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) {
        G(obj, bArr, i, i2, 0, registers);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[PHI: r3
  0x00e4: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0219, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.protobuf.GeneratedMessageLite r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.g(com.google.protobuf.GeneratedMessageLite):int");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:96|361|97|(3:317|99|(7:102|103|104|257|292|380|379))|101|107|355|108|109|85|256|257|292|380|379) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01fc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fd, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0200, code lost:
    
        r7 = r1;
        r2 = r5;
        r8 = r21;
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        r13.n(r5, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0843 A[Catch: all -> 0x084a, TryCatch #13 {all -> 0x084a, blocks: (B:277:0x083e, B:279:0x0843, B:283:0x084d), top: B:311:0x083e }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x088e A[LOOP:3: B:301:0x088c->B:302:0x088e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0853 A[SYNTHETIC] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.h(java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(com.google.protobuf.GeneratedMessageLite r12, com.google.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.i(com.google.protobuf.GeneratedMessageLite, com.google.protobuf.GeneratedMessageLite):boolean");
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return r(i, generatedMessageLite) == r(i, generatedMessageLite2);
    }

    public final Object m(Object obj, int i, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier enumVerifierN;
        int i2 = this.f16070a[i];
        Object objM = UnsafeUtil.c.m(R(i) & 1048575, obj);
        if (objM == null || (enumVerifierN = n(i)) == null) {
            return obj2;
        }
        MapFieldSchema mapFieldSchema = this.o;
        MapFieldLite mapFieldLiteE = mapFieldSchema.e(objM);
        MapEntryLite.Metadata metadataB = mapFieldSchema.b(o(i));
        Iterator it = mapFieldLiteE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierN.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = unknownFieldSchema.f(obj3);
                }
                ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(MapEntryLite.a(metadataB, entry.getKey(), entry.getValue()));
                CodedOutputStream codedOutputStreamB = codedBuilder.b();
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    FieldSet.o(codedOutputStreamB, metadataB.f16067a, 1, key);
                    FieldSet.o(codedOutputStreamB, metadataB.b, 2, value);
                    unknownFieldSchema.d(obj2, i2, codedBuilder.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier n(int i) {
        return (Internal.EnumVerifier) this.b[androidx.constraintlayout.core.state.a.D(i, 3, 2, 1)];
    }

    @Override // com.google.protobuf.Schema
    public final Object newInstance() {
        return this.k.newInstance(this.e);
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final Schema p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        Schema schema = (Schema) objArr[i2];
        if (schema != null) {
            return schema;
        }
        Schema schemaA = Protobuf.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = schemaA;
        return schemaA;
    }

    public final boolean r(int i, Object obj) {
        int i2 = this.f16070a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iR = R(i);
            long j2 = iR & 1048575;
            switch (Q(iR)) {
                case 0:
                    if (Double.doubleToRawLongBits(UnsafeUtil.c.h(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.c.i(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return UnsafeUtil.c.e(j2, obj);
                case 8:
                    Object objM = UnsafeUtil.c.m(j2, obj);
                    if (objM instanceof String) {
                        return !((String) objM).isEmpty();
                    }
                    if (objM instanceof ByteString) {
                        return !ByteString.e.equals(objM);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (UnsafeUtil.c.m(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.e.equals(UnsafeUtil.c.m(j2, obj));
                case 11:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (UnsafeUtil.c.j(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (UnsafeUtil.c.l(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (UnsafeUtil.c.m(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & UnsafeUtil.c.j(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean s(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? r(i, obj) : (i3 & i4) != 0;
    }

    public final boolean u(int i, int i2, Object obj) {
        return UnsafeUtil.c.j((long) (this.f16070a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jR = R(i) & 1048575;
        Object objM = UnsafeUtil.c.m(jR, obj);
        MapFieldSchema mapFieldSchema = this.o;
        if (objM == null) {
            objM = mapFieldSchema.g();
            UnsafeUtil.r(obj, jR, objM);
        } else if (mapFieldSchema.h(objM)) {
            MapFieldLite mapFieldLiteG = mapFieldSchema.g();
            mapFieldSchema.a(mapFieldLiteG, objM);
            UnsafeUtil.r(obj, jR, mapFieldLiteG);
            objM = mapFieldLiteG;
        }
        reader.J(mapFieldSchema.e(objM), mapFieldSchema.b(obj2), extensionRegistryLite);
    }

    public final void w(int i, Object obj, Object obj2) {
        if (r(i, obj2)) {
            long jR = R(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f16070a[i] + " is present but null: " + obj2);
            }
            Schema schemaP = p(i);
            if (!r(i, obj)) {
                if (t(object)) {
                    Object objNewInstance = schemaP.newInstance();
                    schemaP.a(objNewInstance, object);
                    unsafe.putObject(obj, jR, objNewInstance);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                L(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!t(object2)) {
                Object objNewInstance2 = schemaP.newInstance();
                schemaP.a(objNewInstance2, object2);
                unsafe.putObject(obj, jR, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaP.a(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.f16070a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            long jR = R(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            Schema schemaP = p(i);
            if (!u(i2, i, obj)) {
                if (t(object)) {
                    Object objNewInstance = schemaP.newInstance();
                    schemaP.a(objNewInstance, object);
                    unsafe.putObject(obj, jR, objNewInstance);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                M(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!t(object2)) {
                Object objNewInstance2 = schemaP.newInstance();
                schemaP.a(objNewInstance2, object2);
                unsafe.putObject(obj, jR, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaP.a(object2, object);
        }
    }

    public final Object y(int i, Object obj) {
        Schema schemaP = p(i);
        long jR = R(i) & 1048575;
        if (!r(i, obj)) {
            return schemaP.newInstance();
        }
        Object object = q.getObject(obj, jR);
        if (t(object)) {
            return object;
        }
        Object objNewInstance = schemaP.newInstance();
        if (object != null) {
            schemaP.a(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final Object z(int i, int i2, Object obj) {
        Schema schemaP = p(i2);
        if (!u(i, i2, obj)) {
            return schemaP.newInstance();
        }
        Object object = q.getObject(obj, R(i2) & 1048575);
        if (t(object)) {
            return object;
        }
        Object objNewInstance = schemaP.newInstance();
        if (object != null) {
            schemaP.a(objNewInstance, object);
        }
        return objNewInstance;
    }
}
