package au.com.woolworths.feature.product.list.legacy;

import android.content.SharedPreferences;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.LivePagedList;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
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
import au.com.woolworths.android.onesite.analytics.TrackableErrorType;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorCode;
import au.com.woolworths.android.onesite.network.ServerErrorException;
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
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.ProductListInteractor;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListActions;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.legacy.data.CustomMessage;
import au.com.woolworths.feature.product.list.legacy.data.FullScreenMessage;
import au.com.woolworths.feature.product.list.legacy.data.IngredientAnalyticsApiData;
import au.com.woolworths.feature.product.list.legacy.data.IngredientCardApiData;
import au.com.woolworths.feature.product.list.legacy.data.PopupMessage;
import au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults;
import au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData;
import au.com.woolworths.feature.product.list.legacy.errorstates.ProductListErrorState;
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
import au.com.woolworths.pagingutils.KeyedPageData;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.pagingutils.NumericPageKeyedPagingSourceFactory;
import au.com.woolworths.pagingutils.NumericPageListing;
import au.com.woolworths.pagingutils.PageKeyedPagingSource;
import au.com.woolworths.pagingutils.PageListingKt;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.productbottomsheet.ProductListFeedTrolleyUpdater;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.product.ui.ProductMultiBuyLabel;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCardKt;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.cart.ui.productreview.ReplaceProductResultRouter;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.wallet.WalletConstants;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/product/tile/ProductClickListener;", "Lau/com/woolworths/feature/product/list/legacy/ProductListClickHandler;", "Lau/com/woolworths/android/onesite/dynamicsizecard/listeners/DynamicSizeCardClickListener;", "Lau/com/woolworths/android/onesite/modules/insetbanner/InsetBannerClickListener;", "Lau/com/woolworths/base/shopapp/modules/button/ButtonClickHandler;", "ProductListingEvent", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListViewModel extends ViewModel implements FullPageErrorStateClickHandler, ProductClickListener, ProductListClickHandler, DynamicSizeCardClickListener, InsetBannerClickListener, ButtonClickHandler {
    public final MediatorLiveData A;
    public final SharedFlow B;
    public final MediatorLiveData C;
    public final MediatorLiveData D;
    public final StateFlow E;
    public final MediatorLiveData F;
    public Activities.ProductList.Extras G;
    public Activities.ProductList.ExtraProductListSource H;
    public ProductsDisplayMode I;
    public final Lazy J;
    public final Lazy K;
    public ProductCard L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public final CompletableDeferred Q;
    public final ArrayList R;
    public final ProductListInteractor e;
    public final ShopAccountInteractor f;
    public final AnalyticsManager g;
    public final GoogleAdManagerInteractor h;
    public final FeatureToggleManager i;
    public final RepositoryManager j;
    public final ProductBoostInteractor k;
    public final RewardsOfferActivationInteractor l;
    public final InstoreNavigationInteractor m;
    public final ReplaceProductResultRouter n;
    public final WatchlistInteractor o;
    public final MapFeatureHighlightStatusInteractorImpl p;
    public final ShopAppRegionInteractor q;
    public final ReleaseSettingsInteractorImpl r;
    public final EdrOfferBoosterImpl s;
    public final ProductListFeedTrolleyUpdater t;
    public final CompositeDisposable u;
    public final SharedFlowImpl v;
    public final Flow w;
    public final SharedFlowImpl x;
    public final Flow y;
    public final MutableLiveData z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2", f = "ProductListViewModel.kt", l = {WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ TrolleyInteractor q;
        public final /* synthetic */ ProductListViewModel r;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", lqlqqlq.m006Dm006Dm006Dm, "Lau/com/woolworths/android/onesite/rxutils/Result;", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$2", f = "ProductListViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$2, reason: invalid class name and collision with other inner class name */
        final class C01202 extends SuspendLambda implements Function2<Result<? extends TrolleyResult>, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ProductListViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01202(ProductListViewModel productListViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = productListViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01202 c01202 = new C01202(this.q, continuation);
                c01202.p = obj;
                return c01202;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C01202 c01202 = (C01202) create((Result) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c01202.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ZeroResultPageData zeroResultPageDataA;
                List listZ6;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                Result result = (Result) this.p;
                ProductListViewModel productListViewModel = this.q;
                MediatorLiveData mediatorLiveData = productListViewModel.F;
                Object obj2 = result.f4591a;
                TrolleyResult trolleyResult = (TrolleyResult) obj2;
                if (trolleyResult != null && (listZ6 = productListViewModel.z6()) != null) {
                    productListViewModel.t.getClass();
                    productListViewModel.e.D(ProductListFeedTrolleyUpdater.b(listZ6, trolleyResult));
                }
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
                if (viewState != null) {
                    ZeroResultPageData zeroResultPageData = viewState.s;
                    if (zeroResultPageData != null) {
                        Intrinsics.e(obj2);
                        TrolleyResult trolleyResult2 = (TrolleyResult) obj2;
                        List list = zeroResultPageData.d;
                        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                        for (Object objA : list) {
                            if (objA instanceof HorizontalListData) {
                                HorizontalListData horizontalListData = (HorizontalListData) objA;
                                objA = HorizontalListData.a(horizontalListData, ProductListFeedTrolleyUpdater.b(CollectionsKt.B(horizontalListData.getH()), trolleyResult2));
                            }
                            arrayList.add(objA);
                        }
                        zeroResultPageDataA = ZeroResultPageData.a(zeroResultPageData, null, null, arrayList, 7);
                    } else {
                        zeroResultPageDataA = null;
                    }
                    ProductListZeroResults productListZeroResultsA = viewState.t;
                    if (productListZeroResultsA instanceof ProductListZeroResults.ZeroResultData) {
                        ProductListZeroResults.ZeroResultData zeroResultData = (ProductListZeroResults.ZeroResultData) productListZeroResultsA;
                        Intrinsics.e(obj2);
                        TrolleyResult trolleyResult3 = (TrolleyResult) obj2;
                        List list2 = zeroResultData.d;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                        for (Object objA2 : list2) {
                            if (objA2 instanceof HorizontalListData) {
                                HorizontalListData horizontalListData2 = (HorizontalListData) objA2;
                                objA2 = HorizontalListData.a(horizontalListData2, ProductListFeedTrolleyUpdater.b(CollectionsKt.B(horizontalListData2.getH()), trolleyResult3));
                            }
                            arrayList2.add(objA2);
                        }
                        productListZeroResultsA = ProductListZeroResults.ZeroResultData.a(zeroResultData, null, null, arrayList2, 7);
                    }
                    ProductListViewModel.V6(productListViewModel, mediatorLiveData, 0, null, 0, false, null, null, null, null, null, null, null, zeroResultPageDataA, productListZeroResultsA, null, null, 1703935);
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
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01202(this.r, null), new Flow<Result<? extends TrolleyResult>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "ProductListViewModel.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1$2$1
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
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
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
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$3", f = "ProductListViewModel.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$3, reason: invalid class name */
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
            SharedFlowImpl sharedFlowImpl = productListViewModel.k.c;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListViewModel.3.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    List list = (List) obj2;
                    ProductListViewModel productListViewModel2 = productListViewModel;
                    List listZ6 = productListViewModel2.z6();
                    if (listZ6 != null) {
                        productListViewModel2.e.D(ProductAnalyticsExtKt.i(listZ6, list));
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            sharedFlowImpl.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$4", f = "ProductListViewModel.kt", l = {416}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$4, reason: invalid class name */
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
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = productListViewModel.l;
            i iVar = new i(productListViewModel, 2);
            this.p = 1;
            rewardsOfferActivationInteractor.c(iVar, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$5", f = "ProductListViewModel.kt", l = {427}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$5, reason: invalid class name */
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
                Flow flowQ = FlowKt.q(productListViewModel.e.p, new a0(0));
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListViewModel.5.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        CustomMessage customMessage = (CustomMessage) obj2;
                        ProductListViewModel productListViewModel2 = productListViewModel;
                        AnalyticsManager analyticsManager = productListViewModel2.g;
                        if (customMessage instanceof PopupMessage) {
                            PopupMessage popupMessage = (PopupMessage) customMessage;
                            productListViewModel2.v.f(new ProductListContract.Actions.DisplayPopupMessage(popupMessage));
                            TrackingMetadata trackingMetadataX6 = productListViewModel2.x6();
                            TrackableValue trackableValue = TrackableValue.o0;
                            String str = popupMessage.d;
                            if (str == null) {
                                str = "";
                            }
                            trackingMetadataX6.b(trackableValue, str);
                            analyticsManager.j(ProductListActions.UserMessageImpression.e, trackingMetadataX6);
                        } else {
                            if (!(customMessage instanceof FullScreenMessage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FullScreenMessage fullScreenMessage = (FullScreenMessage) customMessage;
                            ProductListViewModel.V6(productListViewModel2, productListViewModel2.F, 0, null, 0, false, fullScreenMessage, null, null, null, null, null, null, null, null, null, null, 2097023);
                            TrackingMetadata trackingMetadataX62 = productListViewModel2.x6();
                            TrackableValue trackableValue2 = TrackableValue.o0;
                            String str2 = fullScreenMessage.d;
                            if (str2 == null) {
                                str2 = "";
                            }
                            trackingMetadataX62.b(trackableValue2, str2);
                            analyticsManager.j(ProductListActions.FullScreenMessageImpression.e, trackingMetadataX62);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListViewModel$Companion;", "", "", "AddToListSnackbarEventDescription", "Ljava/lang/String;", "EdrOfferBoostingErrorMessage", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListViewModel$ProductListingEvent;", "", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListingEvent {

        /* renamed from: a, reason: collision with root package name */
        public final NumericPageListing f5338a;
        public boolean b;

        public ProductListingEvent(NumericPageListing data) {
            Intrinsics.h(data, "data");
            this.f5338a = data;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5339a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ButtonActionApiData.values().length];
            try {
                iArr[ButtonActionApiData.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5339a = iArr;
            int[] iArr2 = new int[ActionType.values().length];
            try {
                ActionType actionType = ActionType.d;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ActionType actionType2 = ActionType.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            b = iArr2;
        }
    }

    public ProductListViewModel(ProductListInteractor productListInteractor, ShopAccountInteractor accountInteractor, AnalyticsManager analyticsManager, TrolleyInteractor trolleyInteractor, GoogleAdManagerInteractor googleAdManagerInteractor, FeatureToggleManager featureToggleManager, RepositoryManager repositoryManager, ProductBoostInteractor productBoostInteractor, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, InstoreNavigationInteractor instoreNavigationInteractor, ReplaceProductResultRouter replaceProductResultRouter, WatchlistInteractor watchlistInteractor, MapFeatureHighlightStatusInteractorImpl mapFeatureHighlightStatusInteractorImpl, ShopAppRegionInteractor shopAppRegionInteractor, ReleaseSettingsInteractorImpl releaseSettingsInteractorImpl, EdrOfferBoosterImpl edrOfferBoosterImpl) {
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
        this.e = productListInteractor;
        this.f = accountInteractor;
        this.g = analyticsManager;
        this.h = googleAdManagerInteractor;
        this.i = featureToggleManager;
        this.j = repositoryManager;
        this.k = productBoostInteractor;
        this.l = rewardsOfferActivationInteractor;
        this.m = instoreNavigationInteractor;
        this.n = replaceProductResultRouter;
        this.o = watchlistInteractor;
        this.p = mapFeatureHighlightStatusInteractorImpl;
        this.q = shopAppRegionInteractor;
        this.r = releaseSettingsInteractorImpl;
        this.s = edrOfferBoosterImpl;
        this.t = new ProductListFeedTrolleyUpdater();
        this.u = new CompositeDisposable();
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.v = sharedFlowImplB;
        this.w = FlowKt.a(sharedFlowImplB);
        SharedFlowImpl sharedFlowImplB2 = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.x = sharedFlowImplB2;
        this.y = FlowKt.a(sharedFlowImplB2);
        MutableLiveData mutableLiveData = productListInteractor.k;
        this.z = mutableLiveData;
        this.A = Transformations.b(mutableLiveData, new au.com.woolworths.feature.product.list.compose.filter.a(23));
        this.B = FlowKt.M(FlowLiveDataConversions.a(Transformations.c(mutableLiveData, new au.com.woolworths.feature.product.list.compose.filter.a(27))), ViewModelKt.a(this), SharingStarted.Companion.f24711a, 1);
        MediatorLiveData mediatorLiveDataC = Transformations.c(mutableLiveData, new au.com.woolworths.feature.product.list.compose.filter.a(28));
        this.C = mediatorLiveDataC;
        this.D = Transformations.c(mutableLiveData, new au.com.woolworths.feature.product.list.compose.filter.a(29));
        final Flow flowA = FlowLiveDataConversions.a(Transformations.c(mutableLiveData, new y(0)));
        this.E = FlowKt.O(new Flow<KeyedPageData<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1$2", f = "ProductListViewModel.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1$2$1 r0 = (au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1$2$1 r0 = new au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L4d
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        r6 = r5
                        au.com.woolworths.pagingutils.KeyedPageData r6 = (au.com.woolworths.pagingutils.KeyedPageData) r6
                        au.com.woolworths.pagingutils.PageData r6 = r6.b
                        java.lang.String r2 = "null cannot be cast to non-null type au.com.woolworths.feature.product.list.legacy.data.ProductListData"
                        kotlin.jvm.internal.Intrinsics.f(r6, r2)
                        au.com.woolworths.feature.product.list.legacy.data.ProductListData r6 = (au.com.woolworths.feature.product.list.legacy.data.ProductListData) r6
                        boolean r6 = r6.r
                        if (r6 != 0) goto L4d
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListViewModel$special$$inlined$filterNot$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowA.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, ViewModelKt.a(this), SharingStarted.Companion.b, null);
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        this.F = mediatorLiveData;
        String string = productListInteractor.f5328a.f5342a.getString("product_list_display_mode", null);
        this.I = ProductsDisplayMode.valueOf(string == null ? "GRID" : string);
        this.J = LazyKt.b(new z(this, 0));
        int i = 1;
        this.K = LazyKt.b(new z(this, i));
        this.Q = CompletableDeferredKt.a();
        this.R = new ArrayList();
        mediatorLiveData.n(Transformations.c(mutableLiveData, new y(i)), new ProductListViewModelKt$sam$androidx_lifecycle_Observer$0(new x(this, mediatorLiveData, 0)));
        mediatorLiveData.n(Transformations.c(mutableLiveData, new au.com.woolworths.feature.product.list.compose.filter.a(24)), new ProductListViewModelKt$sam$androidx_lifecycle_Observer$0(new x(this, mediatorLiveData, 1)));
        mediatorLiveData.n(mediatorLiveDataC, new ProductListViewModelKt$sam$androidx_lifecycle_Observer$0(new x(this, mediatorLiveData, 2)));
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$1$6(this, mediatorLiveData, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$addWatchlistObserver$1(this, mediatorLiveData, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(trolleyInteractor, this, null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass4(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass5(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[EDGE_INSN: B:172:0x0086->B:29:0x0086 BREAK  A[LOOP:0: B:20:0x0068->B:173:0x0068]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [au.com.woolworths.feature.product.list.legacy.ProductListContract$CoachMark] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void V6(au.com.woolworths.feature.product.list.legacy.ProductListViewModel r27, androidx.lifecycle.MediatorLiveData r28, int r29, au.com.woolworths.feature.product.list.legacy.errorstates.ProductListErrorState r30, int r31, boolean r32, au.com.woolworths.feature.product.list.legacy.data.FullScreenMessage r33, au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState r34, au.com.woolworths.feature.product.list.legacy.ProductListContract.CoachMark r35, java.util.List r36, java.util.List r37, java.lang.String r38, java.util.List r39, au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData r40, au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults r41, au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState r42, au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState r43, int r44) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.product.list.legacy.ProductListViewModel.V6(au.com.woolworths.feature.product.list.legacy.ProductListViewModel, androidx.lifecycle.MediatorLiveData, int, au.com.woolworths.feature.product.list.legacy.errorstates.ProductListErrorState, int, boolean, au.com.woolworths.feature.product.list.legacy.data.FullScreenMessage, au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState, au.com.woolworths.feature.product.list.legacy.ProductListContract$CoachMark, java.util.List, java.util.List, java.lang.String, java.util.List, au.com.woolworths.feature.product.list.legacy.data.ZeroResultPageData, au.com.woolworths.feature.product.list.legacy.data.ProductListZeroResults, au.com.woolworths.foundation.shop.video.advertising.data.VideoAdPlayerState, au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState, int):void");
    }

    public static final ProductListErrorState q6(ProductListViewModel productListViewModel, Activities.ProductList.ExtraProductListSource extraProductListSource) {
        r6(productListViewModel, extraProductListSource, false);
        ProductListInteractor.ProductFetchRequestModel[] productFetchRequestModelArr = productListViewModel.e.v;
        productFetchRequestModelArr[0] = null;
        productFetchRequestModelArr[1] = null;
        return extraProductListSource instanceof Activities.ProductList.ExtrasBySearch ? new ProductListErrorState.ProductListNoResultsState(productListViewModel.w6().d.d) : new ProductListErrorState.ProductListEmptyState(productListViewModel.w6().d.d);
    }

    public static final void r6(ProductListViewModel productListViewModel, Activities.ProductList.ExtraProductListSource extraProductListSource, boolean z) {
        String strH = productListViewModel.R6() ? "Sorry, we couldn't find items matching your filter." : extraProductListSource instanceof Activities.ProductList.ExtrasBySearch ? YU.a.h("Your search \"", productListViewModel.w6().d.d, "\" did not match any products.") : YU.a.h("There are currently no products in \"", productListViewModel.w6().d.d, "\"");
        TrackingMetadata trackingMetadataX6 = productListViewModel.x6();
        if (z) {
            trackingMetadataX6.b(TrackableValue.k0, TrackableErrorType.f);
        } else {
            trackingMetadataX6.b(TrackableValue.k0, TrackableErrorType.d);
        }
        trackingMetadataX6.b(TrackableValue.l0, strH);
        trackingMetadataX6.b(TrackableValue.R1, 0);
        productListViewModel.g.j(z ? ProductListActions.ProductListEmptySnackBarShown.e : ProductListActions.ProductListEmpty.e, trackingMetadataX6);
    }

    public static void t6(ProductListViewModel productListViewModel, Activities.ProductList.Extras extras, String str, List list, Map map, String str2, boolean z, List list2, int i) {
        String str3 = (i & 2) != 0 ? null : str;
        List list3 = (i & 4) != 0 ? null : list;
        Map map2 = (i & 8) != 0 ? null : map;
        String str4 = (i & 16) != 0 ? null : str2;
        boolean z2 = (i & 32) != 0 ? false : z;
        List list4 = (i & 64) != 0 ? null : list2;
        ProductListInteractor productListInteractor = productListViewModel.e;
        Lazy lazy = productListViewModel.K;
        Activities.ProductList.ExtraProductListSource extraProductListSource = extras.e;
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByCategory) {
            Activities.ProductList.ExtrasByCategory extrasByCategory = (Activities.ProductList.ExtrasByCategory) extraProductListSource;
            ProductListInteractor.i(productListInteractor, extras, extrasByCategory.d, null, extrasByCategory.e, str3, map2, ((Boolean) lazy.getD()).booleanValue(), 4);
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasBySpecialsCategory) {
            Activities.ProductList.ExtrasBySpecialsCategory extrasBySpecialsCategory = (Activities.ProductList.ExtrasBySpecialsCategory) extraProductListSource;
            productListInteractor.o(extras, extrasBySpecialsCategory.d, null, extrasBySpecialsCategory.e, str3, map2, ((Boolean) lazy.getD()).booleanValue());
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasBySearch) {
            Activities.ProductList.ExtrasBySearch extrasBySearch = (Activities.ProductList.ExtrasBySearch) extraProductListSource;
            ProductListInteractor.l(productListInteractor, extras, extrasBySearch.getD(), extrasBySearch.e, null, str3, list3, map2, str4, ((Boolean) lazy.getD()).booleanValue(), list4, z2, 24);
            return;
        }
        Map map3 = map2;
        String str5 = str4;
        List list5 = list4;
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByPastShop) {
            String str6 = ((Activities.ProductList.ExtrasByPastShop) extraProductListSource).d;
            productListInteractor.getClass();
            final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory = new NumericPageKeyedPagingSourceFactory(null, new ProductListInteractor$fetchProductListByPastShop$1(productListInteractor, str6, null));
            productListInteractor.h = numericPageKeyedPagingSourceFactory;
            MutableLiveData mutableLiveData = productListInteractor.k;
            LivePagedList livePagedListA = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByPastShop$$inlined$getPageListing$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return numericPageKeyedPagingSourceFactory.a();
                }
            }, productListInteractor.s).a();
            ProductListInteractor$fetchProductListByPastShop$$inlined$getPageListing$2 productListInteractor$fetchProductListByPastShop$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByPastShop$$inlined$getPageListing$2.d;
            MutableLiveData mutableLiveData2 = numericPageKeyedPagingSourceFactory.c;
            mutableLiveData.m(new NumericPageListing(livePagedListA, Transformations.c(mutableLiveData2, productListInteractor$fetchProductListByPastShop$$inlined$getPageListing$2), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByPastShop$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByPastShop$$inlined$getPageListing$4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory.c.e();
                    if (pageKeyedPagingSource != null) {
                        pageKeyedPagingSource.c();
                    }
                    return Unit.f24250a;
                }
            }, Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByPastShop$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData2, ProductListInteractor$fetchProductListByPastShop$$inlined$getPageListing$6.d)));
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasBySuggestedLists) {
            String strF = productListViewModel.j.f();
            int i2 = ((Activities.ProductList.ExtrasBySuggestedLists) extraProductListSource).d;
            productListInteractor.getClass();
            final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory2 = new NumericPageKeyedPagingSourceFactory(null, new ProductListInteractor$fetchSuggestedProductList$1(productListInteractor, strF, i2, null));
            productListInteractor.h = numericPageKeyedPagingSourceFactory2;
            MutableLiveData mutableLiveData3 = productListInteractor.k;
            LivePagedList livePagedListA2 = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchSuggestedProductList$$inlined$getPageListing$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return numericPageKeyedPagingSourceFactory2.a();
                }
            }, productListInteractor.s).a();
            ProductListInteractor$fetchSuggestedProductList$$inlined$getPageListing$2 productListInteractor$fetchSuggestedProductList$$inlined$getPageListing$2 = ProductListInteractor$fetchSuggestedProductList$$inlined$getPageListing$2.d;
            MutableLiveData mutableLiveData4 = numericPageKeyedPagingSourceFactory2.c;
            mutableLiveData3.m(new NumericPageListing(livePagedListA2, Transformations.c(mutableLiveData4, productListInteractor$fetchSuggestedProductList$$inlined$getPageListing$2), Transformations.c(mutableLiveData4, ProductListInteractor$fetchSuggestedProductList$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchSuggestedProductList$$inlined$getPageListing$4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory2.c.e();
                    if (pageKeyedPagingSource != null) {
                        pageKeyedPagingSource.c();
                    }
                    return Unit.f24250a;
                }
            }, Transformations.c(mutableLiveData4, ProductListInteractor$fetchSuggestedProductList$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData4, ProductListInteractor$fetchSuggestedProductList$$inlined$getPageListing$6.d)));
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByProductIds) {
            List list6 = ((Activities.ProductList.ExtrasByProductIds) extraProductListSource).d;
            if (list6 != null) {
                productListInteractor.getClass();
                final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory3 = new NumericPageKeyedPagingSourceFactory(null, new ProductListInteractor$fetchProductListByProductIds$1(productListInteractor, list6, null));
                productListInteractor.h = numericPageKeyedPagingSourceFactory3;
                MutableLiveData mutableLiveData5 = productListInteractor.k;
                LivePagedList livePagedListA3 = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductIds$$inlined$getPageListing$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return numericPageKeyedPagingSourceFactory3.a();
                    }
                }, productListInteractor.s).a();
                ProductListInteractor$fetchProductListByProductIds$$inlined$getPageListing$2 productListInteractor$fetchProductListByProductIds$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByProductIds$$inlined$getPageListing$2.d;
                MutableLiveData mutableLiveData6 = numericPageKeyedPagingSourceFactory3.c;
                mutableLiveData5.m(new NumericPageListing(livePagedListA3, Transformations.c(mutableLiveData6, productListInteractor$fetchProductListByProductIds$$inlined$getPageListing$2), Transformations.c(mutableLiveData6, ProductListInteractor$fetchProductListByProductIds$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByProductIds$$inlined$getPageListing$4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory3.c.e();
                        if (pageKeyedPagingSource != null) {
                            pageKeyedPagingSource.c();
                        }
                        return Unit.f24250a;
                    }
                }, Transformations.c(mutableLiveData6, ProductListInteractor$fetchProductListByProductIds$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData6, ProductListInteractor$fetchProductListByProductIds$$inlined$getPageListing$6.d)));
                return;
            }
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByFacet) {
            Activities.ProductList.ExtrasByFacet extrasByFacet = (Activities.ProductList.ExtrasByFacet) extraProductListSource;
            productListInteractor.j(extrasByFacet.d, extrasByFacet.e, extrasByFacet.f, extrasByFacet.g, extrasByFacet.h, EmptyMap.d, null);
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe) {
            Activities.ProductList.ExtrasByRecipe extrasByRecipe = (Activities.ProductList.ExtrasByRecipe) extraProductListSource;
            String recipeId = extrasByRecipe.d;
            Integer num = extrasByRecipe.h;
            productListInteractor.getClass();
            Intrinsics.h(recipeId, "recipeId");
            final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory4 = new NumericPageKeyedPagingSourceFactory(null, new ProductListInteractor$fetchProductListByRecipeId$1(productListInteractor, recipeId, num, null));
            productListInteractor.h = numericPageKeyedPagingSourceFactory4;
            MutableLiveData mutableLiveData7 = productListInteractor.k;
            LivePagedList livePagedListA4 = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return numericPageKeyedPagingSourceFactory4.a();
                }
            }, productListInteractor.s).a();
            ProductListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$2 productListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$2.d;
            MutableLiveData mutableLiveData8 = numericPageKeyedPagingSourceFactory4.c;
            mutableLiveData7.m(new NumericPageListing(livePagedListA4, Transformations.c(mutableLiveData8, productListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$2), Transformations.c(mutableLiveData8, ProductListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory4.c.e();
                    if (pageKeyedPagingSource != null) {
                        pageKeyedPagingSource.c();
                    }
                    return Unit.f24250a;
                }
            }, Transformations.c(mutableLiveData8, ProductListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData8, ProductListInteractor$fetchProductListByRecipeId$$inlined$getPageListing$6.d)));
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByBoostedOffers) {
            ProductListInteractor.h(productListInteractor, ((Activities.ProductList.ExtrasByBoostedOffers) extraProductListSource).d);
            return;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasByHaveYouForgotten) {
            productListInteractor.getClass();
            final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory5 = new NumericPageKeyedPagingSourceFactory(null, new ProductListInteractor$fetchProductListByHaveYouForgotten$1(productListInteractor, null));
            productListInteractor.h = numericPageKeyedPagingSourceFactory5;
            MutableLiveData mutableLiveData9 = productListInteractor.k;
            LivePagedList livePagedListA5 = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return numericPageKeyedPagingSourceFactory5.a();
                }
            }, productListInteractor.s).a();
            ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$2 productListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$2.d;
            MutableLiveData mutableLiveData10 = numericPageKeyedPagingSourceFactory5.c;
            mutableLiveData9.m(new NumericPageListing(livePagedListA5, Transformations.c(mutableLiveData10, productListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$2), Transformations.c(mutableLiveData10, ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory5.c.e();
                    if (pageKeyedPagingSource != null) {
                        pageKeyedPagingSource.c();
                    }
                    return Unit.f24250a;
                }
            }, Transformations.c(mutableLiveData10, ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData10, ProductListInteractor$fetchProductListByHaveYouForgotten$$inlined$getPageListing$6.d)));
            return;
        }
        if (!(extraProductListSource instanceof Activities.ProductList.ExtrasByPriceFamily)) {
            if (extraProductListSource instanceof Activities.ProductList.ExtrasByProductGroup) {
                Activities.ProductList.ExtrasByProductGroup extrasByProductGroup = (Activities.ProductList.ExtrasByProductGroup) extraProductListSource;
                ProductListInteractor.k(productListInteractor, extras, extrasByProductGroup.d, z2, extrasByProductGroup.e, ((Boolean) lazy.getD()).booleanValue(), extrasByProductGroup.f, list5, null, map3, str3, str5, 128);
                return;
            } else {
                if (!(extraProductListSource instanceof Activities.ProductList.ExtrasBySearchAlternative)) {
                    throw new NoWhenBranchMatchedException();
                }
                Activities.ProductList.ExtrasBySearchAlternative extrasBySearchAlternative = (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSource;
                ProductListInteractor.m(productListInteractor, extras, extrasBySearchAlternative.e, extrasBySearchAlternative.d, null, str3, map3, str5, list5, 24);
                return;
            }
        }
        String priceFamilyId = ((Activities.ProductList.ExtrasByPriceFamily) extraProductListSource).d;
        productListInteractor.getClass();
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        final NumericPageKeyedPagingSourceFactory numericPageKeyedPagingSourceFactory6 = new NumericPageKeyedPagingSourceFactory(null, new ProductListInteractor$fetchProductListByPriceFamily$1(productListInteractor, priceFamilyId, null));
        productListInteractor.h = numericPageKeyedPagingSourceFactory6;
        MutableLiveData mutableLiveData11 = productListInteractor.k;
        LivePagedList livePagedListA6 = new LivePagedListBuilder(new Function0<PagingSource<Integer, Object>>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return numericPageKeyedPagingSourceFactory6.a();
            }
        }, productListInteractor.s).a();
        ProductListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$2 productListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$2 = ProductListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$2.d;
        MutableLiveData mutableLiveData12 = numericPageKeyedPagingSourceFactory6.c;
        mutableLiveData11.m(new NumericPageListing(livePagedListA6, Transformations.c(mutableLiveData12, productListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$2), Transformations.c(mutableLiveData12, ProductListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$3.d), new Function0<Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PageKeyedPagingSource pageKeyedPagingSource = (PageKeyedPagingSource) numericPageKeyedPagingSourceFactory6.c.e();
                if (pageKeyedPagingSource != null) {
                    pageKeyedPagingSource.c();
                }
                return Unit.f24250a;
            }
        }, Transformations.c(mutableLiveData12, ProductListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$5.d), Transformations.c(mutableLiveData12, ProductListInteractor$fetchProductListByPriceFamily$$inlined$getPageListing$6.d)));
    }

    public final Activities.ProductList.ProductListType A6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
        if (extraProductListSource != null) {
            return extraProductListSource.getE();
        }
        Intrinsics.p("productListSource");
        throw null;
    }

    public final ProductCard B6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = w6().e;
        Activities.ProductList.ExtrasBySearchAlternative extrasBySearchAlternative = extraProductListSource instanceof Activities.ProductList.ExtrasBySearchAlternative ? (Activities.ProductList.ExtrasBySearchAlternative) extraProductListSource : null;
        Parcelable parcelable = extrasBySearchAlternative != null ? extrasBySearchAlternative.f : null;
        if (parcelable instanceof ProductCard) {
            return (ProductCard) parcelable;
        }
        return null;
    }

    public final ProductListScreens C6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
        if (extraProductListSource != null) {
            return extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe ? ProductListScreens.f : X6() ? ProductListScreens.h : ProductListScreens.e;
        }
        Intrinsics.p("productListSource");
        throw null;
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.L = productCardTileData;
        N6(productCardTileData, true);
    }

    public final String D6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        if (extraProductListSource instanceof Activities.ProductList.ExtrasBySearch) {
            return ((Activities.ProductList.ExtrasBySearch) extraProductListSource).getD();
        }
        return null;
    }

    public final ZeroResultAnalytics.ZeroPageResult E6() {
        String str = w6().d.d;
        SearchKeywordType searchKeywordType = SearchKeywordType.e;
        return new ZeroResultAnalytics.ZeroPageResult(str, ProductsDisplayModeKt.a(this.I));
    }

    public final boolean F6() {
        return this.q.b() == Region.j;
    }

    public final void G1() {
        PagedList pagedList = (PagedList) CollectionsKt.F(this.B.a());
        if (pagedList != null) {
            List listG0 = CollectionsKt.G0(pagedList);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG0) {
                if (obj instanceof ProductCard) {
                    arrayList.add(obj);
                }
            }
            this.g.j(ProductListActions.ProductVarietiesBoostAllClick.e, ProductAnalyticsExtKt.f(arrayList));
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$onBoostAllClicked$2(this, null), 3);
        }
    }

    public final void G6(boolean z) {
        if (this.i.c(BaseShopAppFeature.M)) {
            MediatorLiveData mediatorLiveData = this.F;
            ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
            if (viewState != null) {
                V6(this, mediatorLiveData, 0, null, 0, false, null, null, null, null, null, null, null, null, null, VideoAdPlayerState.a(viewState.u, false, false, 0L, z, false, BitmapDescriptorFactory.HUE_RED, 55), null, 1572863);
            }
        }
    }

    public final void H6(List productsAdded) {
        Intrinsics.h(productsAdded, "productsAdded");
        TrackingMetadata trackingMetadataF = ProductAnalyticsExtKt.f(productsAdded);
        trackingMetadataF.b(TrackableValue.o0, "saved 1 in my shopping list");
        this.g.j(ProductListActions.AddToListSnackbarImpression.e, trackingMetadataF);
    }

    public final void I6(ProductListContract.CoachMark coachMark) {
        coachMark.d.invoke();
        V6(this, this.F, 0, null, 0, false, null, null, (ProductListContract.CoachMark) CollectionsKt.i0(this.R), null, null, null, null, null, null, null, null, 2096127);
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        TrackingMetadata trackingMetadataX6 = x6();
        trackingMetadataX6.a(ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        boolean zX6 = X6();
        AnalyticsManager analyticsManager = this.g;
        if (zX6) {
            ZeroResultAnalytics.ZeroPageResult.Action action = E6().f;
            action.getClass();
            analyticsManager.i(new ZeroResultAnalytics$ZeroPageResult$Action$productClick$1(action, containerTitle), trackingMetadataX6);
        } else {
            ProductListScreens productListScreens = ProductListScreens.d;
            analyticsManager.j(new ProductListActions.ProductClick(), trackingMetadataX6);
        }
        this.x.f(new ProductListContract.ProductListActivityActions.LaunchProductDetails(productCardData));
    }

    public final void J6(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof ActionableCard;
        AnalyticsManager analyticsManager = this.g;
        if (z) {
            ProductListActions.ActionableCardImpression actionableCardImpression = ProductListActions.ActionableCardImpression.e;
            TrackingMetadata trackingMetadataA = ActionableCardKt.a((ActionableCard) data);
            String strD6 = D6();
            if (strD6 != null) {
                trackingMetadataA.b(TrackableValue.J2, strD6);
            }
            trackingMetadataA.a(x6());
            analyticsManager.j(actionableCardImpression, trackingMetadataA);
            return;
        }
        if (data instanceof GoogleAdBannerCard) {
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) data;
            BuildersKt.c(ViewModelKt.a(this), null, null, new ProductListViewModel$onGoogleAdBannerImpression$1(this, googleAdBannerCard, null), 3);
            ProductListActions.GoogleAdBannerImpression googleAdBannerImpression = ProductListActions.GoogleAdBannerImpression.e;
            TrackingMetadata trackingMetadataA2 = GoogleAdBannerCardKt.a(googleAdBannerCard);
            String strD62 = D6();
            if (strD62 != null) {
                trackingMetadataA2.b(TrackableValue.J2, strD62);
            }
            trackingMetadataA2.a(x6());
            analyticsManager.j(googleAdBannerImpression, trackingMetadataA2);
        }
    }

    public final void K6(ProductCard productCardData) {
        Intrinsics.h(productCardData, "productCardData");
        MapFeatureHighlightStatusInteractorImpl mapFeatureHighlightStatusInteractorImpl = this.p;
        if (mapFeatureHighlightStatusInteractorImpl.a(productCardData)) {
            this.v.f(ProductListContract.Actions.ShowMapFeatureHighlight.f5312a);
            SharedPreferences.Editor editorEdit = mapFeatureHighlightStatusInteractorImpl.f7325a.f7437a.edit();
            editorEdit.putBoolean("tappableAisleFeatureHighlightShown", true);
            editorEdit.apply();
            ProductListScreens productListScreensC6 = C6();
            AnalyticsManagerExtKt.b(this.g, productListScreensC6.getD(), productListScreensC6.getE());
        }
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        boolean zX6 = X6();
        AnalyticsManager analyticsManager = this.g;
        if (zX6) {
            analyticsManager.i((Event) E6().f.c.getD(), O6(productCardTileData));
        } else {
            Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
            if (extraProductListSource == null) {
                Intrinsics.p("productListSource");
                throw null;
            }
            analyticsManager.j(extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe ? ProductListActions.AddToListFromRecipe.e : ProductListActions.AddToList.e, O6(productCardTileData));
        }
        ProductListScreens productListScreensC6 = C6();
        TrackingMetadata trackingMetadataY6 = y6();
        Activities.ProductList.ExtraProductListSource extraProductListSource2 = this.H;
        if (extraProductListSource2 == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        boolean z = extraProductListSource2 instanceof Activities.ProductList.ExtrasByPriceFamily;
        Activities.ProductList.ExtrasBySearch extrasBySearch = extraProductListSource2 instanceof Activities.ProductList.ExtrasBySearch ? (Activities.ProductList.ExtrasBySearch) extraProductListSource2 : null;
        this.v.f(new ProductListContract.Actions.LaunchAddToList(productCardTileData, productListScreensC6, trackingMetadataY6, z, extrasBySearch != null ? extrasBySearch.g : null));
    }

    public final void L6(ActionData actionData) {
        Intrinsics.h(actionData, "actionData");
        if (WhenMappings.b[actionData.getType().ordinal()] == 2) {
            this.v.f(new ProductListContract.Actions.LaunchDeeplink(actionData.getAction(), null));
            AnalyticsData analytics = actionData.getAnalytics();
            if (analytics != null) {
                this.g.g(AnalyticsDataKt.a(analytics));
            }
        }
    }

    public final void M6(ProductCard productCard, boolean z) {
        InfoSection infoSection;
        PurchaseRestriction purchaseRestriction = productCard.getPurchaseRestriction();
        PurchaseRestriction purchaseRestriction2 = PurchaseRestriction.LEGAL_AGE_RESTRICTION;
        SharedFlowImpl sharedFlowImpl = this.v;
        if (purchaseRestriction == purchaseRestriction2) {
            ShopAccountInteractor shopAccountInteractor = this.f;
            if (!shopAccountInteractor.K()) {
                sharedFlowImpl.f(new ProductListContract.Actions.DisplayRestrictedItemPrompt(productCard, shopAccountInteractor.d()));
                return;
            }
        }
        ProductListInteractor productListInteractor = this.e;
        BottomSheetContent.Marketplace marketplace = productListInteractor.t;
        Pair pair = null;
        if (marketplace != null && (infoSection = productListInteractor.u) != null) {
            pair = new Pair(marketplace, infoSection);
        }
        if (!z || productCard.getMarketplace() == null || !productListInteractor.f.f8753a.getBoolean("education_bottom_sheet", true) || pair == null) {
            sharedFlowImpl.f(new ProductListContract.Actions.LaunchProductAddOrReplace(productCard, C6(), y6(), B6()));
        } else {
            sharedFlowImpl.f(new ProductListContract.Actions.LaunchEducationBottomSheet((BottomSheetContent.Marketplace) pair.d, (InfoSection) pair.e));
        }
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ProductListClickHandler
    public final void N() {
        P6();
    }

    public final void N6(ProductCard productCardTileData, boolean z) {
        InfoSection infoSection;
        ProductListInteractor productListInteractor = this.e;
        BottomSheetContent.Marketplace marketplace = productListInteractor.t;
        Pair pair = null;
        if (marketplace != null && (infoSection = productListInteractor.u) != null) {
            pair = new Pair(marketplace, infoSection);
        }
        SharedFlowImpl sharedFlowImpl = this.v;
        if (z) {
            Intrinsics.h(productCardTileData, "productCardTileData");
            if (productCardTileData.getMarketplace() != null && productListInteractor.f.f8753a.getBoolean("education_bottom_sheet", true) && pair != null) {
                sharedFlowImpl.f(new ProductListContract.Actions.LaunchEducationBottomSheet((BottomSheetContent.Marketplace) pair.d, (InfoSection) pair.e));
                return;
            }
        }
        boolean zX6 = X6();
        AnalyticsManager analyticsManager = this.g;
        if (zX6) {
            analyticsManager.i((Event) E6().f.d.getD(), O6(productCardTileData));
        } else {
            ProductListScreens productListScreensC6 = C6();
            analyticsManager.i((Event) new QuantitySelectorAnalytics.QuantitySelector(productListScreensC6.getD(), productListScreensC6.getE()).h.h.getD(), O6(productCardTileData));
        }
        sharedFlowImpl.f(new ProductListContract.Actions.LaunchProductUpdate(productCardTileData, C6(), y6()));
    }

    @Override // au.com.woolworths.base.shopapp.modules.button.ButtonClickHandler
    public final void O2(Button data) {
        String url;
        Intrinsics.h(data, "data");
        ButtonActionApiData action = data.getAction();
        if ((action == null ? -1 : WhenMappings.f5339a[action.ordinal()]) != 1 || (url = data.getUrl()) == null) {
            return;
        }
        ProductListActions.FullScreenMessageCTAClick fullScreenMessageCTAClick = ProductListActions.FullScreenMessageCTAClick.e;
        TrackingMetadata trackingMetadataX6 = x6();
        trackingMetadataX6.b(TrackableValue.o0, data.getLabel());
        this.g.j(fullScreenMessageCTAClick, trackingMetadataX6);
        this.v.f(new ProductListContract.Actions.NavigateToLink(url));
        this.M = true;
    }

    public final TrackingMetadata O6(ProductCard productCardTileData) {
        Intrinsics.h(productCardTileData, "productCardTileData");
        TrackingMetadata trackingMetadataX6 = x6();
        trackingMetadataX6.a(ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        TrackingMetadata trackingMetadataY6 = y6();
        if (trackingMetadataY6 != null) {
            trackingMetadataX6.a(trackingMetadataY6);
        }
        return trackingMetadataX6;
    }

    public final void P6() {
        V6(this, this.F, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 2097147);
        NumericPageListing numericPageListing = (NumericPageListing) this.z.e();
        if (numericPageListing != null) {
            PageListingKt.a(numericPageListing);
        }
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void Q2(String containerTitle, String priceFamilyId) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(priceFamilyId, "priceFamilyId");
        this.g.j(ProductListActions.ProductVarietiesClick.e, x6());
        this.v.f(new ProductListContract.Actions.LaunchProductVarieties(priceFamilyId));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public final void Q6(Activities.ProductList.Extras extras) {
        Intrinsics.h(extras, "extras");
        Activities.ProductList.ExtraProductListSource extraProductListSource = extras.e;
        this.G = extras;
        Activities.ProductList.ExtraProductListSource extraProductListSource2 = this.H;
        if (extraProductListSource2 == null || !extraProductListSource2.equals(extraProductListSource)) {
            this.H = extraProductListSource;
            if (extraProductListSource == null) {
                Intrinsics.p("productListSource");
                throw null;
            }
            if (extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe) {
                W6(ProductsDisplayMode.d, false);
            }
            Activities.ProductList.ExtraProductListSource extraProductListSource3 = this.H;
            if (extraProductListSource3 == null) {
                Intrinsics.p("productListSource");
                throw null;
            }
            Activities.ProductList.ExtrasBySearch extrasBySearch = extraProductListSource3 instanceof Activities.ProductList.ExtrasBySearch ? (Activities.ProductList.ExtrasBySearch) extraProductListSource3 : null;
            t6(this, extras, null, extrasBySearch != null ? extrasBySearch.f : null, extras.f.d, null, extras.g, this.e.f5328a.l(), 18);
            this.Q.h(Unit.f24250a);
        }
    }

    public final boolean R6() {
        return (w6().e instanceof Activities.ProductList.ExtrasBySearch) || (w6().e instanceof Activities.ProductList.ExtrasByCategory) || (w6().e instanceof Activities.ProductList.ExtrasBySpecialsCategory) || (w6().e instanceof Activities.ProductList.ExtrasByFacet) || (w6().e instanceof Activities.ProductList.ExtrasBySearchAlternative) || (w6().e instanceof Activities.ProductList.ExtrasByProductGroup);
    }

    public final boolean S6() {
        return A6().k && ((Boolean) this.J.getD()).booleanValue() && !F6();
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T0(ProductCard productCardData) {
        Intrinsics.h(productCardData, "productCardData");
        ProductListScreens productListScreensC6 = C6();
        AnalyticsManagerExtKt.a(this.g, productListScreensC6.getD(), null, productListScreensC6.getE(), productCardData);
        this.x.f(new ProductListContract.ProductListActivityActions.LaunchInstoreMap(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        String string;
        String string2;
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.L = productCardTileData;
        ProductCard productCardB6 = B6();
        AnalyticsManager analyticsManager = this.g;
        if (productCardB6 != null) {
            String str = "";
            if (X6()) {
                ZeroResultAnalytics.ZeroPageResult.Action action = E6().f;
                List listQ = CollectionsKt.Q(productCardB6.getProductId());
                List listQ2 = CollectionsKt.Q(productCardTileData.getProductId());
                List listQ3 = CollectionsKt.Q(productCardTileData.getName());
                if (productCardTileData.getPrice() != null && (string2 = Float.valueOf(r13.intValue() / 100.0f).toString()) != null) {
                    str = string2;
                }
                List listQ4 = CollectionsKt.Q(str);
                action.getClass();
                analyticsManager.g(new ZeroResultAnalytics$ZeroPageResult$Action$replaceInitiated$1(action, listQ, listQ2, listQ3, listQ4));
            } else {
                ProductListScreens productListScreensC6 = C6();
                QuantitySelectorAnalytics.QuantitySelector quantitySelector = new QuantitySelectorAnalytics.QuantitySelector(productListScreensC6.getD(), productListScreensC6.getE());
                List listQ5 = CollectionsKt.Q(productCardB6.getProductId());
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
        } else if (X6()) {
            analyticsManager.i((Event) E6().f.b.getD(), O6(productCardTileData));
        } else {
            ProductListScreens productListScreensC62 = C6();
            analyticsManager.i((Event) new QuantitySelectorAnalytics.QuantitySelector(productListScreensC62.getD(), productListScreensC62.getE()).h.g.getD(), O6(productCardTileData));
        }
        M6(productCardTileData, true);
    }

    public final boolean T6(ProductCard productCard, ProductMultiBuyLabel productMultiBuyLabel) {
        Intrinsics.h(productCard, "productCard");
        return productMultiBuyLabel == ProductMultiBuyLabel.f ? ProductCardExtKt.w(productCard, productMultiBuyLabel) && F6() : ProductCardExtKt.w(productCard, productMultiBuyLabel) && !F6();
    }

    public final ProductListErrorState U6(NetworkState networkState) {
        NumericPageListing numericPageListing;
        Integer num;
        if (Intrinsics.c(networkState, NetworkState.d) && (numericPageListing = (NumericPageListing) this.z.e()) != null && (num = (Integer) numericPageListing.e.e()) != null && num.intValue() == 0) {
            ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.F.e();
            if ((viewState != null ? viewState.h : null) == null && !X6()) {
                return p6();
            }
        }
        Throwable th = networkState.c;
        boolean z = th instanceof NoConnectivityException;
        AnalyticsManager analyticsManager = this.g;
        if (z) {
            TrackingMetadata trackingMetadataX6 = x6();
            trackingMetadataX6.b(TrackableValue.l0, "Unable to load \"" + w6().d.d + "\" due to connection error");
            trackingMetadataX6.b(TrackableValue.k0, TrackableErrorType.d);
            analyticsManager.j(ProductListActions.NetworkError.e, trackingMetadataX6);
            return new ProductListErrorState.ProductListConnectionError(w6().d.d);
        }
        if (!(th instanceof ServerErrorException)) {
            if ((th instanceof CancellationException) || th == null) {
                return null;
            }
            throw new IllegalStateException("Unexpected exception caught: " + th, th);
        }
        if (ExceptionExtKt.d(((ServerErrorException) th).d, ServerErrorCode.g) != null) {
            return p6();
        }
        TrackingMetadata trackingMetadataX62 = x6();
        trackingMetadataX62.b(TrackableValue.l0, "Unable to load \"" + w6().d.d + "\" due to server error.");
        trackingMetadataX62.b(TrackableValue.k0, TrackableErrorType.d);
        analyticsManager.j(ProductListActions.ServerError.e, trackingMetadataX62);
        return new ProductListErrorState.ProductListServerError(w6().d.d);
    }

    public final void W6(ProductsDisplayMode productsDisplayMode, boolean z) {
        if (this.I == productsDisplayMode) {
            return;
        }
        this.I = productsDisplayMode;
        if (z) {
            ProductListInteractor productListInteractor = this.e;
            productListInteractor.getClass();
            SharedPreferences.Editor editorEdit = productListInteractor.f5328a.f5342a.edit();
            editorEdit.putString("product_list_display_mode", productsDisplayMode.name());
            editorEdit.apply();
        }
        this.v.f(new ProductListContract.Actions.ChangeDisplayMode(this.I));
    }

    public final boolean X6() {
        MediatorLiveData mediatorLiveData = this.F;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if ((viewState != null ? viewState.s : null) != null) {
            return true;
        }
        ProductListContract.ViewState viewState2 = (ProductListContract.ViewState) mediatorLiveData.e();
        return (viewState2 != null ? viewState2.t : null) != null;
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
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        this.g.j(extraProductListSource instanceof Activities.ProductList.ExtrasByRecipe ? new ProductListActions.ShowAvailabilityInfoFromRecipe(label) : new ProductListActions.ShowAvailabilityInfo(label), O6(productCardTileData));
        this.v.f(new ProductListContract.Actions.LaunchAvailabilityMessage(productCardTileData, C6(), y6()));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        WatchlistInteractor watchlistInteractor = this.o;
        boolean zC = watchlistInteractor.c();
        SharedFlowImpl sharedFlowImpl = this.v;
        if (zC) {
            sharedFlowImpl.f(ProductListContract.Actions.LaunchWatchlistGuestOnboardingScreen.f5308a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.F.e();
        boolean zT = ProductCardExtKt.t(productCardData, viewState != null ? viewState.r : null);
        AnalyticsManager analyticsManager = this.g;
        if (zT) {
            analyticsManager.j(ProductListActions.RemoveFromWatchlistClick.e, O6(productCardData));
            watchlistInteractor.d(productCardData);
            sharedFlowImpl.f(new ProductListContract.Actions.DisplaySnackbarForWatchlist(strB, new ResText(com.woolworths.R.string.watchlist_product_removed_snackbar_message), false, productCardData));
        } else {
            analyticsManager.j(ProductListActions.SaveToWatchlistClick.e, O6(productCardData));
            watchlistInteractor.a(productCardData);
            sharedFlowImpl.f(new ProductListContract.Actions.DisplaySnackbarForWatchlist(strB, new ResText(com.woolworths.R.string.watchlist_product_added_snackbar_message), true, productCardData));
        }
    }

    @Override // au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener
    public final void m(DynamicSizeCardData data) {
        Intrinsics.h(data, "data");
        boolean z = data instanceof GoogleAdBannerCard;
        AnalyticsManager analyticsManager = this.g;
        SharedFlowImpl sharedFlowImpl = this.v;
        if (!z) {
            if (data instanceof ActionableCard) {
                ActionableCard actionableCard = (ActionableCard) data;
                ProductListActions.ActionableCardClick actionableCardClick = ProductListActions.ActionableCardClick.e;
                TrackingMetadata trackingMetadataA = ActionableCardKt.a(actionableCard);
                String strD6 = D6();
                if (strD6 != null) {
                    trackingMetadataA.b(TrackableValue.J2, strD6);
                }
                trackingMetadataA.a(x6());
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
        String strD62 = D6();
        if (strD62 != null) {
            trackingMetadataA2.b(TrackableValue.J2, strD62);
        }
        trackingMetadataA2.a(x6());
        analyticsManager.j(googleAdBannerClick, trackingMetadataA2);
        String strG = googleAdBannerCard.getCtaUrl();
        String strK = googleAdBannerCard.getTargetId();
        if (strG != null && strG.length() != 0) {
            sharedFlowImpl.f(new ProductListContract.Actions.HandleBannerClick(strG));
        } else if (strK != null) {
            sharedFlowImpl.f(new ProductListContract.Actions.LaunchProductListProductGroup(strK, googleAdBannerCard.getTitle(), googleAdBannerCard.getTargetType()));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        this.u.e();
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
            this.g.g(new ProductGroupAnalytics$ProductGroupPage$Action$Companion$insetBannerImpression$1(stringText, linkText));
            this.v.f(new ProductListContract.Actions.NavigateToLink(linkText));
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        P6();
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        Function0 function0;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.F.e();
        ProductListErrorState productListErrorState = viewState != null ? viewState.c : null;
        boolean z = productListErrorState instanceof ProductListErrorState.ProductListEmptyState;
        AnalyticsManager analyticsManager = this.g;
        if (z) {
            analyticsManager.j(ProductListActions.ProductListEmptyTryAgain.e, x6());
            NumericPageListing numericPageListing = (NumericPageListing) this.z.e();
            if (numericPageListing == null || (function0 = numericPageListing.d) == null) {
                return;
            }
            function0.invoke();
            return;
        }
        if (productListErrorState instanceof ProductListErrorState.ProductListConnectionError) {
            analyticsManager.j(ProductListActions.NetworkErrorTryAgain.e, x6());
            P6();
        } else {
            if (!(productListErrorState instanceof ProductListErrorState.ProductListServerError)) {
                throw new IllegalStateException("Invalid error state with secondary action");
            }
            analyticsManager.j(ProductListActions.ServerErrorTryAgain.e, x6());
            P6();
        }
    }

    @Override // au.com.woolworths.feature.product.list.legacy.ProductListClickHandler
    public final void p4(IngredientCardApiData ingredientCard) {
        Intrinsics.h(ingredientCard, "ingredientCard");
        List listZ6 = z6();
        if (listZ6 == null) {
            return;
        }
        Iterator it = listZ6.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.c(it.next(), ingredientCard)) {
                break;
            } else {
                i++;
            }
        }
        Object obj = listZ6.get(i + 1);
        ProductCard productCard = obj instanceof ProductCard ? (ProductCard) obj : null;
        List list = ingredientCard.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.c(((ProductCard) obj2).getProductId(), productCard != null ? productCard.getProductId() : null)) {
                arrayList.add(obj2);
            }
        }
        this.g.g(ShopARecipeAnalytics.ProductList.Action.d);
        String ingredientDetails = ingredientCard.d;
        ButtonApiData buttonApiData = ingredientCard.e;
        IngredientAnalyticsApiData analytics = ingredientCard.g;
        Intrinsics.h(ingredientDetails, "ingredientDetails");
        Intrinsics.h(analytics, "analytics");
        this.x.f(new ProductListContract.ProductListActivityActions.LaunchAlternativeProducts(new IngredientCardApiData(ingredientDetails, buttonApiData, arrayList, analytics)));
    }

    public final ProductListErrorState p6() {
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        if (!R6()) {
            return q6(this, extraProductListSource);
        }
        ProductListInteractor productListInteractor = this.e;
        if (productListInteractor.v[1] == null) {
            return q6(this, extraProductListSource);
        }
        this.v.f(ProductListContract.Actions.ShowNoResultsMessage.f5313a);
        r6(this, extraProductListSource, true);
        if (productListInteractor.v[1] == null) {
            return null;
        }
        Activities.ProductList.Extras extrasZ = productListInteractor.z();
        if (extrasZ != null) {
            Activities.ProductList.Extras extrasW6 = w6();
            Activities.ProductList.ExtrasPageData extrasPageData = w6().d;
            String pageTitle = extrasZ.d.d;
            String str = extrasPageData.e;
            Intrinsics.h(pageTitle, "pageTitle");
            Activities.ProductList.ExtrasPageData extrasPageData2 = new Activities.ProductList.ExtrasPageData(pageTitle, str);
            Activities.ProductList.ExtraProductListSource productListSource = extrasW6.e;
            Activities.ProductList.ExtrasConfig config = extrasW6.f;
            boolean z = extrasW6.g;
            Intrinsics.h(productListSource, "productListSource");
            Intrinsics.h(config, "config");
            this.G = new Activities.ProductList.Extras(extrasPageData2, productListSource, config, z);
        } else {
            extrasZ = null;
        }
        if (extrasZ == null) {
            extrasZ = w6();
        }
        t6(this, extrasZ, null, null, null, null, false, null, 124);
        return null;
    }

    public final boolean s6() {
        return S6() && A6().g != Activities.ProductList.ToolbarType.e;
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void u3(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        this.x.f(new ProductListContract.ProductListActivityActions.LaunchProductAvailability(productCardData));
        this.g.i(ListsAnalytics.Lists.Action.h, O6(productCardData));
    }

    public final BoostAllBannerState u6(StatefulButtonState statefulButtonState) {
        BoostAllBannerState boostAllBannerState;
        Object next;
        if (this.i.c(BaseShopAppFeature.t0)) {
            Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
            if (extraProductListSource == null) {
                Intrinsics.p("productListSource");
                throw null;
            }
            if (extraProductListSource.getE() == Activities.ProductList.ProductListType.A) {
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.F.e();
                if (viewState == null || (boostAllBannerState = viewState.i) == null) {
                    boostAllBannerState = BoostAllBannerState.f;
                }
                PagedList pagedList = (PagedList) CollectionsKt.P(this.B.a());
                if (pagedList != null) {
                    Iterator<T> it = pagedList.iterator();
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
                            PluralResText pluralResText = new PluralResText(com.woolworths.R.plurals.shop_lists_boost_all_message, 1);
                            PluralResText pluralResText2 = new PluralResText(com.woolworths.R.plurals.shop_lists_boost_all_button_text, 1);
                            if (statefulButtonState == null) {
                                statefulButtonState = boostAllBannerState.e;
                            }
                            return new BoostAllBannerState(true, pluralResText, pluralResText2, false, statefulButtonState);
                        }
                    }
                }
                return BoostAllBannerState.a(boostAllBannerState, false, 30);
            }
        }
        return BoostAllBannerState.f;
    }

    public final int v6() {
        return F6() ? 2 : 1;
    }

    public final Activities.ProductList.Extras w6() {
        Activities.ProductList.Extras extras = this.G;
        if (extras != null) {
            return extras;
        }
        Intrinsics.p("pageExtras");
        throw null;
    }

    public final TrackingMetadata x6() {
        String str;
        List list;
        TrackableValue trackableValue = TrackableValue.X1;
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
        if (extraProductListSource == null) {
            Intrinsics.p("productListSource");
            throw null;
        }
        Activities.ProductList.ExtrasByProductGroup extrasByProductGroup = extraProductListSource instanceof Activities.ProductList.ExtrasByProductGroup ? (Activities.ProductList.ExtrasByProductGroup) extraProductListSource : null;
        if (extrasByProductGroup == null || (str = extrasByProductGroup.e) == null) {
            str = extraProductListSource.getE().d;
        }
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, str);
        trackingMetadataA.b(TrackableValue.W1, w6().d.d);
        MediatorLiveData mediatorLiveData = this.F;
        ProductListContract.ViewState viewState = (ProductListContract.ViewState) mediatorLiveData.e();
        if (viewState != null && (list = viewState.m) != null && (!list.isEmpty())) {
            Object objE = mediatorLiveData.e();
            Intrinsics.e(objE);
            trackingMetadataA.b(TrackableValue.S1, CollectionsKt.M(((ProductListContract.ViewState) objE).m, ", ", null, null, new au.com.woolworths.feature.product.list.compose.filter.a(25), 30));
        }
        return trackingMetadataA;
    }

    public final TrackingMetadata y6() {
        if (X6()) {
            return TrackingMetadata.Companion.a(TrackableValue.F2, "zero-result");
        }
        Activities.ProductList.ExtraProductListSource extraProductListSource = this.H;
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

    public final List z6() {
        List list = this.e.q;
        if (list != null) {
            return list;
        }
        PagedList pagedList = (PagedList) CollectionsKt.F(this.B.a());
        if (pagedList != null) {
            return CollectionsKt.G0(pagedList);
        }
        return null;
    }
}
