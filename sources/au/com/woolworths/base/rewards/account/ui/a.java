package au.com.woolworths.base.rewards.account.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.base.shopapp.customviews.InlineLabel;
import au.com.woolworths.design.core.ui.component.experimental.tag.TagSpec;
import au.com.woolworths.design.wx.utils.MeasureInlineContentPlaceholderKt;
import au.com.woolworths.dynamic.page.data.DynamicPageFeedData;
import au.com.woolworths.dynamic.page.ui.content.ScreenContentKt;
import au.com.woolworths.feature.rewards.account.closeaccount.model.DeleteAccountConfirmation;
import au.com.woolworths.feature.rewards.account.closeaccount.ui.ConsentPageUiKt;
import au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiScreenKt;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData;
import au.com.woolworths.feature.shop.contentpage.ui.infotile.InfoTileKt;
import au.com.woolworths.feature.shop.countryselector.ui.CountrySelectorUiKt;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.RegistrationCardUIKt;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.DirectionAndDistanceIndicatorData;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.MapProductCardKt;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderScreenKt;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButton;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import au.com.woolworths.feature.shop.modeselector.ui.LocationContentKt;
import au.com.woolworths.feature.shop.modeselector.ui.ModeSelectorButtonsKt;
import au.com.woolworths.feature.shop.modeselector.ui.StoreDetailsSectionKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.MandyBannerUiKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.MandyBanner;
import au.com.woolworths.foundation.rewards.common.ui.info.FeatureInfoBulletItemUiKt;
import au.com.woolworths.foundation.rewards.offers.ui.AutoAdjustBackgroundHeaderImageKt;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageUiKt;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdBottomSheet;
import au.com.woolworths.foundation.shop.video.advertising.ui.VideoAdUnitKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageSpec;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessageUiKt;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelKt;
import au.com.woolworths.product.composeui.ProductMemberPriceLabelStyle;
import au.com.woolworths.product.composeui.ProductNameKt;
import au.com.woolworths.product.models.MemberPriceInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.sdui.common.coretag.TagKt;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.sdui.legacy.banner.designcoreadapter.StandardAlertKt;
import au.com.woolworths.shared.ui.compose.ConfettiKt;
import au.com.woolworths.shop.aem.components.model.bottomsheet.StaticBottomSheetData;
import au.com.woolworths.shop.aem.components.model.searchnavcard.SearchNavCardData;
import au.com.woolworths.shop.aem.components.ui.bottomsheet.StaticBottomSheetContentKt;
import au.com.woolworths.shop.aem.components.ui.searchnavcard.SearchNavCardKt;
import au.com.woolworths.shop.aem.components.ui.tab.ComposableSingletons$TabItemsKt;
import au.com.woolworths.shop.aem.components.ui.tab.TabItemsKt;
import au.com.woolworths.shop.aem.components.ui.tab.TabRowStyle;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.ui.components.compose.FulfilmentWindowsOptionUiKt;
import au.com.woolworths.shop.checkout.ui.timeselector.compose.TimeSelectorFooterKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ a(int i, TabRowStyle tabRowStyle, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.d = 27;
        ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$TabItemsKt.f10223a;
        this.f = i;
        this.h = tabRowStyle;
        this.e = modifier;
        this.i = composableLambdaImpl;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        int i2 = this.g;
        int i3 = this.f;
        Unit unit = Unit.f24250a;
        Object obj3 = this.e;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 1:
                ((Integer) obj2).getClass();
                MeasureInlineContentPlaceholderKt.a((ComposableLambdaImpl) obj5, (Modifier) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ScreenContentKt.f((DynamicPageFeedData) obj5, (Modifier) obj3, (Function2) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ConsentPageUiKt.b((DeleteAccountConfirmation) obj5, (LazyListState) obj3, (Function1) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 4:
                ((Integer) obj2).getClass();
                InstoreWifiScreenKt.l((String) obj5, (Modifier) obj3, (Function2) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 5:
                ((Integer) obj2).getClass();
                InfoTileKt.a((InfoTileData) obj5, (Modifier) obj3, (Function1) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 6:
                ((Integer) obj2).getClass();
                CountrySelectorUiKt.b((Region) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 7:
                ((Integer) obj2).getClass();
                RegistrationCardUIKt.a((Function0) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 8:
                ((Integer) obj2).getClass();
                MapProductCardKt.a((ProductCard) obj5, (Modifier) obj3, (DirectionAndDistanceIndicatorData) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(i2 | 1);
                ProductFinderScreenKt.e((String) obj5, (Function1) obj4, this.f, (Modifier) obj3, (Composer) obj, iA);
                break;
            case 10:
                ((Integer) obj2).getClass();
                LocationContentKt.a((ShoppingModeSection.ShoppingModeSelectorAddressInfoSection) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ModeSelectorButtonsKt.b((Function1) obj4, (ShoppingModeButton) obj5, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 12:
                ((Integer) obj2).getClass();
                StoreDetailsSectionKt.b((ShoppingModeSection.ShoppingModeSelectorStoreDetailsSectionData) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 13:
                ((Integer) obj2).getClass();
                MandyBannerUiKt.a((MandyBanner) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 14:
                ((Integer) obj2).getClass();
                FeatureInfoBulletItemUiKt.a((FeatureInfoBulletItem) obj5, (Modifier) obj3, (List) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 15:
                ((Integer) obj2).getClass();
                AutoAdjustBackgroundHeaderImageKt.a((String) obj5, (Modifier) obj3, (Painter) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 16:
                ((Integer) obj2).getClass();
                ServiceMessageUiKt.a((RewardsServiceMessage) obj5, (Modifier) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 17:
                ((Integer) obj2).getClass();
                VideoAdUnitKt.a((VideoAdBottomSheet) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 18:
                ((Integer) obj2).getClass();
                FullPageMessageUiKt.a((FullPageMessageSpec) obj5, (Modifier) obj3, (Alignment.Vertical) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 19:
                ((Integer) obj2).getClass();
                au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageUiKt.a((au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessageSpec) obj5, (Modifier) obj3, (Alignment.Vertical) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 20:
                ((Integer) obj2).getClass();
                ProductMemberPriceLabelKt.a((MemberPriceInfo) obj5, (Modifier) obj3, (ProductMemberPriceLabelStyle) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 21:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(i2 | 1);
                ProductNameKt.a((InlineLabel) obj5, (Modifier) obj3, this.f, (Integer) obj4, (Composer) obj, iA2);
                break;
            case 22:
                ((Integer) obj2).getClass();
                TagKt.a((CoreTagModel) obj5, (Modifier) obj3, (TagSpec.Size) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 23:
                ((Integer) obj2).getClass();
                StandardAlertKt.c((InsetBanner) obj5, (Modifier) obj3, (Function1) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 24:
                ((Integer) obj2).getClass();
                ConfettiKt.a((List) obj5, (Modifier) obj3, (Function0) obj4, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 25:
                ((Integer) obj2).getClass();
                StaticBottomSheetContentKt.a((StaticBottomSheetData) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 26:
                ((Integer) obj2).getClass();
                SearchNavCardKt.a((SearchNavCardData) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            case 27:
                ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$TabItemsKt.f10223a;
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(i2 | 1);
                TabItemsKt.a(this.f, (TabRowStyle) obj5, (Modifier) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, iA3);
                break;
            case 28:
                ((Integer) obj2).getClass();
                FulfilmentWindowsOptionUiKt.a((FulfilmentWindowsOption) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                TimeSelectorFooterKt.a((FooterData) obj5, (Function0) obj4, (Modifier) obj3, (Composer) obj, RecomposeScopeImplKt.a(i3 | 1), this.g);
                break;
        }
        return unit;
    }

    public /* synthetic */ a(InlineLabel inlineLabel, Modifier modifier, int i, Integer num, int i2) {
        this.d = 21;
        this.h = inlineLabel;
        this.e = modifier;
        this.f = i;
        this.i = num;
        this.g = i2;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.e = obj2;
        this.i = obj3;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ a(Object obj, Function function, Modifier modifier, int i, int i2, int i3) {
        this.d = i3;
        this.h = obj;
        this.i = function;
        this.e = modifier;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ a(String str, Function1 function1, int i, Modifier modifier, int i2) {
        this.d = 9;
        this.h = str;
        this.i = function1;
        this.f = i;
        this.e = modifier;
        this.g = i2;
    }

    public /* synthetic */ a(Function1 function1, ShoppingModeButton shoppingModeButton, Modifier modifier, int i, int i2) {
        this.d = 11;
        this.i = function1;
        this.h = shoppingModeButton;
        this.e = modifier;
        this.f = i;
        this.g = i2;
    }
}
