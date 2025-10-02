package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.SmallSortedMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

@CheckReturnValue
/* loaded from: classes.dex */
final class SchemaUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2670a;
    public static final UnknownFieldSchema b;
    public static final UnknownFieldSetLiteSchema c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Protobuf protobuf = Protobuf.c;
        UnknownFieldSchema unknownFieldSchema = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2670a = cls;
        try {
            Protobuf protobuf2 = Protobuf.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                unknownFieldSchema = (UnknownFieldSchema) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = unknownFieldSchema;
        c = new UnknownFieldSetLiteSchema();
    }

    public static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZ;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += CodedOutputStream.Z(intArrayList.getInt(i));
            i++;
        }
        return iZ2;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.X(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.X(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(((Integer) list.get(i)).intValue());
                i++;
            }
            return iZ;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += CodedOutputStream.Z(intArrayList.getInt(i));
            i++;
        }
        return iZ2;
    }

    public static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(((Long) list.get(i)).longValue());
                i++;
            }
            return iZ;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += CodedOutputStream.Z(longArrayList.h(i));
            i++;
        }
        return iZ2;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iU = 0;
            while (i < size) {
                iU += CodedOutputStream.U(((Integer) list.get(i)).intValue());
                i++;
            }
            return iU;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += CodedOutputStream.U(intArrayList.getInt(i));
            i++;
        }
        return iU2;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iV = 0;
            while (i < size) {
                iV += CodedOutputStream.V(((Long) list.get(i)).longValue());
                i++;
            }
            return iV;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iV2 = 0;
        while (i < size) {
            iV2 += CodedOutputStream.V(longArrayList.h(i));
            i++;
        }
        return iV2;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iY = 0;
            while (i < size) {
                iY += CodedOutputStream.Y(((Integer) list.get(i)).intValue());
                i++;
            }
            return iY;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iY2 = 0;
        while (i < size) {
            iY2 += CodedOutputStream.Y(intArrayList.getInt(i));
            i++;
        }
        return iY2;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iZ = 0;
            while (i < size) {
                iZ += CodedOutputStream.Z(((Long) list.get(i)).longValue());
                i++;
            }
            return iZ;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iZ2 = 0;
        while (i < size) {
            iZ2 += CodedOutputStream.Z(longArrayList.h(i));
            i++;
        }
        return iZ2;
    }

    public static Object j(Object obj, int i, List list, Internal.EnumVerifier enumVerifier, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.a(iIntValue)) {
                    obj2 = m(obj, i, iIntValue, obj2, unknownFieldSchema);
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
                obj2 = m(obj, i, iIntValue2, obj2, unknownFieldSchema);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void k(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        FieldSet fieldSetC = extensionSchema.c(obj2);
        if (fieldSetC.f2639a.isEmpty()) {
            return;
        }
        FieldSet fieldSetD = extensionSchema.d(obj);
        fieldSetD.getClass();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = fieldSetC.f2639a;
        int size = anonymousClass1.d.size();
        for (int i = 0; i < size; i++) {
            fieldSetD.k(anonymousClass1.c(i));
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            fieldSetD.k((Map.Entry) it.next());
        }
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object m(Object obj, int i, int i2, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.f(obj);
        }
        unknownFieldSchema.e(obj2, i, i2);
        return obj2;
    }

    public static void n(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.G(i, list, z);
    }

    public static void o(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.t(i, list, z);
    }

    public static void p(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i, list, z);
    }

    public static void q(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i, list, z);
    }

    public static void r(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.a(i, list, z);
    }

    public static void s(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.f(i, list, z);
    }

    public static void t(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.I(i, list, z);
    }

    public static void u(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.F(i, list, z);
    }

    public static void v(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.A(i, list, z);
    }

    public static void w(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.s(i, list, z);
    }

    public static void x(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i, list, z);
    }

    public static void y(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.i(i, list, z);
    }

    public static void z(int i, List list, Writer writer, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.l(i, list, z);
    }
}
