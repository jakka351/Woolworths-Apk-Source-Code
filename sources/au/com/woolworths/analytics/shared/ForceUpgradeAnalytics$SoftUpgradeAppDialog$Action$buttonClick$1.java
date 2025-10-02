package au.com.woolworths.analytics.shared;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.shared.ForceUpgradeAnalytics;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/shared/ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action$buttonClick$1", "Lau/com/woolworths/analytics/Event;", "specs-shared"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action$buttonClick$1 implements Event {
    public final Object d;

    public ForceUpgradeAnalytics$SoftUpgradeAppDialog$Action$buttonClick$1(ForceUpgradeAnalytics.SoftUpgradeAppDialog.Action action, String str) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.b(action.f4027a.e);
        a.y("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "click", spreadBuilder, str), spreadBuilder);
        ArrayList arrayList = spreadBuilder.f24269a;
        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getD() {
        return "popup_notification_click";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return "popup_notification_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d;
    }
}
