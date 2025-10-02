package au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.lists.SnapAListAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.lists.ui.snapalist.snapbottomsheet.SnapAListBottomSheetFragment;
import java.util.ArrayList;
import java.util.Locale;
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
final /* synthetic */ class SnapAListBottomSheetFragment$setContent$1$1$1$1 extends FunctionReferenceImpl implements Function1<SnapAListMenuOption, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SnapAListMenuOption p0 = (SnapAListMenuOption) obj;
        Intrinsics.h(p0, "p0");
        SnapAListBottomSheetFragment snapAListBottomSheetFragment = (SnapAListBottomSheetFragment) this.receiver;
        ((SnapAListBottomSheetFragment.BottomSheetHost) snapAListBottomSheetFragment.i.getD()).l(p0);
        AnalyticsManager analyticsManager = snapAListBottomSheetFragment.k;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        SnapAListAnalytics.ListDetails.Action.Companion companion = SnapAListAnalytics.ListDetails.Action.d;
        String string = snapAListBottomSheetFragment.getString(p0.f12465a);
        Intrinsics.g(string, "getString(...)");
        final String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        companion.getClass();
        analyticsManager.g(new Event(lowerCase) { // from class: au.com.woolworths.analytics.supers.lists.SnapAListAnalytics$ListDetails$Action$Companion$bottomSheetItemClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(SnapAListAnalytics.ListDetails.e);
                spreadBuilder.a(new Pair("event.Category", "snap a list"));
                spreadBuilder.a(new Pair("event.Action", "icon_click"));
                a.y("event.Label", lowerCase, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "snap_a_list_icon_click";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "snap_a_list_icon_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        snapAListBottomSheetFragment.dismiss();
        return Unit.f24250a;
    }
}
