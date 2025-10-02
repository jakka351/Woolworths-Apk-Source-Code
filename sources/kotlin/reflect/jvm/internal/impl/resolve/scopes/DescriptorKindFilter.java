package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import androidx.compose.ui.input.pointer.a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DescriptorKindFilter {
    public static final Companion c = new Companion();
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final DescriptorKindFilter m;
    public static final DescriptorKindFilter n;
    public static final DescriptorKindFilter o;
    public static final DescriptorKindFilter p;
    public static final DescriptorKindFilter q;
    public static final ArrayList r;
    public static final ArrayList s;

    /* renamed from: a, reason: collision with root package name */
    public final List f24554a;
    public final int b;

    @SourceDebugExtension
    public static final class Companion {

        public static final class MaskToName {

            /* renamed from: a, reason: collision with root package name */
            public final int f24555a;
            public final String b;

            public MaskToName(int i, String str) {
                this.f24555a = i;
                this.b = str;
            }
        }

        public static int a() {
            return DescriptorKindFilter.l;
        }

        public static int b() {
            return DescriptorKindFilter.i;
        }

        public static int c() {
            return DescriptorKindFilter.e;
        }

        public static int d() {
            return DescriptorKindFilter.h;
        }

        public static int e() {
            return DescriptorKindFilter.f;
        }

        public static int f() {
            return DescriptorKindFilter.g;
        }

        public static int g() {
            return DescriptorKindFilter.j;
        }
    }

    static {
        Companion.MaskToName maskToName;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        h = i5;
        int i7 = i2 << 5;
        i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        l = i9;
        m = new DescriptorKindFilter(i8);
        n = new DescriptorKindFilter(i6 | i7);
        new DescriptorKindFilter(i2);
        new DescriptorKindFilter(i3);
        new DescriptorKindFilter(i4);
        o = new DescriptorKindFilter(i9);
        new DescriptorKindFilter(i5);
        p = new DescriptorKindFilter(i6);
        q = new DescriptorKindFilter(i7);
        new DescriptorKindFilter(i3 | i6 | i7);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.g(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Companion.MaskToName maskToName2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                int i10 = descriptorKindFilter.b;
                String name = field2.getName();
                Intrinsics.g(name, "getName(...)");
                maskToName2 = new Companion.MaskToName(i10, name);
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        r = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.g(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (Intrinsics.c(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.g(name2, "getName(...)");
                maskToName = new Companion.MaskToName(iIntValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        s = arrayList5;
    }

    public DescriptorKindFilter(int i2, List excludes) {
        Intrinsics.h(excludes, "excludes");
        this.f24554a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i2 &= ~((DescriptorKindExclude) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (i2 & this.b) != 0;
    }

    public final List b() {
        return this.f24554a;
    }

    public final DescriptorKindFilter c(int i2) {
        int i3 = i2 & this.b;
        if (i3 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i3, this.f24554a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DescriptorKindFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.c(this.f24554a, descriptorKindFilter.f24554a) && this.b == descriptorKindFilter.b;
    }

    public final int hashCode() {
        return (this.f24554a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object next;
        Iterator it = r.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Companion.MaskToName) next).f24555a == this.b) {
                break;
            }
        }
        Companion.MaskToName maskToName = (Companion.MaskToName) next;
        String strM = maskToName != null ? maskToName.b : null;
        if (strM == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = s.iterator();
            while (it2.hasNext()) {
                Companion.MaskToName maskToName2 = (Companion.MaskToName) it2.next();
                String str = a(maskToName2.f24555a) ? maskToName2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strM = CollectionsKt.M(arrayList, " | ", null, null, null, 62);
        }
        return a.o(YU.a.u("DescriptorKindFilter(", strM, ", "), this.f24554a, ')');
    }

    public /* synthetic */ DescriptorKindFilter(int i2) {
        this(i2, EmptyList.d);
    }
}
