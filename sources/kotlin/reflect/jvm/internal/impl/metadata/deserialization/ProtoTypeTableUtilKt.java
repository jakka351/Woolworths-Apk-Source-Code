package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ProtoTypeTableUtilKt {
    public static final ProtoBuf.Type a(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.h(type, "<this>");
        int i = type.f;
        if ((i & 1024) == 1024) {
            return type.r;
        }
        if ((i & 2048) == 2048) {
            return typeTable.a(type.s);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List b(ProtoBuf.Class r2, TypeTable typeTable) {
        Intrinsics.h(r2, "<this>");
        List list = r2.p;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = r2.q;
            Intrinsics.g(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            for (Integer num : list3) {
                Intrinsics.e(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List c(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.h(function, "<this>");
        List list = function.o;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = function.p;
            Intrinsics.g(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            for (Integer num : list3) {
                Intrinsics.e(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List d(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.h(property, "<this>");
        List list = property.o;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = property.p;
            Intrinsics.g(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            for (Integer num : list3) {
                Intrinsics.e(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final ProtoBuf.Type e(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.h(typeAlias, "<this>");
        int i = typeAlias.f;
        if ((i & 16) == 16) {
            ProtoBuf.Type type = typeAlias.l;
            Intrinsics.g(type, "getExpandedType(...)");
            return type;
        }
        if ((i & 32) == 32) {
            return typeTable.a(typeAlias.m);
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final ProtoBuf.Type f(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.h(type, "<this>");
        int i = type.f;
        if ((i & 4) == 4) {
            return type.j;
        }
        if ((i & 8) == 8) {
            return typeTable.a(type.k);
        }
        return null;
    }

    public static final boolean g(ProtoBuf.Function function) {
        Intrinsics.h(function, "<this>");
        int i = function.f;
        return (i & 32) == 32 || (i & 64) == 64;
    }

    public static final boolean h(ProtoBuf.Property property) {
        Intrinsics.h(property, "<this>");
        int i = property.f;
        return (i & 32) == 32 || (i & 64) == 64;
    }

    public static final ProtoBuf.Type i(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.h(type, "<this>");
        int i = type.f;
        if ((i & 256) == 256) {
            return type.p;
        }
        if ((i & 512) == 512) {
            return typeTable.a(type.q);
        }
        return null;
    }

    public static final ProtoBuf.Type j(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.h(function, "<this>");
        Intrinsics.h(typeTable, "typeTable");
        int i = function.f;
        if ((i & 32) == 32) {
            return function.m;
        }
        if ((i & 64) == 64) {
            return typeTable.a(function.n);
        }
        return null;
    }

    public static final ProtoBuf.Type k(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.h(property, "<this>");
        int i = property.f;
        if ((i & 32) == 32) {
            return property.m;
        }
        if ((i & 64) == 64) {
            return typeTable.a(property.n);
        }
        return null;
    }

    public static final ProtoBuf.Type l(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.h(function, "<this>");
        Intrinsics.h(typeTable, "typeTable");
        int i = function.f;
        if ((i & 8) == 8) {
            ProtoBuf.Type type = function.j;
            Intrinsics.g(type, "getReturnType(...)");
            return type;
        }
        if ((i & 16) == 16) {
            return typeTable.a(function.k);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final ProtoBuf.Type m(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.h(property, "<this>");
        Intrinsics.h(typeTable, "typeTable");
        int i = property.f;
        if ((i & 8) == 8) {
            ProtoBuf.Type type = property.j;
            Intrinsics.g(type, "getReturnType(...)");
            return type;
        }
        if ((i & 16) == 16) {
            return typeTable.a(property.k);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final List n(ProtoBuf.Class r2, TypeTable typeTable) {
        Intrinsics.h(r2, "<this>");
        List list = r2.k;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List list2 = r2.l;
            Intrinsics.g(list2, "getSupertypeIdList(...)");
            List<Integer> list3 = list2;
            arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            for (Integer num : list3) {
                Intrinsics.e(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final ProtoBuf.Type o(ProtoBuf.Type.Argument argument, TypeTable typeTable) {
        int i = argument.e;
        if ((i & 2) == 2) {
            return argument.g;
        }
        if ((i & 4) == 4) {
            return typeTable.a(argument.h);
        }
        return null;
    }

    public static final ProtoBuf.Type p(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.h(typeTable, "typeTable");
        int i = valueParameter.f;
        if ((i & 4) == 4) {
            ProtoBuf.Type type = valueParameter.i;
            Intrinsics.g(type, "getType(...)");
            return type;
        }
        if ((i & 8) == 8) {
            return typeTable.a(valueParameter.j);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final ProtoBuf.Type q(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.h(typeAlias, "<this>");
        int i = typeAlias.f;
        if ((i & 4) == 4) {
            ProtoBuf.Type type = typeAlias.j;
            Intrinsics.g(type, "getUnderlyingType(...)");
            return type;
        }
        if ((i & 8) == 8) {
            return typeTable.a(typeAlias.k);
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static final ProtoBuf.Type r(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        int i = valueParameter.f;
        if ((i & 16) == 16) {
            return valueParameter.k;
        }
        if ((i & 32) == 32) {
            return typeTable.a(valueParameter.l);
        }
        return null;
    }
}
