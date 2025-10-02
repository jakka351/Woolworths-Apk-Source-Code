package kotlin.collections;

import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"kotlin/collections/MapsKt__MapWithDefaultKt", "kotlin/collections/MapsKt__MapsJVMKt", "kotlin/collections/MapsKt__MapsKt", "kotlin/collections/MapsKt___MapsJvmKt", "kotlin/collections/MapsKt___MapsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class MapsKt extends MapsKt___MapsKt {
    public static Object e(Object obj, Map map) {
        Intrinsics.h(map, "<this>");
        if (map instanceof MapWithDefault) {
            ((MapWithDefault) map).r0();
            throw null;
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(b.n(obj, "Key ", " is missing in the map."));
    }

    public static HashMap f(Pair... pairArr) {
        HashMap map = new HashMap(h(pairArr.length));
        MapsKt__MapsKt.c(map, pairArr);
        return map;
    }

    public static LinkedHashMap g(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(pairArr.length));
        MapsKt__MapsKt.c(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static int h(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map i(Pair pair) {
        Intrinsics.h(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.d, pair.e);
        Intrinsics.g(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map j(Pair... pairs) {
        Intrinsics.h(pairs, "pairs");
        if (pairs.length <= 0) {
            return EmptyMap.d;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(pairs.length));
        MapsKt__MapsKt.c(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static Map k(LinkedHashMap linkedHashMap, Iterable keys) {
        Intrinsics.h(keys, "keys");
        LinkedHashMap linkedHashMapS = s(linkedHashMap);
        CollectionsKt.e0(keys, linkedHashMapS.keySet());
        return MapsKt__MapsKt.b(linkedHashMapS);
    }

    public static LinkedHashMap l(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(pairArr.length));
        MapsKt__MapsKt.c(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap m(Map map, Map map2) {
        Intrinsics.h(map, "<this>");
        Intrinsics.h(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map n(Map map, Pair pair) {
        if (map.isEmpty()) {
            return i(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.d, pair.e);
        return linkedHashMap;
    }

    public static List o(Map map) {
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return CollectionsKt.Q(new Pair(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return EmptyList.d;
    }

    public static Map p(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return EmptyMap.d;
        }
        if (size == 1) {
            return i((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.d, pair.e);
        }
        return linkedHashMap;
    }

    public static Map q(Map map) {
        Intrinsics.h(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? s(map) : MapsKt__MapsJVMKt.a(map) : EmptyMap.d;
    }

    public static Map r(Sequence sequence) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.d, pair.e);
        }
        return MapsKt__MapsKt.b(linkedHashMap);
    }

    public static LinkedHashMap s(Map map) {
        Intrinsics.h(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static TreeMap t(Map map, Comparator comparator) {
        Intrinsics.h(map, "<this>");
        Intrinsics.h(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
