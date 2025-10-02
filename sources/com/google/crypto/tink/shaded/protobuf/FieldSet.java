package com.google.crypto.tink.shaded.protobuf;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.LazyField;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import com.google.crypto.tink.shaded.protobuf.SmallSortedMap;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {
    public static final FieldSet d = new FieldSet(0);

    /* renamed from: a, reason: collision with root package name */
    public final SmallSortedMap.AnonymousClass1 f15096a;
    public boolean b;
    public boolean c;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.FieldSet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15097a;
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
            f15097a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f15097a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f15097a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f15097a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f15097a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f15097a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f15097a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f15097a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f15097a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        GeneratedMessageLite.Builder Y(MessageLite.Builder builder, MessageLite messageLite);

        int g();

        WireFormat.FieldType h();

        WireFormat.JavaType i();

        boolean j();

        boolean k();
    }

    public FieldSet() {
        this.f15096a = new SmallSortedMap.AnonymousClass1(16);
    }

    public static int c(WireFormat.FieldType fieldType, int i, Object obj) {
        int iZ = CodedOutputStream.Z(i);
        if (fieldType == WireFormat.FieldType.o) {
            iZ *= 2;
        }
        return iZ + d(fieldType, obj);
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        int size;
        int iB0;
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
                return CodedOutputStream.c0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.c0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.X(((Integer) obj).intValue());
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
                    return CodedOutputStream.Y((String) obj);
                }
                Logger logger6 = CodedOutputStream.b;
                size = ((ByteString) obj).size();
                iB0 = CodedOutputStream.b0(size);
                break;
            case 9:
                Logger logger7 = CodedOutputStream.b;
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof LazyField)) {
                    Logger logger8 = CodedOutputStream.b;
                    size = ((MessageLite) obj).getSerializedSize();
                    iB0 = CodedOutputStream.b0(size);
                    break;
                } else {
                    Logger logger9 = CodedOutputStream.b;
                    size = ((LazyField) obj).a();
                    iB0 = CodedOutputStream.b0(size);
                    break;
                }
            case 11:
                if (!(obj instanceof ByteString)) {
                    Logger logger10 = CodedOutputStream.b;
                    size = ((byte[]) obj).length;
                    iB0 = CodedOutputStream.b0(size);
                    break;
                } else {
                    Logger logger11 = CodedOutputStream.b;
                    size = ((ByteString) obj).size();
                    iB0 = CodedOutputStream.b0(size);
                    break;
                }
            case 12:
                return CodedOutputStream.b0(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.X(((Internal.EnumLite) obj).g()) : CodedOutputStream.X(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger12 = CodedOutputStream.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger13 = CodedOutputStream.b;
                return 8;
            case 16:
                return CodedOutputStream.b0(CodedOutputStream.d0(((Integer) obj).intValue()));
            case 17:
                return CodedOutputStream.c0(CodedOutputStream.e0(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iB0 + size;
    }

    public static int e(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeH = fieldDescriptorLite.h();
        int iG = fieldDescriptorLite.g();
        if (!fieldDescriptorLite.j()) {
            return c(fieldTypeH, iG, obj);
        }
        int iC = 0;
        if (!fieldDescriptorLite.k()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC += c(fieldTypeH, iG, it.next());
            }
            return iC;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iC += d(fieldTypeH, it2.next());
        }
        return CodedOutputStream.b0(iC) + CodedOutputStream.Z(iG) + iC;
    }

    public static int i(Map.Entry entry) {
        int iZ = CodedOutputStream.Z(3);
        int iZ2 = CodedOutputStream.Z(1);
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.i() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.j() || fieldDescriptorLite.k()) {
            return e(fieldDescriptorLite, value);
        }
        if (value instanceof LazyField) {
            int iA0 = CodedOutputStream.a0(2, ((FieldDescriptorLite) entry.getKey()).g()) + (iZ2 * 2);
            int iA = ((LazyField) value).a();
            return c.c(iA, iA, iZ, iA0);
        }
        int iA02 = CodedOutputStream.a0(2, ((FieldDescriptorLite) entry.getKey()).g()) + (iZ2 * 2);
        int serializedSize = ((MessageLite) value).getSerializedSize();
        return c.c(serializedSize, serializedSize, iZ, iA02);
    }

    public static boolean m(Map.Entry entry) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            java.nio.charset.Charset r0 = com.google.crypto.tink.shaded.protobuf.Internal.f15103a
            r3.getClass()
            com.google.crypto.tink.shaded.protobuf.WireFormat$JavaType r2 = r2.d
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
                case 8: goto L12;
                default: goto L10;
            }
        L10:
            r0 = r1
            goto L3e
        L12:
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.MessageLite
            if (r2 != 0) goto L3e
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.LazyField
            if (r2 == 0) goto L10
            goto L3e
        L1b:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L3e
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
            if (r2 == 0) goto L10
            goto L3e
        L24:
            boolean r2 = r3 instanceof com.google.crypto.tink.shaded.protobuf.ByteString
            if (r2 != 0) goto L3e
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L10
            goto L3e
        L2d:
            boolean r0 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r0 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r0 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r0 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r0 = r3 instanceof java.lang.Integer
        L3e:
            if (r0 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.FieldSet.s(com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void t(CodedOutputStream codedOutputStream, int i, Object obj) {
        if (WireFormat.FieldType.o != null) {
            throw null;
        }
        codedOutputStream.p0(i, 3);
        ((MessageLite) obj).writeTo(codedOutputStream);
        codedOutputStream.p0(i, 4);
    }

    public final void a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List arrayList;
        if (!fieldDescriptorLite.j()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        s(fieldDescriptorLite.h(), obj);
        Object objG = g(fieldDescriptorLite);
        if (objG == null) {
            arrayList = new ArrayList();
            this.f15096a.put(fieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objG;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        FieldSet fieldSet = new FieldSet();
        int i = 0;
        while (true) {
            anonymousClass1 = this.f15096a;
            if (i >= anonymousClass1.e.size()) {
                break;
            }
            Map.Entry entryC = anonymousClass1.c(i);
            fieldSet.r((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
            i++;
        }
        for (Map.Entry entry : anonymousClass1.d()) {
            fieldSet.r((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.c = this.c;
        return fieldSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f15096a.equals(((FieldSet) obj).f15096a);
        }
        return false;
    }

    public final Iterator f() {
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f15096a;
        if (this.c) {
            if (anonymousClass1.j == null) {
                anonymousClass1.j = new SmallSortedMap.DescendingEntrySet();
            }
            return new LazyField.LazyIterator(anonymousClass1.j.iterator());
        }
        if (anonymousClass1.j == null) {
            anonymousClass1.j = new SmallSortedMap.DescendingEntrySet();
        }
        return anonymousClass1.j.iterator();
    }

    public final Object g(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f15096a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).b(null) : obj;
    }

    public final int h() {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        int i = 0;
        int i2 = 0;
        while (true) {
            anonymousClass1 = this.f15096a;
            if (i >= anonymousClass1.e.size()) {
                break;
            }
            i2 += i(anonymousClass1.c(i));
            i++;
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            i2 += i((Map.Entry) it.next());
        }
        return i2;
    }

    public final int hashCode() {
        return this.f15096a.hashCode();
    }

    public final int j() {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        int i = 0;
        int iE = 0;
        while (true) {
            anonymousClass1 = this.f15096a;
            if (i >= anonymousClass1.e.size()) {
                break;
            }
            Map.Entry entryC = anonymousClass1.c(i);
            iE += e((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
            i++;
        }
        for (Map.Entry entry : anonymousClass1.d()) {
            iE += e((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iE;
    }

    public final boolean k() {
        return this.f15096a.isEmpty();
    }

    public final boolean l() {
        int i = 0;
        while (true) {
            SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f15096a;
            if (i >= anonymousClass1.e.size()) {
                Iterator it = anonymousClass1.d().iterator();
                while (it.hasNext()) {
                    if (!m((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!m(anonymousClass1.c(i))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final Iterator n() {
        boolean z = this.c;
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f15096a;
        return z ? new LazyField.LazyIterator(((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator()) : ((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator();
    }

    public final void o() {
        if (this.b) {
            return;
        }
        this.f15096a.f();
        this.b = true;
    }

    public final void p(FieldSet fieldSet) {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        int i = 0;
        while (true) {
            anonymousClass1 = fieldSet.f15096a;
            if (i >= anonymousClass1.e.size()) {
                break;
            }
            q(anonymousClass1.c(i));
            i++;
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).b(null);
        }
        boolean zJ = fieldDescriptorLite.j();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f15096a;
        if (zJ) {
            Object objG = g(fieldDescriptorLite);
            if (objG == null) {
                objG = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objG;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            anonymousClass1.put(fieldDescriptorLite, objG);
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
        Object objG2 = g(fieldDescriptorLite);
        if (objG2 != null) {
            anonymousClass1.put(fieldDescriptorLite, fieldDescriptorLite.Y(((MessageLite) objG2).toBuilder(), (MessageLite) value).p1());
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

    public final void r(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.j()) {
            s(fieldDescriptorLite.h(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s(fieldDescriptorLite.h(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.c = true;
        }
        this.f15096a.put(fieldDescriptorLite, obj);
    }

    public FieldSet(int i) {
        int i2 = SmallSortedMap.k;
        this.f15096a = new SmallSortedMap.AnonymousClass1(0);
        o();
        o();
    }
}
