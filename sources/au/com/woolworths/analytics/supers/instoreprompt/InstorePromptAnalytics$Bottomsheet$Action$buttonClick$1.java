package au.com.woolworths.analytics.supers.instoreprompt;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.instoreprompt.InstorePromptAnalytics;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/instoreprompt/InstorePromptAnalytics$Bottomsheet$Action$buttonClick$1", "Lau/com/woolworths/analytics/Event;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstorePromptAnalytics$Bottomsheet$Action$buttonClick$1 implements Event {
    public final Object d;

    public InstorePromptAnalytics$Bottomsheet$Action$buttonClick$1(InstorePromptAnalytics.Bottomsheet.Action action, String str, String str2) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
        spreadBuilder.b(action.f4037a.g);
        spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
        spreadBuilder.a(new Pair("event.Action", "click"));
        a.z("event.Label", str, spreadBuilder, "event.Description", str2);
        ArrayList arrayList = spreadBuilder.f24269a;
        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getE() {
        return "bottomsheet_click";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return "bottomsheet_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d;
    }
}
