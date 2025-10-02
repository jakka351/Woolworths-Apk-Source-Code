package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt;
import au.com.woolworths.feature.shop.instore.cart.ui.InstoreCartScreenKt;
import au.com.woolworths.product.deliveryaddressprompt.AddDeliveryAddressBottomSheetScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ d(int i, int i2, Function0 function0) {
        this.d = i2;
        this.e = function0;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.d) {
            case 0:
                num.getClass();
                FilterCardItemKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 1:
                num.getClass();
                au.com.woolworths.feature.product.list.legacy.compose.filter.FilterCardItemKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 2:
                num.getClass();
                CategoryListingScreenKt.d(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 3:
                num.getClass();
                PromotionDetailsScreenKt.f(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            case 4:
                num.intValue();
                InstoreCartScreenKt.c(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
            default:
                num.getClass();
                AddDeliveryAddressBottomSheetScreenKt.a(this.e, composer, RecomposeScopeImplKt.a(this.f | 1));
                break;
        }
        return Unit.f24250a;
    }
}
