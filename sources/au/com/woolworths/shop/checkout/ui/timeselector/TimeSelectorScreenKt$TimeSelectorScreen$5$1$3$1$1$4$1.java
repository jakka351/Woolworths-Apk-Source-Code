package au.com.woolworths.shop.checkout.ui.timeselector;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.checkout.ui.timeselector.uimodel.TimeOfDay;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class TimeSelectorScreenKt$TimeSelectorScreen$5$1$3$1$1$4$1 extends FunctionReferenceImpl implements Function1<TimeOfDay, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TimeOfDay p0 = (TimeOfDay) obj;
        Intrinsics.h(p0, "p0");
        TimeSelectorViewModel timeSelectorViewModel = (TimeSelectorViewModel) this.receiver;
        timeSelectorViewModel.getClass();
        AnalyticsManager analyticsManager = timeSelectorViewModel.g;
        TimeSelectorAnalytics.WindowSelection.Action.Companion companion = TimeSelectorAnalytics.WindowSelection.Action.d;
        final String group = p0.f10843a;
        companion.getClass();
        Intrinsics.h(group, "group");
        analyticsManager.g(new Event(group) { // from class: au.com.woolworths.analytics.supers.checkout.TimeSelectorAnalytics$WindowSelection$Action$Companion$emptyGroupErrorImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(TimeSelectorAnalytics.WindowSelection.e);
                spreadBuilder.a(new Pair("event.Category", "error"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                androidx.constraintlayout.core.state.a.y("event.Label", YU.a.A("No Windows Available ", group), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "error_impression";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        return Unit.f24250a;
    }
}
