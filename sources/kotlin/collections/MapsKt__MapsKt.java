package kotlin.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@SourceDebugExtension
/* loaded from: classes.dex */
class MapsKt__MapsKt extends MapsKt__MapsJVMKt {
    public static final Map b(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? linkedHashMap : MapsKt__MapsJVMKt.a(linkedHashMap) : EmptyMap.d;
    }

    public static final void c(HashMap map, Pair[] pairs) {
        Intrinsics.h(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.d, pair.e);
        }
    }
}
