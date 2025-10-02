package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CheckoutSummaryEpoxyController$buildUi$19$1$1 extends FunctionReferenceImpl implements Function1<CheckoutRewardsAndDiscount, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CheckoutRewardsAndDiscount p0 = (CheckoutRewardsAndDiscount) obj;
        Intrinsics.h(p0, "p0");
        ((CheckoutSummaryListener) this.receiver).E5(p0);
        return Unit.f24250a;
    }
}
