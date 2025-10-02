package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class OrderConfirmationEpoxyController$buildUi$15$1$1$1 extends FunctionReferenceImpl implements Function1<DynamicSizeCardData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicSizeCardData p0 = (DynamicSizeCardData) obj;
        Intrinsics.h(p0, "p0");
        ((OrderConfirmationViewModel) this.receiver).m(p0);
        return Unit.f24250a;
    }
}
