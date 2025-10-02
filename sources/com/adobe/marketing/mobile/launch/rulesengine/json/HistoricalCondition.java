package com.adobe.marketing.mobile.launch.rulesengine.json;

import au.com.woolworths.product.details.epoxy.a;
import com.adobe.marketing.mobile.EventHistoryRequest;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.rulesengine.ComparisonExpression;
import com.adobe.marketing.mobile.rulesengine.Evaluable;
import com.adobe.marketing.mobile.rulesengine.OperandFunction;
import com.adobe.marketing.mobile.rulesengine.OperandLiteral;
import com.adobe.marketing.mobile.services.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/HistoricalCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HistoricalCondition extends JSONCondition {

    /* renamed from: a, reason: collision with root package name */
    public final JSONDefinition f13205a;
    public final ExtensionApi b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/HistoricalCondition$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public HistoricalCondition(JSONDefinition jSONDefinition, ExtensionApi extensionApi) {
        Intrinsics.h(extensionApi, "extensionApi");
        this.f13205a = jSONDefinition;
        this.b = extensionApi;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition
    public final Evaluable a() {
        JSONDefinition jSONDefinition = this.f13205a;
        Object obj = jSONDefinition.g;
        String str = (String) MatcherCondition.b.get(jSONDefinition.d);
        List list = jSONDefinition.f;
        if (list == null || str == null || !(obj instanceof Integer)) {
            Log.b("LaunchRulesEngine", "HistoricalCondition", "Failed to build Evaluable from definition JSON: \n " + jSONDefinition, new Object[0]);
            return null;
        }
        Long l = jSONDefinition.h;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = jSONDefinition.i;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        String str2 = jSONDefinition.j;
        if (str2 == null) {
            str2 = "any";
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new EventHistoryRequest((Map) it.next(), jLongValue, jLongValue2));
        }
        return new ComparisonExpression(new OperandFunction(new a(this, 10), arrayList, str2), str, new OperandLiteral(obj));
    }
}
