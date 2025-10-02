package com.adobe.marketing.mobile.launch.rulesengine.json;

import androidx.constraintlayout.core.state.a;
import com.adobe.marketing.mobile.rulesengine.Evaluable;
import com.adobe.marketing.mobile.rulesengine.LogicalExpression;
import com.adobe.marketing.mobile.services.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/GroupCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class GroupCondition extends JSONCondition {
    public static final List b = CollectionsKt.R("or", "and");

    /* renamed from: a, reason: collision with root package name */
    public final JSONDefinition f13204a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/GroupCondition$Companion;", "", "", "", "LOGICAL_OPERATORS", "Ljava/util/List;", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public GroupCondition(JSONDefinition jSONDefinition) {
        this.f13204a = jSONDefinition;
    }

    @Override // com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition
    public final Evaluable a() {
        JSONDefinition jSONDefinition = this.f13204a;
        List list = jSONDefinition.b;
        String str = jSONDefinition.f13207a;
        if (str == null || list == null || list.isEmpty()) {
            return null;
        }
        Locale locale = Locale.ROOT;
        String strM = a.m(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)");
        if (!b.contains(strM)) {
            Log.b("LaunchRulesEngine", "GroupCondition", "Unsupported logical operator: ".concat(strM), new Object[0]);
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((JSONCondition) it.next()).a());
        }
        return new LogicalExpression(strM, arrayList);
    }
}
