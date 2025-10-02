package au.com.woolworths.shop.checkout.ui.epoxy.controller;

import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CheckoutProductEpoxyController e;
    public final /* synthetic */ CheckoutProduct f;

    public /* synthetic */ a(CheckoutProductEpoxyController checkoutProductEpoxyController, CheckoutProduct checkoutProduct, int i) {
        this.d = i;
        this.e = checkoutProductEpoxyController;
        this.f = checkoutProduct;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.checkoutProductListener.x1(this.f);
                break;
            case 1:
                this.e.checkoutProductListener.E4(this.f);
                break;
            default:
                this.e.checkoutProductListener.I4(this.f);
                break;
        }
        return Unit.f24250a;
    }
}
