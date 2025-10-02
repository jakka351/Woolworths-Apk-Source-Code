package com.adobe.marketing.mobile.launch.rulesengine.json;

import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.launch.rulesengine.LaunchRule;
import com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition;
import com.adobe.marketing.mobile.rulesengine.Evaluable;
import com.adobe.marketing.mobile.services.Log;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRule;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class JSONRule {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f13208a;
    public final JSONArray b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONRule$Companion;", "", "", "KEY_CONDITION", "Ljava/lang/String;", "KEY_CONSEQUENCES", "LOG_TAG", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public static JSONRule a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("condition");
            JSONArray jSONArray = jSONObject.getJSONArray("consequences");
            if (jSONObject2 != null && jSONArray != null) {
                return new JSONRule(jSONObject2, jSONArray);
            }
            Log.b("LaunchRulesEngine", "JSONRule", "Failed to extract [rule.condition] or [rule.consequences].", new Object[0]);
            return null;
        }
    }

    public JSONRule(JSONObject jSONObject, JSONArray jSONArray) {
        this.f13208a = jSONObject;
        this.b = jSONArray;
    }

    public final /* synthetic */ LaunchRule a(ExtensionApi extensionApi) throws JSONException {
        Intrinsics.h(extensionApi, "extensionApi");
        JSONCondition jSONConditionA = JSONCondition.Companion.a(this.f13208a, extensionApi);
        Evaluable evaluableA = jSONConditionA != null ? jSONConditionA.a() : null;
        if (evaluableA == null) {
            Log.b("LaunchRulesEngine", "JSONRule", "Failed to build LaunchRule from JSON, the [rule.condition] can't be parsed to Evaluable.", new Object[0]);
            return null;
        }
        JSONArray jSONArray = this.b;
        return new LaunchRule(evaluableA, SequencesKt.x(SequencesKt.r(CollectionsKt.n(RangesKt.o(0, jSONArray.length())), new Function1(JSONRule$toLaunchRule$consequenceList$1.h, jSONArray) { // from class: com.adobe.marketing.mobile.internal.util.JSONExtensionsKt$map$1
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
        })));
    }
}
