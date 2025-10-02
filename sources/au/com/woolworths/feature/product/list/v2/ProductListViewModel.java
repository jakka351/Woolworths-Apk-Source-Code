package au.com.woolworths.feature.product.list.v2;

import androidx.compose.runtime.Stable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.product.list.v2.ProductListUiEffect;
import au.com.woolworths.feature.product.list.v2.ui.ProductsDisplayMode;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Factory", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListViewModel extends ViewModel implements ProductClickListener {
    public final Activities.ProductList.Extras e;
    public final CartUpdateInteractor f;
    public final CollectionModeInteractor g;
    public final FeatureToggleManager h;
    public final InstoreNavigationInteractor i;
    public final ProductListInteractorImpl j;
    public final ProductListPaginationAdapter k;
    public final ShopAppRegionInteractor l;
    public final WatchlistInteractor m;
    public ProductListPagingSource n;
    public final Flow o;
    public final MutableStateFlow p;
    public final StateFlow q;
    public final SharedFlowImpl r;
    public final Flow s;
    public final a t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.v2.ProductListViewModel$2", f = "ProductListViewModel.kt", l = {139}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.v2.ProductListViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return Unit.f24250a;
            }
            ResultKt.b(obj);
            final ProductListViewModel productListViewModel = ProductListViewModel.this;
            Flow flow = productListViewModel.f.l;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.v2.ProductListViewModel.2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Object value;
                    int iIntValue = ((Number) obj2).intValue();
                    MutableStateFlow mutableStateFlow = productListViewModel.p;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value, ProductListUiState.a((ProductListUiState) value, null, null, false, false, new Integer(iIntValue), false, null, null, null, 495)));
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            flow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.v2.ProductListViewModel$3", f = "ProductListViewModel.kt", l = {152}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.v2.ProductListViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListViewModel.this.new AnonymousClass3(continuation);
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
                final ProductListViewModel productListViewModel = ProductListViewModel.this;
                Flow flowR = FlowKt.r(productListViewModel.m.e);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.v2.ProductListViewModel.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object value;
                        List list = (List) obj2;
                        MutableStateFlow mutableStateFlow = productListViewModel.p;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value, ProductListUiState.a((ProductListUiState) value, null, null, false, false, null, false, null, null, list, 255)));
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowR.collect(flowCollector, this) == coroutineSingletons) {
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

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListViewModel$Factory;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        ProductListViewModel a(Activities.ProductList.Extras extras);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5523a;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                ActionType actionType = ActionType.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5523a = iArr;
        }
    }

    public ProductListViewModel(Activities.ProductList.Extras extras, CartUpdateInteractor cartUpdateInteractor, CollectionModeInteractor collectionModeInteractor, FeatureToggleManager featureToggleManager, InstoreNavigationInteractor instoreNavigationInteractor, ProductListInteractorImpl productListInteractorImpl, ProductListPaginationAdapter productListPaginationAdapter, ShopAppRegionInteractor shopAppRegionInteractor, WatchlistInteractor watchlistInteractor) {
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        this.e = extras;
        this.f = cartUpdateInteractor;
        this.g = collectionModeInteractor;
        this.h = featureToggleManager;
        this.i = instoreNavigationInteractor;
        this.j = productListInteractorImpl;
        this.k = productListPaginationAdapter;
        this.l = shopAppRegionInteractor;
        this.m = watchlistInteractor;
        this.o = CachedPagingDataKt.a(new Pager(new PagingConfig(5, 10, 5, 48, false), new androidx.lifecycle.a(this, 21)).f3571a, ViewModelKt.a(this));
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ProductListUiState.j);
        this.p = mutableStateFlowA;
        this.q = mutableStateFlowA;
        boolean z = false;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.r = sharedFlowImplB;
        this.s = FlowKt.a(sharedFlowImplB);
        while (true) {
            Object value = mutableStateFlowA.getValue();
            ProductListUiState productListUiState = (ProductListUiState) value;
            String str = this.e.d.d;
            boolean z2 = (this.f.b.z() && this.e.e.getE().i) ? true : z;
            boolean z3 = this.e.e.getE().g == Activities.ProductList.ToolbarType.d ? true : z;
            boolean z4 = (this.h.c(BaseShopAppFeature.h0) && this.e.e.getE().k && this.l.b() != Region.j) ? true : z;
            String string = this.j.f5401a.c.getString("product_list_display_mode", null);
            if (mutableStateFlowA.d(value, ProductListUiState.a(productListUiState, str, null, z2, z3, null, z4, ProductsDisplayMode.valueOf(string == null ? "GRID" : string), ProductCardConfig.copy$default(ProductCardConfig.INSTANCE.getDefault(), this.g.b(), false, !(this.e.e instanceof Activities.ProductList.ExtrasBySearchAlternative), this.h.c(BaseShopAppFeature.v), this.h.c(BaseShopAppFeature.h), this.i.d(), Integer.valueOf(this.l.b() == Region.j ? 2 : 1), 2, null), null, 274))) {
                BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
                BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
                this.t = new a(this, 0);
                return;
            }
            z = false;
        }
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        this.r.f(new ProductListUiEffect.LaunchProductDetails(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T0(ProductCard productCardData) {
        Intrinsics.h(productCardData, "productCardData");
        this.r.f(new ProductListUiEffect.LaunchInstoreMap(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        WatchlistInteractor watchlistInteractor = this.m;
        boolean zC = watchlistInteractor.c();
        SharedFlowImpl sharedFlowImpl = this.r;
        if (zC) {
            sharedFlowImpl.f(ProductListUiEffect.LaunchWatchlistGuestOnboardingScreen.f5507a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        if (ProductCardExtKt.t(productCardData, ((ProductListUiState) this.q.getValue()).i)) {
            watchlistInteractor.d(productCardData);
            sharedFlowImpl.f(new ProductListUiEffect.DisplaySnackbarForWatchlist(strB, new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), false, productCardData));
        } else {
            watchlistInteractor.a(productCardData);
            sharedFlowImpl.f(new ProductListUiEffect.DisplaySnackbarForWatchlist(strB, new ResText(com.woolworths.R.string.watchlist_product_added_snackbar_message), true, productCardData));
        }
    }

    public final void p6(String str) {
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.e.e;
        Activities.ProductList.ExtrasBySearchAlternative extrasBySearchAlternative = extraProductListSource instanceof Activities.ProductList.ExtrasBySearchAlternative ? (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSource : null;
        Object obj = extrasBySearchAlternative != null ? extrasBySearchAlternative.f : null;
        this.r.f(new ProductListUiEffect.LaunchProductSearch(obj instanceof ProductCard ? (ProductCard) obj : null, str));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void u3(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.r.f(new ProductListUiEffect.LaunchProductAvailability(productCardTileData));
    }
}
