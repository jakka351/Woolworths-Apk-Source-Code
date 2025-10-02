package au.com.woolworths.feature.shop.homepage.presentation;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.homepage.HomepageAnalytics;
import au.com.woolworths.analytics.supers.local.HomepageAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.authentication.Member;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardData;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsCardTypeData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.AkamaiException;
import au.com.woolworths.android.onesite.network.AkamaiServerErrorType;
import au.com.woolworths.android.onesite.rxutils.Optional;
import au.com.woolworths.android.onesite.rxutils.OptionalKt;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.customviews.SimpleCoachMarkSettings;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.base.shopapp.events.LoginStatusEvent;
import au.com.woolworths.base.shopapp.events.LogoutStatusEvent;
import au.com.woolworths.feature.shop.banners.BannerClickListener;
import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.feature.shop.banners.broadcastbanner.analytics.AnalyticsExtensionsKt;
import au.com.woolworths.feature.shop.homepage.HomeFeature;
import au.com.woolworths.feature.shop.homepage.analytics.HomePageActions;
import au.com.woolworths.feature.shop.homepage.data.AddRewardsTileData;
import au.com.woolworths.feature.shop.homepage.data.BaseDeliveryNowBanner;
import au.com.woolworths.feature.shop.homepage.data.BoosterHorizontalListData;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNow;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBanner;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNowBottomBanner;
import au.com.woolworths.feature.shop.homepage.data.HomeListData;
import au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListItemData;
import au.com.woolworths.feature.shop.homepage.data.MyShoppingListsData;
import au.com.woolworths.feature.shop.homepage.data.OrderAnalytics;
import au.com.woolworths.feature.shop.homepage.data.OrderCardData;
import au.com.woolworths.feature.shop.homepage.data.OrderCardDataKt;
import au.com.woolworths.feature.shop.homepage.data.RewardsBalanceCardData;
import au.com.woolworths.feature.shop.homepage.domain.HomeInteractor;
import au.com.woolworths.feature.shop.homepage.domain.HomePageFeedTrolleyUpdater;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.rewards.RewardsBalanceCardClickListener;
import au.com.woolworths.feature.shop.storelocator.legacy.LegacyStoreLocatorInteractorImpl;
import au.com.woolworths.foundation.advertising.data.adobe.model.AdobeTargetAnalytics;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.editorder.EditOrderInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.instore.presence.domain.InstorePresenceInteractor;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler;
import au.com.woolworths.foundation.shop.storelocator.LegacyStoreLocatorInteractor;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.extensions.ProductTrolleyExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.auth.AccountRepository;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.buyagain.domain.BuyAgainEntryPointInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor;
import au.com.woolworths.shop.lists.data.ShoppingListInteractor$special$$inlined$map$1;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.skydoves.balloon.overlay.BalloonOverlayOval;
import com.skydoves.balloon.overlay.BalloonOverlayRoundRect;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Maybe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableFromArray;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.rx2.RxAwaitKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u0012:\u0001\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/homepage/presentation/CatalogueClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/RewardsClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/AddRewardsClickListener;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Lau/com/woolworths/base/shopapp/epoxy/HorizontalListActionClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/RegistrationClickListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/homepage/presentation/HomePageFullPageErrorActionInterface;", "Lau/com/woolworths/android/onesite/dynamicsizecard/listeners/DynamicSizeCardClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/OrdersClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/MarketplaceCardClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/QuickLinkClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/MyShoppingListClickListener;", "Lau/com/woolworths/feature/shop/banners/BannerClickListener;", "Lau/com/woolworths/feature/shop/homepage/presentation/rewards/RewardsBalanceCardClickListener;", "Lau/com/woolworths/foundation/shop/instore/presence/presentation/InstorePresencePromptClickHandler;", "Lau/com/woolworths/feature/shop/homepage/presentation/ChatEntryCardClickListener;", "Companion", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HomePageViewModel extends ViewModel implements CatalogueClickListener, RewardsClickListener, AddRewardsClickListener, ProductClickListener, HorizontalListActionClickListener, RegistrationClickListener, FullPageErrorStateClickHandler, HomePageFullPageErrorActionInterface, DynamicSizeCardClickListener, OrdersClickListener, MarketplaceCardClickListener, QuickLinkClickListener, MyShoppingListClickListener, BannerClickListener, RewardsBalanceCardClickListener, InstorePresencePromptClickHandler, ChatEntryCardClickListener {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final LinkedList E;
    public final HomePageFeedTrolleyUpdater F;
    public final CompositeDisposable G;
    public final MutableStateFlow H;
    public final StateFlow I;
    public final SharedFlowImpl J;
    public final SharedFlowImpl K;
    public final SharedFlowImpl L;
    public final SharedFlow M;
    public final ChannelLimitedFlowMerge N;
    public Optional O;
    public final HomeInteractor e;
    public final AnalyticsManager f;
    public final CollectionModeInteractor g;
    public final RewardsAccountInteractor h;
    public final SharedPreferences i;
    public final FirebasePerfMonitor j;
    public final GoogleAdManagerInteractor k;
    public final EditOrderInteractor l;
    public final ShoppingListInteractor m;
    public final ProductBoostInteractor n;
    public final BannerDismissInteractor o;
    public final BuyAgainEntryPointInteractor p;
    public final ShopAccountInteractor q;
    public final InstorePresenceInteractor r;
    public final LegacyStoreLocatorInteractorImpl s;
    public final LocationInteractor t;
    public final FeatureToggleManager u;
    public final InstoreNavigationInteractor v;
    public final WatchlistInteractor w;
    public final ShopAppRegionInteractor x;
    public final ShopAppFlavorInteractor y;
    public boolean z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3", f = "HomePageViewModel.kt", l = {292}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ TrolleyInteractor q;
        public final /* synthetic */ HomePageViewModel r;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", lqlqqlq.m006Dm006Dm006Dm, "Lau/com/woolworths/android/onesite/rxutils/Result;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$2", f = "HomePageViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<Result<? extends TrolleyResult>, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ HomePageViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomePageViewModel homePageViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = homePageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
                anonymousClass2.p = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Result) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass2.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                HomePageContract.ViewState viewState;
                HomeListData homeListData;
                TrolleyResult trolleyResult;
                Object objA;
                TrolleyResult.TrolleyItem trolleyItem;
                TrolleyResult trolleyResult2;
                Object next;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                TrolleyResult trolleyResult3 = (TrolleyResult) ((Result) this.p).f4591a;
                HomePageViewModel homePageViewModel = this.q;
                MutableStateFlow mutableStateFlow = homePageViewModel.H;
                if (trolleyResult3 != null && (viewState = (HomePageContract.ViewState) mutableStateFlow.getValue()) != null && (homeListData = viewState.b) != null) {
                    List list = homeListData.c;
                    int i = 10;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                    for (Object obj2 : list) {
                        if (HomePageViewModel.C6(obj2) && (obj2 instanceof HorizontalListDataInterface)) {
                            HorizontalListDataInterface horizontalListDataInterface = (HorizontalListDataInterface) obj2;
                            List listProducts = horizontalListDataInterface.getH();
                            homePageViewModel.F.getClass();
                            Intrinsics.h(listProducts, "listProducts");
                            ArrayList arrayListB = CollectionsKt.B(listProducts);
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayListB, i));
                            Iterator it = arrayListB.iterator();
                            while (it.hasNext()) {
                                Object next2 = it.next();
                                Intrinsics.f(next2, "null cannot be cast to non-null type au.com.woolworths.product.models.ProductCard");
                                ProductCard productCardCopy = (ProductCard) next2;
                                String string = Integer.toString(Integer.parseInt(productCardCopy.getProductId()));
                                Intrinsics.g(string, "trimPaddedZeroes(...)");
                                List<TrolleyResult.TrolleyItem> trolleyItems = trolleyResult3.getTrolleyItems();
                                if (trolleyItems != null) {
                                    Iterator<T> it2 = trolleyItems.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                        if (string.equals(((TrolleyResult.TrolleyItem) next).getArticle())) {
                                            break;
                                        }
                                    }
                                    trolleyItem = (TrolleyResult.TrolleyItem) next;
                                } else {
                                    trolleyItem = null;
                                }
                                float itemQuantityInTrolley = trolleyItem != null ? trolleyItem.getItemQuantityInTrolley() : 0.0f;
                                ProductTrolleyData trolley = productCardCopy.getTrolley();
                                if (trolley == null) {
                                    trolleyResult2 = trolleyResult3;
                                } else {
                                    Pair pair = !productCardCopy.isAvailable() ? new Pair(ProductTileButtonType.DISABLED, trolley.getButtonLabel()) : itemQuantityInTrolley == BitmapDescriptorFactory.HUE_RED ? new Pair(ProductTileButtonType.ADD, "Add") : new Pair(ProductTileButtonType.UPDATE, "Update");
                                    trolleyResult2 = trolleyResult3;
                                    productCardCopy = productCardCopy.copy(((-33554433) & 1) != 0 ? productCardCopy.productId : null, ((-33554433) & 2) != 0 ? productCardCopy.name : null, ((-33554433) & 4) != 0 ? productCardCopy.productImage : null, ((-33554433) & 8) != 0 ? productCardCopy.badgeImage : null, ((-33554433) & 16) != 0 ? productCardCopy.price : null, ((-33554433) & 32) != 0 ? productCardCopy.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCardCopy.promotionValue : null, ((-33554433) & 128) != 0 ? productCardCopy.promotionType : null, ((-33554433) & 256) != 0 ? productCardCopy.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCardCopy.isAvailable : false, ((-33554433) & 1024) != 0 ? productCardCopy.isNew : false, ((-33554433) & 2048) != 0 ? productCardCopy.wasPrice : null, ((-33554433) & 4096) != 0 ? productCardCopy.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCardCopy.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCardCopy.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCardCopy.trolley : trolley.copy((895 & 1) != 0 ? trolley.minimum : 0.0d, (895 & 2) != 0 ? trolley.maximum : 0.0d, (895 & 4) != 0 ? trolley.increment : 0.0d, (895 & 8) != 0 ? trolley.defaultValue : 0.0d, (895 & 16) != 0 ? trolley.inTrolley : Double.valueOf(itemQuantityInTrolley), (895 & 32) != 0 ? trolley.unitLabel : null, (895 & 64) != 0 ? trolley.buttonState : (ProductTileButtonType) pair.d, (895 & 128) != 0 ? trolley.buttonLabel : (String) pair.e, (895 & 256) != 0 ? trolley.buttonQuantity : ProductTrolleyExtKt.a(trolley, itemQuantityInTrolley), (895 & 512) != 0 ? trolley.title : null), ((-33554433) & 65536) != 0 ? productCardCopy.trolleys : null, ((-33554433) & 131072) != 0 ? productCardCopy.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCardCopy.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCardCopy.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCardCopy.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCardCopy.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCardCopy.adId : null, ((-33554433) & 8388608) != 0 ? productCardCopy.source : null, ((-33554433) & 16777216) != 0 ? productCardCopy.marketplace : null, ((-33554433) & 33554432) != 0 ? productCardCopy.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCardCopy.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCardCopy.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCardCopy.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCardCopy.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCardCopy.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCardCopy.isTobacco : false, (255 & 1) != 0 ? productCardCopy.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCardCopy.memberPriceInfo : null, (255 & 4) != 0 ? productCardCopy.cartProductInfo : null, (255 & 8) != 0 ? productCardCopy.inStoreLocation : null, (255 & 16) != 0 ? productCardCopy.productCardAnalytics : null, (255 & 32) != 0 ? productCardCopy.impressionAnalyticsData : null, (255 & 64) != 0 ? productCardCopy.productCardAction : null, (255 & 128) != 0 ? productCardCopy.pricingFootnoteMd : null);
                                }
                                arrayList2.add(productCardCopy);
                                trolleyResult3 = trolleyResult2;
                            }
                            trolleyResult = trolleyResult3;
                            if (horizontalListDataInterface instanceof HorizontalListData) {
                                objA = HorizontalListData.copy$default((HorizontalListData) obj2, null, null, null, null, null, arrayList2, null, null, null, null, 991, null);
                            } else if (horizontalListDataInterface instanceof BoosterHorizontalListData) {
                                objA = BoosterHorizontalListData.a((BoosterHorizontalListData) obj2, arrayList2);
                            } else {
                                obj2 = horizontalListDataInterface;
                            }
                            obj2 = objA;
                        } else {
                            trolleyResult = trolleyResult3;
                        }
                        arrayList.add(obj2);
                        trolleyResult3 = trolleyResult;
                        i = 10;
                    }
                    mutableStateFlow.setValue(HomePageViewModel.z6(homePageViewModel, HomeListData.a(homeListData, arrayList), null, null, 29));
                }
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TrolleyInteractor trolleyInteractor, HomePageViewModel homePageViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = trolleyInteractor;
            this.r = homePageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final StateFlow p = this.q.getP();
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(this.r, null), new Flow<Result<? extends TrolleyResult>>() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "HomePageViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.d = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L46
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.android.onesite.rxutils.Result r6 = (au.com.woolworths.android.onesite.rxutils.Result) r6
                                boolean r6 = r6.b()
                                if (r6 == 0) goto L46
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L46
                                return r1
                            L46:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$3$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = p.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                });
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$5", f = "HomePageViewModel.kt", l = {304}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePageViewModel.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final HomePageViewModel homePageViewModel = HomePageViewModel.this;
                ShoppingListInteractor$special$$inlined$map$1 shoppingListInteractor$special$$inlined$map$1 = homePageViewModel.m.c;
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel.5.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        HomePageViewModel.t6(homePageViewModel, (List) obj2);
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (shoppingListInteractor$special$$inlined$map$1.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$6", f = "HomePageViewModel.kt", l = {310}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePageViewModel.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Maybe maybeB = HomePageViewModel.this.t.b();
                this.p = 1;
                if (RxAwaitKt.g(maybeB, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$7", f = "HomePageViewModel.kt", l = {317}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$7, reason: invalid class name */
    final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "updateOfferInfoList", "", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$7$1", f = "HomePageViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$7$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends BasicRewardsOfferStatusData>, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ HomePageViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomePageViewModel homePageViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = homePageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ?? arrayList;
                HomeListData homeListData;
                HomeListData homeListData2;
                Object next;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                List list = (List) this.p;
                HomePageViewModel homePageViewModel = this.q;
                MutableStateFlow mutableStateFlow = homePageViewModel.H;
                HomePageContract.ViewState viewState = (HomePageContract.ViewState) mutableStateFlow.getValue();
                if (viewState == null || (homeListData2 = viewState.b) == null) {
                    arrayList = EmptyList.d;
                } else {
                    List list2 = homeListData2.c;
                    arrayList = new ArrayList(CollectionsKt.s(list2, 10));
                    for (Object objA : list2) {
                        if (objA instanceof BoosterHorizontalListData) {
                            BoosterHorizontalListData boosterHorizontalListData = (BoosterHorizontalListData) objA;
                            List list3 = boosterHorizontalListData.h;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list3, 10));
                            for (Object obj2 : list3) {
                                ProductCard productCard = obj2 instanceof ProductCard ? (ProductCard) obj2 : null;
                                if (productCard != null) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                        String d = ((BasicRewardsOfferStatusData) next).getD();
                                        RewardsOfferInfo rewardsOfferInfo = productCard.getRewardsOfferInfo();
                                        if (Intrinsics.c(d, rewardsOfferInfo != null ? rewardsOfferInfo.getD() : null)) {
                                            break;
                                        }
                                    }
                                    BasicRewardsOfferStatusData basicRewardsOfferStatusData = (BasicRewardsOfferStatusData) next;
                                    ProductCard productCardJ = basicRewardsOfferStatusData != null ? ProductAnalyticsExtKt.j(productCard, basicRewardsOfferStatusData) : null;
                                    if (productCardJ != null) {
                                        obj2 = productCardJ;
                                    }
                                }
                                arrayList2.add(obj2);
                            }
                            objA = BoosterHorizontalListData.a(boosterHorizontalListData, arrayList2);
                        }
                        arrayList.add(objA);
                    }
                }
                HomePageContract.ViewState viewState2 = (HomePageContract.ViewState) mutableStateFlow.getValue();
                HomeListData homeListDataA = (viewState2 == null || (homeListData = viewState2.b) == null) ? null : HomeListData.a(homeListData, arrayList);
                HomePageViewModel.K6(homePageViewModel, mutableStateFlow, homeListDataA, HomePageViewModel.x6(homeListDataA), null, null, null, 499);
                return Unit.f24250a;
            }
        }

        public AnonymousClass7(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePageViewModel.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                HomePageViewModel homePageViewModel = HomePageViewModel.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(homePageViewModel, null), homePageViewModel.n.c);
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lau/com/woolworths/product/models/ProductId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$8", f = "HomePageViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$8, reason: invalid class name */
    final class AnonymousClass8 extends SuspendLambda implements Function2<List<? extends ProductId>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass8(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass8 anonymousClass8 = HomePageViewModel.this.new AnonymousClass8(continuation);
            anonymousClass8.p = obj;
            return anonymousClass8;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass8 anonymousClass8 = (AnonymousClass8) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass8.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            HomePageViewModel homePageViewModel = HomePageViewModel.this;
            HomePageViewModel.K6(homePageViewModel, homePageViewModel.H, null, null, null, list, null, 447);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$9", f = "HomePageViewModel.kt", l = {328}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$9, reason: invalid class name */
    final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass9(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomePageViewModel.this.new AnonymousClass9(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass9) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                this.p = 1;
                if (HomePageViewModel.p6(HomePageViewModel.this, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/presentation/HomePageViewModel$Companion;", "", "", "EVENT_FIRE_DELAY_MS", "J", "", "SEARCH_BAR", "Ljava/lang/String;", "", "MAX_MY_LISTS_ITEMS", "I", "BUY_AGAIN_LIST_EVENT_DESCRIPTION", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7241a;

        static {
            int[] iArr = new int[HomePageContract.ScreenLoadedStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HomePageContract.ScreenLoadedStatus screenLoadedStatus = HomePageContract.ScreenLoadedStatus.e;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ActionType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ActionType actionType = ActionType.d;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f7241a = iArr2;
        }
    }

    public HomePageViewModel(Application application, HomeInteractor homeInteractor, AnalyticsManager analyticsManager, SchedulersProvider schedulersProvider, CollectionModeInteractor collectionModeInteractor, RewardsAccountInteractor rewardsAccountInteractor, TrolleyInteractor trolleyInteractor, SharedPreferences sharedPreferences, FirebasePerfMonitor firebasePerfMonitor, GoogleAdManagerInteractor googleAdManagerInteractor, EditOrderInteractor editOrderInteractor, ShoppingListInteractor shoppingListInteractor, ProductBoostInteractor productBoostInteractor, BannerDismissInteractor bannerDismissInteractor, BuyAgainEntryPointInteractor buyAgainEntryPointInteractor, ShopAccountInteractor accountInteractor, InstorePresenceInteractor instorePresenceInteractor, LegacyStoreLocatorInteractorImpl legacyStoreLocatorInteractorImpl, LocationInteractor locationInteractor, FeatureToggleManager featureToggleManager, InstoreNavigationInteractor instoreNavigationInteractor, WatchlistInteractor watchlistInteractor, ShopAppRegionInteractor shopAppRegionInteractor, ShopAppFlavorInteractor shopAppFlavorInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(schedulersProvider, "schedulersProvider");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(editOrderInteractor, "editOrderInteractor");
        Intrinsics.h(shoppingListInteractor, "shoppingListInteractor");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(instorePresenceInteractor, "instorePresenceInteractor");
        Intrinsics.h(locationInteractor, "locationInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(shopAppFlavorInteractor, "shopAppFlavorInteractor");
        this.e = homeInteractor;
        this.f = analyticsManager;
        this.g = collectionModeInteractor;
        this.h = rewardsAccountInteractor;
        this.i = sharedPreferences;
        this.j = firebasePerfMonitor;
        this.k = googleAdManagerInteractor;
        this.l = editOrderInteractor;
        this.m = shoppingListInteractor;
        this.n = productBoostInteractor;
        this.o = bannerDismissInteractor;
        this.p = buyAgainEntryPointInteractor;
        this.q = accountInteractor;
        this.r = instorePresenceInteractor;
        this.s = legacyStoreLocatorInteractorImpl;
        this.t = locationInteractor;
        this.u = featureToggleManager;
        this.v = instoreNavigationInteractor;
        this.w = watchlistInteractor;
        this.x = shopAppRegionInteractor;
        this.y = shopAppFlavorInteractor;
        this.E = new LinkedList();
        this.F = new HomePageFeedTrolleyUpdater();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.G = compositeDisposable;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(HomePageContract.ViewState.n);
        this.H = mutableStateFlowA;
        this.I = mutableStateFlowA;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.J = sharedFlowImplB;
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.K = sharedFlowImplB2;
        SharedFlowImpl sharedFlowImplB3 = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.L = sharedFlowImplB3;
        this.M = FlowKt.a(sharedFlowImplB3);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        JobImpl jobImplA = JobKt.a();
        jobImplA.Z(Unit.f24250a);
        objectRef.d = jobImplA;
        this.N = FlowKt.G(sharedFlowImplB, FlowKt.B(new FlowExtKt$throttleFirst$2$1(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(sharedFlowImplB2, new FlowExtKt$throttleFirst$1(objectRef, null)), objectRef, null)));
        this.O = Optional.None.f4589a;
        ObservableObserveOn observableObserveOnF = collectionModeInteractor.k().f(schedulersProvider.b());
        au.com.woolworths.feature.shop.delivery.address.a aVar = new au.com.woolworths.feature.shop.delivery.address.a(new j(this, 0), 2);
        Consumer consumer = Functions.e;
        LambdaObserver lambdaObserver = new LambdaObserver(aVar, consumer);
        observableObserveOnF.a(lambdaObserver);
        compositeDisposable.d(lambdaObserver);
        ObservableObserveOn observableObserveOnF2 = rewardsAccountInteractor.getRewardCardSourceObservable().f(schedulersProvider.b());
        LambdaObserver lambdaObserver2 = new LambdaObserver(new au.com.woolworths.feature.shop.delivery.address.a(new j(this, 1), 3), consumer);
        observableObserveOnF2.a(lambdaObserver2);
        compositeDisposable.d(lambdaObserver2);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(trolleyInteractor, this, null), 3);
        ObservableObserveOn observableObserveOnF3 = new ObservableFromArray(new ObservableSource[]{RxBus.a().c(LoginStatusEvent.class), RxBus.a().c(LogoutStatusEvent.class), RxBus.a().c(ForcedLogoutEvent.class)}).c(Functions.f24224a, 3).f(schedulersProvider.b());
        LambdaObserver lambdaObserver3 = new LambdaObserver(new au.com.woolworths.feature.shop.delivery.address.a(this, 4), consumer);
        observableObserveOnF3.a(lambdaObserver3);
        compositeDisposable.d(lambdaObserver3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass5(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass6(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass7(null), 3);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass8(null), watchlistInteractor.e), ViewModelKt.a(this));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass9(null), 3);
    }

    public static String A6(String label) {
        Intrinsics.h(label, "label");
        return "Carousel - ".concat(label);
    }

    public static HomePageContract.DeliveryNowViewState B6(HomeListData homeListData) {
        List list = homeListData.d;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof HomeModeSelectorContainerData) {
                    arrayList.add(obj);
                }
            }
            HomeModeSelectorContainerData homeModeSelectorContainerData = (HomeModeSelectorContainerData) CollectionsKt.F(arrayList);
            if (homeModeSelectorContainerData != null) {
                BaseDeliveryNowBanner baseDeliveryNowBanner = homeModeSelectorContainerData.c;
                return baseDeliveryNowBanner instanceof DeliveryNowBottomBanner ? HomePageContract.DeliveryNowViewState.f : baseDeliveryNowBanner instanceof DeliveryNowBanner ? HomePageContract.DeliveryNowViewState.e : HomePageContract.DeliveryNowViewState.d;
            }
        }
        return HomePageContract.DeliveryNowViewState.d;
    }

    public static boolean C6(Object obj) {
        return (obj instanceof HorizontalListDataInterface) && (CollectionsKt.F(((HorizontalListDataInterface) obj).getH()) instanceof ProductCard);
    }

    public static void K6(HomePageViewModel homePageViewModel, MutableStateFlow mutableStateFlow, HomeListData homeListData, HorizontalListActionState horizontalListActionState, HomePageContract.DeliveryNowData deliveryNowData, List list, HomePageContract.Snackbar snackbar, int i) {
        Object value;
        boolean z = (i & 1) != 0 ? ((HomePageContract.ViewState) homePageViewModel.I.getValue()).f7239a : false;
        HomePageErrorState homePageErrorState = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).c;
        if ((i & 4) != 0) {
            homeListData = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).b;
        }
        HomeListData homeListData2 = homeListData;
        HorizontalListActionState horizontalListActionState2 = (i & 8) != 0 ? ((HomePageContract.ViewState) homePageViewModel.I.getValue()).e : horizontalListActionState;
        HomePageRefreshErrorState homePageRefreshErrorState = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).d;
        HomePageContract.DeliveryNowData deliveryNowData2 = (i & 32) != 0 ? ((HomePageContract.ViewState) homePageViewModel.I.getValue()).f : deliveryNowData;
        List list2 = (i & 64) != 0 ? ((HomePageContract.ViewState) homePageViewModel.I.getValue()).h : list;
        HomePageContract.Snackbar snackbar2 = (i & 128) != 0 ? ((HomePageContract.ViewState) homePageViewModel.I.getValue()).i : snackbar;
        boolean z2 = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).g;
        homePageViewModel.getClass();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, new HomePageContract.ViewState(z, homeListData2, homePageErrorState, homePageRefreshErrorState, horizontalListActionState2, deliveryNowData2, z2, list2, snackbar2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p6(au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$initInstoreNavigation$1
            if (r0 == 0) goto L13
            r0 = r7
            au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$initInstoreNavigation$1 r0 = (au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$initInstoreNavigation$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$initInstoreNavigation$1 r0 = new au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel$initInstoreNavigation$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L75
        L28:
            r6 = move-exception
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.b(r7)
            au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager r7 = r6.u
            au.com.woolworths.base.shopapp.BaseShopAppFeature r2 = au.com.woolworths.base.shopapp.BaseShopAppFeature.u
            boolean r7 = r7.c(r2)
            if (r7 == 0) goto L75
            au.com.woolworths.foundation.shop.app.region.data.ShopAppFlavorInteractor r7 = r6.y
            au.com.woolworths.android.onesite.modules.common.Region r2 = au.com.woolworths.android.onesite.modules.common.Region.i
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L75
            timber.log.Timber$Forest r7 = timber.log.Timber.f27013a
            java.lang.String r2 = "early oriient initInstoreNavigation"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r7.h(r2, r5)
            au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor r6 = r6.v     // Catch: java.lang.Throwable -> L28
            r0.r = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.g(r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L75
            return r1
        L5d:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L6b
            timber.log.Timber$Forest r7 = timber.log.Timber.f27013a
            java.lang.String r0 = "oriient instoreNavigationInteractor init failed()"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r7.n(r0, r6, r1)
            goto L75
        L6b:
            timber.log.Timber$Forest r7 = timber.log.Timber.f27013a
            java.lang.String r0 = "oriient instoreNavigationInteractor init cancelled"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r7.n(r0, r6, r1)
            throw r6
        L75:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel.p6(au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void q6(HomePageViewModel homePageViewModel) {
        HomePageContract.Actions.ShowCoachMarkContent showCoachMarkContent;
        LinkedList linkedList = homePageViewModel.E;
        homePageViewModel.D = true;
        EditOrderInteractor editOrderInteractor = homePageViewModel.l;
        if (editOrderInteractor.e() && !homePageViewModel.C && !editOrderInteractor.O()) {
            HomePageContract.Actions.ShowCoachMarkContent showCoachMarkContent2 = new HomePageContract.Actions.ShowCoachMarkContent(HomePageContract.CoachMarkAnchor.d, new SimpleCoachMarkSettings(new ResText(R.string.cmo_coachmark_cart_title), new ResText(R.string.cmo_coachmark_cart_body), new ResText(R.string.cmo_coachmark_next), null, BitmapDescriptorFactory.HUE_RED, BalloonOverlayOval.f19022a, 440));
            HomePageContract.CoachMarkAnchor coachMarkAnchor = HomePageContract.CoachMarkAnchor.e;
            ResText resText = new ResText(R.string.cmo_coachmark_cancel_title);
            ResText resText2 = new ResText(R.string.cmo_coachmark_cancel_body);
            ResText resText3 = new ResText(R.string.cmo_coachmark_got_it);
            Integer numValueOf = Integer.valueOf(R.dimen.cardview_default_radius);
            linkedList.addAll(CollectionsKt.R(showCoachMarkContent2, new HomePageContract.Actions.ShowCoachMarkContent(coachMarkAnchor, new SimpleCoachMarkSettings(resText, resText2, resText3, null, BitmapDescriptorFactory.HUE_RED, new BalloonOverlayRoundRect(null, new Pair(numValueOf, numValueOf), 1), 504))));
            homePageViewModel.C = true;
        }
        if (homePageViewModel.D && homePageViewModel.z && (showCoachMarkContent = (HomePageContract.Actions.ShowCoachMarkContent) linkedList.peek()) != null) {
            homePageViewModel.w6(showCoachMarkContent);
        }
    }

    public static final void r6(HomePageViewModel homePageViewModel, HomeListData homeListData) {
        boolean z;
        Unit unit;
        HomeListData homeListData2;
        AnalyticsManager analyticsManager = homePageViewModel.f;
        InstorePresenceInteractor instorePresenceInteractor = homePageViewModel.r;
        List list = homeListData.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof HorizontalListData) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (CollectionsKt.F(((HorizontalListData) it.next()).getH()) instanceof OrderCardData) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        instorePresenceInteractor.a(!z);
        HomePageContract.ScreenLoadedStatus screenLoadedStatus = HomePageContract.ScreenLoadedStatus.e;
        List list2 = homeListData.f7192a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof AdobeTargetAnalytics) {
                arrayList2.add(obj2);
            }
        }
        TrackableValue trackableValue = TrackableValue.f;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AdobeTargetAnalytics) it2.next()).getPe());
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, arrayList3);
        TrackableValue trackableValue2 = TrackableValue.g;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((AdobeTargetAnalytics) it3.next()).getTnta());
        }
        trackingMetadataA.b(trackableValue2, arrayList4);
        homePageViewModel.J6(screenLoadedStatus, trackingMetadataA);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 != null) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (next instanceof HorizontalListData) {
                arrayList6.add(next);
            }
        }
        if (!arrayList6.isEmpty()) {
            Iterator it5 = arrayList6.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (CollectionsKt.F(((HorizontalListData) it5.next()).getH()) instanceof OrderCardData) {
                        analyticsManager.c(HomePageActions.MyOrdersImpression.e);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof OrderCardData) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList(CollectionsKt.s(arrayList7, 10));
        Iterator it6 = arrayList7.iterator();
        while (true) {
            boolean zHasNext = it6.hasNext();
            unit = Unit.f24250a;
            if (!zHasNext) {
                break;
            }
            OrderCardData orderCardData = (OrderCardData) it6.next();
            if (orderCardData.j != null) {
                analyticsManager.j(HomePageActions.MyOrdersFulfilmentStatusBannerImpression.e, OrderCardDataKt.a(orderCardData));
            }
            arrayList8.add(unit);
        }
        DeliveryNow deliveryNow = homeListData.b;
        if (deliveryNow != null) {
            TrackingMetadata trackingMetadataA2 = TrackingMetadata.Companion.a(TrackableValue.o0, deliveryNow.f7185a);
            TrackableValue trackableValue3 = TrackableValue.r0;
            Integer num = deliveryNow.b;
            trackingMetadataA2.b(trackableValue3, Integer.valueOf(num != null ? num.intValue() : 0));
            analyticsManager.j(HomePageActions.DeliveryNowEligibility.e, trackingMetadataA2);
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof HorizontalListData) {
                arrayList9.add(obj5);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it7 = arrayList9.iterator();
        while (it7.hasNext()) {
            Object next2 = it7.next();
            if (C6((HorizontalListData) next2)) {
                arrayList10.add(next2);
            }
        }
        Iterator it8 = arrayList10.iterator();
        while (it8.hasNext()) {
            String d = ((HorizontalListData) it8.next()).getD();
            if (d == null) {
                d = "";
            }
            analyticsManager.c(new HomePageActions.ProductCarouselImpression(A6(d)));
        }
        ArrayList arrayList11 = new ArrayList();
        for (Object obj6 : list) {
            if (obj6 instanceof BoosterHorizontalListData) {
                arrayList11.add(obj6);
            }
        }
        ArrayList arrayList12 = new ArrayList();
        Iterator it9 = arrayList11.iterator();
        while (it9.hasNext()) {
            Object next3 = it9.next();
            if (C6((BoosterHorizontalListData) next3)) {
                arrayList12.add(next3);
            }
        }
        Iterator it10 = arrayList12.iterator();
        while (it10.hasNext()) {
            analyticsManager.c(new HomePageActions.ProductCarouselImpression(A6(((BoosterHorizontalListData) it10.next()).d)));
        }
        if (!homePageViewModel.u.c(HomeFeature.e)) {
            ArrayList arrayList13 = new ArrayList();
            for (Object obj7 : list) {
                if (obj7 instanceof BroadcastBannerData) {
                    arrayList13.add(obj7);
                }
            }
            ArrayList arrayList14 = new ArrayList(CollectionsKt.s(arrayList13, 10));
            Iterator it11 = arrayList13.iterator();
            while (it11.hasNext()) {
                analyticsManager.g(AnalyticsExtensionsKt.c((BroadcastBannerData) it11.next(), Screens.l));
                arrayList14.add(unit);
            }
        }
        homePageViewModel.H.setValue(z6(homePageViewModel, homeListData, null, null, 29));
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) homePageViewModel.I.getValue();
        if (viewState == null || (homeListData2 = viewState.b) == null) {
            return;
        }
        List list3 = homeListData2.c;
        ArrayList arrayList15 = new ArrayList();
        for (Object obj8 : list3) {
            if (obj8 instanceof GoogleAdBannerCard) {
                arrayList15.add(obj8);
            }
        }
        BuildersKt.c(ViewModelKt.a(homePageViewModel), null, null, new HomePageViewModel$processAnalyticResponse$1(homePageViewModel, arrayList15, null), 3);
        List list4 = homeListData2.f7192a;
        ArrayList arrayList16 = new ArrayList();
        for (Object obj9 : list4) {
            if (obj9 instanceof OrderAnalytics) {
                arrayList16.add(obj9);
            }
        }
        OrderAnalytics orderAnalytics = (OrderAnalytics) CollectionsKt.F(arrayList16);
        if (orderAnalytics != null) {
            ShopAccountInteractor shopAccountInteractor = homePageViewModel.q;
            int i = orderAnalytics.f7203a;
            int i2 = orderAnalytics.b;
            Member memberN = shopAccountInteractor.n();
            if (memberN != null) {
                memberN.setMarketOrderCount(i2);
                memberN.setOrderCount(i);
                String strJ = shopAccountInteractor.e.j(memberN);
                AccountRepository accountRepository = shopAccountInteractor.b;
                Intrinsics.e(strJ);
                accountRepository.a(strJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s6(au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel r3, au.com.woolworths.feature.shop.homepage.data.HomeListData r4) {
        /*
            java.util.List r4 = r4.d
            if (r4 == 0) goto L38
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData
            if (r2 == 0) goto Lf
            r0.add(r1)
            goto Lf
        L21:
            java.lang.Object r4 = kotlin.collections.CollectionsKt.F(r0)
            au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData r4 = (au.com.woolworths.feature.shop.homepage.data.HomeModeSelectorContainerData) r4
            if (r4 == 0) goto L38
            au.com.woolworths.feature.shop.homepage.data.InStoreDetailsCardData r4 = r4.d
            if (r4 == 0) goto L30
            java.lang.Boolean r4 = r4.c
            goto L31
        L30:
            r4 = 0
        L31:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r0)
            goto L39
        L38:
            r4 = 0
        L39:
            au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor r3 = r3.v
            r3.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel.s6(au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel, au.com.woolworths.feature.shop.homepage.data.HomeListData):void");
    }

    public static final void t6(HomePageViewModel homePageViewModel, List list) {
        HomeListData homeListData;
        ArrayList arrayList;
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) homePageViewModel.I.getValue();
        if (viewState == null || (homeListData = viewState.b) == null) {
            return;
        }
        List list2 = homeListData.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object myShoppingListsData : list2) {
            if (myShoppingListsData instanceof MyShoppingListsData) {
                boolean zD = homePageViewModel.p.f10252a.d();
                MyShoppingListsData myShoppingListsData2 = (MyShoppingListsData) myShoppingListsData;
                int iMax = zD ? Math.max(1, 0) : 2;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (!Intrinsics.c(((ShoppingListWithItems) obj).getShoppingList().isWatchlist(), Boolean.TRUE)) {
                            arrayList3.add(obj);
                        }
                    }
                    List<ShoppingListWithItems> listW0 = CollectionsKt.w0(arrayList3, iMax);
                    arrayList = new ArrayList(CollectionsKt.s(listW0, 10));
                    for (ShoppingListWithItems shoppingListWithItems : listW0) {
                        arrayList.add(new MyShoppingListItemData(shoppingListWithItems.getItemCount(), ColorKt.b(shoppingListWithItems.getShoppingList().getColor()), shoppingListWithItems.getShoppingList().getId(), shoppingListWithItems.getShoppingList().getTitle(), myShoppingListsData2.f7202a));
                    }
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = arrayList;
                String title = myShoppingListsData2.f7202a;
                String str = myShoppingListsData2.b;
                String str2 = myShoppingListsData2.c;
                String str3 = myShoppingListsData2.d;
                Intrinsics.h(title, "title");
                myShoppingListsData = new MyShoppingListsData(title, str, str2, str3, arrayList4, zD);
            }
            if (myShoppingListsData != null) {
                arrayList2.add(myShoppingListsData);
            }
        }
        K6(homePageViewModel, homePageViewModel.H, HomeListData.a(homeListData, arrayList2), null, null, null, null, 507);
    }

    public static final void u6(HomePageViewModel homePageViewModel, HomeListData homeListData) {
        Object obj;
        Object next;
        SharedPreferences sharedPreferences = homePageViewModel.i;
        RewardsAccountInteractor rewardsAccountInteractor = homePageViewModel.h;
        List list = homeListData.c;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next instanceof AddRewardsTileData) {
                    break;
                }
            }
        }
        if (next != null) {
            RewardsCardData cardData = rewardsAccountInteractor.getB();
            if ((cardData != null ? cardData.getNumber() : null) != null) {
                rewardsAccountInteractor.clearRewardsData();
                if (sharedPreferences.getInt("previously_removed_workaround_tw_1675", 0) != 0) {
                    Bark.Companion companion = Bark.f8483a;
                    Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.m), "Rewards card has been removed previously", null);
                    return;
                } else {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putInt("previously_removed_workaround_tw_1675", 1);
                    editorEdit.apply();
                    return;
                }
            }
            return;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof RewardsBalanceCardData) {
                obj = next2;
                break;
            }
        }
        if (obj != null) {
            RewardsBalanceCardData rewardsBalanceCardData = (RewardsBalanceCardData) obj;
            String str = rewardsBalanceCardData.f7205a;
            homePageViewModel.O = OptionalKt.b(str);
            rewardsAccountInteractor.setCardData(new RewardsCardData(str, str, "", RewardsCardTypeData.LOYALTY_CARD, null, null, null, 96, null));
            rewardsAccountInteractor.setRewardsState(rewardsBalanceCardData.k);
        }
    }

    public static HorizontalListActionState x6(HomeListData homeListData) {
        Object next;
        if (homeListData != null) {
            List list = homeListData.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof BoosterHorizontalListData) {
                    arrayList.add(obj);
                }
            }
            BoosterHorizontalListData boosterHorizontalListData = (BoosterHorizontalListData) CollectionsKt.F(arrayList);
            HorizontalListActionState horizontalListActionState = null;
            if (boosterHorizontalListData != null) {
                List list2 = boosterHorizontalListData.h;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof ProductCard) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    RewardsOfferInfo rewardsOfferInfo = ((ProductCard) next).getRewardsOfferInfo();
                    if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED) {
                        break;
                    }
                }
                if (((ProductCard) next) != null || boosterHorizontalListData.g != null) {
                    horizontalListActionState = HorizontalListActionState.d;
                }
            }
            if (horizontalListActionState != null) {
                return horizontalListActionState;
            }
        }
        return HorizontalListActionState.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HomePageContract.ViewState z6(HomePageViewModel homePageViewModel, HomeListData homeListData, HomePageErrorState homePageErrorState, HomePageRefreshErrorState homePageRefreshErrorState, int i) {
        DeliveryNowBottomBanner deliveryNowBottomBanner;
        HomeModeSelectorContainerData homeModeSelectorContainerData;
        HomeListData homeListDataA;
        List list;
        Object next;
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            homeListData = null;
        }
        HomePageErrorState homePageErrorState2 = (i & 4) != 0 ? null : homePageErrorState;
        HomePageRefreshErrorState homePageRefreshErrorState2 = (i & 8) != 0 ? null : homePageRefreshErrorState;
        List list2 = ((HomePageContract.ViewState) homePageViewModel.I.getValue()).h;
        if (list2 == null) {
            list2 = EmptyList.d;
        }
        List list3 = list2;
        homePageViewModel.getClass();
        if (homeListData == null || (list = homeListData.d) == null) {
            deliveryNowBottomBanner = null;
            homeModeSelectorContainerData = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof HomeModeSelectorContainerData) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((HomeModeSelectorContainerData) next).c instanceof DeliveryNowBottomBanner) {
                    break;
                }
            }
            homeModeSelectorContainerData = (HomeModeSelectorContainerData) next;
            deliveryNowBottomBanner = null;
        }
        if (homeListData != null) {
            List list4 = homeListData.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list4) {
                BroadcastBannerData broadcastBannerData = obj2 instanceof BroadcastBannerData ? (BroadcastBannerData) obj2 : deliveryNowBottomBanner;
                if (broadcastBannerData == 0 || !homePageViewModel.o.a(broadcastBannerData)) {
                    arrayList2.add(obj2);
                }
            }
            homeListDataA = HomeListData.a(homeListData, arrayList2);
        } else {
            homeListDataA = deliveryNowBottomBanner;
        }
        HorizontalListActionState horizontalListActionStateX6 = x6(homeListData);
        HomePageContract.DeliveryNowViewState deliveryNowViewStateB6 = homeListData != null ? B6(homeListData) : HomePageContract.DeliveryNowViewState.d;
        Object obj3 = homeModeSelectorContainerData != null ? homeModeSelectorContainerData.c : deliveryNowBottomBanner;
        if (obj3 instanceof DeliveryNowBottomBanner) {
            deliveryNowBottomBanner = (DeliveryNowBottomBanner) obj3;
        }
        return new HomePageContract.ViewState(z, homeListDataA, homePageErrorState2, homePageRefreshErrorState2, horizontalListActionStateX6, new HomePageContract.DeliveryNowData(deliveryNowViewStateB6, deliveryNowBottomBanner), homePageViewModel.u.c(HomeFeature.e), list3, null);
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.OrdersClickListener
    public final void B3(OrderCardData data) {
        Intrinsics.h(data, "data");
        w6(new HomePageContract.Actions.LaunchYourGroceries(String.valueOf(data.d)));
        this.f.j(HomePageActions.MyOrdersFulfilmentStatusBannerClick.e, OrderCardDataKt.a(data));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.f.g(HomepageAnalytics.Home.Action.e);
        this.K.f(new HomePageContract.Actions.LaunchProductUpdate(productCardTileData));
    }

    public final void D6(BroadcastBannerData broadcastBannerData) {
        Intrinsics.h(broadcastBannerData, "broadcastBannerData");
        String bannerId = broadcastBannerData.getBannerId();
        if (bannerId != null) {
            if (!Intrinsics.c(broadcastBannerData.getDismissible(), Boolean.TRUE)) {
                bannerId = null;
            }
            if (bannerId != null) {
                this.o.b(bannerId);
                MutableStateFlow mutableStateFlow = this.H;
                HomePageContract.ViewState viewState = (HomePageContract.ViewState) mutableStateFlow.getValue();
                mutableStateFlow.setValue(z6(this, viewState != null ? viewState.b : null, null, null, 29));
                this.f.g(AnalyticsExtensionsKt.b(broadcastBannerData, Screens.l));
            }
        }
    }

    public final void E6() {
        this.f.g(HomepageAnalytics.HomeScreen.Action.g);
        BuildersKt.c(ViewModelKt.a(this), null, null, new HomePageViewModel$onCloseDeliveryNowBannerClicked$1(this, null), 3);
    }

    public final void F6(String deepLink) {
        Intrinsics.h(deepLink, "deepLink");
        w6(new HomePageContract.Actions.LaunchDeepLink(deepLink));
    }

    @Override // au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener
    public final void G0(HorizontalListDataInterface data) {
        Intrinsics.h(data, "data");
        TrackableValue trackableValue = TrackableValue.o0;
        String d = data.getD();
        if (d == null) {
            d = "";
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, A6(d));
        if (!C6(data)) {
            TrackableValue trackableValue2 = TrackableValue.z0;
            String d2 = data.getD();
            trackingMetadataA.b(trackableValue2, d2 != null ? d2 : "");
            TrackableValue trackableValue3 = TrackableValue.y0;
            String f = data.getF();
            Intrinsics.e(f);
            trackingMetadataA.b(trackableValue3, f);
        }
        boolean z = data instanceof BoosterHorizontalListData;
        AnalyticsManager analyticsManager = this.f;
        if (!z) {
            analyticsManager.j(HomePageActions.SeeAllClick.e, trackingMetadataA);
            String g = data.getG();
            if (g != null) {
                w6(new HomePageContract.Actions.LaunchDeepLink(g));
                return;
            }
            return;
        }
        BoosterHorizontalListData boosterHorizontalListData = (BoosterHorizontalListData) data;
        String str = boosterHorizontalListData.g;
        if (str == null) {
            analyticsManager.j(HomePageActions.BoostAllClick.e, trackingMetadataA);
            BuildersKt.c(ViewModelKt.a(this), null, null, new HomePageViewModel$onBoosterHorizontalListActionClicked$1(this, boosterHorizontalListData, null), 3);
        } else {
            analyticsManager.j(HomePageActions.SeeMoreClick.e, trackingMetadataA);
            w6(new HomePageContract.Actions.LaunchDeepLink(str));
        }
    }

    public final void G6(MyShoppingListItemData myShoppingListItemData) {
        Intrinsics.h(myShoppingListItemData, "myShoppingListItemData");
        this.f.j(HomePageActions.MyListsItemClick.e, TrackingMetadata.Companion.a(TrackableValue.o0, myShoppingListItemData.e));
        w6(new HomePageContract.Actions.LaunchShoppingListDetails(myShoppingListItemData.f7201a));
    }

    public final void H6(MyShoppingListsData myShoppingListsData) {
        Intrinsics.h(myShoppingListsData, "myShoppingListsData");
        this.f.j(HomePageActions.MyListsClick.e, TrackingMetadata.Companion.a(TrackableValue.o0, myShoppingListsData.f7202a));
        String str = myShoppingListsData.d;
        if (str != null) {
            w6(new HomePageContract.Actions.LaunchDeepLink(str));
        }
    }

    public final HomePageContract.ViewState I6(AkamaiServerErrorType akamaiServerErrorType, Text text, Boolean bool) {
        J6(HomePageContract.ScreenLoadedStatus.f, null);
        HomePageActions.ServerError serverError = HomePageActions.ServerError.e;
        AnalyticsManager analyticsManager = this.f;
        analyticsManager.c(serverError);
        MutableStateFlow mutableStateFlow = this.H;
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) mutableStateFlow.getValue();
        if ((viewState != null ? viewState.b : null) != null) {
            HomePageRefreshErrorState homePageRefreshErrorState = HomePageRefreshErrorState.e;
            HomePageContract.ViewState viewState2 = (HomePageContract.ViewState) mutableStateFlow.getValue();
            return z6(this, viewState2 != null ? viewState2.b : null, null, homePageRefreshErrorState, 21);
        }
        if (akamaiServerErrorType != null) {
            String f4561a = akamaiServerErrorType.getF4561a();
            if (f4561a != null) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.h(new ReportOwner(ReportOwner.Squad.m), new AkamaiException(androidx.camera.core.impl.b.o(akamaiServerErrorType.getC(), " -> ", f4561a)), "Home page data fetch failed -> " + akamaiServerErrorType.getC(), 24);
                HomepageAnalytics.HomeScreen.Action.Companion companion2 = HomepageAnalytics.HomeScreen.Action.d;
                final String errorLabel = akamaiServerErrorType.getC();
                final String errorReason = akamaiServerErrorType.getD() + " -> " + f4561a;
                companion2.getClass();
                Intrinsics.h(errorLabel, "errorLabel");
                Intrinsics.h(errorReason, "errorReason");
                analyticsManager.g(new Event(errorLabel, errorReason) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$fullScreenServerError$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                        a.z("event.Category", "error", spreadBuilder, "event.Action", "impression");
                        a.z("error.Reason", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(errorLabel), spreadBuilder, errorReason), spreadBuilder, "error.Name", "Full Screen");
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "error_impression";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            } else {
                Bark.Companion companion3 = Bark.f8483a;
                Bark.Barker.h(new ReportOwner(ReportOwner.Squad.m), new AkamaiException(akamaiServerErrorType.getC()), "Home page data fetch failed -> " + akamaiServerErrorType.getC(), 24);
                HomepageAnalytics.HomeScreen.Action.Companion companion4 = HomepageAnalytics.HomeScreen.Action.d;
                final String errorLabel2 = akamaiServerErrorType.getC();
                final String errorReason2 = akamaiServerErrorType.getD();
                companion4.getClass();
                Intrinsics.h(errorLabel2, "errorLabel");
                Intrinsics.h(errorReason2, "errorReason");
                analyticsManager.g(new Event(errorLabel2, errorReason2) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$fullScreenServerError$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                        a.z("event.Category", "error", spreadBuilder, "event.Action", "impression");
                        a.z("error.Reason", androidx.compose.ui.input.pointer.a.m("event.Label", String.valueOf(errorLabel2), spreadBuilder, errorReason2), spreadBuilder, "error.Name", "Full Screen");
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "error_impression";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "error_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
        }
        ServerErrorState serverErrorState = new ServerErrorState(text, bool);
        HomePageContract.ViewState viewState3 = (HomePageContract.ViewState) mutableStateFlow.getValue();
        return z6(this, viewState3 != null ? viewState3.b : null, serverErrorState, null, 25);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        HomePageActions.ProductClick productClick = HomePageActions.ProductClick.e;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.z0, containerTitle);
        trackingMetadataA.b(TrackableValue.o0, A6(containerTitle));
        Double dU = ProductCardExtKt.u(productCardData);
        trackingMetadataA.a(ProductAnalyticsExtKt.h(productCardData, dU != null ? Float.valueOf((float) dU.doubleValue()) : null, null, 6));
        this.f.j(productClick, trackingMetadataA);
        w6(new HomePageContract.Actions.LaunchProductDetails(productCardData));
    }

    public final void J6(HomePageContract.ScreenLoadedStatus screenLoadedStatus, TrackingMetadata trackingMetadata) {
        String str = this.B ? "Yes|Fine|None" : this.A ? "Yes|Coarse|None" : "No|None|None";
        FirebasePerfMonitor firebasePerfMonitor = this.j;
        firebasePerfMonitor.d("app_cold_start_interactive_state");
        HashMap map = firebasePerfMonitor.f4059a;
        if (map.get("app_start_interactive_state") != null) {
            int iOrdinal = screenLoadedStatus.ordinal();
            if (iOrdinal == 0) {
                FirebasePerfMonitor.b(firebasePerfMonitor, "successful_load");
                firebasePerfMonitor.d("home_page_successful_load");
                map.remove("home_page_failed_load");
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                FirebasePerfMonitor.b(firebasePerfMonitor, "failed_load");
                firebasePerfMonitor.d("home_page_failed_load");
                map.remove("home_page_successful_load");
            }
            firebasePerfMonitor.d("app_start_interactive_state");
        }
        HomePageActions.ScreenLoaded screenLoaded = HomePageActions.ScreenLoaded.e;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.x0, screenLoadedStatus.d);
        if (trackingMetadata != null) {
            trackingMetadataA.a(trackingMetadata);
        }
        trackingMetadataA.b(TrackableValue.H0, str);
        this.f.j(screenLoaded, trackingMetadataA);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        HomePageActions.AddToList addToList = HomePageActions.AddToList.e;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, A6(containerTitle));
        Double dU = ProductCardExtKt.u(productCardTileData);
        trackingMetadataA.a(ProductAnalyticsExtKt.h(productCardTileData, dU != null ? Float.valueOf((float) dU.doubleValue()) : null, null, 6));
        this.f.j(addToList, trackingMetadataA);
        this.K.f(new HomePageContract.Actions.LaunchAddToList(productCardTileData));
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.CatalogueClickListener
    public final void L1() {
        this.f.c(HomePageActions.CatalogueClick.e);
        w6(HomePageContract.Actions.LaunchCatalogue.f7215a);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    /* renamed from: L5, reason: from getter */
    public final InstorePresenceInteractor getR() {
        return this.r;
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.OrdersClickListener
    public final void N4(OrderCardData data) {
        Intrinsics.h(data, "data");
        this.f.c(HomePageActions.MyOrdersCardClick.e);
        ActionData actionData = data.i;
        if (actionData == null) {
            w6(new HomePageContract.Actions.LaunchOrder(data));
            return;
        }
        if (WhenMappings.f7241a[actionData.getType().ordinal()] == 1) {
            F6(actionData.getAction());
        }
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void Q2(String containerTitle, String priceFamilyId) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        this.f.j(HomePageActions.ViewProductVarieties.e, TrackingMetadata.Companion.a(TrackableValue.o0, containerTitle));
        this.K.f(new HomePageContract.Actions.LaunchProductVarieties(priceFamilyId));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        HomepageAnalytics.Home.Action action = HomepageAnalytics.Home.Action.d;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, A6(containerTitle));
        trackingMetadataA.a(ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.f.i(action, trackingMetadataA);
        this.K.f(new HomePageContract.Actions.LaunchProductAdd(productCardTileData));
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.RegistrationClickListener
    public final void Y4() {
        this.f.c(HomePageActions.LoginClick.e);
        w6(HomePageContract.Actions.LaunchLogIn.f7218a);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    /* renamed from: c, reason: from getter */
    public final AnalyticsManager getF() {
        return this.f;
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.RegistrationClickListener
    public final void d6() {
        this.f.c(HomePageActions.SignUpClick.e);
        w6(HomePageContract.Actions.LaunchSignUp.f7228a);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final LegacyStoreLocatorInteractor e3() {
        return this.s;
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final Screen f() {
        return Screens.l;
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(final ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        WatchlistInteractor watchlistInteractor = this.w;
        if (watchlistInteractor.c()) {
            this.J.f(HomePageContract.Actions.LaunchWatchlistGuestOnboardingScreen.f7229a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) this.I.getValue();
        boolean zT = ProductCardExtKt.t(productCardData, viewState != null ? viewState.h : null);
        final String description = "Carousel - ".concat(containerTitle);
        MutableStateFlow mutableStateFlow = this.H;
        AnalyticsManager analyticsManager = this.f;
        if (zT) {
            HomepageAnalytics.HomeScreen.Action.d.getClass();
            Intrinsics.h(description, "description");
            analyticsManager.i(new Event(description) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$removeFromWatchlist$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                    spreadBuilder.a(new Pair("screen.Type", "home"));
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Label", "unsave from watchlist"));
                    a.y("event.Description", description, spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "watchlist_buttonclick";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "watchlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
            watchlistInteractor.d(productCardData);
            final int i = 0;
            K6(this, mutableStateFlow, null, null, null, null, new HomePageContract.Snackbar(new ResText(R.string.watchlist_product_removed_snackbar_message), null, new au.com.woolworths.android.onesite.deeplink.h(20), new Function1(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.k
                public final /* synthetic */ HomePageViewModel e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String it = (String) obj;
                    switch (i) {
                        case 0:
                            Intrinsics.h(it, "it");
                            AnalyticsManager analyticsManager2 = this.e.f;
                            HomepageAnalytics.HomeScreen.Action.d.getClass();
                            analyticsManager2.i(new Event(it, description) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                                    spreadBuilder.a(new Pair("screen.Type", "home"));
                                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                    a.z("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, it), spreadBuilder, "event.Description", str);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getD() {
                                    return "watchlist_snackbarimpression";
                                }

                                public final boolean equals(Object obj2) {
                                    if (!(obj2 instanceof Event)) {
                                        return false;
                                    }
                                    Event event = (Event) obj2;
                                    return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
                            break;
                        default:
                            Intrinsics.h(it, "it");
                            AnalyticsManager analyticsManager3 = this.e.f;
                            HomepageAnalytics.HomeScreen.Action.d.getClass();
                            analyticsManager3.i(new Event(it, description) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                                    spreadBuilder.a(new Pair("screen.Type", "home"));
                                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                    a.z("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, it), spreadBuilder, "event.Description", str);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getD() {
                                    return "watchlist_snackbarimpression";
                                }

                                public final boolean equals(Object obj2) {
                                    if (!(obj2 instanceof Event)) {
                                        return false;
                                    }
                                    Event event = (Event) obj2;
                                    return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
                            break;
                    }
                    return Unit.f24250a;
                }
            }), 383);
            return;
        }
        HomepageAnalytics.HomeScreen.Action.d.getClass();
        Intrinsics.h(description, "description");
        analyticsManager.i(new Event(description) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$addToWatchlist$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                spreadBuilder.a(new Pair("screen.Type", "home"));
                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", "save to watchlist"));
                a.y("event.Description", description, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "watchlist_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "watchlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        watchlistInteractor.a(productCardData);
        ResText resText = new ResText(R.string.watchlist_product_added_snackbar_message);
        ResText resText2 = new ResText(R.string.view_list);
        androidx.work.impl.utils.b bVar = new androidx.work.impl.utils.b(this, description, productCardData, strB, 6);
        final int i2 = 1;
        K6(this, mutableStateFlow, null, null, null, null, new HomePageContract.Snackbar(resText, resText2, bVar, new Function1(this) { // from class: au.com.woolworths.feature.shop.homepage.presentation.k
            public final /* synthetic */ HomePageViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.h(it, "it");
                        AnalyticsManager analyticsManager2 = this.e.f;
                        HomepageAnalytics.HomeScreen.Action.d.getClass();
                        analyticsManager2.i(new Event(it, description) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                                spreadBuilder.a(new Pair("screen.Type", "home"));
                                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                a.z("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, it), spreadBuilder, "event.Description", str);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getD() {
                                return "watchlist_snackbarimpression";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj2;
                                return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
                        break;
                    default:
                        Intrinsics.h(it, "it");
                        AnalyticsManager analyticsManager3 = this.e.f;
                        HomepageAnalytics.HomeScreen.Action.d.getClass();
                        analyticsManager3.i(new Event(it, description) { // from class: au.com.woolworths.analytics.supers.homepage.HomepageAnalytics$HomeScreen$Action$Companion$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                spreadBuilder.b(HomepageAnalytics.HomeScreen.e);
                                spreadBuilder.a(new Pair("screen.Type", "home"));
                                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                a.z("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, it), spreadBuilder, "event.Description", str);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getD() {
                                return "watchlist_snackbarimpression";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event = (Event) obj2;
                                return "watchlist_snackbarimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
                        break;
                }
                return Unit.f24250a;
            }
        }), 383);
    }

    @Override // au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener
    public final void m(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof GoogleAdBannerCard;
        AnalyticsManager analyticsManager = this.f;
        if (!z) {
            if (data instanceof ActionableCard) {
                ActionableCard actionableCard = (ActionableCard) data;
                analyticsManager.j(HomePageActions.ActionableCardClick.e, ActionableCardKt.a(actionableCard));
                w6(new HomePageContract.Actions.LaunchDeepLink(actionableCard.getLink()));
                return;
            }
            return;
        }
        GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
        if (GoogleAdBannerCardKt.c(googleAdBannerCard)) {
            String ctaUrl = googleAdBannerCard.getCtaUrl();
            String targetId = googleAdBannerCard.getTargetId();
            if (ctaUrl != null && ctaUrl.length() != 0) {
                w6(new HomePageContract.Actions.LaunchDeepLink(ctaUrl));
            } else if (targetId != null) {
                String title = googleAdBannerCard.getTitle();
                if (title == null) {
                    title = "";
                }
                Activities.ProductList.ExtrasPageData extrasPageData = new Activities.ProductList.ExtrasPageData(title, null);
                Activities.ProductList.ProductListType productListType = Activities.ProductList.ProductListType.x;
                w6(new HomePageContract.Actions.LaunchProductGroup(new Activities.ProductList.Extras(extrasPageData, new Activities.ProductList.ExtrasByProductGroup(targetId, productListType.d, null, productListType), (Activities.ProductList.ExtrasConfig) null, 4)));
            }
            BuildersKt.c(ViewModelKt.a(this), null, null, new HomePageViewModel$onGoogleAdBannerClicked$1(this, googleAdBannerCard, null), 3);
            analyticsManager.j(HomePageActions.GoogleAdBannerClick.e, GoogleAdBannerCardKt.a(googleAdBannerCard));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.G.e();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        HomePageErrorState homePageErrorState;
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) this.I.getValue();
        if (viewState == null || (homePageErrorState = viewState.c) == null) {
            return;
        }
        homePageErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        HomePageErrorState homePageErrorState;
        HomePageContract.ViewState viewState = (HomePageContract.ViewState) this.I.getValue();
        if (viewState == null || (homePageErrorState = viewState.c) == null) {
            return;
        }
        homePageErrorState.b(this);
    }

    @Override // au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptClickHandler
    public final CloseableCoroutineScope s0() {
        return ViewModelKt.a(this);
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.AddRewardsClickListener
    public final void u1() {
        this.f.c(HomePageActions.AddRewardsCardClick.e);
        w6(HomePageContract.Actions.LaunchAddRewards.f7212a);
    }

    public final void v6() {
        this.H.setValue(z6(this, null, null, null, 31));
    }

    public final void w6(HomePageContract.Actions actions) {
        this.J.f(actions);
    }

    public final void y6() {
        this.l.D();
        BuildersKt.c(ViewModelKt.a(this), null, null, new HomePageViewModel$fetchHomePage$1(this, null), 3);
    }

    @Override // au.com.woolworths.feature.shop.homepage.presentation.MarketplaceCardClickListener
    public final void z5() {
        this.f.c(HomePageActions.MarketplaceCardClick.e);
        w6(HomePageContract.Actions.LaunchMarketplace.f7219a);
    }
}
