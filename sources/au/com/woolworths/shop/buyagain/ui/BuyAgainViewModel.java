package au.com.woolworths.shop.buyagain.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityUpdated;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.offers.TrackableBoostMetadata;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.buyagain.ShopBuyAgainFeature;
import au.com.woolworths.shop.buyagain.analytics.ScreenExtKt;
import au.com.woolworths.shop.buyagain.domain.BuyAgainInteractor;
import au.com.woolworths.shop.buyagain.domain.BuyAgainProductList;
import au.com.woolworths.shop.buyagain.domain.ProductList;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BuyAgainViewModel extends ViewModel {
    public final BuyAgainInteractor e;
    public final ProductBoostInteractor f;
    public final AnalyticsManager g;
    public final ShopAccountInteractor h;
    public final CartUpdateInteractor i;
    public final WatchlistInteractor j;
    public final BufferedChannel k;
    public final Flow l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final SharedFlowImpl o;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$1", f = "BuyAgainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public /* synthetic */ int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = BuyAgainViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.p = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            int i = this.p;
            BuyAgainViewModel buyAgainViewModel = BuyAgainViewModel.this;
            BuyAgainViewModel.x6(buyAgainViewModel, buyAgainViewModel.m, false, false, new Integer(i), null, null, null, false, null, false, null, null, false, false, false, 16379);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductQuantitiesUpdatedResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$2", f = "BuyAgainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CartProductQuantitiesUpdatedResponse, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = BuyAgainViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((CartProductQuantitiesUpdatedResponse) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CartProductQuantitiesUpdatedResponse cartProductQuantitiesUpdatedResponse = (CartProductQuantitiesUpdatedResponse) this.p;
            BuyAgainViewModel buyAgainViewModel = BuyAgainViewModel.this;
            MutableStateFlow mutableStateFlow = buyAgainViewModel.m;
            BuyAgainProductList buyAgainProductList = ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).d;
            BuyAgainProductList buyAgainProductListA = null;
            if (buyAgainProductList != null) {
                ProductList productList = buyAgainProductList.c;
                ?? T6 = buyAgainViewModel.t6();
                ?? r1 = cartProductQuantitiesUpdatedResponse.c;
                if (!r1.isEmpty()) {
                    T6 = CollectionsKt.J0((Collection) T6);
                    for (final CartProductQuantityUpdated cartProductQuantityUpdated : (Iterable) r1) {
                        T6.replaceAll(new UnaryOperator() { // from class: au.com.woolworths.shop.buyagain.ui.a
                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                ProductCard productCard = (ProductCard) obj2;
                                Intrinsics.h(productCard, "productCard");
                                String productId = productCard.getProductId();
                                CartProductQuantityUpdated cartProductQuantityUpdated2 = cartProductQuantityUpdated;
                                if (!Intrinsics.c(productId, cartProductQuantityUpdated2.f8684a)) {
                                    return productCard;
                                }
                                ProductTrolleyData trolley = productCard.getTrolley();
                                return productCard.copy(((-33554433) & 1) != 0 ? productCard.productId : null, ((-33554433) & 2) != 0 ? productCard.name : null, ((-33554433) & 4) != 0 ? productCard.productImage : null, ((-33554433) & 8) != 0 ? productCard.badgeImage : null, ((-33554433) & 16) != 0 ? productCard.price : null, ((-33554433) & 32) != 0 ? productCard.unitOfMeasureLabel : null, ((-33554433) & 64) != 0 ? productCard.promotionValue : null, ((-33554433) & 128) != 0 ? productCard.promotionType : null, ((-33554433) & 256) != 0 ? productCard.unitPriceDescription : null, ((-33554433) & 512) != 0 ? productCard.isAvailable : false, ((-33554433) & 1024) != 0 ? productCard.isNew : false, ((-33554433) & 2048) != 0 ? productCard.wasPrice : null, ((-33554433) & 4096) != 0 ? productCard.multiBuyPrice : null, ((-33554433) & 8192) != 0 ? productCard.multiBuyUnitPrice : null, ((-33554433) & 16384) != 0 ? productCard.purchaseWarning : null, ((-33554433) & 32768) != 0 ? productCard.trolley : trolley != null ? trolley.copy((895 & 1) != 0 ? trolley.minimum : 0.0d, (895 & 2) != 0 ? trolley.maximum : 0.0d, (895 & 4) != 0 ? trolley.increment : 0.0d, (895 & 8) != 0 ? trolley.defaultValue : 0.0d, (895 & 16) != 0 ? trolley.inTrolley : Double.valueOf(cartProductQuantityUpdated2.b), (895 & 32) != 0 ? trolley.unitLabel : null, (895 & 64) != 0 ? trolley.buttonState : null, (895 & 128) != 0 ? trolley.buttonLabel : null, (895 & 256) != 0 ? trolley.buttonQuantity : null, (895 & 512) != 0 ? trolley.title : null) : null, ((-33554433) & 65536) != 0 ? productCard.trolleys : null, ((-33554433) & 131072) != 0 ? productCard.productShoppingList : null, ((-33554433) & 262144) != 0 ? productCard.inStoreDetails : null, ((-33554433) & 524288) != 0 ? productCard.purchaseRestriction : null, ((-33554433) & 1048576) != 0 ? productCard.inlineLabels : null, ((-33554433) & 2097152) != 0 ? productCard.promotionInfo : null, ((-33554433) & 4194304) != 0 ? productCard.adId : null, ((-33554433) & 8388608) != 0 ? productCard.source : null, ((-33554433) & 16777216) != 0 ? productCard.marketplace : null, ((-33554433) & 33554432) != 0 ? productCard.rewardsOfferInfo : null, ((-33554433) & 67108864) != 0 ? productCard.disclaimer : null, ((-33554433) & 134217728) != 0 ? productCard.tagLabel : null, ((-33554433) & 268435456) != 0 ? productCard.inStoreAvailabilityInfo : null, ((-33554433) & 536870912) != 0 ? productCard.productVarieties : null, ((-33554433) & 1073741824) != 0 ? productCard.categories : null, ((-33554433) & Integer.MIN_VALUE) != 0 ? productCard.isTobacco : false, (255 & 1) != 0 ? productCard.multiBuyPriceInfo : null, (255 & 2) != 0 ? productCard.memberPriceInfo : null, (255 & 4) != 0 ? productCard.cartProductInfo : null, (255 & 8) != 0 ? productCard.inStoreLocation : null, (255 & 16) != 0 ? productCard.productCardAnalytics : null, (255 & 32) != 0 ? productCard.impressionAnalyticsData : null, (255 & 64) != 0 ? productCard.productCardAction : null, (255 & 128) != 0 ? productCard.pricingFootnoteMd : null);
                            }
                        });
                    }
                }
                buyAgainProductListA = BuyAgainProductList.a(buyAgainProductList, ProductList.a(productList, T6, null, 14));
            }
            BuyAgainViewModel.x6(buyAgainViewModel, mutableStateFlow, false, false, null, buyAgainProductListA, null, null, false, null, false, null, null, false, false, false, 16375);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "offerInfoList", "", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$3", f = "BuyAgainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends BasicRewardsOfferStatusData>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = BuyAgainViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            BuyAgainViewModel buyAgainViewModel = BuyAgainViewModel.this;
            MutableStateFlow mutableStateFlow = buyAgainViewModel.m;
            BuyAgainProductList buyAgainProductList = ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).d;
            BuyAgainViewModel.x6(buyAgainViewModel, mutableStateFlow, false, false, null, buyAgainProductList != null ? BuyAgainProductList.a(buyAgainProductList, ProductList.a(buyAgainProductList.c, ProductAnalyticsExtKt.i(buyAgainViewModel.t6(), list), null, 14)) : null, null, null, false, null, false, null, null, false, false, false, 16375);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$4", f = "BuyAgainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BuyAgainViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass4.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            BuyAgainViewModel buyAgainViewModel = BuyAgainViewModel.this;
            BuildersKt.c(ViewModelKt.a(buyAgainViewModel), null, null, new BuyAgainViewModel$updateCartThroughQuantityMap$1(buyAgainViewModel, MapsKt.q(((BuyAgainContract.ViewState) buyAgainViewModel.m.getValue()).e), null), 3);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lau/com/woolworths/product/models/ProductId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$5", f = "BuyAgainViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<List<? extends ProductId>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass5 anonymousClass5 = BuyAgainViewModel.this.new AnonymousClass5(continuation);
            anonymousClass5.p = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass5 anonymousClass5 = (AnonymousClass5) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass5.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            BuyAgainViewModel buyAgainViewModel = BuyAgainViewModel.this;
            BuyAgainViewModel.x6(buyAgainViewModel, buyAgainViewModel.m, false, false, null, null, null, null, false, null, false, list, null, false, false, false, 15871);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/buyagain/ui/BuyAgainViewModel$Companion;", "", "", "ADD_TO_LIST_SNACKBAR_EVENT_DESCRIPTION", "Ljava/lang/String;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BuyAgainViewModel(BuyAgainInteractor buyAgainInteractor, ProductBoostInteractor productBoostInteractor, AnalyticsManager analyticsManager, ShopAccountInteractor accountInteractor, CartUpdateInteractor cartUpdateInteractor, FeatureToggleManager featureToggleManager, WatchlistInteractor watchlistInteractor, InstoreNavigationInteractor instoreNavigationInteractor) {
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        this.e = buyAgainInteractor;
        this.f = productBoostInteractor;
        this.g = analyticsManager;
        this.h = accountInteractor;
        this.i = cartUpdateInteractor;
        this.j = watchlistInteractor;
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.k = bufferedChannelA;
        this.l = FlowKt.I(bufferedChannelA);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(BuyAgainContract.ViewState.o);
        this.m = mutableStateFlowA;
        this.n = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(0, 1, BufferOverflow.e);
        this.o = sharedFlowImplA;
        x6(this, mutableStateFlowA, false, false, null, null, null, null, cartUpdateInteractor.b.z(), null, featureToggleManager.c(ShopBuyAgainFeature.e), null, null, instoreNavigationInteractor.d(), !buyAgainInteractor.f10256a.d.getBoolean("best_value_coach_mark_seen", false), featureToggleManager.c(BaseShopAppFeature.w), 1727);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), cartUpdateInteractor.l), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), FlowKt.s(cartUpdateInteractor.j, 1)), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), productBoostInteractor.c), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass4(null), FlowKt.o(sharedFlowImplA, 1000L)), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass5(null), watchlistInteractor.e), ViewModelKt.a(this));
    }

    public static final Object p6(BuyAgainViewModel buyAgainViewModel, ArrayList arrayList, Continuation continuation) {
        Object obj = BuyAgainAnalytics.BuyAgain.d;
        Object objB = ProductBoostInteractor.b(buyAgainViewModel.f, arrayList, new TrackableBoostMetadata(ScreenExtKt.a(), null), null, null, continuation, 26);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    public static final Set q6(BuyAgainViewModel buyAgainViewModel, BuyAgainProductList buyAgainProductList) {
        List list = buyAgainProductList.c.f10259a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductCard) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            RewardsOfferInfo rewardsOfferInfo = ((ProductCard) next).getRewardsOfferInfo();
            if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.ACTIVATED) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ProductCard) it2.next()).getProductId());
        }
        return CollectionsKt.L0(arrayList3);
    }

    public static /* synthetic */ void w6(BuyAgainViewModel buyAgainViewModel, Text text, PlainText plainText, au.com.woolworths.sdui.common.alert.a aVar, TrackingMetadata trackingMetadata, int i) {
        if ((i & 2) != 0) {
            plainText = null;
        }
        Function0 hVar = aVar;
        if ((i & 4) != 0) {
            hVar = new h(20);
        }
        if ((i & 8) != 0) {
            trackingMetadata = null;
        }
        buyAgainViewModel.v6(text, plainText, hVar, trackingMetadata);
    }

    public static void x6(BuyAgainViewModel buyAgainViewModel, MutableStateFlow mutableStateFlow, boolean z, boolean z2, Integer num, BuyAgainProductList buyAgainProductList, Set set, LinkedHashMap linkedHashMap, boolean z3, BuyAgainFullPageError buyAgainFullPageError, boolean z4, List list, BuyAgainContract.Snackbar snackbar, boolean z5, boolean z6, boolean z7, int i) {
        boolean z8 = (i & 1) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).f10271a : z;
        boolean z9 = (i & 2) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).b : z2;
        Integer num2 = (i & 4) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).c : num;
        BuyAgainProductList buyAgainProductList2 = (i & 8) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).d : buyAgainProductList;
        Set set2 = (i & 16) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).f : set;
        Map map = (i & 32) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).e : linkedHashMap;
        boolean z10 = (i & 64) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).g : z3;
        BuyAgainFullPageError buyAgainFullPageError2 = (i & 128) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).h : buyAgainFullPageError;
        boolean z11 = (i & 256) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).i : z4;
        List watchlistedProductIds = (i & 512) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).j : list;
        BuyAgainContract.Snackbar snackbar2 = (i & 1024) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).k : snackbar;
        boolean z12 = (i & 2048) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).l : z5;
        boolean z13 = (i & 4096) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).m : z6;
        boolean z14 = (i & 8192) != 0 ? ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).n : z7;
        buyAgainViewModel.getClass();
        ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).getClass();
        Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
        mutableStateFlow.f(new BuyAgainContract.ViewState(z8, z9, num2, buyAgainProductList2, map, set2, z10, buyAgainFullPageError2, z11, watchlistedProductIds, snackbar2, z12, z13, z14));
    }

    public final void r6(ProductCard productCard, double d) {
        MutableStateFlow mutableStateFlow = this.m;
        LinkedHashMap linkedHashMapS = MapsKt.s(((BuyAgainContract.ViewState) mutableStateFlow.getValue()).e);
        linkedHashMapS.put(productCard.getProductId(), Double.valueOf(d));
        x6(this, mutableStateFlow, false, false, null, null, null, linkedHashMapS, false, null, false, null, null, false, false, false, 16351);
        this.o.f(new Object());
    }

    public final List s6() {
        ProductList productList;
        List list;
        BuyAgainProductList buyAgainProductList = ((BuyAgainContract.ViewState) this.n.getValue()).d;
        return (buyAgainProductList == null || (productList = buyAgainProductList.c) == null || (list = productList.d) == null) ? EmptyList.d : list;
    }

    public final List t6() {
        ProductList productList;
        List list;
        BuyAgainProductList buyAgainProductList = ((BuyAgainContract.ViewState) this.n.getValue()).d;
        if (buyAgainProductList == null || (productList = buyAgainProductList.c) == null || (list = productList.f10259a) == null) {
            return EmptyList.d;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ProductCard) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void u6(String str, String str2) {
        BuildersKt.c(ViewModelKt.a(this), null, null, new BuyAgainViewModel$loadScreen$1(this, str, str2, null), 3);
    }

    public final void v6(Text text, Text text2, Function0 actionCallback, TrackingMetadata trackingMetadata) {
        Intrinsics.h(actionCallback, "actionCallback");
        x6(this, this.m, false, false, null, null, null, null, false, null, false, null, new BuyAgainContract.Snackbar(text, text2, actionCallback, trackingMetadata), false, false, false, 15359);
    }
}
