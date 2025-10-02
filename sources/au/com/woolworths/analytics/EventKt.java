package au.com.woolworths.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"specs-api"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class EventKt {
    public static final Event a(Event event, String str, Map map, EventConfig eventConfig) {
        Intrinsics.h(event, "<this>");
        if (str == null) {
            str = event.getD();
        }
        Map data = event.getData();
        Intrinsics.h(data, "<this>");
        LinkedHashMap linkedHashMapS = MapsKt.s(data);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMapS.put(entry.getKey(), value);
                } else {
                    linkedHashMapS.remove(entry.getKey());
                }
            }
        }
        String f = event.getF();
        if (eventConfig == null) {
            eventConfig = event.getG();
        }
        return new UpdatedEvent(str, linkedHashMapS, f, eventConfig);
    }
}
