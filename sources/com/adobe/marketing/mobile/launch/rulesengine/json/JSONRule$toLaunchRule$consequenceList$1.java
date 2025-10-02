package com.adobe.marketing.mobile.launch.rulesengine.json;

import com.adobe.marketing.mobile.internal.util.JSONExtensionsKt;
import com.adobe.marketing.mobile.launch.rulesengine.RuleConsequence;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/adobe/marketing/mobile/launch/rulesengine/RuleConsequence;", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final class JSONRule$toLaunchRule$consequenceList$1 extends Lambda implements Function1<Object, RuleConsequence> {
    public static final JSONRule$toLaunchRule$consequenceList$1 h = new JSONRule$toLaunchRule$consequenceList$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) throws Exception {
        Intrinsics.h(it, "it");
        JSONConsequence jSONConsequence = null;
        JSONObject jSONObject = it instanceof JSONObject ? (JSONObject) it : null;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("id");
            Intrinsics.g(strOptString, "jsonObject.optString(KEY_ID)");
            String strOptString2 = jSONObject.optString("type");
            Intrinsics.g(strOptString2, "jsonObject.optString(KEY_TYPE)");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("detail");
            jSONConsequence = new JSONConsequence(strOptString, strOptString2, jSONObjectOptJSONObject != null ? JSONExtensionsKt.c(jSONObjectOptJSONObject) : null);
        }
        if (jSONConsequence != null) {
            return new RuleConsequence(jSONConsequence.f13206a, jSONConsequence.b, jSONConsequence.c);
        }
        throw new Exception();
    }
}
