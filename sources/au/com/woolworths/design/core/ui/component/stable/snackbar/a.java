package au.com.woolworths.design.core.ui.component.stable.snackbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.models.products.ProductListMarketplace;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingCta;
import au.com.woolworths.dynamic.page.data.CampaignTermsAndConditionsData;
import au.com.woolworths.dynamic.page.ui.content.TermsAndConditionsUiKt;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.rewards.offers.ui.OfferDetailMechanicsKt;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionSettingKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.ui.FeaturesSectionKt;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.CurrentPickupOrderOverviewItemKt;
import au.com.woolworths.feature.shop.product.availability.ui.ProductPanelUiKt;
import au.com.woolworths.foundation.rewards.common.ui.PulsingIndicatorColor;
import au.com.woolworths.foundation.rewards.common.ui.PulsingIndicatorKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferMechanicItem;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.product.composeui.ProductMarketplaceDetailsKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.VideoAdUnitData;
import au.com.woolworths.sdui.legacy.banner.inlinemessage.InlineMessageUiKt;
import au.com.woolworths.shop.aem.components.ui.CatalogueCardKt;
import au.com.woolworths.shop.lists.ui.substitutions.SelectAlternativeOptionsBottomSheetContentKt;
import au.com.woolworths.shop.productcard.data.MarketplaceInfo;
import au.com.woolworths.shop.productcard.ui.components.MarketPartnerKt;
import com.halilibo.richtext.ui.HeadingKt;
import com.halilibo.richtext.ui.RichTextScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(int i, String str, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.d = 5;
        this.f = i;
        this.h = str;
        this.e = composableLambdaImpl;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.g;
        Object obj3 = this.e;
        int i3 = this.f;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SnackbarHostKt.b((SnackbarHostState) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                TermsAndConditionsUiKt.a((CampaignTermsAndConditionsData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                float f = ProductListFragment.u;
                ((ProductListFragment) obj4).Q2(i3, (VideoAdUnitData) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                OfferDetailMechanicsKt.a((RewardsOfferMechanicItem) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                RedemptionSettingKt.d((RewardsRedemptionSettingCta) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.c(i3, (String) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                FeaturesSectionKt.b((ShoppingModeSection.ShoppingModeSelectorStoreFeaturesData) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                CurrentPickupOrderOverviewItemKt.a((BroadcastBannerData) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ProductPanelUiKt.a((ProductCard) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 9:
                ((Integer) obj2).getClass();
                PulsingIndicatorKt.a((PulsingIndicatorColor) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ServiceMessageUiKt.b((RewardsServiceMessage) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ProductMarketplaceDetailsKt.a((ProductListMarketplace) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 12:
                ((Integer) obj2).getClass();
                InlineMessageUiKt.a((InlineMessage) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 13:
                ((Integer) obj2).getClass();
                CatalogueCardKt.b((Modifier) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(i2 | 1);
                SelectAlternativeOptionsBottomSheetContentKt.b(i3, iA, (Composer) obj, (String) obj4, (Function0) obj3);
                break;
            case 15:
                ((Integer) obj2).getClass();
                MarketPartnerKt.a((MarketplaceInfo) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), i2);
                break;
            case 16:
                ((Integer) obj2).intValue();
                HeadingKt.b((RichTextScope) obj4, i3, (String) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                HeadingKt.a((RichTextScope) obj4, i3, (ComposableLambdaImpl) obj3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                break;
        }
        return unit;
    }

    public /* synthetic */ a(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = 13;
        this.e = modifier;
        this.h = composableLambdaImpl;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ a(Object obj, int i, Object obj2, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.f = i;
        this.e = obj2;
        this.g = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.e = obj2;
        this.f = i;
        this.g = i2;
    }
}
