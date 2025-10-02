package au.com.woolworths.shop.checkout.ui.summary;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
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
final /* synthetic */ class CheckoutSummaryFragment$updateBottomSheet$1$1$1$13$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((String) obj);
        return Unit.f24250a;
    }

    public final void m(final String p0) {
        Intrinsics.h(p0, "p0");
        CheckoutSummaryViewModel checkoutSummaryViewModel = (CheckoutSummaryViewModel) this.receiver;
        checkoutSummaryViewModel.getClass();
        AnalyticsManager analyticsManager = checkoutSummaryViewModel.p;
        CheckoutAnalytics.Summary.Action.d.getClass();
        analyticsManager.g(new Event(p0) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$removePromoCodeButtonClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(CheckoutAnalytics.Summary.f);
                spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                spreadBuilder.a(new Pair("event.Action", "discount_removal"));
                androidx.constraintlayout.core.state.a.y("checkout.promoCodes", androidx.compose.ui.input.pointer.a.m("event.Label", "Promo code removed", spreadBuilder, p0), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "checkout_promo_code_removed";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "checkout_promo_code_removed".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        BuildersKt.c(ViewModelKt.a(checkoutSummaryViewModel), null, null, new CheckoutSummaryViewModel$removeCheckoutPromoCode$1(checkoutSummaryViewModel, p0, null), 3);
    }
}
