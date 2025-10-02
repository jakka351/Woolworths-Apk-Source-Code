package au.com.woolworths.feature.shop.homepage.presentation;

import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardImageLoaderListener;
import au.com.woolworths.android.onesite.epoxy.DynamicSizeCardEpoxyModel;
import au.com.woolworths.android.onesite.epoxy.ItemSpacerEpoxyModel;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.home.models.RegistrationTileData;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.customviews.itemdividers.Divider;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.base.shopapp.epoxy.HorizontalModelGroup;
import au.com.woolworths.base.shopapp.modules.spacer.SpacerApiData;
import au.com.woolworths.base.shopapp.modules.spacer.SpacerApiDataKt;
import au.com.woolworths.base.shopapp.remoteconfig.ShopRemoteConfig;
import au.com.woolworths.compose.utils.modifier.SharedIntrinsicHeightState;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BroadcastBannerKt;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.homepage.HomeFeature;
import au.com.woolworths.feature.shop.homepage.HomepageDividerBindingModel_;
import au.com.woolworths.feature.shop.homepage.ItemAddRewardsTileBindingModel_;
import au.com.woolworths.feature.shop.homepage.ItemCatalogueTileBindingModel_;
import au.com.woolworths.feature.shop.homepage.ItemOrdersTileBindingModel_;
import au.com.woolworths.feature.shop.homepage.ItemPriorityMessageTileBindingModel_;
import au.com.woolworths.feature.shop.homepage.ItemRegistrationTileBindingModel_;
import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.data.AddRewardsTileData;
import au.com.woolworths.feature.shop.homepage.data.BoosterHorizontalListData;
import au.com.woolworths.feature.shop.homepage.data.CatalogueCard;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentStatusBannerData;
import au.com.woolworths.feature.shop.homepage.data.HomeListData;
import au.com.woolworths.feature.shop.homepage.data.MarketplaceCard;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.data.QuickLinkHorizontalListData;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.homepage.domain.HeroBannerInteractor;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.boosters.MyBoostersViewModel_;
import au.com.woolworths.feature.shop.homepage.presentation.carousel.ProductCarouselViewModel_;
import au.com.woolworths.feature.shop.homepage.presentation.lists.MyListsKt;
import au.com.woolworths.feature.shop.homepage.presentation.marketplace.MarketplaceCardViewModel_;
import au.com.woolworths.feature.shop.homepage.presentation.quicklinks.HorizontalQuickLinkListKt;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardUiKt;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.ItemProductCardTileBindingModel_;
import au.com.woolworths.product.databinding.EpoxyItemProductCardTileBinding;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListActionState;
import au.com.woolworths.sdui.legacy.scrollablelist.ScrollableListUiKt;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardMargins;
import au.com.woolworths.shop.aem.components.model.herobanner.Carousel;
import au.com.woolworths.shop.aem.components.model.herobanner.CarouselItem;
import au.com.woolworths.shop.aem.components.model.herobanner.HeroBanner;
import au.com.woolworths.shop.aem.components.model.recipe.RecipeCardSummaryData;
import au.com.woolworths.shop.aem.components.ui.herobanner.HeroBannerKt;
import com.airbnb.epoxy.ComposeInteropKt;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.TypedEpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\u001e\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010'\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020#H\u0002J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u00100\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u0002012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u00102\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u0002032\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u00104\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u000205H\u0002J\u0018\u00106\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u0002072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u00108\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u0002092\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomeController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "Lau/com/woolworths/feature/shop/homepage/data/HomeListData;", "viewModel", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageViewModel;", "featureToggleManager", "Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;", "collectionModeInteractor", "Lau/com/woolworths/foundation/shop/collectionmode/CollectionModeInteractor;", "heroBannerInteractor", "Lau/com/woolworths/feature/shop/homepage/domain/HeroBannerInteractor;", "<init>", "(Lau/com/woolworths/feature/shop/homepage/presentation/HomePageViewModel;Lau/com/woolworths/android/onesite/featuretoggles/FeatureToggleManager;Lau/com/woolworths/foundation/shop/collectionmode/CollectionModeInteractor;Lau/com/woolworths/feature/shop/homepage/domain/HeroBannerInteractor;)V", "buildModels", "", "homeListData", "buildHeroBannerList", "data", "", "Lau/com/woolworths/shop/aem/components/model/herobanner/CarouselItem;", "index", "", "buildRewardsBalanceCard", "Lau/com/woolworths/feature/shop/homepage/data/RewardsBalanceCardData;", "buildBroadcastBanner", "Lau/com/woolworths/foundation/shop/banners/broadcastbanner/data/BroadcastBannerData;", "buildMyLists", "Lau/com/woolworths/feature/shop/homepage/data/MyShoppingListsData;", "buildQuickLinkHorizontalList", "Lau/com/woolworths/feature/shop/homepage/data/QuickLinkHorizontalListData;", "shouldEnableComposeHorizontalProductLists", "", "buildHorizontalList", "Lau/com/woolworths/android/onesite/data/HorizontalListData;", "buildOrderCardTile", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "createProductCardConfig", "Lau/com/woolworths/product/models/ProductCardConfig;", "buildProductCarousel", "buildBoosterHorizontalList", "Lau/com/woolworths/feature/shop/homepage/data/BoosterHorizontalListData;", "buildProductCardTile", "getHorizontalListActionState", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionState;", "shouldShowAddToListButton", "product", "Lau/com/woolworths/product/models/ProductCard;", "buildRecipesTile", "buildPriorityMessageBanner", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerApiData;", "buildSpacer", "Lau/com/woolworths/base/shopapp/modules/spacer/SpacerApiData;", "buildMarketplaceCard", "Lau/com/woolworths/feature/shop/homepage/data/MarketplaceCard;", "buildActionableCard", "Lau/com/woolworths/sdui/shop/actionablecard/ActionableCard;", "buildGoogleAdBannerCard", "Lau/com/woolworths/foundation/advertising/data/google/model/GoogleAdBannerCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HomeController extends TypedEpoxyController<HomeListData> {
    public static final int $stable = 8;

    @NotNull
    private final CollectionModeInteractor collectionModeInteractor;

    @NotNull
    private final FeatureToggleManager featureToggleManager;

    @NotNull
    private final HeroBannerInteractor heroBannerInteractor;

    @NotNull
    private final HomePageViewModel viewModel;

    public HomeController(@NotNull HomePageViewModel viewModel, @NotNull FeatureToggleManager featureToggleManager, @NotNull CollectionModeInteractor collectionModeInteractor, @NotNull HeroBannerInteractor heroBannerInteractor) {
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(heroBannerInteractor, "heroBannerInteractor");
        this.viewModel = viewModel;
        this.featureToggleManager = featureToggleManager;
        this.collectionModeInteractor = collectionModeInteractor;
        this.heroBannerInteractor = heroBannerInteractor;
    }

    private final void buildActionableCard(ActionableCard data, int index) {
        DynamicSizeCardEpoxyModel dynamicSizeCardEpoxyModel = new DynamicSizeCardEpoxyModel(R.layout.item_dynamic_size_card);
        buildActionableCard$lambda$18(index, data, this, dynamicSizeCardEpoxyModel);
        add(dynamicSizeCardEpoxyModel);
    }

    private static final Unit buildActionableCard$lambda$18(int i, ActionableCard data, HomeController homeController, DynamicSizeCardEpoxyModel itemDynamicSizeCard) {
        Intrinsics.h(itemDynamicSizeCard, "$this$itemDynamicSizeCard");
        itemDynamicSizeCard.D("actionable_card_" + i);
        Intrinsics.h(data, "data");
        itemDynamicSizeCard.p = data;
        itemDynamicSizeCard.q = new DynamicSizeCardMargins(15);
        itemDynamicSizeCard.s = new DynamicSizeCardImageLoaderListener();
        HomePageViewModel clickListener = homeController.viewModel;
        Intrinsics.h(clickListener, "clickListener");
        itemDynamicSizeCard.r = clickListener;
        itemDynamicSizeCard.t = new n(4, homeController, data);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildActionableCard$lambda$18$lambda$17(HomeController homeController, ActionableCard actionableCard) {
        HomePageViewModel homePageViewModel = homeController.viewModel;
        homePageViewModel.getClass();
        Intrinsics.h(actionableCard, "actionableCard");
        homePageViewModel.f.j(HomePageActions.ActionableCardImpression.e, ActionableCardKt.a(actionableCard));
        return Unit.f24250a;
    }

    private final void buildBoosterHorizontalList(BoosterHorizontalListData data, int index) {
        HomePageViewModel homePageViewModel = this.viewModel;
        HorizontalListActionState horizontalListActionState = getHorizontalListActionState(data);
        MyBoostersViewModel_ myBoostersViewModel_ = new MyBoostersViewModel_();
        myBoostersViewModel_.n = null;
        myBoostersViewModel_.o = null;
        myBoostersViewModel_.p = null;
        myBoostersViewModel_.q = null;
        myBoostersViewModel_.r = null;
        myBoostersViewModel_.s = null;
        myBoostersViewModel_.D("my_boosters_" + index);
        myBoostersViewModel_.t();
        myBoostersViewModel_.p = horizontalListActionState;
        myBoostersViewModel_.t();
        myBoostersViewModel_.n = data;
        ProductCardConfig productCardConfigCreateProductCardConfig = createProductCardConfig();
        myBoostersViewModel_.t();
        myBoostersViewModel_.o = productCardConfigCreateProductCardConfig;
        myBoostersViewModel_.t();
        myBoostersViewModel_.r = homePageViewModel;
        myBoostersViewModel_.t();
        myBoostersViewModel_.s = homePageViewModel;
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) homePageViewModel.I.getValue();
        List list = viewState != null ? viewState.h : null;
        myBoostersViewModel_.t();
        myBoostersViewModel_.q = list;
        addInternal(myBoostersViewModel_);
        myBoostersViewModel_.d(this);
    }

    private final void buildBroadcastBanner(final BroadcastBannerData data, int index) {
        ComposeInteropKt.a(this, YU.a.d(index, "homepage_broadcast_banner_"), new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildBroadcastBanner.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final BroadcastBannerData broadcastBannerData = data;
                    final HomeController homeController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1786549657, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildBroadcastBanner.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                composer2.o(5004770);
                                HomeController homeController2 = homeController;
                                boolean zI = composer2.I(homeController2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new a(homeController2, 0);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(homeController2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    objG2 = new a(homeController2, 1);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                BroadcastBannerKt.a(broadcastBannerData, function1, (Function1) objG2, PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 8, 7), null, composer2, 3072, 16);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2069310289));
    }

    private final void buildGoogleAdBannerCard(GoogleAdBannerCard data, int index) {
        DynamicSizeCardEpoxyModel dynamicSizeCardEpoxyModel = new DynamicSizeCardEpoxyModel(R.layout.item_dynamic_size_card);
        buildGoogleAdBannerCard$lambda$20(index, data, this, dynamicSizeCardEpoxyModel);
        add(dynamicSizeCardEpoxyModel);
    }

    private static final Unit buildGoogleAdBannerCard$lambda$20(int i, GoogleAdBannerCard data, HomeController homeController, DynamicSizeCardEpoxyModel itemDynamicSizeCard) {
        Intrinsics.h(itemDynamicSizeCard, "$this$itemDynamicSizeCard");
        itemDynamicSizeCard.D("google_ad_banner_card_" + i);
        Intrinsics.h(data, "data");
        itemDynamicSizeCard.p = data;
        itemDynamicSizeCard.q = new DynamicSizeCardMargins(15);
        itemDynamicSizeCard.s = new DynamicSizeCardImageLoaderListener();
        HomePageViewModel clickListener = homeController.viewModel;
        Intrinsics.h(clickListener, "clickListener");
        itemDynamicSizeCard.r = clickListener;
        itemDynamicSizeCard.t = new n(3, homeController, data);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildGoogleAdBannerCard$lambda$20$lambda$19(HomeController homeController, GoogleAdBannerCard googleAdBannerCard) {
        HomePageViewModel homePageViewModel = homeController.viewModel;
        homePageViewModel.getClass();
        Intrinsics.h(googleAdBannerCard, "googleAdBannerCard");
        if (GoogleAdBannerCardKt.c(googleAdBannerCard)) {
            BuildersKt.c(ViewModelKt.a(homePageViewModel), null, null, new HomePageViewModel$onGoogleAdBannerImpression$1(homePageViewModel, googleAdBannerCard, null), 3);
            homePageViewModel.f.j(HomePageActions.GoogleAdBannerImpression.e, GoogleAdBannerCardKt.a(googleAdBannerCard));
        }
        return Unit.f24250a;
    }

    private final void buildHeroBannerList(final List<CarouselItem> data, int index) {
        HeroBannerInteractor heroBannerInteractor = this.heroBannerInteractor;
        SharedPreferences sharedPreferences = heroBannerInteractor.f7207a;
        SharedPreferences sharedPreferences2 = heroBannerInteractor.f7207a;
        Intrinsics.h(data, "data");
        final int i = 0;
        if (Integer.parseInt(heroBannerInteractor.b.e(ShopRemoteConfig.o, false)) < 1) {
            i = -1;
        } else {
            String string = sharedPreferences.getString("HERO_BANNER_ID_DATA", null);
            List listT = string != null ? StringsKt.T(string, new String[]{"##"}, 6) : null;
            ArrayList arrayList = new ArrayList();
            for (Object obj : data) {
                if (((CarouselItem) obj).f10162a != null) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                HeroBanner heroBanner = ((CarouselItem) it.next()).f10162a;
                Intrinsics.e(heroBanner);
                arrayList2.add(heroBanner.f10163a);
            }
            if (listT == null || !listT.equals(arrayList2)) {
                heroBannerInteractor.a(System.currentTimeMillis());
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("HERO_BANNER_ID_DATA", CollectionsKt.M(arrayList2, "##", null, null, null, 62));
                editorEdit.apply();
            } else {
                int i2 = sharedPreferences2.getInt("HERO_BANNER_LAST_SHOWN_POSITION", 0);
                if (System.currentTimeMillis() - sharedPreferences.getLong("HERO_BANNER_LAST_SHOWN_TIME", 0L) > Integer.parseInt(r5.e(ShopRemoteConfig.o, false)) * 1000) {
                    heroBannerInteractor.a(System.currentTimeMillis());
                    if (i2 < listT.size() - 1) {
                        i = i2 + 1;
                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                        editorEdit2.putInt("HERO_BANNER_LAST_SHOWN_POSITION", i);
                        editorEdit2.apply();
                    } else {
                        SharedPreferences.Editor editorEdit3 = sharedPreferences2.edit();
                        editorEdit3.putInt("HERO_BANNER_LAST_SHOWN_POSITION", 0);
                        editorEdit3.apply();
                    }
                } else {
                    heroBannerInteractor.a(System.currentTimeMillis());
                    i = i2;
                }
            }
        }
        ComposeInteropKt.a(this, androidx.camera.core.impl.b.i(index, i, "homepage_hero_banner_list_", "_"), new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildHeroBannerList.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final HomeController homeController = this;
                    final int i3 = i;
                    final List list = data;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-2107749153, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildHeroBannerList.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            Composer composer2 = (Composer) obj4;
                            if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierJ = PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 0, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, 7);
                                composer2.o(5004770);
                                HomeController homeController2 = homeController;
                                boolean zI = composer2.I(homeController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    objG = new a(homeController2, 2);
                                    composer2.A(objG);
                                }
                                Function1 function1 = (Function1) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(homeController2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new a(homeController2, 3);
                                    composer2.A(objG2);
                                }
                                Function1 function12 = (Function1) objG2;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI3 = composer2.I(homeController2);
                                List list2 = list;
                                boolean zI4 = zI3 | composer2.I(list2);
                                Object objG3 = composer2.G();
                                if (zI4 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new au.com.woolworths.feature.shop.catalogue.listing.promotion.ui.a(6, homeController2, list2);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                HeroBannerKt.b(list2, function1, function12, modifierJ, i3, (Function1) objG3, composer2, 3072, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1043639657));
    }

    private final void buildHorizontalList(HorizontalListData data, int index) {
        Object objF = CollectionsKt.F(data.getH());
        if (objF instanceof OrderCardData) {
            buildOrderCardTile(data, index);
            return;
        }
        if (objF instanceof ProductCard) {
            if (!shouldEnableComposeHorizontalProductLists()) {
                buildProductCardTile(data, index);
                return;
            }
            if (this.featureToggleManager.c(HomeFeature.g)) {
                buildProductCardTile(data, index);
            }
            buildProductCarousel(data, index);
            return;
        }
        if (objF instanceof RecipeCardSummaryData) {
            buildRecipesTile(data, index);
        } else if (objF == null) {
            Bark.Companion companion = Bark.f8483a;
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.i), "HorizontalLisData should contain a list of items with a known type to be displayed", null);
        }
    }

    private final void buildMarketplaceCard(MarketplaceCard data) {
        MarketplaceCardViewModel_ marketplaceCardViewModel_ = new MarketplaceCardViewModel_();
        marketplaceCardViewModel_.n = null;
        marketplaceCardViewModel_.o = null;
        marketplaceCardViewModel_.C("homepage_marketplace_" + data.hashCode());
        marketplaceCardViewModel_.t();
        marketplaceCardViewModel_.n = data;
        HomePageViewModel homePageViewModel = this.viewModel;
        marketplaceCardViewModel_.t();
        marketplaceCardViewModel_.o = homePageViewModel;
        add(marketplaceCardViewModel_);
    }

    private final void buildMyLists(final MyShoppingListsData data, int index) {
        ComposeInteropKt.a(this, YU.a.d(index, "homepage_my_lists_"), new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildMyLists.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final MyShoppingListsData myShoppingListsData = data;
                    final HomeController homeController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(469804553, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildMyLists.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                HomeController homeController2 = homeController;
                                HomePageViewModel homePageViewModel = homeController2.viewModel;
                                composer2.o(5004770);
                                boolean zI = composer2.I(homePageViewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    HomeController$buildMyLists$1$1$1$1 homeController$buildMyLists$1$1$1$1 = new HomeController$buildMyLists$1$1$1$1(1, homePageViewModel, HomePageViewModel.class, "onMyShoppingListsActionClicked", "onMyShoppingListsActionClicked(Lau/com/woolworths/feature/shop/homepage/data/MyShoppingListsData;)V", 0);
                                    composer2.A(homeController$buildMyLists$1$1$1$1);
                                    objG = homeController$buildMyLists$1$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                HomePageViewModel homePageViewModel2 = homeController2.viewModel;
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(homePageViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new HomeController$buildMyLists$1$1$2$1(1, homePageViewModel2, HomePageViewModel.class, "onMyShoppingListItemClicked", "onMyShoppingListItemClicked(Lau/com/woolworths/feature/shop/homepage/data/MyShoppingListItemData;)V", 0);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                Function1 function12 = (Function1) ((KFunction) objG2);
                                HomePageViewModel homePageViewModel3 = homeController2.viewModel;
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(homePageViewModel3);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    HomeController$buildMyLists$1$1$3$1 homeController$buildMyLists$1$1$3$1 = new HomeController$buildMyLists$1$1$3$1(0, homePageViewModel3, HomePageViewModel.class, "onBuyAgainListItemClicked", "onBuyAgainListItemClicked()V", 0);
                                    composer2.A(homeController$buildMyLists$1$1$3$1);
                                    objG3 = homeController$buildMyLists$1$1$3$1;
                                }
                                composer2.l();
                                MyListsKt.a(myShoppingListsData, function1, function12, (Function0) ((KFunction) objG3), PaddingKt.j(PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 8, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 24, 7), composer2, 24576);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -2050460735));
    }

    private final void buildOrderCardTile(HorizontalListDataInterface data, int index) {
        Object next;
        ArrayList arrayListB = CollectionsKt.B(data.getH());
        Iterator it = arrayListB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Intrinsics.f(next, "null cannot be cast to non-null type au.com.woolworths.feature.shop.homepage.data.OrderCardData");
            if (((OrderCardData) next).j != null) {
                break;
            }
        }
        FulfilmentStatusBannerData fulfilmentStatusBannerData = next != null ? ((OrderCardData) next).j : null;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListB, 10));
        Iterator it2 = arrayListB.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.f(next2, "null cannot be cast to non-null type au.com.woolworths.feature.shop.homepage.data.OrderCardData");
            OrderCardData orderCardData = (OrderCardData) next2;
            int i = orderCardData.j == null ? 4 : 8;
            ItemOrdersTileBindingModel_ itemOrdersTileBindingModel_ = new ItemOrdersTileBindingModel_();
            itemOrdersTileBindingModel_.r(Integer.valueOf(orderCardData.d));
            itemOrdersTileBindingModel_.t();
            itemOrdersTileBindingModel_.n = orderCardData;
            HomePageViewModel homePageViewModel = this.viewModel;
            itemOrdersTileBindingModel_.t();
            itemOrdersTileBindingModel_.o = homePageViewModel;
            itemOrdersTileBindingModel_.t();
            itemOrdersTileBindingModel_.p = fulfilmentStatusBannerData;
            Integer numValueOf = Integer.valueOf(i);
            itemOrdersTileBindingModel_.t();
            itemOrdersTileBindingModel_.q = numValueOf;
            arrayList.add(itemOrdersTileBindingModel_);
        }
        addInternal(new HorizontalModelGroup(data, this.viewModel, arrayList, Integer.valueOf(index), null, 112));
    }

    private final void buildPriorityMessageBanner(InsetBannerApiData data, int index) {
        ItemPriorityMessageTileBindingModel_ itemPriorityMessageTileBindingModel_ = new ItemPriorityMessageTileBindingModel_();
        itemPriorityMessageTileBindingModel_.M("homepage_priority_message_" + index);
        InsetBannerData uiModel = InsetBannerApiDataExtKt.toUiModel(data);
        itemPriorityMessageTileBindingModel_.t();
        itemPriorityMessageTileBindingModel_.n = uiModel;
        add(itemPriorityMessageTileBindingModel_);
    }

    private final void buildProductCardTile(HorizontalListData data, int index) {
        List<Object> d = data.getH();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (obj instanceof ProductCard) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            List list = null;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            ProductCard productCard = (ProductCard) next;
            ItemProductCardTileBindingModel_ itemProductCardTileBindingModel_ = new ItemProductCardTileBindingModel_();
            itemProductCardTileBindingModel_.M(ProductCardExtKt.b(productCard, i, this.featureToggleManager));
            String title = data.getD();
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.o = title;
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.q = productCard;
            HomePageViewModel homePageViewModel = this.viewModel;
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.p = homePageViewModel;
            Boolean boolValueOf = Boolean.valueOf(this.viewModel.u.c(HomeFeature.i) && ProductCardExtKt.a(productCard));
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.s = boolValueOf;
            HomePageContract.ViewState viewState = (HomePageContract.ViewState) this.viewModel.I.getValue();
            if (viewState != null) {
                list = viewState.h;
            }
            Boolean boolValueOf2 = Boolean.valueOf(ProductCardExtKt.t(productCard, list));
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.t = boolValueOf2;
            Boolean boolValueOf3 = Boolean.valueOf(shouldShowAddToListButton(productCard));
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.r = boolValueOf3;
            boolean zC = this.featureToggleManager.c(BaseShopAppFeature.w);
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.u = zC;
            au.com.woolworths.feature.shop.delivery.address.a aVar = new au.com.woolworths.feature.shop.delivery.address.a(this, 1);
            itemProductCardTileBindingModel_.t();
            itemProductCardTileBindingModel_.n = aVar;
            arrayList2.add(itemProductCardTileBindingModel_);
            i = i2;
        }
        addInternal(new HorizontalModelGroup(data, this.viewModel, arrayList2, Integer.valueOf(index), getHorizontalListActionState(data), 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildProductCardTile$lambda$13$lambda$12(HomeController homeController, ItemProductCardTileBindingModel_ itemProductCardTileBindingModel_, DataBindingEpoxyModel.DataBindingHolder dataBindingHolder, int i) {
        ViewDataBinding viewDataBinding = dataBindingHolder.f13309a;
        Intrinsics.f(viewDataBinding, "null cannot be cast to non-null type au.com.woolworths.product.databinding.EpoxyItemProductCardTileBinding");
        TextView textView = ((EpoxyItemProductCardTileBinding) viewDataBinding).O;
        Region regionB = homeController.viewModel.x.b();
        Region region = Region.j;
        textView.setMaxLines(regionB == region ? 2 : 1);
        textView.setSingleLine((homeController.viewModel.x.b() != region ? (char) 1 : (char) 2) == 1);
    }

    private final void buildProductCarousel(HorizontalListData data, int index) {
        HomePageViewModel homePageViewModel = this.viewModel;
        HorizontalListActionState horizontalListActionState = getHorizontalListActionState(data);
        ProductCarouselViewModel_ productCarouselViewModel_ = new ProductCarouselViewModel_();
        productCarouselViewModel_.n = null;
        productCarouselViewModel_.o = null;
        productCarouselViewModel_.p = null;
        productCarouselViewModel_.q = null;
        productCarouselViewModel_.r = null;
        productCarouselViewModel_.s = null;
        productCarouselViewModel_.D("product_carousel_" + index);
        productCarouselViewModel_.t();
        productCarouselViewModel_.p = horizontalListActionState;
        productCarouselViewModel_.t();
        productCarouselViewModel_.n = data;
        ProductCardConfig productCardConfigCreateProductCardConfig = createProductCardConfig();
        productCarouselViewModel_.t();
        productCarouselViewModel_.o = productCardConfigCreateProductCardConfig;
        productCarouselViewModel_.t();
        productCarouselViewModel_.r = homePageViewModel;
        productCarouselViewModel_.t();
        productCarouselViewModel_.s = homePageViewModel;
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) homePageViewModel.I.getValue();
        List list = viewState != null ? viewState.h : null;
        productCarouselViewModel_.t();
        productCarouselViewModel_.q = list;
        addInternal(productCarouselViewModel_);
        productCarouselViewModel_.d(this);
    }

    private final void buildQuickLinkHorizontalList(final QuickLinkHorizontalListData data, int index) {
        ComposeInteropKt.a(this, YU.a.d(index, "homepage_horizontal_quick_links_"), new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildQuickLinkHorizontalList.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final QuickLinkHorizontalListData quickLinkHorizontalListData = data;
                    final HomeController homeController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(-1168100719, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildQuickLinkHorizontalList.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                HomeController homeController2 = homeController;
                                HomePageViewModel homePageViewModel = homeController2.viewModel;
                                composer2.o(5004770);
                                boolean zI = composer2.I(homePageViewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    HomeController$buildQuickLinkHorizontalList$1$1$1$1 homeController$buildQuickLinkHorizontalList$1$1$1$1 = new HomeController$buildQuickLinkHorizontalList$1$1$1$1(1, homePageViewModel, HomePageViewModel.class, "onQuickLinkClicked", "onQuickLinkClicked(Lau/com/woolworths/shop/aem/components/model/QuickLinkCard;)V", 0);
                                    composer2.A(homeController$buildQuickLinkHorizontalList$1$1$1$1);
                                    objG = homeController$buildQuickLinkHorizontalList$1$1$1$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG);
                                HomePageViewModel homePageViewModel2 = homeController2.viewModel;
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(homePageViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    HomeController$buildQuickLinkHorizontalList$1$1$2$1 homeController$buildQuickLinkHorizontalList$1$1$2$1 = new HomeController$buildQuickLinkHorizontalList$1$1$2$1(1, homePageViewModel2, HomePageViewModel.class, "onDeepLinkResolved", "onDeepLinkResolved$homepage_release(Ljava/lang/String;)V", 0);
                                    composer2.A(homeController$buildQuickLinkHorizontalList$1$1$2$1);
                                    objG2 = homeController$buildQuickLinkHorizontalList$1$1$2$1;
                                }
                                composer2.l();
                                HorizontalQuickLinkListKt.b(quickLinkHorizontalListData, function1, (Function1) ((KFunction) objG2), PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 0, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), composer2, 3072, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1350018999));
    }

    private final void buildRecipesTile(final HorizontalListDataInterface data, int index) {
        ComposeInteropKt.a(this, "recipe_card_carousel_" + data.getG() + "_" + index, new Object[0], new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildRecipesTile.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    composer.o(1849434622);
                    Object objG = composer.G();
                    if (objG == Composer.Companion.f1624a) {
                        objG = new SharedIntrinsicHeightState();
                        composer.A(objG);
                    }
                    final SharedIntrinsicHeightState sharedIntrinsicHeightState = (SharedIntrinsicHeightState) objG;
                    composer.l();
                    final HorizontalListDataInterface horizontalListDataInterface = data;
                    final HomeController homeController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(31377941, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildRecipesTile.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final HorizontalListDataInterface horizontalListDataInterface2 = horizontalListDataInterface;
                                String title = horizontalListDataInterface2.getD();
                                String subtitle = horizontalListDataInterface2.getE();
                                String actionTitle = horizontalListDataInterface2.getF();
                                composer2.o(-1633490746);
                                final HomeController homeController2 = homeController;
                                boolean zI = composer2.I(homeController2) | composer2.I(horizontalListDataInterface2);
                                Object objG2 = composer2.G();
                                if (zI || objG2 == Composer.Companion.f1624a) {
                                    objG2 = new b(homeController2, horizontalListDataInterface2, 0);
                                    composer2.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                composer2.l();
                                String deepLink = horizontalListDataInterface2.getG();
                                ScrollableListActionState scrollableListActionState = (deepLink == null || deepLink.length() == 0) ? ScrollableListActionState.f : ScrollableListActionState.d;
                                final SharedIntrinsicHeightState sharedIntrinsicHeightState2 = sharedIntrinsicHeightState;
                                ScrollableListUiKt.c(title, subtitle, actionTitle, function0, scrollableListActionState, null, false, ComposableLambdaKt.c(1174172808, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildRecipesTile.1.1.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            Modifier modifierJ = PaddingKt.j(SizeKt.e(Modifier.Companion.d, 1.0f), BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                                            float f = 12;
                                            PaddingValuesImpl paddingValuesImplB = PaddingKt.b(f, BitmapDescriptorFactory.HUE_RED, f, f, 2);
                                            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                                            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
                                            composer3.o(-1746271574);
                                            HorizontalListDataInterface horizontalListDataInterface3 = horizontalListDataInterface2;
                                            boolean zI2 = composer3.I(horizontalListDataInterface3);
                                            HomeController homeController3 = homeController2;
                                            boolean zI3 = zI2 | composer3.I(homeController3);
                                            Object objG3 = composer3.G();
                                            if (zI3 || objG3 == Composer.Companion.f1624a) {
                                                objG3 = new c(0, horizontalListDataInterface3, homeController3, sharedIntrinsicHeightState2);
                                                composer3.A(objG3);
                                            }
                                            composer3.l();
                                            LazyDslKt.d(modifierJ, null, paddingValuesImplB, false, spacedAlignedG, null, null, false, null, (Function1) objG3, composer3, 24966, 490);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 12582912, 96);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1401406413));
    }

    private final void buildRewardsBalanceCard(final RewardsBalanceCardData data, int index) {
        ComposeInteropKt.a(this, YU.a.d(index, "homepage_rewards_balance_card_"), new Object[]{data}, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildRewardsBalanceCard.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RewardsBalanceCardData rewardsBalanceCardData = data;
                    final HomeController homeController = this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(114575951, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomeController.buildRewardsBalanceCard.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierJ = PaddingKt.j(PaddingKt.h(Modifier.Companion.d, 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 2, BitmapDescriptorFactory.HUE_RED, 24, 5);
                                composer2.o(5004770);
                                final HomeController homeController2 = homeController;
                                boolean zI = composer2.I(homeController2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    final int i = 0;
                                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.homepage.presentation.e
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i) {
                                                case 0:
                                                    HomePageViewModel homePageViewModel = homeController2.viewModel;
                                                    homePageViewModel.f.c(HomePageActions.ShowBarcodeClick.e);
                                                    homePageViewModel.w6(HomePageContract.Actions.LaunchDisplayBarcode.f7217a);
                                                    break;
                                                case 1:
                                                    homeController2.viewModel.f.c(HomePageActions.RewardsOffersBalanceErrorClick.e);
                                                    break;
                                                default:
                                                    homeController2.viewModel.f.c(HomePageActions.RewardsPointsBalanceErrorClick.e);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(-1633490746);
                                boolean zI2 = composer2.I(homeController2);
                                RewardsBalanceCardData rewardsBalanceCardData2 = rewardsBalanceCardData;
                                boolean zI3 = zI2 | composer2.I(rewardsBalanceCardData2);
                                Object objG2 = composer2.G();
                                if (zI3 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new n(5, homeController2, rewardsBalanceCardData2);
                                    composer2.A(objG2);
                                }
                                Function0 function02 = (Function0) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(homeController2);
                                Object objG3 = composer2.G();
                                if (zI4 || objG3 == composer$Companion$Empty$1) {
                                    final int i2 = 1;
                                    objG3 = new Function0() { // from class: au.com.woolworths.feature.shop.homepage.presentation.e
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i2) {
                                                case 0:
                                                    HomePageViewModel homePageViewModel = homeController2.viewModel;
                                                    homePageViewModel.f.c(HomePageActions.ShowBarcodeClick.e);
                                                    homePageViewModel.w6(HomePageContract.Actions.LaunchDisplayBarcode.f7217a);
                                                    break;
                                                case 1:
                                                    homeController2.viewModel.f.c(HomePageActions.RewardsOffersBalanceErrorClick.e);
                                                    break;
                                                default:
                                                    homeController2.viewModel.f.c(HomePageActions.RewardsPointsBalanceErrorClick.e);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG3);
                                }
                                Function0 function03 = (Function0) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(homeController2);
                                Object objG4 = composer2.G();
                                if (zI5 || objG4 == composer$Companion$Empty$1) {
                                    final int i3 = 2;
                                    objG4 = new Function0() { // from class: au.com.woolworths.feature.shop.homepage.presentation.e
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i3) {
                                                case 0:
                                                    HomePageViewModel homePageViewModel = homeController2.viewModel;
                                                    homePageViewModel.f.c(HomePageActions.ShowBarcodeClick.e);
                                                    homePageViewModel.w6(HomePageContract.Actions.LaunchDisplayBarcode.f7217a);
                                                    break;
                                                case 1:
                                                    homeController2.viewModel.f.c(HomePageActions.RewardsOffersBalanceErrorClick.e);
                                                    break;
                                                default:
                                                    homeController2.viewModel.f.c(HomePageActions.RewardsPointsBalanceErrorClick.e);
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                composer2.l();
                                RewardsBalanceCardUiKt.c(rewardsBalanceCardData, function0, function02, function03, (Function0) objG4, modifierJ, composer2, 0, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1843022329));
    }

    private final void buildSpacer(SpacerApiData data, int index) {
        ItemSpacerEpoxyModel itemSpacerEpoxyModel = new ItemSpacerEpoxyModel(R.layout.item_spacer);
        buildSpacer$lambda$15(index, data, itemSpacerEpoxyModel);
        add(itemSpacerEpoxyModel);
    }

    private static final Unit buildSpacer$lambda$15(int i, SpacerApiData spacerApiData, ItemSpacerEpoxyModel itemSpacer) {
        Intrinsics.h(itemSpacer, "$this$itemSpacer");
        itemSpacer.p("homepage_spacer-" + i);
        itemSpacer.D(SpacerApiDataKt.a(spacerApiData));
        return Unit.f24250a;
    }

    private final ProductCardConfig createProductCardConfig() {
        return new ProductCardConfig(this.collectionModeInteractor.b(), true, false, this.viewModel.u.c(HomeFeature.i), false, false, null, 116, null);
    }

    private final HorizontalListActionState getHorizontalListActionState(HorizontalListDataInterface data) {
        HorizontalListActionState horizontalListActionState;
        if (data instanceof BoosterHorizontalListData) {
            HomePageContract.ViewState viewState = (HomePageContract.ViewState) this.viewModel.I.getValue();
            return (viewState == null || (horizontalListActionState = viewState.e) == null) ? HorizontalListActionState.d : horizontalListActionState;
        }
        String deepLink = data.getG();
        return (deepLink == null || deepLink.length() == 0) ? HorizontalListActionState.f : HorizontalListActionState.d;
    }

    private final boolean shouldEnableComposeHorizontalProductLists() {
        return this.featureToggleManager.c(HomeFeature.f);
    }

    private final boolean shouldShowAddToListButton(ProductCard product) {
        return product.getTagLabel() == null;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@Nullable HomeListData homeListData) {
        if (homeListData != null) {
            int i = 0;
            for (Object obj : homeListData.c) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                if (obj instanceof RegistrationTileData) {
                    ItemRegistrationTileBindingModel_ itemRegistrationTileBindingModel_ = new ItemRegistrationTileBindingModel_();
                    itemRegistrationTileBindingModel_.M();
                    HomePageViewModel homePageViewModel = this.viewModel;
                    itemRegistrationTileBindingModel_.t();
                    itemRegistrationTileBindingModel_.n = homePageViewModel;
                    add(itemRegistrationTileBindingModel_);
                } else if (obj instanceof AddRewardsTileData) {
                    ItemAddRewardsTileBindingModel_ itemAddRewardsTileBindingModel_ = new ItemAddRewardsTileBindingModel_();
                    itemAddRewardsTileBindingModel_.M();
                    HomePageViewModel homePageViewModel2 = this.viewModel;
                    itemAddRewardsTileBindingModel_.t();
                    itemAddRewardsTileBindingModel_.o = homePageViewModel2;
                    itemAddRewardsTileBindingModel_.t();
                    itemAddRewardsTileBindingModel_.n = (AddRewardsTileData) obj;
                    add(itemAddRewardsTileBindingModel_);
                } else if (obj instanceof Divider) {
                    HomepageDividerBindingModel_ homepageDividerBindingModel_ = new HomepageDividerBindingModel_();
                    homepageDividerBindingModel_.M("divider_" + i);
                    add(homepageDividerBindingModel_);
                } else if (obj instanceof HorizontalListData) {
                    buildHorizontalList((HorizontalListData) obj, i);
                } else if (obj instanceof BoosterHorizontalListData) {
                    buildBoosterHorizontalList((BoosterHorizontalListData) obj, i);
                } else if (obj instanceof InsetBannerApiData) {
                    buildPriorityMessageBanner((InsetBannerApiData) obj, i);
                } else if (obj instanceof CatalogueCard) {
                    ItemCatalogueTileBindingModel_ itemCatalogueTileBindingModel_ = new ItemCatalogueTileBindingModel_();
                    itemCatalogueTileBindingModel_.M();
                    itemCatalogueTileBindingModel_.t();
                    itemCatalogueTileBindingModel_.n = (CatalogueCard) obj;
                    HomePageViewModel homePageViewModel3 = this.viewModel;
                    itemCatalogueTileBindingModel_.t();
                    itemCatalogueTileBindingModel_.o = homePageViewModel3;
                    add(itemCatalogueTileBindingModel_);
                } else if (obj instanceof MarketplaceCard) {
                    buildMarketplaceCard((MarketplaceCard) obj);
                } else if (obj instanceof ActionableCard) {
                    buildActionableCard((ActionableCard) obj, i);
                } else if (obj instanceof GoogleAdBannerCard) {
                    buildGoogleAdBannerCard((GoogleAdBannerCard) obj, i);
                } else if (obj instanceof SpacerApiData) {
                    buildSpacer((SpacerApiData) obj, i);
                } else if (obj instanceof MyShoppingListsData) {
                    buildMyLists((MyShoppingListsData) obj, i);
                } else if (obj instanceof BroadcastBannerData) {
                    buildBroadcastBanner((BroadcastBannerData) obj, i);
                } else if (obj instanceof QuickLinkHorizontalListData) {
                    buildQuickLinkHorizontalList((QuickLinkHorizontalListData) obj, i);
                } else if (obj instanceof RewardsBalanceCardData) {
                    buildRewardsBalanceCard((RewardsBalanceCardData) obj, i);
                } else if (obj instanceof Carousel) {
                    buildHeroBannerList(((Carousel) obj).f10161a, i);
                }
                i = i2;
            }
        }
    }
}
