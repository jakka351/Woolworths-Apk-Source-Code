package au.com.woolworths.feature.product.list;

import au.com.woolworths.android.onesite.featuretoggles.BaseFeature;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.product.list.ui.MarketplaceSwitchListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return Boolean.valueOf(((ComposeProductListActivityViewModel) this.e).g.c(BaseShopAppFeature.h0));
            case 1:
                ((MarketplaceSwitchListener) this.e).E();
                return Unit.f24250a;
            case 2:
                ((ProductListOptionsFilterFragment) this.e).requireActivity().getF().d();
                return Unit.f24250a;
            default:
                return Boolean.valueOf(((ProductListPaginationAdapter) this.e).b.c(BaseFeature.q));
        }
    }
}
