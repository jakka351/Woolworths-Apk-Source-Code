package au.com.woolworths.feature.product.list.legacy.compose.filter;

import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.legacy.analytics.SeeResultsClickSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListOptionsViewModel e;

    public /* synthetic */ c(ProductListOptionsViewModel productListOptionsViewModel, int i) {
        this.d = i;
        this.e = productListOptionsViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.F6(SeeResultsClickSource.e);
                break;
            case 1:
                this.e.F6(SeeResultsClickSource.e);
                break;
            default:
                this.e.F6(SeeResultsClickSource.f);
                break;
        }
        return Unit.f24250a;
    }
}
