package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.SmallSortedMap;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    public static final FieldSet d = new FieldSet(0);

    /* renamed from: a, reason: collision with root package name */
    public final SmallSortedMap.AnonymousClass1 f2639a = SmallSortedMap.g();
    public boolean b;
    public boolean c;

    /* renamed from: androidx.datastore.preferences.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2640a;
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
                b[WireFormat.FieldType.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[WireFormat.FieldType.p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WireFormat.FieldType.n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WireFormat.FieldType.q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WireFormat.FieldType.r.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[WireFormat.FieldType.t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[WireFormat.FieldType.u.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[WireFormat.FieldType.v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[WireFormat.FieldType.w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[WireFormat.FieldType.s.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f2640a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f2640a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f2640a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f2640a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f2640a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f2640a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f2640a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2640a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2640a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    /* loaded from: classes2.dex */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        int g();

        WireFormat.FieldType h();

        WireFormat.JavaType i();

        boolean j();

        boolean k();

        GeneratedMessageLite.Builder m0(MessageLite.Builder builder, MessageLite messageLite);
    }

    public FieldSet() {
    }

    public static int b(WireFormat.FieldType fieldType, int i, Object obj) {
        int iX = CodedOutputStream.X(i);
        if (fieldType == WireFormat.FieldType.o) {
            iX *= 2;
        }
        return iX + c(fieldType, obj);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) {
        int size;
        int iY;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.b;
                return 4;
            case 2:
                return CodedOutputStream.Z(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.Z(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Z(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.b;
                return 1;
            case 8:
                if (!(obj instanceof ByteString)) {
                    return CodedOutputStream.W((String) obj);
                }
                Logger logger6 = CodedOutputStream.b;
                size = ((ByteString) obj).size();
                iY = CodedOutputStream.Y(size);
                break;
            case 9:
                Logger logger7 = CodedOutputStream.b;
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof LazyField)) {
                    Logger logger8 = CodedOutputStream.b;
                    size = ((MessageLite) obj).getSerializedSize();
                    iY = CodedOutputStream.Y(size);
                    break;
                } else {
                    return CodedOutputStream.T((LazyField) obj);
                }
            case 11:
                if (!(obj instanceof ByteString)) {
                    Logger logger9 = CodedOutputStream.b;
                    size = ((byte[]) obj).length;
                    iY = CodedOutputStream.Y(size);
                    break;
                } else {
                    Logger logger10 = CodedOutputStream.b;
                    size = ((ByteString) obj).size();
                    iY = CodedOutputStream.Y(size);
                    break;
                }
            case 12:
                return CodedOutputStream.Y(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.Z(((Internal.EnumLite) obj).g()) : CodedOutputStream.Z(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = CodedOutputStream.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = CodedOutputStream.b;
                return 8;
            case 16:
                return CodedOutputStream.U(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.V(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iY + size;
    }

    public static int d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeH = fieldDescriptorLite.h();
        int iG = fieldDescriptorLite.g();
        if (!fieldDescriptorLite.j()) {
            return b(fieldTypeH, iG, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!fieldDescriptorLite.k()) {
            int iB = 0;
            while (i < size) {
                iB += b(fieldTypeH, iG, list.get(i));
                i++;
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iC = 0;
        while (i < size) {
            iC += c(fieldTypeH, list.get(i));
            i++;
        }
        return CodedOutputStream.Y(iC) + CodedOutputStream.X(iG) + iC;
    }

    public static int f(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.i() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.j() || fieldDescriptorLite.k()) {
            return d(fieldDescriptorLite, value);
        }
        if (value instanceof LazyField) {
            int iG = ((FieldDescriptorLite) entry.getKey()).g();
            return CodedOutputStream.T((LazyField) value) + CodedOutputStream.X(3) + CodedOutputStream.Y(iG) + CodedOutputStream.X(2) + (CodedOutputStream.X(1) * 2);
        }
        int iG2 = ((FieldDescriptorLite) entry.getKey()).g();
        int iY = CodedOutputStream.Y(iG2) + CodedOutputStream.X(2) + (CodedOutputStream.X(1) * 2);
        int iX = CodedOutputStream.X(3);
        int serializedSize = ((MessageLite) value).getSerializedSize();
        return CodedOutputStream.Y(serializedSize) + serializedSize + iX + iY;
    }

    public static boolean h(Map.Entry entry) {
        boolean zIsInitialized;
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.i() == WireFormat.JavaType.MESSAGE) {
            if (!fieldDescriptorLite.j()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).isInitialized();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (obj instanceof MessageLiteOrBuilder) {
                    zIsInitialized = ((MessageLiteOrBuilder) obj).isInitialized();
                } else {
                    if (!(obj instanceof LazyField)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite r3, java.lang.Object r4) {
        /*
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r0 = r3.h()
            java.nio.charset.Charset r1 = androidx.datastore.preferences.protobuf.Internal.f2648a
            r4.getClass()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r0 = r0.d
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L40;
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L28;
                case 7: goto L1f;
                case 8: goto L16;
                default: goto L14;
            }
        L14:
            r1 = r2
            goto L42
        L16:
            boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.MessageLite
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.LazyField
            if (r0 == 0) goto L14
            goto L42
        L1f:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.Internal.EnumLite
            if (r0 == 0) goto L14
            goto L42
        L28:
            boolean r0 = r4 instanceof androidx.datastore.preferences.protobuf.ByteString
            if (r0 != 0) goto L42
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L14
            goto L42
        L31:
            boolean r1 = r4 instanceof java.lang.String
            goto L42
        L34:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r1 = r4 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r1 = r4 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r1 = r4 instanceof java.lang.Long
            goto L42
        L40:
            boolean r1 = r4 instanceof java.lang.Integer
        L42:
            if (r1 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.g()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r3 = r3.h()
            androidx.datastore.preferences.protobuf.WireFormat$JavaType r3 = r3.d
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.FieldSet.m(androidx.datastore.preferences.protobuf.FieldSet$FieldDescriptorLite, java.lang.Object):void");
    }

    public static void n(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.o) {
            codedOutputStream.p0(i, 3);
            ((MessageLite) obj).b(codedOutputStream);
            codedOutputStream.p0(i, 4);
        }
        codedOutputStream.p0(i, fieldType.e);
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.h0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.g0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.i0(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.h0(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.g0(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.d0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.o0((String) obj);
                    break;
                } else {
                    codedOutputStream.f0((ByteString) obj);
                    break;
                }
            case 9:
                ((MessageLite) obj).b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.l0((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.e0(bArr.length, bArr);
                    break;
                } else {
                    codedOutputStream.f0((ByteString) obj);
                    break;
                }
            case 12:
                codedOutputStream.q0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.i0(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.i0(((Internal.EnumLite) obj).g());
                    break;
                }
            case 14:
                codedOutputStream.g0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.h0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.q0(CodedOutputStream.a0(((Integer) obj).intValue()));
                break;
            case 17:
                codedOutputStream.r0(CodedOutputStream.b0(((Long) obj).longValue()));
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        FieldSet fieldSet = new FieldSet();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f2639a;
        int size = anonymousClass1.d.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = anonymousClass1.c(i);
            fieldSet.l((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
        }
        for (Map.Entry entry : anonymousClass1.d()) {
            fieldSet.l((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.c = this.c;
        return fieldSet;
    }

    public final Object e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f2639a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).a(null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f2639a.equals(((FieldSet) obj).f2639a);
        }
        return false;
    }

    public final boolean g() {
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f2639a;
        int size = anonymousClass1.d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                Iterator it = anonymousClass1.d().iterator();
                while (it.hasNext()) {
                    if (!h((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!h(anonymousClass1.c(i))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2639a.hashCode();
    }

    public final Iterator i() {
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f2639a;
        return anonymousClass1.isEmpty() ? Collections.emptyIterator() : this.c ? new LazyField.LazyIterator(((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator()) : ((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator();
    }

    public final void j() {
        if (this.b) {
            return;
        }
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f2639a;
        int size = anonymousClass1.d.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = anonymousClass1.c(i);
            if (entryC.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) entryC.getValue();
                generatedMessageLite.getClass();
                Protobuf protobuf = Protobuf.c;
                protobuf.getClass();
                protobuf.a(generatedMessageLite.getClass()).c(generatedMessageLite);
                generatedMessageLite.o();
            }
        }
        anonymousClass1.f();
        this.b = true;
    }

    public final void k(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof LazyField;
        boolean zJ = fieldDescriptorLite.j();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f2639a;
        if (zJ) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
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
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
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
            if (z) {
                value = ((LazyField) value).a(null);
            }
            anonymousClass1.put(fieldDescriptorLite, fieldDescriptorLite.m0(((MessageLite) objE2).toBuilder(), (MessageLite) value).d());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        anonymousClass1.put(fieldDescriptorLite, value);
        if (z) {
            this.c = true;
        }
    }

    public final void l(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.j()) {
            m(fieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m(fieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.f2639a.put(fieldDescriptorLite, obj);
    }

    public FieldSet(int i) {
        j();
        j();
    }
}
