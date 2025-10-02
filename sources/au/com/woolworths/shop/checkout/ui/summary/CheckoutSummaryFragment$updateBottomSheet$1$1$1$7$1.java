package au.com.woolworths.shop.checkout.ui.summary;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditItem;
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
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CheckoutSummaryFragment$updateBottomSheet$1$1$1$7$1 extends FunctionReferenceImpl implements Function1<CheckoutStoreCreditItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((CheckoutStoreCreditItem) obj);
        return Unit.f24250a;
    }

    public final void m(CheckoutStoreCreditItem p0) {
        Intrinsics.h(p0, "p0");
        CheckoutSummaryViewModel checkoutSummaryViewModel = (CheckoutSummaryViewModel) this.receiver;
        checkoutSummaryViewModel.getClass();
        AnalyticsManager analyticsManager = checkoutSummaryViewModel.p;
        CheckoutAnalytics.Summary.Action.Companion companion = CheckoutAnalytics.Summary.Action.d;
        final String str = p0.g;
        final String str2 = p0.f;
        companion.getClass();
        analyticsManager.g(new Event(str, str2) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$applyCreditButtonClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CheckoutAnalytics.Summary.f);
                spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                spreadBuilder.a(new Pair("event.Action", "discount_activation"));
                spreadBuilder.a(new Pair("event.Label", "Store credit applied"));
                spreadBuilder.a(new Pair("checkout.storeCreditAmount", str));
                androidx.constraintlayout.core.state.a.y("checkout.storeCreditCode", str2, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "checkout_store_credit_applied";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "checkout_store_credit_applied".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        BuildersKt.c(ViewModelKt.a(checkoutSummaryViewModel), null, null, new CheckoutSummaryViewModel$applyStoreCredit$1(checkoutSummaryViewModel, p0, null), 3);
    }
}
