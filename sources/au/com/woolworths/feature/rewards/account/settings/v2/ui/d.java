package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.shop.catalogue.listing.category.ui.CategoryListingScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui.PromotionDetailsScreenKt;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.PromotionListingScreenKt;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.PageIndicatorKt;
import au.com.woolworths.foundation.ui.shimmers.ProductsSkeletonKt;
import au.com.woolworths.product.composeui.ProductCardButtonsKt;
import au.com.woolworths.shop.product.details.ui.ProductPriceKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public /* synthetic */ d(int i, int i2, Modifier modifier) {
        this.d = 8;
        this.f = i;
        this.e = modifier;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                LoadingPlaceholderItemUiKt.b(RecomposeScopeImplKt.a(this.f | 1), this.g, composer, this.e);
                break;
            case 1:
                CategoryListingScreenKt.e(RecomposeScopeImplKt.a(this.f | 1), this.g, composer, this.e);
                break;
            case 2:
                PromotionDetailsScreenKt.g(RecomposeScopeImplKt.a(this.f | 1), this.g, composer, this.e);
                break;
            case 3:
                PromotionListingScreenKt.d(RecomposeScopeImplKt.a(this.f | 1), this.g, composer, this.e);
                break;
            case 4:
                PageIndicatorKt.b(this.f, this.g, RecomposeScopeImplKt.a(385), composer, this.e);
                break;
            case 5:
                ProductsSkeletonKt.b(RecomposeScopeImplKt.a(this.f | 1), this.g, composer, this.e);
                break;
            case 6:
                ProductCardButtonsKt.h(RecomposeScopeImplKt.a(this.f | 1), this.g, composer, this.e);
                break;
            case 7:
                ProductCardButtonsKt.g(RecomposeScopeImplKt.a(this.f | 1), this.g, composer, this.e);
                break;
            default:
                ProductPriceKt.a(this.f, RecomposeScopeImplKt.a(this.g | 1), composer, this.e);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ d(int i, int i2, Modifier modifier, int i3) {
        this.d = 4;
        this.f = i;
        this.g = i2;
        this.e = modifier;
    }

    public /* synthetic */ d(Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = i;
        this.g = i2;
    }
}
