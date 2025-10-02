package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class SchemaUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f15116a;
    public static final UnknownFieldSchema b;
    public static final UnknownFieldSchema c;
    public static final UnknownFieldSetLiteSchema d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f15116a = cls;
        b = y(false);
        c = y(true);
        d = new UnknownFieldSetLiteSchema();
    }

    public static Object A(int i, int i2, Object obj, UnknownFieldSchema unknownFieldSchema) {
        if (obj == null) {
            obj = unknownFieldSchema.m();
        }
        unknownFieldSchema.e(obj, i, i2);
        return obj;
    }

    public static void B(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.G(i, list, z);
    }

    public static void C(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.t(i, list, z);
    }

    public static void D(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.z(i, list, z);
    }

    public static void E(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i, list, z);
    }

    public static void F(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i, list, z);
    }

    public static void G(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i, list, z);
    }

    public static void H(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.f(i, list, z);
    }

    public static void I(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.I(i, list, z);
    }

    public static void J(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.F(i, list, z);
    }

    public static void K(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i, list, z);
    }

    public static void L(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.s(i, list, z);
    }

    public static void M(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i, list, z);
    }

    public static void N(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.i(i, list, z);
    }

    public static void O(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i, list, z);
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = CodedOutputStream.Z(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZ += CodedOutputStream.T((ByteString) list.get(i2));
        }
        return iZ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.Z(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iX = 0;
            while (i < size) {
                iX += CodedOutputStream.X(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += CodedOutputStream.X(intArrayList.getInt(i));
            i++;
        }
        return iX2;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.U(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.V(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.Z(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iX = 0;
            while (i < size) {
                iX += CodedOutputStream.X(((Integer) list.get(i)).intValue());
                i++;
            }
            return iX;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += CodedOutputStream.X(intArrayList.getInt(i));
            i++;
        }
        return iX2;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.Z(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += CodedOutputStream.c0(((Long) list.get(i)).longValue());
                i++;
            }
            return iC0;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iC02 = 0;
        while (i < size) {
            iC02 += CodedOutputStream.c0(longArrayList.i(i));
            i++;
        }
        return iC02;
    }

    public static int l(int i, Object obj, Schema schema) {
        int iZ;
        int serializedSize;
        int iB0;
        if (obj instanceof LazyFieldLite) {
            iZ = CodedOutputStream.Z(i);
            serializedSize = ((LazyFieldLite) obj).a();
            iB0 = CodedOutputStream.b0(serializedSize);
        } else {
            iZ = CodedOutputStream.Z(i);
            serializedSize = ((AbstractMessageLite) ((MessageLite) obj)).getSerializedSize(schema);
            iB0 = CodedOutputStream.b0(serializedSize);
        }
        return iB0 + serializedSize + iZ;
    }

    public static int m(int i, List list, Schema schema) {
        int serializedSize;
        int iB0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZ = CodedOutputStream.Z(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof LazyFieldLite) {
                serializedSize = ((LazyFieldLite) obj).a();
                iB0 = CodedOutputStream.b0(serializedSize);
            } else {
                serializedSize = ((AbstractMessageLite) ((MessageLite) obj)).getSerializedSize(schema);
                iB0 = CodedOutputStream.b0(serializedSize);
            }
            iZ = iB0 + serializedSize + iZ;
        }
        return iZ;
    }

    public static int n(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.Z(i) * size) + o(list);
    }

    public static int o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += CodedOutputStream.b0(CodedOutputStream.d0(((Integer) list.get(i)).intValue()));
                i++;
            }
            return iB0;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += CodedOutputStream.b0(CodedOutputStream.d0(intArrayList.getInt(i)));
            i++;
        }
        return iB02;
    }

    public static int p(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.Z(i) * size) + q(list);
    }

    public static int q(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += CodedOutputStream.c0(CodedOutputStream.e0(((Long) list.get(i)).longValue()));
                i++;
            }
            return iC0;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iC02 = 0;
        while (i < size) {
            iC02 += CodedOutputStream.c0(CodedOutputStream.e0(longArrayList.i(i)));
            i++;
        }
        return iC02;
    }

    public static int r(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZ = CodedOutputStream.Z(i) * size;
        if (!(list instanceof LazyStringList)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof ByteString) {
                    int size2 = ((ByteString) obj).size();
                    iZ = CodedOutputStream.b0(size2) + size2 + iZ;
                } else {
                    iZ = CodedOutputStream.Y((String) obj) + iZ;
                }
                i2++;
            }
            return iZ;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i2 < size) {
            Object raw = lazyStringList.getRaw(i2);
            if (raw instanceof ByteString) {
                int size3 = ((ByteString) raw).size();
                iZ = CodedOutputStream.b0(size3) + size3 + iZ;
            } else {
                iZ = CodedOutputStream.Y((String) raw) + iZ;
            }
            i2++;
        }
        return iZ;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.Z(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iB0 = 0;
            while (i < size) {
                iB0 += CodedOutputStream.b0(((Integer) list.get(i)).intValue());
                i++;
            }
            return iB0;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iB02 = 0;
        while (i < size) {
            iB02 += CodedOutputStream.b0(intArrayList.getInt(i));
            i++;
        }
        return iB02;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.Z(i) * size) + v(list);
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iC0 = 0;
            while (i < size) {
                iC0 += CodedOutputStream.c0(((Long) list.get(i)).longValue());
                i++;
            }
            return iC0;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iC02 = 0;
        while (i < size) {
            iC02 += CodedOutputStream.c0(longArrayList.i(i));
            i++;
        }
        return iC02;
    }

    public static Object w(int i, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj, UnknownFieldSchema unknownFieldSchema) {
        if (enumLiteMap == null) {
            return obj;
        }
        int size = abstractList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) abstractList.get(i3);
            int iIntValue = num.intValue();
            if (enumLiteMap.a(iIntValue) != null) {
                if (i3 != i2) {
                    abstractList.set(i2, num);
                }
                i2++;
            } else {
                obj = A(i, iIntValue, obj, unknownFieldSchema);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj;
    }

    public static Object x(int i, List list, Internal.EnumVerifier enumVerifier, Object obj, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.a(iIntValue)) {
                    obj = A(i, iIntValue, obj, unknownFieldSchema);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (enumVerifier.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj = A(i, iIntValue2, obj, unknownFieldSchema);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj;
    }

    public static UnknownFieldSchema y(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (UnknownFieldSchema) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
