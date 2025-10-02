package au.com.woolworths.shop.cart.ui.productalternative;

import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.domain.model.ProductReviewAlternativeResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductsReviewAlternativeCallbacks e;
    public final /* synthetic */ PageResult f;

    public /* synthetic */ a(ProductsReviewAlternativeCallbacks productsReviewAlternativeCallbacks, PageResult pageResult, int i) {
        this.d = i;
        this.e = productsReviewAlternativeCallbacks;
        this.f = pageResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.I3(((ProductReviewAlternativeResponseData) ((PageResult.Success) this.f).f10438a).g.d);
                break;
            default:
                this.e.U0(((ProductReviewAlternativeResponseData) ((PageResult.Success) this.f).f10438a).g.c.b);
                break;
        }
        return Unit.f24250a;
    }
}
