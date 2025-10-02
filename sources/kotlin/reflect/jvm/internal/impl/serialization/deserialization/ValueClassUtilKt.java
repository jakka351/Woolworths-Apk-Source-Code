package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function1] */
    public static final ValueClassRepresentation a(ProtoBuf.Class r5, NameResolver nameResolver, TypeTable typeTable, Function1 function1, Function1 function12) {
        RigidTypeMarker rigidTypeMarker;
        ?? arrayList;
        Intrinsics.h(r5, "<this>");
        Intrinsics.h(nameResolver, "nameResolver");
        if (r5.C.size() <= 0) {
            ProtoBuf.Type typeA = null;
            if ((r5.f & 8) != 8) {
                return null;
            }
            Name nameB = NameResolverUtilKt.b(nameResolver, r5.z);
            int i = r5.f;
            if ((i & 16) == 16) {
                typeA = r5.A;
            } else if ((i & 32) == 32) {
                typeA = typeTable.a(r5.B);
            }
            if ((typeA != null && (rigidTypeMarker = (RigidTypeMarker) function1.invoke(typeA)) != null) || (rigidTypeMarker = (RigidTypeMarker) function12.invoke(nameB)) != null) {
                return new InlineClassRepresentation(nameB, rigidTypeMarker);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.b(nameResolver, r5.h) + " with property " + nameB).toString());
        }
        List list = r5.C;
        Intrinsics.g(list, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        for (Integer num : list2) {
            Intrinsics.e(num);
            arrayList2.add(NameResolverUtilKt.b(nameResolver, num.intValue()));
        }
        Pair pair = new Pair(Integer.valueOf(r5.F.size()), Integer.valueOf(r5.E.size()));
        if (pair.equals(new Pair(Integer.valueOf(arrayList2.size()), 0))) {
            List list3 = r5.F;
            Intrinsics.g(list3, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list4 = list3;
            arrayList = new ArrayList(CollectionsKt.s(list4, 10));
            for (Integer num2 : list4) {
                Intrinsics.e(num2);
                arrayList.add(typeTable.a(num2.intValue()));
            }
        } else {
            if (!pair.equals(new Pair(0, Integer.valueOf(arrayList2.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.b(nameResolver, r5.h) + " has illegal multi-field value class representation").toString());
            }
            arrayList = r5.E;
        }
        List list5 = (List) arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList3.add(function1.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(CollectionsKt.Q0(arrayList2, arrayList3));
    }
}
