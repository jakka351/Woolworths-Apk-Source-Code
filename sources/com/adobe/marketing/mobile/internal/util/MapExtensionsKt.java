package com.adobe.marketing.mobile.internal.util;

import YU.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MapExtensionsKt {
    public static final /* synthetic */ LinkedHashMap a(String prefix, Map map) {
        Intrinsics.h(map, "<this>");
        Intrinsics.h(prefix, "prefix");
        if (prefix.length() > 0) {
            prefix = prefix.concat(".");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sbS = a.s(prefix);
            sbS.append((String) entry.getKey());
            String string = sbS.toString();
            Object value = entry.getValue();
            if (value instanceof Map) {
                Map map2 = (Map) value;
                if (SetExtensionsKt.a(map2.keySet())) {
                    linkedHashMap.putAll(a(string, map2));
                }
            }
            linkedHashMap.put(string, value);
        }
        return linkedHashMap;
    }

    public static final String b(Map map) throws JSONException {
        Intrinsics.h(map, "<this>");
        try {
            String string = new JSONObject(map).toString(4);
            Intrinsics.g(string, "{\n        JSONObject(this).toString(4)\n    }");
            return string;
        } catch (Exception unused) {
            return map.toString();
        }
    }
}
