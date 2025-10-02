package au.com.woolworths.feature.product.list;

import android.content.SharedPreferences;
import android.os.Parcelable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.analytics.supers.local.QuantitySelectorAnalytics;
import au.com.woolworths.analytics.supers.local.QuantitySelectorAnalytics$QuantitySelector$Action$replaceInitiated$1;
import au.com.woolworths.analytics.supers.products.ProductGroupAnalytics;
import au.com.woolworths.analytics.supers.products.ProductGroupAnalytics$ProductGroupPage$Action$Companion$insetBannerImpression$1;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics$ZeroPageResult$Action$productClick$1;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics$ZeroPageResult$Action$replaceInitiated$1;
import au.com.woolworths.analytics.supers.recipes.shoparecipe.ShopARecipeAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.ReleaseSettingsInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler;
import au.com.woolworths.base.shopapp.modules.search.SearchKeywordType;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import au.com.woolworths.feature.product.list.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.data.CustomMessage;
import au.com.woolworths.feature.product.list.data.FullScreenMessage;
import au.com.woolworths.feature.product.list.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.data.PopupMessage;
import au.com.woolworths.feature.product.list.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.data.ZeroResultPageData;
import au.com.woolworths.feature.product.list.errorstates.ProductListErrorState;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.feature.shop.contentpage.data.HorizontalListData;
import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.domain.MapFeatureHighlightStatusInteractorImpl;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCard;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdBannerCardKt;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.instore.navigation.AnalyticsManagerExtKt;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.nhp.datasource.EdrOfferBoosterImpl;
import au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.productreview.ReplaceProductResultRouter;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

