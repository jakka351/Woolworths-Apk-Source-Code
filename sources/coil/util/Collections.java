package coil.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: coil.util.-Collections, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Collections {
    public static final List a(ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? java.util.Collections.unmodifiableList(new ArrayList(arrayList)) : java.util.Collections.singletonList(CollectionsKt.D(arrayList)) : EmptyList.d;
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size == 0) {
            return EmptyMap.d;
        }
        if (size != 1) {
            return java.util.Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.C(map.entrySet());
        return java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
