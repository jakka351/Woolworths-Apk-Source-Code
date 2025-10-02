package com.google.crypto.tink.shaded.protobuf;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.ArrayDecoders;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.UnsafeUtil;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class MessageSchema<T> implements Schema<T> {
    public static final int[] q = new int[0];
    public static final Unsafe r = UnsafeUtil.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f15110a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final MessageLite e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final NewInstanceSchema l;
    public final ListFieldSchema m;
    public final UnknownFieldSchema n;
    public final ExtensionSchema o;
    public final MapFieldSchema p;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.MessageSchema$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15111a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f15111a = iArr;
            try {
                iArr[WireFormat.FieldType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15111a[WireFormat.FieldType.q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15111a[WireFormat.FieldType.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15111a[WireFormat.FieldType.l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15111a[WireFormat.FieldType.t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15111a[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15111a[WireFormat.FieldType.u.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15111a[WireFormat.FieldType.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15111a[WireFormat.FieldType.s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15111a[WireFormat.FieldType.j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15111a[WireFormat.FieldType.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15111a[WireFormat.FieldType.h.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f15111a[WireFormat.FieldType.i.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15111a[WireFormat.FieldType.p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f15111a[WireFormat.FieldType.v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15111a[WireFormat.FieldType.w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15111a[WireFormat.FieldType.n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, int[] iArr2, int i3, int i4, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f15110a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = messageLite instanceof GeneratedMessageLite;
        this.h = z;
        this.f = extensionSchema != null && extensionSchema.e(messageLite);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = newInstanceSchema;
        this.m = listFieldSchema;
        this.n = unknownFieldSchema;
        this.o = extensionSchema;
        this.e = messageLite;
        this.p = mapFieldSchema;
    }

    public static int A(long j, Object obj) {
        return ((Integer) UnsafeUtil.d.m(j, obj)).intValue();
    }

    public static long B(long j, Object obj) {
        return ((Long) UnsafeUtil.d.m(j, obj)).longValue();
    }

    public static Field I(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
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

    public static int M(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void Q(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.d(i, (String) obj);
        } else {
            writer.P(i, (ByteString) obj);
        }
    }

    public static UnknownFieldSetLite o(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.f) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        generatedMessageLite.unknownFields = unknownFieldSetLite2;
        return unknownFieldSetLite2;
    }

    public static List t(AbstractMessageLite abstractMessageLite, long j) {
        return (List) UnsafeUtil.d.m(j, abstractMessageLite);
    }

    public static MessageSchema x(MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        if (messageInfo instanceof RawMessageInfo) {
            return y((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.crypto.tink.shaded.protobuf.MessageSchema y(com.google.crypto.tink.shaded.protobuf.RawMessageInfo r37, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema r38, com.google.crypto.tink.shaded.protobuf.ListFieldSchema r39, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema r40, com.google.crypto.tink.shaded.protobuf.ExtensionSchema r41, com.google.crypto.tink.shaded.protobuf.MapFieldSchema r42) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.y(com.google.crypto.tink.shaded.protobuf.RawMessageInfo, com.google.crypto.tink.shaded.protobuf.NewInstanceSchema, com.google.crypto.tink.shaded.protobuf.ListFieldSchema, com.google.crypto.tink.shaded.protobuf.UnknownFieldSchema, com.google.crypto.tink.shaded.protobuf.ExtensionSchema, com.google.crypto.tink.shaded.protobuf.MapFieldSchema):com.google.crypto.tink.shaded.protobuf.MessageSchema");
    }

    public static long z(int i) {
        return i & 1048575;
    }

    public final int C(Object obj, byte[] bArr, int i, int i2, int i3, long j, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Unsafe unsafe = r;
        Object objM = m(i3);
        Object object = unsafe.getObject(obj, j);
        MapFieldSchema mapFieldSchema = this.p;
        if (mapFieldSchema.h(object)) {
            MapFieldLite mapFieldLiteG = mapFieldSchema.g();
            mapFieldSchema.a(mapFieldLiteG, object);
            unsafe.putObject(obj, j, mapFieldLiteG);
            object = mapFieldLiteG;
        }
        mapFieldSchema.b(objM);
        mapFieldSchema.e(object);
        int iS = ArrayDecoders.s(bArr, i, registers);
        int i4 = registers.f15078a;
        if (i4 < 0 || i4 > i2 - iS) {
            throw InvalidProtocolBufferException.i();
        }
        throw null;
    }

    public final int D(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        Object object;
        Unsafe unsafe = r;
        long j2 = this.f15110a[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(ArrayDecoders.c(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(ArrayDecoders.b(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iU = ArrayDecoders.u(bArr, i, registers);
                unsafe.putObject(obj, j, Long.valueOf(registers.b));
                unsafe.putInt(obj, j2, i4);
                return iU;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iS = ArrayDecoders.s(bArr, i, registers);
                unsafe.putObject(obj, j, Integer.valueOf(registers.f15078a));
                unsafe.putInt(obj, j2, i4);
                return iS;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(ArrayDecoders.c(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(ArrayDecoders.b(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iU2 = ArrayDecoders.u(bArr, i, registers);
                unsafe.putObject(obj, j, Boolean.valueOf(registers.b != 0));
                unsafe.putInt(obj, j2, i4);
                return iU2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iS2 = ArrayDecoders.s(bArr, i, registers);
                int i13 = registers.f15078a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!Utf8.f15122a.e(iS2, iS2 + i13, bArr)) {
                            throw InvalidProtocolBufferException.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, iS2, i13, Internal.f15103a));
                    iS2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return iS2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int iE = ArrayDecoders.e(n(i8), bArr, i, i2, registers);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, registers.c);
                } else {
                    unsafe.putObject(obj, j, Internal.c(object, registers.c));
                }
                unsafe.putInt(obj, j2, i4);
                return iE;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iA = ArrayDecoders.a(bArr, i, registers);
                unsafe.putObject(obj, j, registers.c);
                unsafe.putInt(obj, j2, i4);
                return iA;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iS3 = ArrayDecoders.s(bArr, i, registers);
                int i14 = registers.f15078a;
                Internal.EnumVerifier enumVerifierL = l(i8);
                if (enumVerifierL != null && !enumVerifierL.a(i14)) {
                    o(obj).d(i3, Long.valueOf(i14));
                    return iS3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return iS3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int iS4 = ArrayDecoders.s(bArr, i, registers);
                unsafe.putObject(obj, j, Integer.valueOf(CodedInputStream.b(registers.f15078a)));
                unsafe.putInt(obj, j2, i4);
                return iS4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iU3 = ArrayDecoders.u(bArr, i, registers);
                unsafe.putObject(obj, j, Long.valueOf(CodedInputStream.c(registers.b)));
                unsafe.putInt(obj, j2, i4);
                return iU3;
            case 68:
                if (i5 == 3) {
                    int iD = ArrayDecoders.d(n(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, registers.c);
                    } else {
                        unsafe.putObject(obj, j, Internal.c(object, registers.c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iD;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x04c2, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0760, code lost:
    
        if (r0 == (-1)) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0762, code lost:
    
        r20.putInt(r9, r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0768, code lost:
    
        r0 = r8.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x076c, code lost:
    
        if (r0 >= r8.k) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x076e, code lost:
    
        r8.k(r9, r8.i[r0], r35, r7);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x077a, code lost:
    
        if (r37 != 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x077c, code lost:
    
        if (r4 != r3) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0783, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0784, code lost:
    
        if (r4 > r3) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0788, code lost:
    
        if (r14 != r37) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x078a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x078f, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r38) {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.E(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0064. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(java.lang.Object r24, byte[] r25, int r26, int r27, com.google.crypto.tink.shaded.protobuf.ArrayDecoders.Registers r28) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.F(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.ArrayDecoders$Registers):void");
    }

    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        int i8;
        int iT;
        Unsafe unsafe = r;
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
                    return ArrayDecoders.h(bArr, i, protobufList, registers);
                }
                if (i5 != 1) {
                    return i;
                }
                DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
                doubleArrayList.d(Double.longBitsToDouble(ArrayDecoders.c(i, bArr)));
                int i9 = i + 8;
                while (i9 < i2) {
                    int iS = ArrayDecoders.s(bArr, i9, registers);
                    if (i3 != registers.f15078a) {
                        return i9;
                    }
                    doubleArrayList.d(Double.longBitsToDouble(ArrayDecoders.c(iS, bArr)));
                    i9 = iS + 8;
                }
                return i9;
            case 19:
            case 36:
                if (i5 == 2) {
                    return ArrayDecoders.k(bArr, i, protobufList, registers);
                }
                if (i5 != 5) {
                    return i;
                }
                FloatArrayList floatArrayList = (FloatArrayList) protobufList;
                floatArrayList.d(Float.intBitsToFloat(ArrayDecoders.b(i, bArr)));
                int i10 = i + 4;
                while (i10 < i2) {
                    int iS2 = ArrayDecoders.s(bArr, i10, registers);
                    if (i3 != registers.f15078a) {
                        return i10;
                    }
                    floatArrayList.d(Float.intBitsToFloat(ArrayDecoders.b(iS2, bArr)));
                    i10 = iS2 + 4;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    LongArrayList longArrayList = (LongArrayList) protobufList;
                    int iS3 = ArrayDecoders.s(bArr, i, registers);
                    int i11 = registers.f15078a + iS3;
                    while (iS3 < i11) {
                        iS3 = ArrayDecoders.u(bArr, iS3, registers);
                        longArrayList.d(registers.b);
                    }
                    if (iS3 == i11) {
                        return iS3;
                    }
                    throw InvalidProtocolBufferException.i();
                }
                if (i5 != 0) {
                    return i;
                }
                LongArrayList longArrayList2 = (LongArrayList) protobufList;
                int iU = ArrayDecoders.u(bArr, i, registers);
                longArrayList2.d(registers.b);
                while (iU < i2) {
                    int iS4 = ArrayDecoders.s(bArr, iU, registers);
                    if (i3 != registers.f15078a) {
                        return iU;
                    }
                    iU = ArrayDecoders.u(bArr, iS4, registers);
                    longArrayList2.d(registers.b);
                }
                return iU;
            case 22:
            case 29:
            case 39:
            case 43:
                return i5 == 2 ? ArrayDecoders.n(bArr, i, protobufList, registers) : i5 == 0 ? ArrayDecoders.t(i3, bArr, i, i2, protobufList, registers) : i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return ArrayDecoders.j(bArr, i, protobufList, registers);
                }
                if (i5 != 1) {
                    return i;
                }
                LongArrayList longArrayList3 = (LongArrayList) protobufList;
                longArrayList3.d(ArrayDecoders.c(i, bArr));
                int i12 = i + 8;
                while (i12 < i2) {
                    int iS5 = ArrayDecoders.s(bArr, i12, registers);
                    if (i3 != registers.f15078a) {
                        return i12;
                    }
                    longArrayList3.d(ArrayDecoders.c(iS5, bArr));
                    i12 = iS5 + 8;
                }
                return i12;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return ArrayDecoders.i(bArr, i, protobufList, registers);
                }
                if (i5 != 5) {
                    return i;
                }
                IntArrayList intArrayList = (IntArrayList) protobufList;
                intArrayList.W1(ArrayDecoders.b(i, bArr));
                int i13 = i + 4;
                while (i13 < i2) {
                    int iS6 = ArrayDecoders.s(bArr, i13, registers);
                    if (i3 != registers.f15078a) {
                        return i13;
                    }
                    intArrayList.W1(ArrayDecoders.b(iS6, bArr));
                    i13 = iS6 + 4;
                }
                return i13;
            case 25:
            case 42:
                if (i5 == 2) {
                    return ArrayDecoders.g(bArr, i, protobufList, registers);
                }
                if (i5 != 0) {
                    return i;
                }
                BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
                int iU2 = ArrayDecoders.u(bArr, i, registers);
                booleanArrayList.d(registers.b != 0);
                while (iU2 < i2) {
                    int iS7 = ArrayDecoders.s(bArr, iU2, registers);
                    if (i3 != registers.f15078a) {
                        return iU2;
                    }
                    iU2 = ArrayDecoders.u(bArr, iS7, registers);
                    booleanArrayList.d(registers.b != 0);
                }
                return iU2;
            case 26:
                if (i5 != 2) {
                    return i;
                }
                if ((j & llqqqql.cc00630063006300630063) == 0) {
                    int iS8 = ArrayDecoders.s(bArr, i, registers);
                    int i14 = registers.f15078a;
                    if (i14 < 0) {
                        throw InvalidProtocolBufferException.f();
                    }
                    if (i14 == 0) {
                        protobufList.add("");
                    } else {
                        protobufList.add(new String(bArr, iS8, i14, Internal.f15103a));
                        iS8 += i14;
                    }
                    while (iS8 < i2) {
                        int iS9 = ArrayDecoders.s(bArr, iS8, registers);
                        if (i3 != registers.f15078a) {
                            return iS8;
                        }
                        iS8 = ArrayDecoders.s(bArr, iS9, registers);
                        int i15 = registers.f15078a;
                        if (i15 < 0) {
                            throw InvalidProtocolBufferException.f();
                        }
                        if (i15 == 0) {
                            protobufList.add("");
                        } else {
                            protobufList.add(new String(bArr, iS8, i15, Internal.f15103a));
                            iS8 += i15;
                        }
                    }
                    return iS8;
                }
                int iS10 = ArrayDecoders.s(bArr, i, registers);
                int i16 = registers.f15078a;
                if (i16 < 0) {
                    throw InvalidProtocolBufferException.f();
                }
                if (i16 == 0) {
                    protobufList.add("");
                } else {
                    int i17 = iS10 + i16;
                    if (!Utf8.f15122a.e(iS10, i17, bArr)) {
                        throw InvalidProtocolBufferException.c();
                    }
                    protobufList.add(new String(bArr, iS10, i16, Internal.f15103a));
                    iS10 = i17;
                }
                while (iS10 < i2) {
                    int iS11 = ArrayDecoders.s(bArr, iS10, registers);
                    if (i3 != registers.f15078a) {
                        return iS10;
                    }
                    iS10 = ArrayDecoders.s(bArr, iS11, registers);
                    int i18 = registers.f15078a;
                    if (i18 < 0) {
                        throw InvalidProtocolBufferException.f();
                    }
                    if (i18 == 0) {
                        protobufList.add("");
                    } else {
                        int i19 = iS10 + i18;
                        if (!Utf8.f15122a.e(iS10, i19, bArr)) {
                            throw InvalidProtocolBufferException.c();
                        }
                        protobufList.add(new String(bArr, iS10, i18, Internal.f15103a));
                        iS10 = i19;
                    }
                }
                return iS10;
            case 27:
                i8 = i;
                if (i5 == 2) {
                    return ArrayDecoders.f(n(i6), i3, bArr, i8, i2, protobufList, registers);
                }
                break;
            case 28:
                i8 = i;
                if (i5 == 2) {
                    int iS12 = ArrayDecoders.s(bArr, i8, registers);
                    int i20 = registers.f15078a;
                    if (i20 < 0) {
                        throw InvalidProtocolBufferException.f();
                    }
                    if (i20 > bArr.length - iS12) {
                        throw InvalidProtocolBufferException.i();
                    }
                    if (i20 == 0) {
                        protobufList.add(ByteString.e);
                    } else {
                        protobufList.add(ByteString.i(iS12, i20, bArr));
                        iS12 += i20;
                    }
                    while (iS12 < i2) {
                        int iS13 = ArrayDecoders.s(bArr, iS12, registers);
                        if (i3 != registers.f15078a) {
                            return iS12;
                        }
                        iS12 = ArrayDecoders.s(bArr, iS13, registers);
                        int i21 = registers.f15078a;
                        if (i21 < 0) {
                            throw InvalidProtocolBufferException.f();
                        }
                        if (i21 > bArr.length - iS12) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i21 == 0) {
                            protobufList.add(ByteString.e);
                        } else {
                            protobufList.add(ByteString.i(iS12, i21, bArr));
                            iS12 += i21;
                        }
                    }
                    return iS12;
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    iT = ArrayDecoders.n(bArr, i, protobufList, registers);
                } else {
                    if (i5 != 0) {
                        return i;
                    }
                    iT = ArrayDecoders.t(i3, bArr, i, i2, protobufList, registers);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                if (unknownFieldSetLite == UnknownFieldSetLite.f) {
                    unknownFieldSetLite = null;
                }
                UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) SchemaUtil.x(i4, protobufList, l(i6), unknownFieldSetLite, this.n);
                if (unknownFieldSetLite2 != null) {
                    generatedMessageLite.unknownFields = unknownFieldSetLite2;
                }
                return iT;
            case 33:
            case 47:
                if (i5 == 2) {
                    return ArrayDecoders.l(bArr, i, protobufList, registers);
                }
                if (i5 != 0) {
                    return i;
                }
                IntArrayList intArrayList2 = (IntArrayList) protobufList;
                int iS14 = ArrayDecoders.s(bArr, i, registers);
                intArrayList2.W1(CodedInputStream.b(registers.f15078a));
                while (iS14 < i2) {
                    int iS15 = ArrayDecoders.s(bArr, iS14, registers);
                    if (i3 != registers.f15078a) {
                        return iS14;
                    }
                    iS14 = ArrayDecoders.s(bArr, iS15, registers);
                    intArrayList2.W1(CodedInputStream.b(registers.f15078a));
                }
                return iS14;
            case 34:
            case 48:
                if (i5 == 2) {
                    return ArrayDecoders.m(bArr, i, protobufList, registers);
                }
                if (i5 != 0) {
                    return i;
                }
                LongArrayList longArrayList4 = (LongArrayList) protobufList;
                int iU3 = ArrayDecoders.u(bArr, i, registers);
                longArrayList4.d(CodedInputStream.c(registers.b));
                while (iU3 < i2) {
                    int iS16 = ArrayDecoders.s(bArr, iU3, registers);
                    if (i3 != registers.f15078a) {
                        return iU3;
                    }
                    iU3 = ArrayDecoders.u(bArr, iS16, registers);
                    longArrayList4.d(CodedInputStream.c(registers.b));
                }
                return iU3;
            case 49:
                if (i5 == 3) {
                    Schema schemaN = n(i6);
                    int i22 = (i3 & (-8)) | 4;
                    int iD = ArrayDecoders.d(schemaN, bArr, i, i2, i22, registers);
                    Schema schema = schemaN;
                    byte[] bArr2 = bArr;
                    protobufList.add(registers.c);
                    while (iD < i2) {
                        int iS17 = ArrayDecoders.s(bArr2, iD, registers);
                        if (i3 != registers.f15078a) {
                            return iD;
                        }
                        byte[] bArr3 = bArr2;
                        Schema schema2 = schema;
                        iD = ArrayDecoders.d(schema2, bArr3, iS17, i2, i22, registers);
                        protobufList.add(registers.c);
                        schema = schema2;
                        bArr2 = bArr3;
                    }
                    return iD;
                }
            default:
                return i;
        }
        return i8;
    }

    public final void H(Object obj, int i, Reader reader) {
        if ((536870912 & i) != 0) {
            UnsafeUtil.p(obj, i & 1048575, reader.I());
        } else if (this.g) {
            UnsafeUtil.p(obj, i & 1048575, reader.G());
        } else {
            UnsafeUtil.p(obj, i & 1048575, reader.h());
        }
    }

    public final void J(int i, Object obj) {
        if (this.h) {
            return;
        }
        int i2 = this.f15110a[i + 2];
        long j = i2 & 1048575;
        UnsafeUtil.n(obj, UnsafeUtil.d.j(j, obj) | (1 << (i2 >>> 20)), j);
    }

    public final void K(int i, int i2, Object obj) {
        UnsafeUtil.n(obj, i, this.f15110a[i2 + 2] & 1048575);
    }

    public final int L(int i, int i2) {
        int[] iArr = this.f15110a;
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

    public final int N(int i) {
        return this.f15110a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(java.lang.Object r22, com.google.crypto.tink.shaded.protobuf.Writer r23) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.O(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    public final void P(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            Object objM = m(i2);
            MapFieldSchema mapFieldSchema = this.p;
            mapFieldSchema.b(objM);
            writer.K(i, null, mapFieldSchema.f(obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void a(Object obj, byte[] bArr, int i, int i2, ArrayDecoders.Registers registers) throws InvalidProtocolBufferException {
        if (this.h) {
            F(obj, bArr, i, i2, registers);
        } else {
            E(obj, bArr, i, i2, 0, registers);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.b(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final void c(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.j;
        while (true) {
            iArr = this.i;
            i = this.k;
            if (i2 >= i) {
                break;
            }
            long jN = N(iArr[i2]) & 1048575;
            Object objM = UnsafeUtil.d.m(jN, obj);
            if (objM != null) {
                UnsafeUtil.p(obj, jN, this.p.c(objM));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.m.a(iArr[i], obj);
            i++;
        }
        this.n.j(obj);
        if (this.f) {
            this.o.f(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r12, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.d(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[PHI: r3
  0x00e4: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0219, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r12) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.e(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final int f(AbstractMessageLite abstractMessageLite) {
        return this.h ? q(abstractMessageLite) : p(abstractMessageLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r9.n(r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x065d A[Catch: all -> 0x048d, TryCatch #5 {all -> 0x048d, blocks: (B:183:0x0658, B:185:0x065d, B:186:0x0662, B:137:0x046d, B:142:0x0493, B:144:0x04a9, B:145:0x04bd, B:146:0x04d1, B:147:0x04e5, B:148:0x04f9, B:150:0x0508, B:153:0x050f, B:154:0x0515, B:155:0x0521, B:156:0x0536, B:157:0x054b, B:159:0x0556, B:160:0x0575, B:161:0x0589, B:162:0x0596, B:163:0x05ad, B:164:0x05c2, B:165:0x05d7, B:166:0x05ec, B:167:0x0601, B:168:0x0616, B:169:0x062d, B:175:0x0647), top: B:209:0x0658 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0682 A[LOOP:3: B:196:0x0680->B:197:0x0682, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0668 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.Reader r20, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.g(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Reader, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.Writer r20) {
        /*
            Method dump skipped, instructions count: 3474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.h(java.lang.Object, com.google.crypto.tink.shaded.protobuf.Writer):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r11, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r12) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.MessageSchema.i(com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite):void");
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, Object obj, int i) {
        return r(i, generatedMessageLite) == r(i, obj);
    }

    public final Object k(Object obj, int i, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        Internal.EnumVerifier enumVerifierL;
        int i2 = this.f15110a[i];
        Object objM = UnsafeUtil.d.m(N(i) & 1048575, obj);
        if (objM != null && (enumVerifierL = l(i)) != null) {
            MapFieldSchema mapFieldSchema = this.p;
            MapFieldLite mapFieldLiteE = mapFieldSchema.e(objM);
            mapFieldSchema.b(m(i));
            for (Map.Entry entry : mapFieldLiteE.entrySet()) {
                if (!enumVerifierL.a(((Integer) entry.getValue()).intValue())) {
                    if (obj2 == null) {
                        unknownFieldSchema.m();
                    }
                    MapEntryLite.b(null, entry.getKey(), entry.getValue());
                    throw null;
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier l(int i) {
        return (Internal.EnumVerifier) this.b[androidx.constraintlayout.core.state.a.D(i, 3, 2, 1)];
    }

    public final Object m(int i) {
        return this.b[(i / 3) * 2];
    }

    public final Schema n(int i) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.Schema
    public final Object newInstance() {
        return this.l.newInstance(this.e);
    }

    public final int p(AbstractMessageLite abstractMessageLite) {
        int i;
        int iZ;
        int iC0;
        int iZ2;
        int iX;
        int iV;
        int iZ3;
        int iY;
        int iC;
        int iL;
        int iW;
        Unsafe unsafe = r;
        int i2 = -1;
        int i3 = 0;
        int iD = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f15110a;
            if (i3 >= iArr.length) {
                UnknownFieldSchema unknownFieldSchema = this.n;
                int iH = iD + unknownFieldSchema.h(unknownFieldSchema.g(abstractMessageLite));
                return this.f ? iH + this.o.c(abstractMessageLite).j() : iH;
            }
            int iN = N(i3);
            int i5 = iArr[i3];
            int iM = M(iN);
            if (iM <= 17) {
                int i6 = iArr[i3 + 2];
                int i7 = i6 & 1048575;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i4 = unsafe.getInt(abstractMessageLite, i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            long j = iN & 1048575;
            switch (iM) {
                case 0:
                    if ((i4 & i) != 0) {
                        iD = c.D(i5, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i & i4) != 0) {
                        iD = c.D(i5, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(abstractMessageLite, j);
                        iZ = CodedOutputStream.Z(i5);
                        iC0 = CodedOutputStream.c0(j2);
                        iD += iC0 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(abstractMessageLite, j);
                        iZ = CodedOutputStream.Z(i5);
                        iC0 = CodedOutputStream.c0(j3);
                        iD += iC0 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        int i8 = unsafe.getInt(abstractMessageLite, j);
                        iZ2 = CodedOutputStream.Z(i5);
                        iX = CodedOutputStream.X(i8);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        iV = CodedOutputStream.V(i5);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        iV = CodedOutputStream.U(i5);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        iD = c.D(i5, 1, iD);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractMessageLite, j);
                        if (object instanceof ByteString) {
                            int iZ4 = CodedOutputStream.Z(i5);
                            int size = ((ByteString) object).size();
                            iC = c.c(size, size, iZ4, iD);
                            iD = iC;
                            break;
                        } else {
                            iZ3 = CodedOutputStream.Z(i5);
                            iY = CodedOutputStream.Y((String) object);
                            iC = iY + iZ3 + iD;
                            iD = iC;
                        }
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        iL = SchemaUtil.l(i5, unsafe.getObject(abstractMessageLite, j), n(i3));
                        iD += iL;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        iV = CodedOutputStream.S(i5, (ByteString) unsafe.getObject(abstractMessageLite, j));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        iV = CodedOutputStream.a0(i5, unsafe.getInt(abstractMessageLite, j));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        int i9 = unsafe.getInt(abstractMessageLite, j);
                        iZ2 = CodedOutputStream.Z(i5);
                        iX = CodedOutputStream.X(i9);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i & i4) != 0) {
                        iD = c.D(i5, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        iD = c.D(i5, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(abstractMessageLite, j);
                        iZ2 = CodedOutputStream.Z(i5);
                        iX = CodedOutputStream.b0(CodedOutputStream.d0(i10));
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i4 & i) != 0) {
                        long j4 = unsafe.getLong(abstractMessageLite, j);
                        iZ = CodedOutputStream.Z(i5);
                        iC0 = CodedOutputStream.c0(CodedOutputStream.e0(j4));
                        iD += iC0 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        iV = CodedOutputStream.W(i5, (MessageLite) unsafe.getObject(abstractMessageLite, j), n(i3));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iL = SchemaUtil.f(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 19:
                    iL = SchemaUtil.d(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 20:
                    iL = SchemaUtil.j(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 21:
                    iL = SchemaUtil.u(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 22:
                    iL = SchemaUtil.h(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 23:
                    iL = SchemaUtil.f(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 24:
                    iL = SchemaUtil.d(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractMessageLite, j);
                    Class cls = SchemaUtil.f15116a;
                    int size2 = list.size();
                    iD += size2 == 0 ? 0 : (CodedOutputStream.Z(i5) + 1) * size2;
                    break;
                case 26:
                    iL = SchemaUtil.r(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 27:
                    iL = SchemaUtil.m(i5, (List) unsafe.getObject(abstractMessageLite, j), n(i3));
                    iD += iL;
                    break;
                case 28:
                    iL = SchemaUtil.a(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 29:
                    iL = SchemaUtil.s(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 30:
                    iL = SchemaUtil.b(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 31:
                    iL = SchemaUtil.d(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 32:
                    iL = SchemaUtil.f(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 33:
                    iL = SchemaUtil.n(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 34:
                    iL = SchemaUtil.p(i5, (List) unsafe.getObject(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 35:
                    int iG = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite, j));
                    if (iG > 0) {
                        iD = c.c(iG, CodedOutputStream.Z(i5), iG, iD);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite, j));
                    if (iE > 0) {
                        iD = c.c(iE, CodedOutputStream.Z(i5), iE, iD);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK = SchemaUtil.k((List) unsafe.getObject(abstractMessageLite, j));
                    if (iK > 0) {
                        iD = c.c(iK, CodedOutputStream.Z(i5), iK, iD);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iV2 = SchemaUtil.v((List) unsafe.getObject(abstractMessageLite, j));
                    if (iV2 > 0) {
                        iD = c.c(iV2, CodedOutputStream.Z(i5), iV2, iD);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i11 = SchemaUtil.i((List) unsafe.getObject(abstractMessageLite, j));
                    if (i11 > 0) {
                        iD = c.c(i11, CodedOutputStream.Z(i5), i11, iD);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG2 = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite, j));
                    if (iG2 > 0) {
                        iD = c.c(iG2, CodedOutputStream.Z(i5), iG2, iD);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite, j));
                    if (iE2 > 0) {
                        iD = c.c(iE2, CodedOutputStream.Z(i5), iE2, iD);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(abstractMessageLite, j);
                    Class cls2 = SchemaUtil.f15116a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        iD = c.c(size3, CodedOutputStream.Z(i5), size3, iD);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iT = SchemaUtil.t((List) unsafe.getObject(abstractMessageLite, j));
                    if (iT > 0) {
                        iD = c.c(iT, CodedOutputStream.Z(i5), iT, iD);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC2 = SchemaUtil.c((List) unsafe.getObject(abstractMessageLite, j));
                    if (iC2 > 0) {
                        iD = c.c(iC2, CodedOutputStream.Z(i5), iC2, iD);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite, j));
                    if (iE3 > 0) {
                        iD = c.c(iE3, CodedOutputStream.Z(i5), iE3, iD);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG3 = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite, j));
                    if (iG3 > 0) {
                        iD = c.c(iG3, CodedOutputStream.Z(i5), iG3, iD);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iO = SchemaUtil.o((List) unsafe.getObject(abstractMessageLite, j));
                    if (iO > 0) {
                        iD = c.c(iO, CodedOutputStream.Z(i5), iO, iD);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iQ = SchemaUtil.q((List) unsafe.getObject(abstractMessageLite, j));
                    if (iQ > 0) {
                        iD = c.c(iQ, CodedOutputStream.Z(i5), iQ, iD);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(abstractMessageLite, j);
                    Schema schemaN = n(i3);
                    Class cls3 = SchemaUtil.f15116a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        iW = 0;
                    } else {
                        iW = 0;
                        for (int i12 = 0; i12 < size4; i12++) {
                            iW += CodedOutputStream.W(i5, (MessageLite) list3.get(i12), schemaN);
                        }
                    }
                    iD += iW;
                    break;
                case 50:
                    this.p.d(i5, unsafe.getObject(abstractMessageLite, j), m(i3));
                    break;
                case 51:
                    if (s(i5, i3, abstractMessageLite)) {
                        iD = c.D(i5, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i5, i3, abstractMessageLite)) {
                        iD = c.D(i5, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i5, i3, abstractMessageLite)) {
                        long jB = B(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i5);
                        iC0 = CodedOutputStream.c0(jB);
                        iD += iC0 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i5, i3, abstractMessageLite)) {
                        long jB2 = B(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i5);
                        iC0 = CodedOutputStream.c0(jB2);
                        iD += iC0 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i5, i3, abstractMessageLite)) {
                        int iA = A(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i5);
                        iX = CodedOutputStream.X(iA);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i5, i3, abstractMessageLite)) {
                        iV = CodedOutputStream.V(i5);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i5, i3, abstractMessageLite)) {
                        iV = CodedOutputStream.U(i5);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i5, i3, abstractMessageLite)) {
                        iD = c.D(i5, 1, iD);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!s(i5, i3, abstractMessageLite)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(abstractMessageLite, j);
                        if (object2 instanceof ByteString) {
                            int iZ5 = CodedOutputStream.Z(i5);
                            int size5 = ((ByteString) object2).size();
                            iC = c.c(size5, size5, iZ5, iD);
                            iD = iC;
                            break;
                        } else {
                            iZ3 = CodedOutputStream.Z(i5);
                            iY = CodedOutputStream.Y((String) object2);
                            iC = iY + iZ3 + iD;
                            iD = iC;
                        }
                    }
                case 60:
                    if (s(i5, i3, abstractMessageLite)) {
                        iL = SchemaUtil.l(i5, unsafe.getObject(abstractMessageLite, j), n(i3));
                        iD += iL;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i5, i3, abstractMessageLite)) {
                        iV = CodedOutputStream.S(i5, (ByteString) unsafe.getObject(abstractMessageLite, j));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i5, i3, abstractMessageLite)) {
                        iV = CodedOutputStream.a0(i5, A(j, abstractMessageLite));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i5, i3, abstractMessageLite)) {
                        int iA2 = A(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i5);
                        iX = CodedOutputStream.X(iA2);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i5, i3, abstractMessageLite)) {
                        iD = c.D(i5, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i5, i3, abstractMessageLite)) {
                        iD = c.D(i5, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i5, i3, abstractMessageLite)) {
                        int iA3 = A(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i5);
                        iX = CodedOutputStream.b0(CodedOutputStream.d0(iA3));
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i5, i3, abstractMessageLite)) {
                        long jB3 = B(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i5);
                        iC0 = CodedOutputStream.c0(CodedOutputStream.e0(jB3));
                        iD += iC0 + iZ;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i5, i3, abstractMessageLite)) {
                        iV = CodedOutputStream.W(i5, (MessageLite) unsafe.getObject(abstractMessageLite, j), n(i3));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
            }
            i3 += 3;
        }
    }

    public final int q(AbstractMessageLite abstractMessageLite) {
        int iZ;
        int iC0;
        int iZ2;
        int iX;
        int iV;
        int iZ3;
        int iY;
        int iL;
        int iW;
        Unsafe unsafe = r;
        int i = 0;
        int iD = 0;
        while (true) {
            int[] iArr = this.f15110a;
            if (i >= iArr.length) {
                UnknownFieldSchema unknownFieldSchema = this.n;
                return iD + unknownFieldSchema.h(unknownFieldSchema.g(abstractMessageLite));
            }
            int iN = N(i);
            int iM = M(iN);
            int i2 = iArr[i];
            long j = iN & 1048575;
            if (iM >= FieldType.h.d && iM <= FieldType.i.d) {
                int i3 = iArr[i + 2];
            }
            switch (iM) {
                case 0:
                    if (r(i, abstractMessageLite)) {
                        iD = c.D(i2, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (r(i, abstractMessageLite)) {
                        iD = c.D(i2, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (r(i, abstractMessageLite)) {
                        long jL = UnsafeUtil.d.l(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i2);
                        iC0 = CodedOutputStream.c0(jL);
                        iV = iC0 + iZ;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (r(i, abstractMessageLite)) {
                        long jL2 = UnsafeUtil.d.l(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i2);
                        iC0 = CodedOutputStream.c0(jL2);
                        iV = iC0 + iZ;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (r(i, abstractMessageLite)) {
                        int iJ = UnsafeUtil.d.j(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i2);
                        iX = CodedOutputStream.X(iJ);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (r(i, abstractMessageLite)) {
                        iV = CodedOutputStream.V(i2);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (r(i, abstractMessageLite)) {
                        iV = CodedOutputStream.U(i2);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (r(i, abstractMessageLite)) {
                        iD = c.D(i2, 1, iD);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (r(i, abstractMessageLite)) {
                        Object objM = UnsafeUtil.d.m(j, abstractMessageLite);
                        if (objM instanceof ByteString) {
                            int iZ4 = CodedOutputStream.Z(i2);
                            int size = ((ByteString) objM).size();
                            iD = c.c(size, size, iZ4, iD);
                            break;
                        } else {
                            iZ3 = CodedOutputStream.Z(i2);
                            iY = CodedOutputStream.Y((String) objM);
                            iD = iY + iZ3 + iD;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (r(i, abstractMessageLite)) {
                        iL = SchemaUtil.l(i2, UnsafeUtil.d.m(j, abstractMessageLite), n(i));
                        iD += iL;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (r(i, abstractMessageLite)) {
                        iV = CodedOutputStream.S(i2, (ByteString) UnsafeUtil.d.m(j, abstractMessageLite));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (r(i, abstractMessageLite)) {
                        iV = CodedOutputStream.a0(i2, UnsafeUtil.d.j(j, abstractMessageLite));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (r(i, abstractMessageLite)) {
                        int iJ2 = UnsafeUtil.d.j(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i2);
                        iX = CodedOutputStream.X(iJ2);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (r(i, abstractMessageLite)) {
                        iD = c.D(i2, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (r(i, abstractMessageLite)) {
                        iD = c.D(i2, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (r(i, abstractMessageLite)) {
                        int iJ3 = UnsafeUtil.d.j(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i2);
                        iX = CodedOutputStream.b0(CodedOutputStream.d0(iJ3));
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (r(i, abstractMessageLite)) {
                        long jL3 = UnsafeUtil.d.l(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i2);
                        iC0 = CodedOutputStream.c0(CodedOutputStream.e0(jL3));
                        iV = iC0 + iZ;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (r(i, abstractMessageLite)) {
                        iV = CodedOutputStream.W(i2, (MessageLite) UnsafeUtil.d.m(j, abstractMessageLite), n(i));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iL = SchemaUtil.f(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 19:
                    iL = SchemaUtil.d(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 20:
                    iL = SchemaUtil.j(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 21:
                    iL = SchemaUtil.u(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 22:
                    iL = SchemaUtil.h(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 23:
                    iL = SchemaUtil.f(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 24:
                    iL = SchemaUtil.d(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 25:
                    List listT = t(abstractMessageLite, j);
                    Class cls = SchemaUtil.f15116a;
                    int size2 = listT.size();
                    iD += size2 == 0 ? 0 : (CodedOutputStream.Z(i2) + 1) * size2;
                    break;
                case 26:
                    iL = SchemaUtil.r(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 27:
                    iL = SchemaUtil.m(i2, t(abstractMessageLite, j), n(i));
                    iD += iL;
                    break;
                case 28:
                    iL = SchemaUtil.a(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 29:
                    iL = SchemaUtil.s(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 30:
                    iL = SchemaUtil.b(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 31:
                    iL = SchemaUtil.d(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 32:
                    iL = SchemaUtil.f(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 33:
                    iL = SchemaUtil.n(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 34:
                    iL = SchemaUtil.p(i2, t(abstractMessageLite, j));
                    iD += iL;
                    break;
                case 35:
                    int iG = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite, j));
                    if (iG > 0) {
                        iD = c.c(iG, CodedOutputStream.Z(i2), iG, iD);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite, j));
                    if (iE > 0) {
                        iD = c.c(iE, CodedOutputStream.Z(i2), iE, iD);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK = SchemaUtil.k((List) unsafe.getObject(abstractMessageLite, j));
                    if (iK > 0) {
                        iD = c.c(iK, CodedOutputStream.Z(i2), iK, iD);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iV2 = SchemaUtil.v((List) unsafe.getObject(abstractMessageLite, j));
                    if (iV2 > 0) {
                        iD = c.c(iV2, CodedOutputStream.Z(i2), iV2, iD);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i4 = SchemaUtil.i((List) unsafe.getObject(abstractMessageLite, j));
                    if (i4 > 0) {
                        iD = c.c(i4, CodedOutputStream.Z(i2), i4, iD);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG2 = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite, j));
                    if (iG2 > 0) {
                        iD = c.c(iG2, CodedOutputStream.Z(i2), iG2, iD);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite, j));
                    if (iE2 > 0) {
                        iD = c.c(iE2, CodedOutputStream.Z(i2), iE2, iD);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(abstractMessageLite, j);
                    Class cls2 = SchemaUtil.f15116a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        iD = c.c(size3, CodedOutputStream.Z(i2), size3, iD);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iT = SchemaUtil.t((List) unsafe.getObject(abstractMessageLite, j));
                    if (iT > 0) {
                        iD = c.c(iT, CodedOutputStream.Z(i2), iT, iD);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = SchemaUtil.c((List) unsafe.getObject(abstractMessageLite, j));
                    if (iC > 0) {
                        iD = c.c(iC, CodedOutputStream.Z(i2), iC, iD);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite, j));
                    if (iE3 > 0) {
                        iD = c.c(iE3, CodedOutputStream.Z(i2), iE3, iD);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG3 = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite, j));
                    if (iG3 > 0) {
                        iD = c.c(iG3, CodedOutputStream.Z(i2), iG3, iD);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iO = SchemaUtil.o((List) unsafe.getObject(abstractMessageLite, j));
                    if (iO > 0) {
                        iD = c.c(iO, CodedOutputStream.Z(i2), iO, iD);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iQ = SchemaUtil.q((List) unsafe.getObject(abstractMessageLite, j));
                    if (iQ > 0) {
                        iD = c.c(iQ, CodedOutputStream.Z(i2), iQ, iD);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List listT2 = t(abstractMessageLite, j);
                    Schema schemaN = n(i);
                    Class cls3 = SchemaUtil.f15116a;
                    int size4 = listT2.size();
                    if (size4 == 0) {
                        iW = 0;
                    } else {
                        iW = 0;
                        for (int i5 = 0; i5 < size4; i5++) {
                            iW += CodedOutputStream.W(i2, (MessageLite) listT2.get(i5), schemaN);
                        }
                    }
                    iD += iW;
                    break;
                case 50:
                    this.p.d(i2, UnsafeUtil.d.m(j, abstractMessageLite), m(i));
                    break;
                case 51:
                    if (s(i2, i, abstractMessageLite)) {
                        iD = c.D(i2, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i2, i, abstractMessageLite)) {
                        iD = c.D(i2, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i2, i, abstractMessageLite)) {
                        long jB = B(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i2);
                        iC0 = CodedOutputStream.c0(jB);
                        iV = iC0 + iZ;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i2, i, abstractMessageLite)) {
                        long jB2 = B(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i2);
                        iC0 = CodedOutputStream.c0(jB2);
                        iV = iC0 + iZ;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i2, i, abstractMessageLite)) {
                        int iA = A(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i2);
                        iX = CodedOutputStream.X(iA);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i2, i, abstractMessageLite)) {
                        iV = CodedOutputStream.V(i2);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i2, i, abstractMessageLite)) {
                        iV = CodedOutputStream.U(i2);
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i2, i, abstractMessageLite)) {
                        iD = c.D(i2, 1, iD);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i2, i, abstractMessageLite)) {
                        Object objM2 = UnsafeUtil.d.m(j, abstractMessageLite);
                        if (objM2 instanceof ByteString) {
                            int iZ5 = CodedOutputStream.Z(i2);
                            int size5 = ((ByteString) objM2).size();
                            iD = c.c(size5, size5, iZ5, iD);
                            break;
                        } else {
                            iZ3 = CodedOutputStream.Z(i2);
                            iY = CodedOutputStream.Y((String) objM2);
                            iD = iY + iZ3 + iD;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (s(i2, i, abstractMessageLite)) {
                        iL = SchemaUtil.l(i2, UnsafeUtil.d.m(j, abstractMessageLite), n(i));
                        iD += iL;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i2, i, abstractMessageLite)) {
                        iV = CodedOutputStream.S(i2, (ByteString) UnsafeUtil.d.m(j, abstractMessageLite));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i2, i, abstractMessageLite)) {
                        iV = CodedOutputStream.a0(i2, A(j, abstractMessageLite));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i2, i, abstractMessageLite)) {
                        int iA2 = A(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i2);
                        iX = CodedOutputStream.X(iA2);
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i2, i, abstractMessageLite)) {
                        iD = c.D(i2, 4, iD);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i2, i, abstractMessageLite)) {
                        iD = c.D(i2, 8, iD);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i2, i, abstractMessageLite)) {
                        int iA3 = A(j, abstractMessageLite);
                        iZ2 = CodedOutputStream.Z(i2);
                        iX = CodedOutputStream.b0(CodedOutputStream.d0(iA3));
                        iV = iX + iZ2;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i2, i, abstractMessageLite)) {
                        long jB3 = B(j, abstractMessageLite);
                        iZ = CodedOutputStream.Z(i2);
                        iC0 = CodedOutputStream.c0(CodedOutputStream.e0(jB3));
                        iV = iC0 + iZ;
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i2, i, abstractMessageLite)) {
                        iV = CodedOutputStream.W(i2, (MessageLite) UnsafeUtil.d.m(j, abstractMessageLite), n(i));
                        iD += iV;
                        break;
                    } else {
                        break;
                    }
            }
            i += 3;
        }
    }

    public final boolean r(int i, Object obj) {
        if (this.h) {
            int iN = N(i);
            long j = iN & 1048575;
            switch (M(iN)) {
                case 0:
                    if (UnsafeUtil.d.h(j, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (UnsafeUtil.d.i(j, obj) == BitmapDescriptorFactory.HUE_RED) {
                        return false;
                    }
                    break;
                case 2:
                    if (UnsafeUtil.d.l(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (UnsafeUtil.d.l(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (UnsafeUtil.d.j(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (UnsafeUtil.d.l(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (UnsafeUtil.d.j(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return UnsafeUtil.d.e(j, obj);
                case 8:
                    Object objM = UnsafeUtil.d.m(j, obj);
                    if (objM instanceof String) {
                        return !((String) objM).isEmpty();
                    }
                    if (objM instanceof ByteString) {
                        return !ByteString.e.equals(objM);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (UnsafeUtil.d.m(j, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.e.equals(UnsafeUtil.d.m(j, obj));
                case 11:
                    if (UnsafeUtil.d.j(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (UnsafeUtil.d.j(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (UnsafeUtil.d.j(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (UnsafeUtil.d.l(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (UnsafeUtil.d.j(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (UnsafeUtil.d.l(j, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (UnsafeUtil.d.m(j, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((UnsafeUtil.d.j(r6 & 1048575, obj) & (1 << (this.f15110a[i + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean s(int i, int i2, Object obj) {
        return UnsafeUtil.d.j((long) (this.f15110a[i2 + 2] & 1048575), obj) == i;
    }

    public final void u(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jN = N(i) & 1048575;
        Object objM = UnsafeUtil.d.m(jN, obj);
        MapFieldSchema mapFieldSchema = this.p;
        if (objM == null) {
            objM = mapFieldSchema.g();
            UnsafeUtil.p(obj, jN, objM);
        } else if (mapFieldSchema.h(objM)) {
            MapFieldLite mapFieldLiteG = mapFieldSchema.g();
            mapFieldSchema.a(mapFieldLiteG, objM);
            UnsafeUtil.p(obj, jN, mapFieldLiteG);
            objM = mapFieldLiteG;
        }
        MapFieldLite mapFieldLiteE = mapFieldSchema.e(objM);
        mapFieldSchema.b(obj2);
        reader.N(mapFieldLiteE, null);
    }

    public final void v(int i, Object obj, Object obj2) {
        long jN = N(i) & 1048575;
        if (r(i, obj2)) {
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            Object objM = memoryAccessor.m(jN, obj);
            Object objM2 = memoryAccessor.m(jN, obj2);
            if (objM != null && objM2 != null) {
                UnsafeUtil.p(obj, jN, Internal.c(objM, objM2));
                J(i, obj);
            } else if (objM2 != null) {
                UnsafeUtil.p(obj, jN, objM2);
                J(i, obj);
            }
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int iN = N(i);
        int i2 = this.f15110a[i];
        long j = iN & 1048575;
        if (s(i2, i, obj2)) {
            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.d;
            Object objM = memoryAccessor.m(j, obj);
            Object objM2 = memoryAccessor.m(j, obj2);
            if (objM != null && objM2 != null) {
                UnsafeUtil.p(obj, j, Internal.c(objM, objM2));
                K(i2, i, obj);
            } else if (objM2 != null) {
                UnsafeUtil.p(obj, j, objM2);
                K(i2, i, obj);
            }
        }
    }
}
