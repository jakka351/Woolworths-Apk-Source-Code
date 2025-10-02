package au.com.woolworths.design.core.ui.component.experimental.badge;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.product.list.compose.FullScreenMessageContentKt;
import au.com.woolworths.feature.product.list.compose.productsearch.SearchRowSectionKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.P2PLiveTrackingMapItemKt;
import au.com.woolworths.feature.shop.recipes.search.ui.RecipeSearchScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.sectionoptionitem.SectionTitleItemKt;
import au.com.woolworths.foundation.rewards.common.ui.info.FeatureInfoTextItemUiKt;
import au.com.woolworths.foundation.rewards.offers.ui.RewardsOfferTileKt;
import au.com.woolworths.foundation.shop.nhp.ui.edr.EdrOfferBannerKt;
import au.com.woolworths.foundation.shop.nhp.ui.pp.InlineProductCarouselKt;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferSuccessScreenKt;
import au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.ReviewCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Modifier f;

    public /* synthetic */ a(Modifier modifier, String str, int i) {
        this.d = 0;
        BadgeVariant[] badgeVariantArr = BadgeVariant.d;
        this.f = modifier;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Modifier modifier = this.f;
        String str = this.e;
        switch (i) {
            case 0:
                BadgeVariant[] badgeVariantArr = BadgeVariant.d;
                ((Integer) obj2).getClass();
                BadgeKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                FullScreenMessageContentKt.d(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                FullScreenMessageContentKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 3:
                ((Integer) obj2).getClass();
                SearchRowSectionKt.c(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 4:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageContentKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 5:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.FullScreenMessageContentKt.d(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 6:
                ((Integer) obj2).getClass();
                au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchRowSectionKt.c(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 7:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.p(RecomposeScopeImplKt.a(49), (Composer) obj, modifier, str);
                break;
            case 8:
                ((Integer) obj2).getClass();
                P2PLiveTrackingMapItemKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 9:
                ((Integer) obj2).getClass();
                RecipeSearchScreenKt.b(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 10:
                ((Integer) obj2).getClass();
                SectionTitleItemKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 11:
                ((Integer) obj2).getClass();
                FeatureInfoTextItemUiKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 12:
                ((Integer) obj2).getClass();
                RewardsOfferTileKt.i(RecomposeScopeImplKt.a(49), (Composer) obj, modifier, str);
                break;
            case 13:
                ((Integer) obj2).getClass();
                RewardsOfferTileKt.k(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 14:
                ((Integer) obj2).getClass();
                EdrOfferBannerKt.c(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 15:
                ((Integer) obj2).getClass();
                InlineProductCarouselKt.b(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            case 16:
                ((Integer) obj2).getClass();
                QuickAddOfferSuccessScreenKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, modifier, str);
                break;
            default:
                ((Integer) obj2).getClass();
                ReviewCardKt.c(RecomposeScopeImplKt.a(49), (Composer) obj, modifier, str);
                break;
        }
        return unit;
    }

    public /* synthetic */ a(String str, Modifier modifier, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = modifier;
    }
}
