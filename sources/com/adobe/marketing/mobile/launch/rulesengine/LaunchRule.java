package com.adobe.marketing.mobile.launch.rulesengine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.rulesengine.Evaluable;
import com.adobe.marketing.mobile.rulesengine.Rule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/LaunchRule;", "Lcom/adobe/marketing/mobile/rulesengine/Rule;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LaunchRule implements Rule {

    /* renamed from: a, reason: collision with root package name */
    public final Evaluable f13196a;
    public final List b;

    public LaunchRule(Evaluable evaluable, List list) {
        this.f13196a = evaluable;
        this.b = list;
    }

    @Override // com.adobe.marketing.mobile.rulesengine.Rule
    /* renamed from: a, reason: from getter */
    public final Evaluable getF13196a() {
        return this.f13196a;
    }

    /* renamed from: b, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaunchRule)) {
            return false;
        }
        LaunchRule launchRule = (LaunchRule) obj;
        return Intrinsics.c(this.f13196a, launchRule.f13196a) && Intrinsics.c(this.b, launchRule.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13196a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchRule(condition=");
        sb.append(this.f13196a);
        sb.append(", consequenceList=");
        return androidx.compose.ui.input.pointer.a.o(sb, this.b, ')');
    }
}
