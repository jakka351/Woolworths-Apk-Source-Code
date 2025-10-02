package com.adobe.marketing.mobile.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/internal/util/EventDataMerger;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EventDataMerger {
    public static final HashMap a(Map map, Map map2, final boolean z) {
        Function2<Object, Object, Object> function2 = new Function2<Object, Object, Object>() { // from class: com.adobe.marketing.mobile.internal.util.EventDataMerger$merge$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean z2 = obj instanceof Map;
                boolean z3 = z;
                if (z2 && (obj2 instanceof Map)) {
                    return EventDataMerger.b((Map) obj, (Map) obj2, z3);
                }
                if (!z3) {
                    return obj2;
                }
                if (!(obj instanceof Collection) || !(obj2 instanceof Collection)) {
                    return obj;
                }
                EventDataMerger$mergeCollection$1 eventDataMerger$mergeCollection$1 = new EventDataMerger$mergeCollection$1();
                eventDataMerger$mergeCollection$1.addAll((Collection) obj);
                eventDataMerger$mergeCollection$1.addAll((Collection) obj2);
                return eventDataMerger$mergeCollection$1;
            }
        };
        HashMap map3 = new HashMap();
        if (map2 != null) {
            map3.putAll(map2);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (map3.containsKey(str)) {
                    Object objInvoke = function2.invoke(value, map3.get(str));
                    if (objInvoke != null) {
                        map3.put(str, objInvoke);
                    } else {
                        map3.remove(str);
                    }
                } else if (!StringsKt.v(str, "[*]", false)) {
                    map3.put(str, value);
                } else if (value instanceof Map) {
                    Map map4 = (Map) value;
                    String strT = StringsKt.t(3, str);
                    Object obj = map3.get(strT);
                    if (obj instanceof Collection) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : (Iterable) obj) {
                            Map map5 = obj2 instanceof Map ? (Map) obj2 : null;
                            if (map5 != null) {
                                arrayList.add(b(map4, map5, z));
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        map3.put(strT, arrayList);
                    }
                }
            }
        }
        return map3;
    }

    public static Map b(Map map, Map map2, boolean z) {
        if (map != null && !SetExtensionsKt.a(map.keySet())) {
            return map2;
        }
        if (map2 != null && !SetExtensionsKt.a(map2.keySet())) {
            return map2;
        }
        if (map == null) {
            map = null;
        }
        try {
            return a(map, map2 != null ? map2 : null, z);
        } catch (Exception unused) {
            return map2;
        }
    }
}