@HiltViewModel
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Lau/com/woolworths/feature/product/list/ProductListClickHandler;", "Lau/com/woolworths/android/onesite/dynamicsizecard/listeners/DynamicSizeCardClickListener;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerClickListener;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonClickHandler;", "Factory", "ProductListingEvent", "Companion", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListViewModel extends ViewModel implements FullPageErrorStateClickHandler, ProductClickListener, ProductListClickHandler, DynamicSizeCardClickListener, InsetBannerClickListener, ButtonClickHandler {
    public final SharedFlowImpl A;
    public final Flow B;
    public final MediatorLiveData C;
    public Activities.ProductList.Extras D;
    public final List E;
    public final Object F;
    public ProductListPagingSource G;
    public final Flow H;
    public final SharedFlow I;
    public final SharedFlow J;
    public Activities.ProductList.ExtraProductListSource K;
    public ProductsDisplayMode L;
    public final Lazy M;
    public final Lazy N;
    public ProductCard O;
    public boolean P;
    public boolean Q;
    public float R;
    public final ArrayList S;
    public final ProductListInteractor e;
    public final ProductListPaginationAdapter f;
    public final ShopAccountInteractor g;
    public final AnalyticsManager h;
    public final GoogleAdManagerInteractor i;
    public final FeatureToggleManager j;
    public final RepositoryManager k;
    public final ProductBoostInteractor l;
    public final RewardsOfferActivationInteractor m;
    public final InstoreNavigationInteractor n;
    public final ReplaceProductResultRouter o;
    public final WatchlistInteractor p;
    public final MapFeatureHighlightStatusInteractorImpl q;
    public final ShopAppRegionInteractor r;
    public final EdrOfferBoosterImpl s;
    public final CartUpdateInteractor t;
    public final ReleaseSettingsInteractorImpl u;
    public final CompletableDeferred v;
    public final ProductListFeedTrolleyUpdater w;
    public final CompositeDisposable x;
    public final SharedFlowImpl y;
    public final Flow z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$2", f = "ProductListViewModel.kt", l = {407}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ TrolleyInteractor q;
        public final /* synthetic */ ProductListViewModel r;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", lqlqqlq.m006Dm006Dm006Dm, "Lau/com/woolworths/android/onesite/rxutils/Result;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$2$2", f = "ProductListViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$2$2, reason: invalid class name and collision with other inner class name */
        final class C01042 extends SuspendLambda implements Function2<Result<? extends TrolleyResult>, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ProductListViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01042(ProductListViewModel productListViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = productListViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01042 c01042 = new C01042(this.q, continuation);
                c01042.p = obj;
                return c01042;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C01042 c01042 = (C01042) create((Result) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c01042.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ZeroResultPageData zeroResultPageDataCopy$default;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                Result result = (Result) this.p;
                ProductListViewModel productListViewModel = this.q;
                MediatorLiveData mediatorLiveData = productListViewModel.C;
                ProductListInteractor productListInteractor = productListViewModel.e;
                Object obj2 = result.f4591a;
                TrolleyResult trolleyResult = (TrolleyResult) obj2;
                if (trolleyResult != null) {
                    List listA = productListInteractor.o;
                    if (listA == null) {
                        listA = productListViewModel.I.a();
                    }
                    if (listA != null) {
                        productListViewModel.w.getClass();
                        productListInteractor.o = ProductListFeedTrolleyUpdater.b(listA, trolleyResult);
                    }
                }
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
                if (viewState != null) {
                    ZeroResultPageData zeroResultPageData = viewState.s;
                    if (zeroResultPageData != null) {
                        Intrinsics.e(obj2);
                        TrolleyResult trolleyResult2 = (TrolleyResult) obj2;
                        List<Object> items = zeroResultPageData.getItems();
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(items, 10));
                        for (Object objA : items) {
                            if (objA instanceof HorizontalListData) {
                                HorizontalListData horizontalListData = (HorizontalListData) objA;
                                objA = HorizontalListData.a(horizontalListData, ProductListFeedTrolleyUpdater.b(CollectionsKt.B(horizontalListData.getH()), trolleyResult2));
                            }
                            arrayList.add(objA);
                        }
                        zeroResultPageDataCopy$default = ZeroResultPageData.copy$default(zeroResultPageData, null, null, null, arrayList, 7, null);
                    } else {
                        zeroResultPageDataCopy$default = null;
                    }
                    ZeroResultPageData zeroResultPageData2 = zeroResultPageDataCopy$default;
                    ProductListZeroResults productListZeroResultsCopy$default = viewState.t;
                    if (productListZeroResultsCopy$default instanceof ProductListZeroResults.ZeroResultData) {
                        ProductListZeroResults.ZeroResultData zeroResultData = (ProductListZeroResults.ZeroResultData) productListZeroResultsCopy$default;
                        Intrinsics.e(obj2);
                        TrolleyResult trolleyResult3 = (TrolleyResult) obj2;
                        List<Object> items2 = zeroResultData.getItems();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(items2, 10));
                        for (Object objA2 : items2) {
                            if (objA2 instanceof HorizontalListData) {
                                HorizontalListData horizontalListData2 = (HorizontalListData) objA2;
                                objA2 = HorizontalListData.a(horizontalListData2, ProductListFeedTrolleyUpdater.b(CollectionsKt.B(horizontalListData2.getH()), trolleyResult3));
                            }
                            arrayList2.add(objA2);
                        }
                        productListZeroResultsCopy$default = ProductListZeroResults.ZeroResultData.copy$default(zeroResultData, null, null, null, arrayList2, 7, null);
                    }
                    ProductListViewModel.H6(productListViewModel, mediatorLiveData, 0, null, null, null, null, null, null, null, null, null, zeroResultPageData2, productListZeroResultsCopy$default, null, null, viewState.y, null, 57147391);
                }
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TrolleyInteractor trolleyInteractor, ProductListViewModel productListViewModel, Continuation continuation) {
            super(2, continuation);
            this.q = trolleyInteractor;
            this.r = productListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, this.r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                final StateFlow stateFlowV = this.q.getP();
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01042(this.r, null), new Flow<Result<? extends TrolleyResult>>() { // from class: au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "ProductListViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1
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
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = stateFlowV.collect(new AnonymousClass2(flowCollector), continuation);
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
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$3", f = "ProductListViewModel.kt", l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$3, reason: invalid class name */
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
        public final Object invokeSuspend(Object obj) throws Throwable {
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
            SharedFlowImpl sharedFlowImpl = productListViewModel.l.c;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.ProductListViewModel.3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    List list = (List) obj2;
                    ProductListViewModel productListViewModel2 = productListViewModel;
                    ProductListInteractor productListInteractor = productListViewModel2.e;
                    List listA = productListInteractor.o;
                    if (listA == null) {
                        listA = productListViewModel2.I.a();
                    }
                    if (listA != null) {
                        productListInteractor.o = ProductAnalyticsExtKt.i(listA, list);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            sharedFlowImpl.getClass();
            SharedFlowImpl.m(sharedFlowImpl, flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$4", f = "ProductListViewModel.kt", l = {417}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
            ProductListViewModel productListViewModel = ProductListViewModel.this;
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = productListViewModel.m;
            j jVar = new j(productListViewModel, 1);
            this.p = 1;
            rewardsOfferActivationInteractor.c(jVar, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$5", f = "ProductListViewModel.kt", l = {428}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListViewModel.this.new AnonymousClass5(continuation);
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
                final ProductListViewModel productListViewModel = ProductListViewModel.this;
                Flow flowQ = FlowKt.q(productListViewModel.e.n, new androidx.navigation.compose.h(23, (byte) 0));
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.ProductListViewModel.5.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        CustomMessage customMessage = (CustomMessage) obj2;
                        ProductListViewModel productListViewModel2 = productListViewModel;
                        AnalyticsManager analyticsManager = productListViewModel2.h;
                        if (customMessage instanceof PopupMessage) {
                            PopupMessage popupMessage = (PopupMessage) customMessage;
                            productListViewModel2.y.f(new ProductListContract.Actions.DisplayPopupMessage(popupMessage));
                            TrackingMetadata trackingMetadataR6 = productListViewModel2.r6();
                            TrackableValue trackableValue = TrackableValue.o0;
                            String title = popupMessage.getTitle();
                            if (title == null) {
                                title = "";
                            }
                            trackingMetadataR6.b(trackableValue, title);
                            analyticsManager.j(ProductListActions.UserMessageImpression.e, trackingMetadataR6);
                        } else {
                            if (!(customMessage instanceof FullScreenMessage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FullScreenMessage fullScreenMessage = (FullScreenMessage) customMessage;
                            ProductListViewModel.H6(productListViewModel2, productListViewModel2.C, 0, fullScreenMessage, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108735);
                            TrackingMetadata trackingMetadataR62 = productListViewModel2.r6();
                            TrackableValue trackableValue2 = TrackableValue.o0;
                            String title2 = fullScreenMessage.getTitle();
                            if (title2 == null) {
                                title2 = "";
                            }
                            trackingMetadataR62.b(trackableValue2, title2);
                            analyticsManager.j(ProductListActions.FullScreenMessageImpression.e, trackingMetadataR62);
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowQ.collect(flowCollector, this) == coroutineSingletons) {
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
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$6", f = "ProductListViewModel.kt", l = {436}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$6, reason: invalid class name */
    final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListViewModel.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
            Flow flow = productListViewModel.t.l;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.ProductListViewModel.6.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    int iIntValue = ((Number) obj2).intValue();
                    ProductListViewModel productListViewModel2 = productListViewModel;
                    ProductListViewModel.H6(productListViewModel2, productListViewModel2.C, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Integer(iIntValue), 33554431);
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            flow.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListViewModel$Companion;", "", "", "AddToListSnackbarEventDescription", "Ljava/lang/String;", "EdrOfferBoostingErrorMessage", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListViewModel$Factory;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        ProductListViewModel a(Activities.ProductList.Extras extras);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/ProductListViewModel$ProductListingEvent;", "", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListingEvent {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5262a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ButtonActionApiData.values().length];
            try {
                iArr[ButtonActionApiData.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5262a = iArr;
            int[] iArr2 = new int[ActionType.values().length];
            try {
                ActionType actionType = ActionType.d;
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr2;
        }
    }

    public ProductListViewModel(Activities.ProductList.Extras extras, ProductListInteractor productListInteractor, ProductListPaginationAdapter productListPaginationAdapter, ShopAccountInteractor accountInteractor, AnalyticsManager analyticsManager, TrolleyInteractor trolleyInteractor, GoogleAdManagerInteractor googleAdManagerInteractor, FeatureToggleManager featureToggleManager, RepositoryManager repositoryManager, ProductBoostInteractor productBoostInteractor, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, InstoreNavigationInteractor instoreNavigationInteractor, ReplaceProductResultRouter replaceProductResultRouter, WatchlistInteractor watchlistInteractor, MapFeatureHighlightStatusInteractorImpl mapFeatureHighlightStatusInteractorImpl, ShopAppRegionInteractor shopAppRegionInteractor, EdrOfferBoosterImpl edrOfferBoosterImpl, CartUpdateInteractor cartUpdateInteractor, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl) {
        Intrinsics.h(productListInteractor, "productListInteractor");
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(replaceProductResultRouter, "replaceProductResultRouter");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = productListInteractor;
        this.f = productListPaginationAdapter;
        this.g = accountInteractor;
        this.h = analyticsManager;
        this.i = googleAdManagerInteractor;
        this.j = featureToggleManager;
        this.k = repositoryManager;
        this.l = productBoostInteractor;
        this.m = rewardsOfferActivationInteractor;
        this.n = instoreNavigationInteractor;
        this.o = replaceProductResultRouter;
        this.p = watchlistInteractor;
        this.q = mapFeatureHighlightStatusInteractorImpl;
        this.r = shopAppRegionInteractor;
        this.s = edrOfferBoosterImpl;
        this.t = cartUpdateInteractor;
        this.u = releaseSettingsInteractorImpl;
        this.v = CompletableDeferredKt.a();
        G6(extras);
        PagingConfig pagingConfig = new PagingConfig(5, 10, 5, 48, false);
        this.w = new ProductListFeedTrolleyUpdater();
        this.x = new CompositeDisposable();
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.y = sharedFlowImplB;
        this.z = FlowKt.a(sharedFlowImplB);
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.A = sharedFlowImplB2;
        this.B = FlowKt.a(sharedFlowImplB2);
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.C = mediatorLiveData;
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.K;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        Activities.ProductList.ExtrasBySearch extrasBySearch = extraProductListSource instanceof Activities.ProductList.ExtrasBySearch ? (Activities.ProductList.ExtrasBySearch) extraProductListSource : null;
        this.E = extrasBySearch != null ? extrasBySearch.f : null;
        this.F = q6().f.d;
        final Flow flowA = CachedPagingDataKt.a(new Pager(pagingConfig, new b0(this, 0)).f3571a, ViewModelKt.a(this));
        this.H = flowA;
        CloseableCoroutineScope closeableCoroutineScopeA = ViewModelKt.a(this);
        SharingStarted sharingStarted = SharingStarted.Companion.f24711a;
        this.I = FlowKt.M(flowA, closeableCoroutineScopeA, sharingStarted, 1);
        this.J = FlowKt.M(new Flow<ProductListingEvent>() { // from class: au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1$2", f = "ProductListViewModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1$2$1 r0 = (au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1$2$1 r0 = new au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L49
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        androidx.paging.PagingData r5 = (androidx.paging.PagingData) r5
                        au.com.woolworths.feature.product.list.ProductListViewModel$ProductListingEvent r6 = new au.com.woolworths.feature.product.list.ProductListViewModel$ProductListingEvent
                        java.lang.String r2 = "data"
                        kotlin.jvm.internal.Intrinsics.h(r5, r2)
                        r6.<init>()
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r5 = r4.d
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L49
                        return r1
                    L49:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, ViewModelKt.a(this), sharingStarted, 1);
        String string = productListInteractor.f5251a.f5265a.getString("product_list_display_mode", null);
        this.L = ProductsDisplayMode.valueOf(string == null ? "GRID" : string);
        this.M = LazyKt.b(new b0(this, 1));
        this.N = LazyKt.b(new b0(this, 2));
        this.S = new ArrayList();
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$1$1(this, mediatorLiveData, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$addWatchlistObserver$1(this, mediatorLiveData, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(trolleyInteractor, this, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass4(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass5(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass6(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[EDGE_INSN: B:215:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:20:0x0067->B:216:0x0067]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void H6(au.com.woolworths.feature.product.list.ProductListViewModel r32, androidx.lifecycle.MediatorLiveData r33, int r34, au.com.woolworths.feature.product.list.data.FullScreenMessage r35, au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState r36, au.com.woolworths.feature.product.list.ProductListContract.CoachMark r37, java.util.List r38, java.lang.String r39, java.lang.String r40, java.util.List r41, java.lang.String r42, java.util.List r43, au.com.woolworths.feature.product.list.data.ZeroResultPageData r44, au.com.woolworths.feature.product.list.data.ProductListZeroResults r45, au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState r46, au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState r47, java.util.List r48, java.lang.Integer r49, int r50) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.ProductListViewModel.H6(au.com.woolworths.feature.product.list.ProductListViewModel, androidx.lifecycle.MediatorLiveData, int, au.com.woolworths.feature.product.list.data.FullScreenMessage, au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState, au.com.woolworths.feature.product.list.ProductListContract$CoachMark, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, au.com.woolworths.feature.product.list.data.ZeroResultPageData, au.com.woolworths.feature.product.list.data.ProductListZeroResults, au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState, au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState, java.util.List, java.lang.Integer, int):void");
    }

    public static final BoostAllBannerState p6(ProductListViewModel productListViewModel, StatefulButtonState statefulButtonState) {
        BoostAllBannerState boostAllBannerState;
        Object next;
        if (productListViewModel.j.c(BaseShopAppFeature.t0)) {
            Activities.ProductList.ExtraProductListSource extraProductListSource = productListViewModel.K;
            if (extraProductListSource == null) {
                Intrinsics.p("productListSource");
                throw null;
            }
            if (extraProductListSource.getE() == Activities.ProductList.ProductListType.A) {
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) productListViewModel.C.e();
                if (viewState == null || (boostAllBannerState = viewState.i) == null) {
                    boostAllBannerState = BoostAllBannerState.f;
                }
                Iterator it = productListViewModel.I.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (next instanceof ProductCard) {
                        break;
                    }
                }
                ProductCard productCard = next instanceof ProductCard ? (ProductCard) next : null;
                if (productCard != null) {
                    RewardsOfferInfo rewardsOfferInfo = productCard.getRewardsOfferInfo();
                    if ((rewardsOfferInfo != null ? rewardsOfferInfo.getN() : null) == RewardsOfferStatus.NOT_ACTIVATED) {
                        return new BoostAllBannerState(true, new PluralResText(com.woolworths.R.plurals.shop_lists_boost_all_message, 1), new PluralResText(com.woolworths.R.plurals.shop_lists_boost_all_button_text, 1), false, statefulButtonState);
                    }
                }
                return BoostAllBannerState.a(boostAllBannerState, false, 30);
            }
        }
        return BoostAllBannerState.f;
    }

    public final void A6(ActionData actionData) {
        Intrinsics.h(actionData, "actionData");
        if (WhenMappings.b[actionData.getType().ordinal()] == 1) {
            this.y.f(new ProductListContract.Actions.LaunchDeeplink(actionData.getAction(), null));
            AnalyticsData analyticsDataC = actionData.getAnalytics();
            if (analyticsDataC != null) {
                this.h.g(AnalyticsDataKt.a(analyticsDataC));
            }
        }
    }

    public final void B6(String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
        int length = searchTerm.length();
        AnalyticsManager analyticsManager = this.h;
        if (length == 0) {
            analyticsManager.j(ProductListActions.DeleteSearchQuery.e, r6());
        } else {
            analyticsManager.j(ProductListActions.UpdateSearchQuery.e, r6());
        }
        this.y.f(new ProductListContract.Actions.LaunchProductSearch(t6(), searchTerm));
    }

    public final void C6(ProductCard productCard, boolean z) {
        InfoSection infoSection;
        PurchaseRestriction purchaseRestriction = productCard.getPurchaseRestriction();
        PurchaseRestriction purchaseRestriction2 = PurchaseRestriction.LEGAL_AGE_RESTRICTION;
        SharedFlowImpl sharedFlowImpl = this.y;
        if (purchaseRestriction == purchaseRestriction2) {
            ShopAccountInteractor shopAccountInteractor = this.g;
            if (!shopAccountInteractor.K()) {
                sharedFlowImpl.f(new ProductListContract.Actions.DisplayRestrictedItemPrompt(productCard, shopAccountInteractor.d()));
                return;
            }
        }
        ProductListInteractor productListInteractor = this.e;
        BottomSheetContent.Marketplace marketplace = productListInteractor.q;
        Pair pair = null;
        if (marketplace != null && (infoSection = productListInteractor.r) != null) {
            pair = new Pair(marketplace, infoSection);
        }
        if (!z || productCard.getMarketplace() == null || !productListInteractor.f.f8753a.getBoolean("education_bottom_sheet", true) || pair == null) {
            sharedFlowImpl.f(new ProductListContract.Actions.LaunchProductAddOrReplace(productCard, u6(), s6(), t6()));
        } else {
            sharedFlowImpl.f(new ProductListContract.Actions.LaunchEducationBottomSheet((BottomSheetContent.Marketplace) pair.d, (InfoSection) pair.e));
        }
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.O = productCardTileData;
        D6(productCardTileData, true);
    }

    public final void D6(ProductCard productCardTileData, boolean z) {
        InfoSection infoSection;
        ProductListInteractor productListInteractor = this.e;
        BottomSheetContent.Marketplace marketplace = productListInteractor.q;
        Pair pair = null;
        if (marketplace != null && (infoSection = productListInteractor.r) != null) {
            pair = new Pair(marketplace, infoSection);
        }
        SharedFlowImpl sharedFlowImpl = this.y;
        if (z) {
            Intrinsics.h(productCardTileData, "productCardTileData");
            if (productCardTileData.getMarketplace() != null && productListInteractor.f.f8753a.getBoolean("education_bottom_sheet", true) && pair != null) {
                sharedFlowImpl.f(new ProductListContract.Actions.LaunchEducationBottomSheet((BottomSheetContent.Marketplace) pair.d, (InfoSection) pair.e));
                return;
            }
        }
        boolean zJ6 = J6();
        AnalyticsManager analyticsManager = this.h;
        if (zJ6) {
            analyticsManager.i((Event) w6().f.d.getD(), E6(productCardTileData));
        } else {
            ProductListScreens productListScreensU6 = u6();
            analyticsManager.i((Event) new QuantitySelectorAnalytics.QuantitySelector(productListScreensU6.getD(), productListScreensU6.getE()).h.h.getD(), E6(productCardTileData));
        }
        sharedFlowImpl.f(new ProductListContract.Actions.LaunchProductUpdate(productCardTileData, u6(), s6()));
    }

    public final TrackingMetadata E6(ProductCard productCardTileData) {
        Intrinsics.h(productCardTileData, "productCardTileData");
        TrackingMetadata trackingMetadataR6 = r6();
        trackingMetadataR6.a(ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        TrackingMetadata trackingMetadataS6 = s6();
        if (trackingMetadataS6 != null) {
            trackingMetadataR6.a(trackingMetadataS6);
        }
        return trackingMetadataR6;
    }

    public final void F6() {
        H6(this, this.C, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108859);
        FlowKt.J(this.H, Long.MAX_VALUE, new FlowKt__ErrorsKt$retry$1());
    }

    public final void G1() {
        List listA = this.I.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof ProductCard) {
                arrayList.add(obj);
            }
        }
        this.h.j(ProductListActions.ProductVarietiesBoostAllClick.e, ProductAnalyticsExtKt.f(arrayList));
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$onBoostAllClicked$2(this, null), 3);
    }

    public final void G6(Activities.ProductList.Extras extras) {
        Intrinsics.h(extras, "extras");
        Activities.ProductList.ExtraProductListSource extraProductListSource = extras.e;
        this.D = extras;
        Activities.ProductList.ExtraProductListSource extraProductListSource2 = this.K;
        if (extraProductListSource2 != null) {
            if (extraProductListSource2 == null) {
                Intrinsics.p("productListSource");
                throw null;
            }
            if (Intrinsics.c(extraProductListSource2, extraProductListSource)) {
                return;
            }
        }
        this.K = extraProductListSource;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe) {
            I6(ProductsDisplayMode.d, false);
        }
        if (this.K == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        this.e.f5251a.k();
        this.v.h(Unit.f24250a);
    }

    public final void I6(ProductsDisplayMode productsDisplayMode, boolean z) {
        if (this.L == productsDisplayMode) {
            return;
        }
        this.L = productsDisplayMode;
        if (z) {
            ProductListInteractor productListInteractor = this.e;
            productListInteractor.getClass();
            SharedPreferences.Editor editorEdit = productListInteractor.f5251a.f5265a.edit();
            editorEdit.putString("product_list_display_mode", productsDisplayMode.name());
            editorEdit.apply();
        }
        this.y.f(new ProductListContract.Actions.ChangeDisplayMode(this.L));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        TrackingMetadata trackingMetadataR6 = r6();
        trackingMetadataR6.a(ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        boolean zJ6 = J6();
        AnalyticsManager analyticsManager = this.h;
        if (zJ6) {
            ZeroResultAnalytics.ZeroPageResult.Action action = w6().f;
            action.getClass();
            analyticsManager.i(new ZeroResultAnalytics$ZeroPageResult$Action$productClick$1(action, containerTitle), trackingMetadataR6);
        } else {
            ProductListScreens productListScreens = ProductListScreens.d;
            analyticsManager.j(new ProductListActions.ProductClick(), trackingMetadataR6);
        }
        this.A.f(new ProductListContract.ProductListActivityActions.LaunchProductDetails(productCardData));
    }

    public final boolean J6() {
        MediatorLiveData mediatorLiveData = this.C;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if ((viewState != null ? viewState.s : null) != null) {
            return true;
        }
        ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mediatorLiveData.e();
        return (viewState2 != null ? viewState2.t : null) != null;
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        boolean zJ6 = J6();
        AnalyticsManager analyticsManager = this.h;
        if (zJ6) {
            analyticsManager.i((Event) w6().f.c.getD(), E6(productCardTileData));
        } else {
            Activities.ProductList.ExtraProductListSource extraProductListSource = this.K;
            if (extraProductListSource == null) {
                Intrinsics.p("productListSource");
                throw null;
            }
            analyticsManager.j(extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe ? ProductListActions.AddToListFromRecipe.e : ProductListActions.AddToList.e, E6(productCardTileData));
        }
        ProductListScreens productListScreensU6 = u6();
        TrackingMetadata trackingMetadataS6 = s6();
        Activities.ProductList.ExtraProductListSource extraProductListSource2 = this.K;
        if (extraProductListSource2 != null) {
            this.y.f(new ProductListContract.Actions.LaunchAddToList(productCardTileData, productListScreensU6, trackingMetadataS6, extraProductListSource2 instanceof Activities.ProductList.ExtrasByPriceFamily));
        } else {
            Intrinsics.p("productListSource");
            throw null;
        }
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button data) {
        String url;
        Intrinsics.h(data, "data");
        ButtonActionApiData action = data.getAction();
        if ((action == null ? -1 : WhenMappings.f5262a[action.ordinal()]) != 1 || (url = data.getUrl()) == null) {
            return;
        }
        ProductListActions.FullScreenMessageCTAClick fullScreenMessageCTAClick = ProductListActions.FullScreenMessageCTAClick.e;
        TrackingMetadata trackingMetadataR6 = r6();
        trackingMetadataR6.b(TrackableValue.o0, data.getLabel());
        this.h.j(fullScreenMessageCTAClick, trackingMetadataR6);
        this.y.f(new ProductListContract.Actions.NavigateToLink(url));
        this.P = true;
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void Q2(String containerTitle, String priceFamilyId) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        this.h.j(ProductListActions.ProductVarietiesClick.e, r6());
        this.y.f(new ProductListContract.Actions.LaunchProductVarieties(priceFamilyId));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T0(ProductCard productCardData) {
        Intrinsics.h(productCardData, "productCardData");
        ProductListScreens productListScreensU6 = u6();
        AnalyticsManagerExtKt.a(this.h, productListScreensU6.getD(), null, productListScreensU6.getE(), productCardData);
        this.A.f(new ProductListContract.ProductListActivityActions.LaunchInstoreMap(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        String string;
        String string2;
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.O = productCardTileData;
        ProductCard productCardT6 = t6();
        AnalyticsManager analyticsManager = this.h;
        if (productCardT6 != null) {
            String str = "";
            if (J6()) {
                ZeroResultAnalytics.ZeroPageResult.Action action = w6().f;
                List listQ = CollectionsKt.Q(productCardT6.getProductId());
                List listQ2 = CollectionsKt.Q(productCardTileData.getProductId());
                List listQ3 = CollectionsKt.Q(productCardTileData.getName());
                if (productCardTileData.getPrice() != null && (string2 = Float.valueOf(r13.intValue() / 100.0f).toString()) != null) {
                    str = string2;
                }
                List listQ4 = CollectionsKt.Q(str);
                action.getClass();
                analyticsManager.g(new ZeroResultAnalytics$ZeroPageResult$Action$replaceInitiated$1(action, listQ, listQ2, listQ3, listQ4));
            } else {
                ProductListScreens productListScreensU6 = u6();
                QuantitySelectorAnalytics.QuantitySelector quantitySelector = new QuantitySelectorAnalytics.QuantitySelector(productListScreensU6.getD(), productListScreensU6.getE());
                List listQ5 = CollectionsKt.Q(productCardT6.getProductId());
                List listQ6 = CollectionsKt.Q(productCardTileData.getProductId());
                List listQ7 = CollectionsKt.Q(productCardTileData.getName());
                if (productCardTileData.getPrice() != null && (string = Float.valueOf(r13.intValue() / 100.0f).toString()) != null) {
                    str = string;
                }
                List listQ8 = CollectionsKt.Q(str);
                QuantitySelectorAnalytics.QuantitySelector.Action action2 = quantitySelector.h;
                action2.getClass();
                analyticsManager.g(new QuantitySelectorAnalytics$QuantitySelector$Action$replaceInitiated$1(action2, listQ5, listQ6, listQ7, listQ8));
            }
        } else if (J6()) {
            analyticsManager.i((Event) w6().f.b.getD(), E6(productCardTileData));
        } else {
            ProductListScreens productListScreensU62 = u6();
            analyticsManager.i((Event) new QuantitySelectorAnalytics.QuantitySelector(productListScreensU62.getD(), productListScreensU62.getE()).h.g.getD(), E6(productCardTileData));
        }
        C6(productCardTileData, true);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g5(ProductCard productCardTileData, String containerTitle) {
        ButtonApiData button;
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        InStoreAvailabilityInfo inStoreAvailabilityInfo = productCardTileData.getInStoreAvailabilityInfo();
        String label = (inStoreAvailabilityInfo == null || (button = inStoreAvailabilityInfo.getButton()) == null) ? null : button.getLabel();
        if (label == null) {
            label = "";
        }
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.K;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        this.h.j(extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe ? new ProductListActions.ShowAvailabilityInfoFromRecipe(label) : new ProductListActions.ShowAvailabilityInfo(label), E6(productCardTileData));
        this.y.f(new ProductListContract.Actions.LaunchAvailabilityMessage(productCardTileData, u6(), s6()));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        WatchlistInteractor watchlistInteractor = this.p;
        boolean zC = watchlistInteractor.c();
        SharedFlowImpl sharedFlowImpl = this.y;
        if (zC) {
            sharedFlowImpl.f(ProductListContract.Actions.LaunchWatchlistGuestOnboardingScreen.f5234a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.C.e();
        boolean zT = ProductCardExtKt.t(productCardData, viewState != null ? viewState.r : null);
        AnalyticsManager analyticsManager = this.h;
        if (zT) {
            analyticsManager.j(ProductListActions.RemoveFromWatchlistClick.e, E6(productCardData));
            watchlistInteractor.d(productCardData);
            sharedFlowImpl.f(new ProductListContract.Actions.DisplaySnackbarForWatchlist(strB, new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), false, productCardData));
        } else {
            analyticsManager.j(ProductListActions.SaveToWatchlistClick.e, E6(productCardData));
            watchlistInteractor.a(productCardData);
            sharedFlowImpl.f(new ProductListContract.Actions.DisplaySnackbarForWatchlist(strB, new ResText(com.woolworths.R.string.watchlist_product_added_snackbar_message), true, productCardData));
        }
    }

    @Override // au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener
    public final void m(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof GoogleAdBannerCard;
        AnalyticsManager analyticsManager = this.h;
        SharedFlowImpl sharedFlowImpl = this.y;
        if (!z) {
            if (data instanceof ActionableCard) {
                ActionableCard actionableCard = (ActionableCard) data;
                ProductListActions.ActionableCardClick actionableCardClick = ProductListActions.ActionableCardClick.e;
                TrackingMetadata trackingMetadataA = ActionableCardKt.a(actionableCard);
                String strV6 = v6();
                if (strV6 != null) {
                    trackingMetadataA.b(TrackableValue.J2, strV6);
                }
                trackingMetadataA.a(r6());
                analyticsManager.j(actionableCardClick, trackingMetadataA);
                sharedFlowImpl.f(new ProductListContract.Actions.HandleBannerClick(actionableCard.getLink()));
                return;
            }
            return;
        }
        GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$onGoogleAdBannerClicked$1(this, googleAdBannerCard, null), 3);
        ProductListActions.GoogleAdBannerClick googleAdBannerClick = ProductListActions.GoogleAdBannerClick.e;
        TrackingMetadata trackingMetadataA2 = GoogleAdBannerCardKt.a(googleAdBannerCard);
        String strV62 = v6();
        if (strV62 != null) {
            trackingMetadataA2.b(TrackableValue.J2, strV62);
        }
        trackingMetadataA2.a(r6());
        analyticsManager.j(googleAdBannerClick, trackingMetadataA2);
        String strG = googleAdBannerCard.getCtaUrl();
        String strK = googleAdBannerCard.getTargetId();
        if (strG != null && strG.length() != 0) {
            sharedFlowImpl.f(new ProductListContract.Actions.HandleBannerClick(strG));
        } else if (strK != null) {
            sharedFlowImpl.f(new ProductListContract.Actions.LaunchProductListProductGroup(strK, googleAdBannerCard.getTitle(), googleAdBannerCard.getTargetType()));
        }
    }

    @Override // au.com.woolworths.feature.product.list.ProductListClickHandler
    public final void o2(IngredientCardApiData ingredientCardApiData) {
        List listA = this.e.o;
        if (listA == null) {
            listA = this.I.a();
        }
        if (listA == null) {
            return;
        }
        Iterator it = listA.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.c(it.next(), ingredientCardApiData)) {
                break;
            } else {
                i++;
            }
        }
        Object obj = listA.get(i + 1);
        ProductCard productCard = obj instanceof ProductCard ? (ProductCard) obj : null;
        List<ProductCard> alternativeProducts = ingredientCardApiData.getAlternativeProducts();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : alternativeProducts) {
            if (!Intrinsics.c(((ProductCard) obj2).getProductId(), productCard != null ? productCard.getProductId() : null)) {
                arrayList.add(obj2);
            }
        }
        this.h.g(ShopARecipeAnalytics.ProductList.Action.d);
        this.A.f(new ProductListContract.ProductListActivityActions.LaunchAlternativeProducts(IngredientCardApiData.copy$default(ingredientCardApiData, null, null, arrayList, null, 11, null)));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.x.e();
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener
    public final void onActionClicked(InsetBanner insetBanner) {
        Intrinsics.h(insetBanner, "insetBanner");
        InlineErrorAction action = insetBanner.getE();
        InlineErrorAction.Link link = action instanceof InlineErrorAction.Link ? (InlineErrorAction.Link) action : null;
        if (link != null) {
            String linkText = link.e;
            ProductGroupAnalytics.ProductGroupPage.Action.Companion companion = ProductGroupAnalytics.ProductGroupPage.Action.d;
            Text textA = insetBanner.getE().a();
            PlainText plainText = textA instanceof PlainText ? (PlainText) textA : null;
            String stringText = plainText != null ? plainText.getStringText() : null;
            companion.getClass();
            Intrinsics.h(linkText, "linkText");
            this.h.g(new ProductGroupAnalytics$ProductGroupPage$Action$Companion$insetBannerImpression$1(stringText, linkText));
            this.y.f(new ProductListContract.Actions.NavigateToLink(linkText));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        F6();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.C.e();
        ProductListErrorState productListErrorState = viewState != null ? viewState.c : null;
        boolean z = productListErrorState instanceof ProductListErrorState.ProductListEmptyState;
        AnalyticsManager analyticsManager = this.h;
        if (z) {
            analyticsManager.j(ProductListActions.ProductListEmptyTryAgain.e, r6());
            FlowKt.J(this.H, Long.MAX_VALUE, new FlowKt__ErrorsKt$retry$1());
        } else if (productListErrorState instanceof ProductListErrorState.ProductListConnectionError) {
            analyticsManager.j(ProductListActions.NetworkErrorTryAgain.e, r6());
            F6();
        } else {
            if (!(productListErrorState instanceof ProductListErrorState.ProductListServerError)) {
                throw new IllegalStateException("Invalid error state with secondary action");
            }
            analyticsManager.j(ProductListActions.ServerErrorTryAgain.e, r6());
            F6();
        }
    }

    public final Activities.ProductList.Extras q6() {
        Activities.ProductList.Extras extras = this.D;
        if (extras != null) {
            return extras;
        }
        Intrinsics.p("pageExtras");
        throw null;
    }

    public final TrackingMetadata r6() {
        String str;
        List list;
        TrackableValue trackableValue = TrackableValue.X1;
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.K;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        Activities.ProductList.ExtrasByProductGroup extrasByProductGroup = extraProductListSource instanceof Activities.ProductList.ExtrasByProductGroup ? (Activities.ProductList.ExtrasByProductGroup) extraProductListSource : null;
        if (extrasByProductGroup == null || (str = extrasByProductGroup.e) == null) {
            str = extraProductListSource.getE().d;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, str);
        trackingMetadataA.b(TrackableValue.W1, q6().d.d);
        MediatorLiveData mediatorLiveData = this.C;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if (viewState != null && (list = viewState.m) != null && (!list.isEmpty())) {
            Object objE = mediatorLiveData.e();
            Intrinsics.e(objE);
            trackingMetadataA.b(TrackableValue.S1, CollectionsKt.M(((ProductListContract.ViewState) objE).m, ", ", null, null, new c0(0), 30));
        }
        return trackingMetadataA;
    }

    public final TrackingMetadata s6() {
        if (J6()) {
            return TrackingMetadata.Companion.a(TrackableValue.F2, "zero-result");
        }
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.K;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        if (!(extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe)) {
            return null;
        }
        Activities.ProductList.ExtrasByRecipe extrasByRecipe = (Activities.ProductList.ExtrasByRecipe) extraProductListSource;
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.m2, extrasByRecipe.d);
        trackingMetadataA.b(TrackableValue.o2, extrasByRecipe.e);
        trackingMetadataA.b(TrackableValue.q2, extrasByRecipe.g);
        String str = extrasByRecipe.f;
        if (str != null) {
            trackingMetadataA.b(TrackableValue.p2, str);
        }
        return trackingMetadataA;
    }

    public final ProductCard t6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = q6().e;
        Activities.ProductList.ExtrasBySearchAlternative extrasBySearchAlternative = extraProductListSource instanceof Activities.ProductList.ExtrasBySearchAlternative ? (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSource : null;
        Parcelable parcelable = extrasBySearchAlternative != null ? extrasBySearchAlternative.f : null;
        if (parcelable instanceof ProductCard) {
            return (ProductCard) parcelable;
        }
        return null;
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void u3(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.A.f(new ProductListContract.ProductListActivityActions.LaunchProductAvailability(productCardTileData));
        this.h.i(ListsAnalytics.Lists.Action.h, E6(productCardTileData));
    }

    public final ProductListScreens u6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.K;
        if (extraProductListSource != null) {
            return extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe ? ProductListScreens.f : J6() ? ProductListScreens.h : ProductListScreens.e;
        }
        Intrinsics.p("productListSource");
        throw null;
    }

    public final String v6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.K;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasBySearch) {
            return ((Activities.ProductList.ExtrasBySearch) extraProductListSource).getD();
        }
        return null;
    }

    public final ZeroResultAnalytics.ZeroPageResult w6() {
        String str = q6().d.d;
        SearchKeywordType searchKeywordType = SearchKeywordType.e;
        return new ZeroResultAnalytics.ZeroPageResult(str, ProductsDisplayModeKt.a(this.L));
    }

    public final void x6(boolean z) {
        if (this.j.c(BaseShopAppFeature.M)) {
            MediatorLiveData mediatorLiveData = this.C;
            ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
            if (viewState != null) {
                H6(this, mediatorLiveData, 0, null, null, null, null, null, null, null, null, null, null, null, VideoAdPlayerState.a(viewState.u, false, false, 0L, z, false, BitmapDescriptorFactory.HUE_RED, 55), null, viewState.y, null, 56623103);
            }
        }
    }

    public final void y6(ProductListContract.CoachMark coachMark) {
        coachMark.d.invoke();
        H6(this, this.C, 0, null, null, (ProductListContract.CoachMark) CollectionsKt.i0(this.S), null, null, null, null, null, null, null, null, null, null, null, null, 67107839);
    }

    public final void z6(ProductCard productCard) {
        MapFeatureHighlightStatusInteractorImpl mapFeatureHighlightStatusInteractorImpl = this.q;
        if (mapFeatureHighlightStatusInteractorImpl.a(productCard)) {
            this.y.f(ProductListContract.Actions.ShowMapFeatureHighlight.f5238a);
            SharedPreferences.Editor editorEdit = mapFeatureHighlightStatusInteractorImpl.f7325a.f7437a.edit();
            editorEdit.putBoolean("tappableAisleFeatureHighlightShown", true);
            editorEdit.apply();
            ProductListScreens productListScreensU6 = u6();
            AnalyticsManagerExtKt.b(this.h, productListScreensU6.getD(), productListScreensU6.getE());
        }
    }
}
