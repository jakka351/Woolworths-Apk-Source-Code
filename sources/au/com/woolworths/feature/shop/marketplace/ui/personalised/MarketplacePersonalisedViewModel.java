package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.supers.local.MarketplaceAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceHorizontalList;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceLandingPageName;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalised;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalisedSegment;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSection;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedContract;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.promotion.banner.ui.PromotionBannerAction;
import au.com.woolworths.promotion.banner.ui.PromotionBannerListener;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Lau/com/woolworths/promotion/banner/ui/PromotionBannerListener;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplacePersonalisedViewModel extends ViewModel implements FullPageErrorStateClickHandler, ProductClickListener, PromotionBannerListener {
    public final AnalyticsManager e;
    public final MarketplaceInteractor f;
    public final TrolleyInteractor g;
    public final ProductListFeedTrolleyUpdater h;
    public final SharedFlowImpl i;
    public final MutableStateFlow j;
    public final SharedFlowImpl k;
    public final StateFlow l;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel$1", f = "MarketplacePersonalisedViewModel.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MarketplacePersonalisedViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final MarketplacePersonalisedViewModel marketplacePersonalisedViewModel = MarketplacePersonalisedViewModel.this;
                StateFlow stateFlowV = marketplacePersonalisedViewModel.g.getP();
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Result result = (Result) obj2;
                        if (result.b()) {
                            Object obj3 = result.f4591a;
                            Intrinsics.e(obj3);
                            TrolleyResult trolleyResult = (TrolleyResult) obj3;
                            MarketplacePersonalisedViewModel marketplacePersonalisedViewModel2 = marketplacePersonalisedViewModel;
                            MutableStateFlow mutableStateFlow = marketplacePersonalisedViewModel2.j;
                            MarketplacePersonalised marketplacePersonalised = ((MarketplacePersonalisedContract.ViewState) mutableStateFlow.getValue()).c;
                            if (marketplacePersonalised != null) {
                                List<MarketplacePersonalisedSegment> list = marketplacePersonalised.c;
                                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                                for (MarketplacePersonalisedSegment marketplaceHorizontalList : list) {
                                    if (marketplaceHorizontalList instanceof MarketplaceHorizontalList) {
                                        ProductListFeedTrolleyUpdater productListFeedTrolleyUpdater = marketplacePersonalisedViewModel2.h;
                                        MarketplaceHorizontalList marketplaceHorizontalList2 = (MarketplaceHorizontalList) marketplaceHorizontalList;
                                        List list2 = marketplaceHorizontalList2.h;
                                        productListFeedTrolleyUpdater.getClass();
                                        marketplaceHorizontalList = new MarketplaceHorizontalList(marketplaceHorizontalList2.d, marketplaceHorizontalList2.e, marketplaceHorizontalList2.f, marketplaceHorizontalList2.g, ProductListFeedTrolleyUpdater.c(list2, trolleyResult));
                                    }
                                    arrayList.add(marketplaceHorizontalList);
                                }
                                MarketplaceLandingPageName pageName = marketplacePersonalised.f7473a;
                                String str = marketplacePersonalised.b;
                                Intrinsics.h(pageName, "pageName");
                                marketplacePersonalisedViewModel2.s6(mutableStateFlow, ((MarketplacePersonalisedContract.ViewState) mutableStateFlow.getValue()).b, new MarketplacePersonalised(pageName, str, arrayList));
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (stateFlowV.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public MarketplacePersonalisedViewModel(AnalyticsManager analyticsManager, MarketplaceInteractor marketplaceInteractor, TrolleyInteractor trolleyInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        this.e = analyticsManager;
        this.f = marketplaceInteractor;
        this.g = trolleyInteractor;
        this.h = new ProductListFeedTrolleyUpdater();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(MarketplacePersonalisedContract.ViewState.e);
        this.j = mutableStateFlowA;
        this.k = sharedFlowImplB;
        this.l = mutableStateFlowA;
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public static MarketplacePersonalised q6(Marketplace marketplace) {
        Object next;
        Iterator it = marketplace.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MarketplaceSection) next) instanceof MarketplacePersonalised) {
                break;
            }
        }
        if (next instanceof MarketplacePersonalised) {
            return (MarketplacePersonalised) next;
        }
        return null;
    }

    public static void t6(MutableStateFlow mutableStateFlow, boolean z, MarketplaceErrorState marketplaceErrorState) {
        mutableStateFlow.setValue(new MarketplacePersonalisedContract.ViewState(z, ((MarketplacePersonalisedContract.ViewState) mutableStateFlow.getValue()).b, ((MarketplacePersonalisedContract.ViewState) mutableStateFlow.getValue()).c, marketplaceErrorState));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.e.i(MarketplaceAnalytics.Landing.Action.e, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.i.f(new MarketplacePersonalisedContract.Action.LaunchAddOrUpdateProduct(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        this.i.f(new MarketplacePersonalisedContract.Action.LaunchProductDetails(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.e.i(MarketplaceAnalytics.Landing.Action.d, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.i.f(new MarketplacePersonalisedContract.Action.LaunchAddOrUpdateProduct(productCardTileData));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        p6();
    }

    public final void p6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new MarketplacePersonalisedViewModel$fetchPersonalised$1(this, null), 3);
    }

    public final void r6(InfoSection infoSection) {
        Intrinsics.h(infoSection, "infoSection");
        String title = infoSection.getTitle();
        if (title != null) {
            this.e.c(new MarketplaceActions.ButtonClick(title));
        }
        this.i.f(new MarketplacePersonalisedContract.Action.LaunchInfoSection(infoSection));
    }

    public final void s6(MutableStateFlow mutableStateFlow, InfoHeader infoHeader, MarketplacePersonalised marketplacePersonalised) {
        MarketplaceErrorState marketplaceErrorState = null;
        List list = marketplacePersonalised != null ? marketplacePersonalised.c : null;
        if (list == null || list.isEmpty()) {
            if ((infoHeader != null ? infoHeader.c : null) == null) {
                this.e.c(MarketplaceActions.NoResultsError.f);
                marketplaceErrorState = MarketplaceErrorState.f;
            }
        }
        mutableStateFlow.setValue(new MarketplacePersonalisedContract.ViewState(false, infoHeader, marketplacePersonalised, marketplaceErrorState));
    }

    @Override // au.com.woolworths.promotion.banner.ui.PromotionBannerListener
    public final void z3(PromotionBanner promotionBanner) {
        PromotionBannerAction promotionBannerAction = promotionBanner.b;
        boolean z = promotionBannerAction instanceof PromotionBannerAction.Link;
        SharedFlowImpl sharedFlowImpl = this.i;
        if (z) {
            sharedFlowImpl.f(new MarketplacePersonalisedContract.Action.OpenUrl(((PromotionBannerAction.Link) promotionBannerAction).d));
        } else if (promotionBannerAction instanceof PromotionBannerAction.LaunchPromotionDetails) {
            sharedFlowImpl.f(new MarketplacePersonalisedContract.Action.LaunchPromotionScreen(((PromotionBannerAction.LaunchPromotionDetails) promotionBannerAction).d));
        } else if (!promotionBannerAction.equals(PromotionBannerAction.None.d)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
