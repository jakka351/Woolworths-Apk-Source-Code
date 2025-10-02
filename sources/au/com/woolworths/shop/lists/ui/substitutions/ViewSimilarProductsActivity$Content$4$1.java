package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsCtaSection;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
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
import kotlinx.coroutines.flow.SharedFlowImpl;
import timber.log.Timber;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ViewSimilarProductsActivity$Content$4$1 extends FunctionReferenceImpl implements Function1<AlternativeProductsCtaSection, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AlternativeProductsCtaSection p0 = (AlternativeProductsCtaSection) obj;
        Intrinsics.h(p0, "p0");
        ViewSimilarProductsViewModel viewSimilarProductsViewModel = (ViewSimilarProductsViewModel) this.receiver;
        viewSimilarProductsViewModel.getClass();
        if (!Intrinsics.c(p0.getAction(), "search-by-category")) {
            Timber.f27013a.o(YU.a.A("CTA action not (yet) supported: ", p0.getAction()), new Object[0]);
        } else {
            if (p0.getActionTerm() == null) {
                throw new IllegalArgumentException(YU.a.g(p0.getAction(), " requires a non-null actionTerm").toString());
            }
            SharedFlowImpl sharedFlowImpl = viewSimilarProductsViewModel.l;
            String actionTerm = p0.getActionTerm();
            Intrinsics.e(actionTerm);
            sharedFlowImpl.f(new ViewSimilarProductsContract.Action.LaunchProductSearch(actionTerm));
        }
        AnalyticsManager analyticsManager = viewSimilarProductsViewModel.h;
        ListsAnalytics.ViewSimilarItems.Action.Companion companion = ListsAnalytics.ViewSimilarItems.Action.d;
        final String ctaText = p0.getText();
        companion.getClass();
        Intrinsics.h(ctaText, "ctaText");
        analyticsManager.g(new Event(ctaText) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$cta$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.y("event.Label", ctaText, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "button_click";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
