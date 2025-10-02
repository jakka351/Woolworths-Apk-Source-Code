package com.adobe.marketing.mobile.launch.rulesengine.json;

import com.adobe.marketing.mobile.internal.util.JSONExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "", "it", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final class JSONDefinition$Companion$buildValueMapList$1 extends Lambda implements Function1<Object, Map<String, ? extends Object>> {
    public static final JSONDefinition$Companion$buildValueMapList$1 h = new JSONDefinition$Companion$buildValueMapList$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) throws JSONException {
        Intrinsics.h(it, "it");
        JSONObject jSONObject = it instanceof JSONObject ? (JSONObject) it : null;
        if (jSONObject != null) {
            return JSONExtensionsKt.c(jSONObject);
        }
        throw new JSONException("Unsupported [rule.condition.historical.events] JSON format: " + it + ' ');
    }
}
