package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CheckoutSummaryFragment$updateBottomSheet$1$1$1$16$1 extends FunctionReferenceImpl implements Function1<ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CheckoutRewardsAndDiscount.StoreCredit storeCreditA;
        ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo p0 = (ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo) obj;
        Intrinsics.h(p0, "p0");
        CheckoutSummaryViewModel checkoutSummaryViewModel = (CheckoutSummaryViewModel) this.receiver;
        checkoutSummaryViewModel.getClass();
        checkoutSummaryViewModel.p.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, p0.c));
        if (CheckoutSummaryViewModel.WhenMappings.f10824a[p0.f10557a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Checkout checkout = ((CheckoutContentContract.ViewState) checkoutSummaryViewModel.j.getValue()).d;
        if (checkout != null && (storeCreditA = CheckoutKt.a(checkout)) != null) {
            checkoutSummaryViewModel.K6(storeCreditA);
        }
        return Unit.f24250a;
    }
}
