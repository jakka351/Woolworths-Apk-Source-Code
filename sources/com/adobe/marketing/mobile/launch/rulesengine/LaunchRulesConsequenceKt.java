package com.adobe.marketing.mobile.launch.rulesengine;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class LaunchRulesConsequenceKt {
    public static final Map a(RuleConsequence ruleConsequence) {
        Map map = ruleConsequence.c;
        Object obj = map != null ? map.get("eventdata") : null;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public static final String b(RuleConsequence ruleConsequence) {
        Map map = ruleConsequence.c;
        Object obj = map != null ? map.get("eventdataaction") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final String c(RuleConsequence ruleConsequence) {
        Map map = ruleConsequence.c;
        Object obj = map != null ? map.get("source") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final String d(RuleConsequence ruleConsequence) {
        Map map = ruleConsequence.c;
        Object obj = map != null ? map.get("type") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
