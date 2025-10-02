package au.com.woolworths.shop.buyagain.ui.composable;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$15$1 extends FunctionReferenceImpl implements Function2<String, TrackingMetadata, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final String p0 = (String) obj;
        TrackingMetadata trackingMetadata = (TrackingMetadata) obj2;
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.getClass();
        if (trackingMetadata != null) {
            AnalyticsManager analyticsManager = buyAgainViewModel.g;
            BuyAgainAnalytics.BuyAgain.Action.d.getClass();
            analyticsManager.i(new Event(p0) { // from class: au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics$BuyAgain$Action$Companion$watchlistSnackbarImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(BuyAgainAnalytics.BuyAgain.e);
                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    a.z("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, p0), spreadBuilder, "product.Source", "watchlist");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "watchlist_snackbarimpression";
                }

                public final boolean equals(Object obj3) {
                    if (!(obj3 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj3;
                    return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, trackingMetadata);
        }
        return Unit.f24250a;
    }
}
