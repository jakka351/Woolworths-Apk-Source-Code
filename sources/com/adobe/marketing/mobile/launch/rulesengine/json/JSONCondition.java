package com.adobe.marketing.mobile.launch.rulesengine.json;

import YU.a;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition;
import com.adobe.marketing.mobile.rulesengine.Evaluable;
import com.adobe.marketing.mobile.services.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class JSONCondition {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition$Companion;", "", "", "KEY_DEFINITION", "Ljava/lang/String;", "KEY_TYPE", "LOG_TAG", "TYPE_VALUE_GROUP", "TYPE_VALUE_HISTORICAL", "TYPE_VALUE_MATCHER", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ JSONCondition a(JSONObject jSONObject, ExtensionApi extensionApi) throws JSONException {
            Intrinsics.h(extensionApi, "extensionApi");
            if (jSONObject == null) {
                return null;
            }
            try {
                String string = jSONObject.getString("type");
                if (string != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode != 98629247) {
                        if (iHashCode != 840862002) {
                            if (iHashCode == 1950555338 && string.equals("historical")) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject("definition");
                                Intrinsics.g(jSONObject2, "jsonCondition.getJSONObj…                        )");
                                return new HistoricalCondition(JSONDefinition.Companion.a(jSONObject2, extensionApi), extensionApi);
                            }
                        } else if (string.equals("matcher")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("definition");
                            Intrinsics.g(jSONObject3, "jsonCondition.getJSONObj…                        )");
                            return new MatcherCondition(JSONDefinition.Companion.a(jSONObject3, extensionApi));
                        }
                    } else if (string.equals("group")) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("definition");
                        Intrinsics.g(jSONObject4, "jsonCondition.getJSONObj…                        )");
                        return new GroupCondition(JSONDefinition.Companion.a(jSONObject4, extensionApi));
                    }
                }
                Log.b("LaunchRulesEngine", "JSONCondition", "Unsupported condition type - " + string, new Object[0]);
                return null;
            } catch (Exception e) {
                Log.b("LaunchRulesEngine", "JSONCondition", a.f(e, new StringBuilder("Failed to parse [rule.condition] JSON, the error is: ")), new Object[0]);
                return null;
            }
        }
    }

    public abstract /* synthetic */ Evaluable a();
}
