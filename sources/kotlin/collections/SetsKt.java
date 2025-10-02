package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/collections/SetsKt__SetsJVMKt", "kotlin/collections/SetsKt__SetsKt", "kotlin/collections/SetsKt___SetsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class SetsKt extends SetsKt___SetsKt {
    public static SetBuilder a(SetBuilder setBuilder) {
        MapBuilder mapBuilder = setBuilder.d;
        mapBuilder.b();
        return mapBuilder.l > 0 ? setBuilder : SetBuilder.e;
    }

    public static HashSet b(Object... objArr) {
        HashSet hashSet = new HashSet(MapsKt.h(objArr.length));
        ArraysKt___ArraysKt.d(objArr, hashSet);
        return hashSet;
    }

    public static LinkedHashSet c(Object... elements) {
        Intrinsics.h(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(elements.length));
        ArraysKt___ArraysKt.d(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet d(Set set, Object obj) {
        Intrinsics.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.c(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set e(Set set, java.util.AbstractCollection abstractCollection) {
        Intrinsics.h(set, "<this>");
        Collection<?> collectionU = CollectionsKt.u(abstractCollection);
        if (collectionU.isEmpty()) {
            return CollectionsKt.L0(set);
        }
        if (!(collectionU instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionU);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionU).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet f(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(objArr.length));
        ArraysKt___ArraysKt.d(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet g(Set set, Iterable elements) {
        Intrinsics.h(set, "<this>");
        Intrinsics.h(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        CollectionsKt.h(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet h(Set set, Object obj) {
        Intrinsics.h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.h(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set i(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.g(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
