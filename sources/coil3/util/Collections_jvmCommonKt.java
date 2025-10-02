package coil3.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Collections_jvmCommonKt {
    public static final List a(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(kotlin.collections.CollectionsKt.D(list)) : EmptyList.d;
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size == 0) {
            return EmptyMap.d;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) kotlin.collections.CollectionsKt.C(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
