package com.adobe.marketing.mobile.launch.rulesengine.json;

import YU.a;
import com.adobe.marketing.mobile.rulesengine.ComparisonExpression;
import com.adobe.marketing.mobile.rulesengine.Evaluable;
import com.adobe.marketing.mobile.rulesengine.LogicalExpression;
import com.adobe.marketing.mobile.rulesengine.OperandLiteral;
import com.adobe.marketing.mobile.rulesengine.OperandMustacheToken;
import com.adobe.marketing.mobile.rulesengine.UnaryExpression;
import com.adobe.marketing.mobile.services.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/MatcherCondition;", "Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONCondition;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class MatcherCondition extends JSONCondition {
    public static final Object b = MapsKt.j(new Pair("eq", "equals"), new Pair("ne", "notEquals"), new Pair("gt", "greaterThan"), new Pair("ge", "greaterEqual"), new Pair("lt", "lessThan"), new Pair("le", "lessEqual"), new Pair("co", "contains"), new Pair("nc", "notContains"), new Pair("sw", "startsWith"), new Pair("ew", "endsWith"), new Pair("ex", "exists"), new Pair("nx", "notExist"));

    /* renamed from: a, reason: collision with root package name */
    public final JSONDefinition f13210a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/MatcherCondition$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "OPERATION_NAME_OR", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public MatcherCondition(JSONDefinition jSONDefinition) {
        this.f13210a = jSONDefinition;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static Evaluable b(Object obj, String str, String str2) {
        String str3 = (String) b.get(str2);
        if (str3 == null) {
            Log.b("LaunchRulesEngine", "MatcherCondition", a.h("Failed to build Evaluable from [type:matcher] json, [definition.matcher = ", str2, "] is not supported."), new Object[0]);
            return null;
        }
        if (obj == null) {
            return new UnaryExpression(new OperandMustacheToken(a.h("{{", str, "}}"), Object.class), str3);
        }
        Pair pair = obj instanceof String ? new Pair(String.class, a.h("{{string(", str, ")}}")) : obj instanceof Integer ? new Pair(Number.class, a.h("{{int(", str, ")}}")) : obj instanceof Double ? new Pair(Number.class, a.h("{{double(", str, ")}}")) : obj instanceof Boolean ? new Pair(Boolean.class, a.h("{{bool(", str, ")}}")) : obj instanceof Float ? new Pair(Number.class, a.h("{{double(", str, ")}}")) : new Pair(Object.class, a.h("{{", str, "}}"));
        Class cls = (Class) pair.d;
        String str4 = (String) pair.e;
        Intrinsics.f(cls, "null cannot be cast to non-null type java.lang.Class<*>");
        return new ComparisonExpression(new OperandMustacheToken(str4, cls), str3, new OperandLiteral(obj));
    }

    @Override // com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition
    public final Evaluable a() {
        JSONDefinition jSONDefinition = this.f13210a;
        String str = jSONDefinition.c;
        String str2 = jSONDefinition.d;
        if (str2 == null || str == null) {
            Log.b("LaunchRulesEngine", "MatcherCondition", "[key] or [matcher] is not String, failed to build Evaluable from definition JSON: \n " + jSONDefinition, new Object[0]);
            return null;
        }
        List list = jSONDefinition.e;
        if (list == null) {
            list = EmptyList.d;
        }
        int size = list.size();
        if (size == 0) {
            return b(null, str, str2);
        }
        if (size == 1) {
            return b(list.get(0), str, str2);
        }
        if (2 <= size && size <= Integer.MAX_VALUE) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next(), str, str2));
            }
            if (!arrayList.isEmpty()) {
                return new LogicalExpression("or", arrayList);
            }
        }
        return null;
    }
}
