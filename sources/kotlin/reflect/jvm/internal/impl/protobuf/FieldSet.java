package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes.dex */
final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {
    public static final FieldSet d = new FieldSet(0);

    /* renamed from: a, reason: collision with root package name */
    public final SmallSortedMap.AnonymousClass1 f24509a;
    public boolean b;
    public boolean c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24510a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            b = iArr;
            try {
                iArr[WireFormat.FieldType.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[WireFormat.FieldType.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[WireFormat.FieldType.h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[WireFormat.FieldType.i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[WireFormat.FieldType.j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[WireFormat.FieldType.k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[WireFormat.FieldType.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[WireFormat.FieldType.m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[WireFormat.FieldType.n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat.FieldType.q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat.FieldType.r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat.FieldType.t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat.FieldType.u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat.FieldType.v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat.FieldType.w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat.FieldType.o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat.FieldType.p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat.FieldType.s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f24510a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f24510a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f24510a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f24510a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f24510a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f24510a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                int[] iArr8 = f24510a;
                WireFormat.JavaType javaType7 = WireFormat.JavaType.INT;
                iArr8[6] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                int[] iArr9 = f24510a;
                WireFormat.JavaType javaType8 = WireFormat.JavaType.INT;
                iArr9[7] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                int[] iArr10 = f24510a;
                WireFormat.JavaType javaType9 = WireFormat.JavaType.INT;
                iArr10[8] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        GeneratedMessageLite.Builder N1(MessageLite.Builder builder, MessageLite messageLite);

        int g();

        WireFormat.FieldType h();

        WireFormat.JavaType i();

        boolean j();

        boolean k();
    }

    public FieldSet() {
        this.c = false;
        this.f24509a = new SmallSortedMap.AnonymousClass1(16);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) throws UnsupportedEncodingException {
        int serializedSize;
        int iF;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof LazyField)) {
                    return CodedOutputStream.e((MessageLite) obj);
                }
                serializedSize = ((LazyField) obj).f24515a.getSerializedSize();
                iF = CodedOutputStream.f(serializedSize);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    return CodedOutputStream.f(bArr.length) + bArr.length;
                }
                ByteString byteString = (ByteString) obj;
                serializedSize = CodedOutputStream.f(byteString.size());
                iF = byteString.size();
                break;
            case 12:
                return CodedOutputStream.f(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.c(((Internal.EnumLite) obj).g()) : CodedOutputStream.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iF + serializedSize;
    }

    public static int d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeH = fieldDescriptorLite.h();
        int iG = fieldDescriptorLite.g();
        if (!fieldDescriptorLite.j()) {
            int iH = CodedOutputStream.h(iG);
            if (fieldTypeH == WireFormat.FieldType.o) {
                iH *= 2;
            }
            return iH + c(fieldTypeH, obj);
        }
        int iC = 0;
        if (fieldDescriptorLite.k()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC += c(fieldTypeH, it.next());
            }
            return CodedOutputStream.f(iC) + CodedOutputStream.h(iG) + iC;
        }
        for (Object obj2 : (List) obj) {
            int iH2 = CodedOutputStream.h(iG);
            if (fieldTypeH == WireFormat.FieldType.o) {
                iH2 *= 2;
            }
            iC += iH2 + c(fieldTypeH, obj2);
        }
        return iC;
    }

    public static boolean f(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.i() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (fieldDescriptorLite.j()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((MessageLite) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof MessageLite) {
            return ((MessageLite) value).isInitialized();
        }
        if (value instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static Object h(CodedInputStream codedInputStream, WireFormat.FieldType fieldType) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(codedInputStream.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(codedInputStream.i()));
            case 2:
                return Long.valueOf(codedInputStream.l());
            case 3:
                return Long.valueOf(codedInputStream.l());
            case 4:
                return Integer.valueOf(codedInputStream.k());
            case 5:
                return Long.valueOf(codedInputStream.j());
            case 6:
                return Integer.valueOf(codedInputStream.i());
            case 7:
                return Boolean.valueOf(codedInputStream.l() != 0);
            case 8:
                int iK = codedInputStream.k();
                int i = codedInputStream.b;
                int i2 = codedInputStream.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(codedInputStream.h(iK), "UTF-8");
                }
                String str = new String(codedInputStream.f24505a, i2, iK, "UTF-8");
                codedInputStream.d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return codedInputStream.e();
            case 12:
                return Integer.valueOf(codedInputStream.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(codedInputStream.i());
            case 15:
                return Long.valueOf(codedInputStream.j());
            case 16:
                int iK2 = codedInputStream.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = codedInputStream.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.d
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L24;
                case 7: goto L1b;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3e
        Lf:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            if (r2 != 0) goto L19
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.LazyField
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            r1 = r0
            goto L3e
        L1b:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L19
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            if (r2 == 0) goto L18
            goto L19
        L24:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.ByteString
            if (r2 != 0) goto L19
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L18
            goto L19
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.j(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void k(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.o) {
            codedOutputStream.x(i, 3);
            ((MessageLite) obj).a(codedOutputStream);
            codedOutputStream.x(i, 4);
        }
        codedOutputStream.x(i, fieldType.e);
        switch (fieldType.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.n(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.v(bytes.length);
                codedOutputStream.s(bytes);
                break;
            case 9:
                codedOutputStream.getClass();
                ((MessageLite) obj).a(codedOutputStream);
                break;
            case 10:
                codedOutputStream.p((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(bArr.length);
                    codedOutputStream.s(bArr);
                    break;
                } else {
                    ByteString byteString = (ByteString) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(byteString.size());
                    codedOutputStream.r(byteString);
                    break;
                }
            case 12:
                codedOutputStream.v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.n(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.n(((Internal.EnumLite) obj).g());
                    break;
                }
            case 14:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List arrayList;
        if (!((GeneratedMessageLite.ExtensionDescriptor) fieldDescriptorLite).f) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(((GeneratedMessageLite.ExtensionDescriptor) fieldDescriptorLite).e, obj);
        Object objE = e(fieldDescriptorLite);
        if (objE == null) {
            arrayList = new ArrayList();
            this.f24509a.put(fieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objE;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        FieldSet fieldSet = new FieldSet();
        int i = 0;
        while (true) {
            anonymousClass1 = this.f24509a;
            if (i >= anonymousClass1.e.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) anonymousClass1.e.get(i);
            fieldSet.i((FieldDescriptorLite) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : anonymousClass1.c()) {
            fieldSet.i((FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        fieldSet.c = this.c;
        return fieldSet;
    }

    public final Object e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f24509a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).a() : obj;
    }

    public final void g(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).a();
        }
        boolean zJ = fieldDescriptorLite.j();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f24509a;
        if (zJ) {
            Object objE = e(fieldDescriptorLite);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            anonymousClass1.put(fieldDescriptorLite, objE);
            return;
        }
        if (fieldDescriptorLite.i() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            anonymousClass1.put(fieldDescriptorLite, value);
            return;
        }
        Object objE2 = e(fieldDescriptorLite);
        if (objE2 != null) {
            anonymousClass1.put(fieldDescriptorLite, fieldDescriptorLite.N1(((MessageLite) objE2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        anonymousClass1.put(fieldDescriptorLite, value);
    }

    public final void i(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.j()) {
            j(fieldDescriptorLite.h(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(fieldDescriptorLite.h(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.f24509a.put(fieldDescriptorLite, obj);
    }

    public FieldSet(int i) {
        this.c = false;
        SmallSortedMap.AnonymousClass1 anonymousClass1 = new SmallSortedMap.AnonymousClass1(0);
        this.f24509a = anonymousClass1;
        if (this.b) {
            return;
        }
        anonymousClass1.e();
        this.b = true;
    }
}
