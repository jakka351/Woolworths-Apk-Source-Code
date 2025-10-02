package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.SmallSortedMap;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

@CheckReturnValue
/* loaded from: classes.dex */
final class SchemaUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f16080a;
    public static final UnknownFieldSchema b;
    public static final UnknownFieldSetLiteSchema c;

    static {
        Class<?> cls;
        Class<?> cls2;
        UnknownFieldSchema unknownFieldSchema = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f16080a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                unknownFieldSchema = (UnknownFieldSchema) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = unknownFieldSchema;
        c = new UnknownFieldSetLiteSchema();
    }

    public static void A(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i, list, z);
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iS = 0;
            while (i < size) {
                iS += CodedOutputStream.S(((Integer) list.get(i)).intValue());
                i++;
            }
            return iS;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iS2 = 0;
        while (i < size) {
            iS2 += CodedOutputStream.S(intArrayList.getInt(i));
            i++;
        }
        return iS2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.V(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.V(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iS = 0;
            while (i < size) {
                iS += CodedOutputStream.S(((Integer) list.get(i)).intValue());
                i++;
            }
            return iS;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iS2 = 0;
        while (i < size) {
            iS2 += CodedOutputStream.S(intArrayList.getInt(i));
            i++;
        }
        return iS2;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iX = 0;
            while (i < size) {
                iX += CodedOutputStream.X(((Long) list.get(i)).longValue());
                i++;
            }
            return iX;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += CodedOutputStream.X(longArrayList.i(i));
            i++;
        }
        return iX2;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iW = 0;
            while (i < size) {
                iW += CodedOutputStream.W(CodedOutputStream.Y(((Integer) list.get(i)).intValue()));
                i++;
            }
            return iW;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += CodedOutputStream.W(CodedOutputStream.Y(intArrayList.getInt(i)));
            i++;
        }
        return iW2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iX = 0;
            while (i < size) {
                iX += CodedOutputStream.X(CodedOutputStream.Z(((Long) list.get(i)).longValue()));
                i++;
            }
            return iX;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += CodedOutputStream.X(CodedOutputStream.Z(longArrayList.i(i)));
            i++;
        }
        return iX2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iW = 0;
            while (i < size) {
                iW += CodedOutputStream.W(((Integer) list.get(i)).intValue());
                i++;
            }
            return iW;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += CodedOutputStream.W(intArrayList.getInt(i));
            i++;
        }
        return iW2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iX = 0;
            while (i < size) {
                iX += CodedOutputStream.X(((Long) list.get(i)).longValue());
                i++;
            }
            return iX;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += CodedOutputStream.X(longArrayList.i(i));
            i++;
        }
        return iX2;
    }

    public static Object j(Object obj, int i, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumLiteMap == null) {
            return obj2;
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
                obj2 = n(obj, i, iIntValue, obj2, unknownFieldSchema);
            }
        }
        if (i2 != size) {
            abstractList.subList(i2, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i, List list, Internal.EnumVerifier enumVerifier, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.a(iIntValue)) {
                    obj2 = n(obj, i, iIntValue, obj2, unknownFieldSchema);
                    it.remove();
                }
            }
            return obj2;
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
                obj2 = n(obj, i, iIntValue2, obj2, unknownFieldSchema);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void l(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        FieldSet fieldSetC = extensionSchema.c(obj2);
        if (fieldSetC.f16049a.isEmpty()) {
            return;
        }
        FieldSet fieldSetD = extensionSchema.d(obj);
        fieldSetD.getClass();
        int i = 0;
        while (true) {
            anonymousClass1 = fieldSetC.f16049a;
            if (i >= anonymousClass1.e.size()) {
                break;
            }
            fieldSetD.l(anonymousClass1.c(i));
            i++;
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            fieldSetD.l((Map.Entry) it.next());
        }
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object n(Object obj, int i, int i2, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.f(obj);
        }
        unknownFieldSchema.e(obj2, i, i2);
        return obj2;
    }

    public static void o(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.G(i, list, z);
    }

    public static void p(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.t(i, list, z);
    }

    public static void q(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i, list, z);
    }

    public static void r(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i, list, z);
    }

    public static void s(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i, list, z);
    }

    public static void t(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.f(i, list, z);
    }

    public static void u(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.I(i, list, z);
    }

    public static void v(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.F(i, list, z);
    }

    public static void w(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i, list, z);
    }

    public static void x(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.s(i, list, z);
    }

    public static void y(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i, list, z);
    }

    public static void z(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.i(i, list, z);
    }
}
