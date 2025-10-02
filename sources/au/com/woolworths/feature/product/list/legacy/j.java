package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.product.models.ProductCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListController e;
    public final /* synthetic */ ProductCard f;

    public /* synthetic */ j(ProductListController productListController, ProductCard productCard, int i) {
        this.d = i;
        this.e = productListController;
        this.f = productCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                this.e.productListViewModel.T0(this.f);
                break;
            case 3:
                this.e.productListViewModel.K6(this.f);
                break;
            case 4:
                this.e.productListViewModel.K6(this.f);
                break;
            case 5:
                this.e.productListViewModel.g6(this.f, "");
                break;
            default:
                this.e.productListViewModel.g6(this.f, "");
                break;
        }
        return Unit.f24250a;
    }
}
