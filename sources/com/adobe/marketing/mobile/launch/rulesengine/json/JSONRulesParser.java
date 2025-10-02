package com.adobe.marketing.mobile.launch.rulesengine.json;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.launch.rulesengine.LaunchRule;
import com.adobe.marketing.mobile.launch.rulesengine.json.JSONRule;
import com.adobe.marketing.mobile.services.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRulesParser;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class JSONRulesParser {
    public static final List a(String jsonString, final ExtensionApi extensionApi) throws JSONException {
        JSONRuleRoot jSONRuleRoot;
        Intrinsics.h(jsonString, "jsonString");
        Intrinsics.h(extensionApi, "extensionApi");
        try {
            Object objNextValue = new JSONTokener(jsonString).nextValue();
            if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objNextValue;
                String version = jSONObject.optString("version", "0");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rules");
                if (jSONArrayOptJSONArray == null) {
                    Log.b("LaunchRulesEngine", "JSONRuleRoot", "Failed to extract [launch_json.rules]", new Object[0]);
                    jSONRuleRoot = null;
                } else {
                    Intrinsics.g(version, "version");
                    jSONRuleRoot = new JSONRuleRoot(jSONArrayOptJSONArray);
                }
                if (jSONRuleRoot != null) {
                    JSONArray jSONArray = jSONRuleRoot.f13209a;
                    return SequencesKt.x(SequencesKt.r(CollectionsKt.n(RangesKt.o(0, jSONArray.length())), new Function1(new Function1<Object, LaunchRule>() { // from class: com.adobe.marketing.mobile.launch.rulesengine.json.JSONRuleRoot$toLaunchRules$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object it) throws Exception {
                            LaunchRule launchRuleA;
                            Intrinsics.h(it, "it");
                            JSONRule jSONRuleA = JSONRule.Companion.a(it instanceof JSONObject ? (JSONObject) it : null);
                            if (jSONRuleA == null || (launchRuleA = jSONRuleA.a(extensionApi)) == null) {
                                throw new Exception();
                            }
                            return launchRuleA;
                        }
                    }, jSONArray) { // from class: com.adobe.marketing.mobile.internal.util.JSONExtensionsKt$map$1
                        public final /* synthetic */ Lambda h;
                        public final /* synthetic */ JSONArray i;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                            this.h = (Lambda) function1;
                            this.i = jSONArray;
                        }

                        /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws JSONException {
                            Object obj2 = this.i.get(((Number) obj).intValue());
                            Intrinsics.g(obj2, "this.get(it)");
                            return this.h.invoke(obj2);
                        }
                    }));
                }
            }
            return null;
        } catch (Exception unused) {
            Log.b("LaunchRulesEngine", "JSONRulesParser", "Failed to parse launch rules JSON: \n ".concat(jsonString), new Object[0]);
            return null;
        }
    }
}
