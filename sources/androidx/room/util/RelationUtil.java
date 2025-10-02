package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@RestrictTo
@JvmName
/* loaded from: classes2.dex */
public final class RelationUtil {
    public static final void a(ArrayMap map, Function1 function1) {
        Intrinsics.h(map, "map");
        ArrayMap arrayMap = new ArrayMap(999);
        int size = map.getSize();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            arrayMap.put(map.keyAt(i), map.valueAt(i));
            i++;
            i2++;
            if (i2 == 999) {
                function1.invoke(arrayMap);
                arrayMap.clear();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            function1.invoke(arrayMap);
        }
    }

    public static final void b(HashMap map, Function1 function1) {
        int i;
        Intrinsics.h(map, "map");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (Object key : map.keySet()) {
                Intrinsics.g(key, "key");
                map2.put(key, map.get(key));
                i++;
                if (i == 999) {
                    break;
                }
            }
            function1.invoke(map2);
            map2.clear();
        }
        if (i > 0) {
            function1.invoke(map2);
        }
    }
}
