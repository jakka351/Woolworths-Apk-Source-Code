package au.com.woolworths.feature.product.list;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$EdrOfferBannerUi$2$1 extends AdaptedFunctionReference implements Function1<EdrOfferBannerData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EdrOfferBannerData p0 = (EdrOfferBannerData) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.d;
        productListViewModel.getClass();
        BuildersKt.c(ViewModelKt.a(productListViewModel), null, null, new ProductListViewModel$onEdrBoostButtonClick$1(productListViewModel, p0, null), 3);
        return Unit.f24250a;
    }
}
