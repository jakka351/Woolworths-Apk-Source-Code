package com.adobe.marketing.mobile.launch.rulesengine;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/RuleConsequence;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RuleConsequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f13200a;
    public final String b;
    public final Map c;

    public RuleConsequence(String id, String type, Map map) {
        Intrinsics.h(id, "id");
        Intrinsics.h(type, "type");
        this.f13200a = id;
        this.b = type;
        this.c = map;
    }

    /* renamed from: a, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final String getF13200a() {
        return this.f13200a;
    }

    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleConsequence)) {
            return false;
        }
        RuleConsequence ruleConsequence = (RuleConsequence) obj;
        return Intrinsics.c(this.f13200a, ruleConsequence.f13200a) && Intrinsics.c(this.b, ruleConsequence.b) && Intrinsics.c(this.c, ruleConsequence.c);
    }

    public final int hashCode() {
        int iC = b.c(this.f13200a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return iC + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleConsequence(id=");
        sb.append(this.f13200a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", detail=");
        return android.support.v4.media.session.a.u(sb, this.c, ')');
    }
}
