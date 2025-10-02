package au.com.woolworths.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics;
import au.com.woolworths.analytics.supers.couponbanner.EmCouponBannerAnalytics$Banner$Action$couponBannerTandcClick$1;
import au.com.woolworths.analytics.supers.local.ProductDetailsAnalytics;
import au.com.woolworths.analytics.supers.products.ReviewPreviewAnalytics;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.MarketplaceTrackingValue;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.modules.common.InlineErrorAction;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiDataExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionAnalytics;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.instore.navigation.AnalyticsManagerExtKt;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetRepository;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.details.ProductDetailsContract;
import au.com.woolworths.product.details.analytics.ProductDetailsActions;
import au.com.woolworths.product.details.models.CppProductsHorizontalList;
import au.com.woolworths.product.details.models.FormattedContentData;
import au.com.woolworths.product.details.models.FormattedContentDataKt;
import au.com.woolworths.product.details.models.HealthierHorizontalListData;
import au.com.woolworths.product.details.models.ProductDetailsMarketplace;
import au.com.woolworths.product.details.models.ProductImage;
import au.com.woolworths.product.details.models.ProductNutritionInfo;
import au.com.woolworths.product.details.models.ProductNutritionInfoKt;
import au.com.woolworths.product.details.ui.CollapsibleContentUiModel;
import au.com.woolworths.product.details.ui.ProductNutritionInfoUiModel;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.PurchaseRestriction;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.product.ui.ProductCardButtonType;
import au.com.woolworths.promotion.banner.data.PromotionBannerApiData;
import au.com.woolworths.promotion.banner.data.PromotionBannerApiDataKt;
import au.com.woolworths.promotion.banner.ui.PromotionBanner;
import au.com.woolworths.promotion.banner.ui.PromotionBannerAction;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsPreviewData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/details/ProductDetailsClickHandler;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Companion", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsViewModel extends ViewModel implements ProductDetailsClickHandler, FullPageErrorStateClickHandler {
    public static final InfoSectionAnalytics s = new InfoSectionAnalytics(Screens.n, Category.m, "Visit our website");
    public final ProductDetailsInteractor e;
    public final ShopAccountInteractor f;
    public final AnalyticsManager g;
    public final RewardsOfferActivationInteractor h;
    public final EducationBottomSheetRepository i;
    public final ListsInMemoryRepository j;
    public final FeatureToggleManager k;
    public final InstoreNavigationInteractor l;
    public final SupportedLinksHelper m;
    public String n;
    public final MutableLiveData o;
    public final PublishSubject p;
    public final PublishSubject q;
    public boolean r;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.details.ProductDetailsViewModel$2", f = "ProductDetailsViewModel.kt", l = {120}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.details.ProductDetailsViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends BasicRewardsOfferStatusData>>, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.q = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.q;
                this.p = 1;
                if (flowCollector.emit(EmptyList.d, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "trolleyResult", "Lau/com/woolworths/android/onesite/models/TrolleyResult;", "offersResults", "", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.details.ProductDetailsViewModel$3", f = "ProductDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.product.details.ProductDetailsViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function3<TrolleyResult, List<? extends BasicRewardsOfferStatusData>, Continuation<? super Unit>, Object> {
        public /* synthetic */ TrolleyResult p;
        public /* synthetic */ List q;

        public AnonymousClass3(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass3 anonymousClass3 = ProductDetailsViewModel.this.new AnonymousClass3((Continuation) obj3);
            anonymousClass3.p = (TrolleyResult) obj;
            anonymousClass3.q = (List) obj2;
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            TrolleyResult trolleyResult = this.p;
            List list = this.q;
            ProductDetailsViewModel productDetailsViewModel = ProductDetailsViewModel.this;
            MutableLiveData mutableLiveData = productDetailsViewModel.o;
            ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) mutableLiveData.e();
            List list2 = viewState != null ? viewState.f9310a : null;
            if (list2 == null) {
                list2 = EmptyList.d;
            }
            List list3 = list2;
            ?? arrayList = new ArrayList(CollectionsKt.s(list3, 10));
            for (Object objB : list3) {
                if (objB instanceof ProductCard) {
                    objB = ProductCardExtKt.B((ProductCard) objB, trolleyResult);
                }
                arrayList.add(objB);
            }
            List list4 = list;
            if (list4 == null || list4.isEmpty()) {
                list = null;
            }
            if (list != null) {
                arrayList = ProductAnalyticsExtKt.i(arrayList, list);
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(iterable, 10));
            for (Object objCopy$default : iterable) {
                if (objCopy$default instanceof CppProductsHorizontalList) {
                    CppProductsHorizontalList cppProductsHorizontalList = (CppProductsHorizontalList) objCopy$default;
                    List<Object> h = cppProductsHorizontalList.getH();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.s(h, 10));
                    for (Object objB2 : h) {
                        if (objB2 instanceof ProductCard) {
                            objB2 = ProductCardExtKt.B((ProductCard) objB2, trolleyResult);
                        }
                        arrayList3.add(objB2);
                    }
                    objCopy$default = CppProductsHorizontalList.copy$default(cppProductsHorizontalList, null, null, null, null, arrayList3, 15, null);
                }
                arrayList2.add(objCopy$default);
            }
            ProductDetailsViewModel.w6(productDetailsViewModel, mutableLiveData, arrayList2, null, null, null, 29);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.product.details.ProductDetailsViewModel$4", f = "ProductDetailsViewModel.kt", l = {126}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.product.details.ProductDetailsViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductDetailsViewModel.this.new AnonymousClass4(continuation);
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
            ProductDetailsViewModel productDetailsViewModel = ProductDetailsViewModel.this;
            RewardsOfferActivationInteractor rewardsOfferActivationInteractor = productDetailsViewModel.h;
            d dVar = new d(productDetailsViewModel, 0);
            this.p = 1;
            rewardsOfferActivationInteractor.c(dVar, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsViewModel$Companion;", "", "Lau/com/woolworths/base/shopapp/data/models/InfoSectionAnalytics;", "analyticsMarketplaceHowItWorks", "Lau/com/woolworths/base/shopapp/data/models/InfoSectionAnalytics;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ProductDetailsViewModel(ProductDetailsInteractor productDetailsInteractor, ShopAccountInteractor accountInteractor, TrolleyInteractor trolleyInteractor, ProductBoostInteractor productBoostInteractor, AnalyticsManager analyticsManager, RewardsOfferActivationInteractor rewardsOfferActivationInteractor, EducationBottomSheetRepository educationBottomSheetRepository, ListsInMemoryRepository listsInMemoryRepository, FeatureToggleManager featureToggleManager, InstoreNavigationInteractor instoreNavigationInteractor, SupportedLinksHelper supportedLinksHelper) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(listsInMemoryRepository, "listsInMemoryRepository");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        this.e = productDetailsInteractor;
        this.f = accountInteractor;
        this.g = analyticsManager;
        this.h = rewardsOfferActivationInteractor;
        this.i = educationBottomSheetRepository;
        this.j = listsInMemoryRepository;
        this.k = featureToggleManager;
        this.l = instoreNavigationInteractor;
        this.m = supportedLinksHelper;
        this.o = new MutableLiveData();
        PublishSubject publishSubject = new PublishSubject();
        this.p = publishSubject;
        this.q = publishSubject;
        final StateFlow p = trolleyInteractor.getP();
        FlowKt.E(FlowKt.l(new Flow<TrolleyResult>() { // from class: au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2", f = "ProductDetailsViewModel.kt", l = {52}, m = "emit")
                /* renamed from: au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                        boolean r0 = r6 instanceof au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1 r0 = (au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1 r0 = new au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L43
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.android.onesite.rxutils.Result r5 = (au.com.woolworths.android.onesite.rxutils.Result) r5
                        java.lang.Object r5 = r5.f4591a
                        if (r5 == 0) goto L43
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.details.ProductDetailsViewModel$special$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = p.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass2(2, null), productBoostInteractor.c), new AnonymousClass3(null)), ViewModelKt.a(this));
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass4(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p6(au.com.woolworths.product.details.ProductDetailsViewModel r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.product.details.ProductDetailsViewModel.p6(au.com.woolworths.product.details.ProductDetailsViewModel):void");
    }

    public static ArrayList v6(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (Object objA : list2) {
            if (objA instanceof FormattedContentData) {
                objA = FormattedContentDataKt.toUiModel((FormattedContentData) objA);
            } else if (objA instanceof ProductNutritionInfo) {
                objA = ProductNutritionInfoKt.toUiModel((ProductNutritionInfo) objA);
            } else if (objA instanceof InsetBannerApiData) {
                objA = InsetBannerApiDataExtKt.toUiModel((InsetBannerApiData) objA);
            } else if (objA instanceof PromotionBannerApiData) {
                objA = PromotionBannerApiDataKt.a((PromotionBannerApiData) objA);
            }
            arrayList.add(objA);
        }
        return arrayList;
    }

    public static void w6(ProductDetailsViewModel productDetailsViewModel, MutableLiveData mutableLiveData, List list, List list2, ProductDetailsErrorState productDetailsErrorState, RatingsAndReviewsPreviewData ratingsAndReviewsPreviewData, int i) {
        ProductDetailsContract.ViewState viewState;
        ProductDetailsContract.ViewState viewState2;
        ProductDetailsContract.ViewState viewState3;
        boolean z = false;
        if ((i & 1) != 0 && (viewState3 = (ProductDetailsContract.ViewState) mutableLiveData.e()) != null) {
            z = viewState3.c;
        }
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.d;
        if (i2 != 0 && ((viewState2 = (ProductDetailsContract.ViewState) mutableLiveData.e()) == null || (list = viewState2.f9310a) == null)) {
            list = emptyList;
        }
        if ((i & 4) != 0 && ((viewState = (ProductDetailsContract.ViewState) mutableLiveData.e()) == null || (list2 = viewState.b) == null)) {
            list2 = emptyList;
        }
        if ((i & 8) != 0) {
            productDetailsErrorState = null;
        }
        if ((i & 16) != 0) {
            ratingsAndReviewsPreviewData = null;
        }
        if (!productDetailsViewModel.k.c(BaseShopAppFeature.N) || ratingsAndReviewsPreviewData == null) {
            mutableLiveData.m(new ProductDetailsContract.ViewState(list, list2, z, productDetailsErrorState));
        } else {
            mutableLiveData.m(new ProductDetailsContract.ViewState(CollectionsKt.d0(ratingsAndReviewsPreviewData, list), list2, z, productDetailsErrorState));
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void F5(ProductCard productCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, "Carousel - ".concat(containerTitle));
        TrackingMetadata trackingMetadataS6 = s6(productCard);
        if (trackingMetadataS6 != null) {
            trackingMetadataA.a(trackingMetadataS6);
        }
        this.g.j(ProductDetailsActions.EmbeddedProductClick.e, trackingMetadataA);
        this.p.onNext(new ProductDetailsContract.Actions.LaunchProductDetails(productCard.getProductId()));
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void I5(ProductCard product) {
        Intrinsics.h(product, "product");
        TrackingMetadata trackingMetadataS6 = s6(product);
        if (trackingMetadataS6 != null) {
            this.g.j(ProductDetailsActions.OpenHealthOptionsCard.e, trackingMetadataS6);
        }
        this.p.onNext(new ProductDetailsContract.Actions.LaunchProductDetails(product.getProductId()));
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void M0(String link, final String linkLabel) {
        Intrinsics.h(link, "link");
        Intrinsics.h(linkLabel, "linkLabel");
        this.p.onNext(new ProductDetailsContract.Actions.LaunchRatingsAndReviews(link));
        ProductCard productCardC = ProductDetailsContractKt.c((ProductDetailsContract.ViewState) this.o.e());
        if (productCardC != null) {
            ReviewPreviewAnalytics.RatingsAndReviewsPreview.Action.d.getClass();
            this.g.i(new Event(linkLabel) { // from class: au.com.woolworths.analytics.supers.products.ReviewPreviewAnalytics$RatingsAndReviewsPreview$Action$Companion$showMoreButtonClicked$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ReviewPreviewAnalytics.RatingsAndReviewsPreview.e);
                    androidx.constraintlayout.core.state.a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "button_click");
                    androidx.constraintlayout.core.state.a.y("event.Label", String.valueOf(linkLabel), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "showmore_buttonclick";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "showmore_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, ProductAnalyticsExtKt.h(productCardC, null, null, 7));
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void M3(String link, final String linkLabel) {
        Intrinsics.h(link, "link");
        Intrinsics.h(linkLabel, "linkLabel");
        this.p.onNext(new ProductDetailsContract.Actions.LaunchWriteReviewIntent(link));
        ProductCard productCardC = ProductDetailsContractKt.c((ProductDetailsContract.ViewState) this.o.e());
        if (productCardC != null) {
            ReviewPreviewAnalytics.RatingsAndReviewsPreview.Action.d.getClass();
            this.g.i(new Event(linkLabel) { // from class: au.com.woolworths.analytics.supers.products.ReviewPreviewAnalytics$RatingsAndReviewsPreview$Action$Companion$writeReviewButtonClicked$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(ReviewPreviewAnalytics.RatingsAndReviewsPreview.e);
                    spreadBuilder.a(new Pair("screen.Type", "productdetail"));
                    spreadBuilder.a(new Pair("event.Category", "Product Ratings and Reviews"));
                    androidx.constraintlayout.core.state.a.y("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "link_click", spreadBuilder, linkLabel), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "productratings&reviews_linkclick";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "productratings&reviews_linkclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, ProductAnalyticsExtKt.h(productCardC, null, null, 7));
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void M5(ProductCard productCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, "Carousel - ".concat(containerTitle));
        TrackingMetadata trackingMetadataS6 = s6(productCard);
        if (trackingMetadataS6 != null) {
            trackingMetadataA.a(trackingMetadataS6);
        }
        this.g.j(ProductDetailsActions.EmbeddedProductAddToCart.e, trackingMetadataA);
        t6(true, true, ProductDetailsAnalytics.Details.Action.d, productCard);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void Q3() {
        this.g.c(ProductDetailsActions.HealthOptionsSwipeLeft.e);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void T1(ProductNutritionInfoUiModel nutritionInfoUiModel) {
        ProductDetailsContract.ViewState viewState;
        List list;
        Intrinsics.h(nutritionInfoUiModel, "nutritionInfoUiModel");
        boolean z = nutritionInfoUiModel.g;
        String title = nutritionInfoUiModel.f9317a;
        String servingsPerPack = nutritionInfoUiModel.b;
        String servingSize = nutritionInfoUiModel.c;
        String bottomCaption = nutritionInfoUiModel.d;
        List tableHeaderRow = nutritionInfoUiModel.e;
        List tableRows = nutritionInfoUiModel.f;
        Intrinsics.h(title, "title");
        Intrinsics.h(servingsPerPack, "servingsPerPack");
        Intrinsics.h(servingSize, "servingSize");
        Intrinsics.h(bottomCaption, "bottomCaption");
        Intrinsics.h(tableHeaderRow, "tableHeaderRow");
        Intrinsics.h(tableRows, "tableRows");
        ProductNutritionInfoUiModel productNutritionInfoUiModel = new ProductNutritionInfoUiModel(title, servingsPerPack, servingSize, bottomCaption, tableHeaderRow, tableRows, !z);
        MutableLiveData mutableLiveData = this.o;
        ProductDetailsContract.ViewState viewState2 = (ProductDetailsContract.ViewState) mutableLiveData.e();
        List list2 = viewState2 != null ? viewState2.f9310a : null;
        if (list2 == null) {
            list2 = EmptyList.d;
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list3, 10));
        for (Object obj : list3) {
            if (Intrinsics.c(obj, nutritionInfoUiModel)) {
                obj = productNutritionInfoUiModel;
            }
            arrayList.add(obj);
        }
        w6(this, mutableLiveData, arrayList, null, null, null, 29);
        TrackingMetadata trackingMetadataS6 = s6(null);
        if (trackingMetadataS6 != null) {
            Action action = z ? ProductDetailsActions.ExpandContent.e : ProductDetailsActions.CollapseContent.e;
            trackingMetadataS6.b(TrackableValue.o0, title);
            this.g.j(action, trackingMetadataS6);
        }
        if (!z || (viewState = (ProductDetailsContract.ViewState) mutableLiveData.e()) == null || (list = viewState.f9310a) == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext() && !(it.next() instanceof ProductNutritionInfoUiModel)) {
        }
        this.p.onNext(ProductDetailsContract.Actions.RequestFocusForNutritionTable.f9308a);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void U() {
        this.g.c(ProductDetailsActions.HealthOptionsSwipeRight.e);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void W5() {
        u6(true, true, ProductDetailsAnalytics.Details.Action.d);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void X5(ProductImage image) {
        List list;
        Intrinsics.h(image, "image");
        ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) this.o.e();
        if (viewState == null || (list = viewState.b) == null) {
            return;
        }
        String str = this.n;
        if (str == null) {
            Intrinsics.p("productId");
            throw null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String largeUrl = ((ProductImage) it.next()).getLargeUrl();
            if (largeUrl == null) {
                largeUrl = "";
            }
            arrayList.add(largeUrl);
        }
        this.p.onNext(new ProductDetailsContract.Actions.LaunchImageGallery(new Activities.ImageGallery.Extras(str, list.indexOf(image), arrayList)));
        TrackingMetadata trackingMetadataS6 = s6(null);
        if (trackingMetadataS6 != null) {
            this.g.j(ProductDetailsActions.OpenImageGallery.e, trackingMetadataS6);
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void d4(String couponCode) {
        Intrinsics.h(couponCode, "couponCode");
        this.p.onNext(new ProductDetailsContract.Actions.CopyEverydayMarketCouponCode(couponCode));
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void e(ProductCard product) {
        ButtonApiData button;
        Intrinsics.h(product, "product");
        InStoreAvailabilityInfo inStoreAvailabilityInfo = product.getInStoreAvailabilityInfo();
        String label = (inStoreAvailabilityInfo == null || (button = inStoreAvailabilityInfo.getButton()) == null) ? null : button.getLabel();
        if (label == null) {
            label = "";
        }
        this.g.c(new ProductDetailsActions.OpenProductAvailability(label));
        this.p.onNext(new ProductDetailsContract.Actions.LaunchAvailabilityMessageBottomSheet(product));
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void g1(String url, String urlText) {
        Intrinsics.h(url, "url");
        Intrinsics.h(urlText, "urlText");
        this.p.onNext(new ProductDetailsContract.Actions.WebLinkClick(url));
        ProductCard productCardC = ProductDetailsContractKt.c((ProductDetailsContract.ViewState) this.o.e());
        if (productCardC != null) {
            EmCouponBannerAnalytics.Banner.Action action = new EmCouponBannerAnalytics.Banner(productCardC.getName(), "productdetail", Screens.t.getE()).h;
            action.getClass();
            this.g.g(new EmCouponBannerAnalytics$Banner$Action$couponBannerTandcClick$1(action, urlText));
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void g4(InfoSection infoSection) {
        Intrinsics.h(infoSection, "infoSection");
        this.g.c(ProductDetailsActions.OpenEverydayMarketplaceHowItWorks.e);
        this.p.onNext(new ProductDetailsContract.Actions.LaunchMarketplaceInfoScreen(infoSection, s));
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void h1(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        this.p.onNext(new ProductDetailsContract.Actions.LaunchAddToList(productCard));
        TrackingMetadata trackingMetadataS6 = s6(productCard);
        if (trackingMetadataS6 != null) {
            this.g.j(ProductDetailsActions.OpenAddToList.e, trackingMetadataS6);
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void i2(ProductCard productCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, "Carousel - ".concat(containerTitle));
        TrackingMetadata trackingMetadataS6 = s6(productCard);
        if (trackingMetadataS6 != null) {
            trackingMetadataA.a(trackingMetadataS6);
        }
        this.g.j(ProductDetailsActions.EmbeddedProductAddToList.e, trackingMetadataA);
        this.p.onNext(new ProductDetailsContract.Actions.LaunchAddToList(productCard));
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void i5() {
        TrackingMetadata trackingMetadataS6 = s6(null);
        if (trackingMetadataS6 != null) {
            this.g.j(ProductDetailsActions.SwipeImageCarousel.e, trackingMetadataS6);
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void k0() {
        u6(true, false, ProductDetailsAnalytics.Details.Action.e);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void k3(ProductCard productCard, String str) {
        Intrinsics.h(productCard, "productCard");
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.o0, "Carousel - ".concat(str));
        TrackingMetadata trackingMetadataS6 = s6(productCard);
        if (trackingMetadataS6 != null) {
            trackingMetadataA.a(trackingMetadataS6);
        }
        this.g.j(ProductDetailsActions.EmbeddedProductAddToCart.e, trackingMetadataA);
        t6(true, true, ProductDetailsAnalytics.Details.Action.e, productCard);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void m(DynamicSizeCardData dynamicSizeCardData) {
        Intrinsics.h(dynamicSizeCardData, "dynamicSizeCardData");
        if (dynamicSizeCardData instanceof ActionableCard) {
            this.p.onNext(new ProductDetailsContract.Actions.LaunchActionableCard((ActionableCard) dynamicSizeCardData));
        }
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void o3(String link, final String linkLabel) {
        Intrinsics.h(link, "link");
        Intrinsics.h(linkLabel, "linkLabel");
        this.p.onNext(new ProductDetailsContract.Actions.LaunchRatingsAndReviews(link));
        ProductCard productCardC = ProductDetailsContractKt.c((ProductDetailsContract.ViewState) this.o.e());
        if (productCardC != null) {
            ReviewPreviewAnalytics.RatingsAndReviewsPreview.Action.d.getClass();
            this.g.i(new Event(linkLabel) { // from class: au.com.woolworths.analytics.supers.products.ReviewPreviewAnalytics$RatingsAndReviewsPreview$Action$Companion$seeAllButtonClicked$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(ReviewPreviewAnalytics.RatingsAndReviewsPreview.e);
                    androidx.constraintlayout.core.state.a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "link_click");
                    androidx.constraintlayout.core.state.a.y("event.Label", String.valueOf(linkLabel), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "seeall_linkclick";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "seeall_linkclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, ProductAnalyticsExtKt.h(productCardC, null, null, 7));
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerClickListener
    public final void onActionClicked(InsetBanner insetBanner) {
        Intrinsics.h(insetBanner, "insetBanner");
        InlineErrorAction e = insetBanner.getE();
        InlineErrorAction.Link link = e instanceof InlineErrorAction.Link ? (InlineErrorAction.Link) e : null;
        if (link == null) {
            throw new IllegalStateException("Action for product details InsetBanner must be LINK");
        }
        this.p.onNext(new ProductDetailsContract.Actions.WebLinkClick(link.e));
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        q6();
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void q1(CollapsibleContentUiModel collapsibleContentUiModel) {
        Intrinsics.h(collapsibleContentUiModel, "collapsibleContentUiModel");
        boolean z = collapsibleContentUiModel.e;
        String title = collapsibleContentUiModel.f9315a;
        String content = collapsibleContentUiModel.b;
        String str = collapsibleContentUiModel.c;
        boolean z2 = collapsibleContentUiModel.d;
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        CollapsibleContentUiModel collapsibleContentUiModel2 = new CollapsibleContentUiModel(title, content, str, z2, !z);
        MutableLiveData mutableLiveData = this.o;
        ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) mutableLiveData.e();
        List list = viewState != null ? viewState.f9310a : null;
        if (list == null) {
            list = EmptyList.d;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list2, 10));
        for (Object obj : list2) {
            if (Intrinsics.c(obj, collapsibleContentUiModel)) {
                obj = collapsibleContentUiModel2;
            }
            arrayList.add(obj);
        }
        w6(this, mutableLiveData, arrayList, null, null, null, 29);
        TrackingMetadata trackingMetadataS6 = s6(null);
        if (trackingMetadataS6 != null) {
            Action action = z ? ProductDetailsActions.ExpandContent.e : ProductDetailsActions.CollapseContent.e;
            trackingMetadataS6.b(TrackableValue.o0, title);
            this.g.j(action, trackingMetadataS6);
        }
    }

    public final void q6() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new ProductDetailsViewModel$fetchProductDetailData$1(this, null), 3);
    }

    public final ProductCardButtonType r6() {
        ProductCard productCardC;
        ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) this.o.e();
        if (viewState == null || (productCardC = ProductDetailsContractKt.c(viewState)) == null) {
            return null;
        }
        return ProductCardExtKt.h(productCardC, this.j.g(), false, false);
    }

    public final TrackingMetadata s6(ProductCard productCard) {
        MutableLiveData mutableLiveData = this.o;
        if (mutableLiveData.e() != null) {
            ProductDetailsMarketplace productDetailsMarketplaceB = ProductDetailsContractKt.b((ProductDetailsContract.ViewState) mutableLiveData.e());
            MarketplaceTrackingValue marketplaceTrackingValue = productDetailsMarketplaceB != null ? new MarketplaceTrackingValue(productDetailsMarketplaceB.getBrandName(), productDetailsMarketplaceB.getSellerName(), productDetailsMarketplaceB.getDispatchNote()) : null;
            if (productCard == null) {
                productCard = ProductDetailsContractKt.c((ProductDetailsContract.ViewState) mutableLiveData.e());
            }
            if (productCard != null) {
                return ProductAnalyticsExtKt.h(productCard, null, marketplaceTrackingValue, 3);
            }
        }
        return null;
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void t(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        AnalyticsManagerExtKt.a(this.g, productCard.getName(), "productdetail", "productdetails", productCard);
        this.p.onNext(new ProductDetailsContract.Actions.LaunchInStoreMap(productCard));
    }

    public final void t6(boolean z, boolean z2, Event event, ProductCard productCard) {
        ProductDetailsMarketplace productDetailsMarketplaceB;
        ProductDetailsMarketplace productDetailsMarketplaceB2;
        AnalyticsManager analyticsManager = this.g;
        PublishSubject publishSubject = this.p;
        if (z2 && productCard.getPurchaseRestriction() == PurchaseRestriction.LEGAL_AGE_RESTRICTION) {
            ShopAccountInteractor shopAccountInteractor = this.f;
            if (!shopAccountInteractor.K()) {
                publishSubject.onNext(new ProductDetailsContract.Actions.DisplayRestrictedItemPrompt(shopAccountInteractor.d()));
                analyticsManager.c(ProductDetailsActions.RestrictedItemLoginPrompt.e);
                return;
            }
        }
        MutableLiveData mutableLiveData = this.o;
        ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) mutableLiveData.e();
        InfoSection info = null;
        BottomSheetContent.Marketplace bottomSheet = (viewState == null || (productDetailsMarketplaceB2 = ProductDetailsContractKt.b(viewState)) == null) ? null : productDetailsMarketplaceB2.getBottomSheet();
        ProductDetailsContract.ViewState viewState2 = (ProductDetailsContract.ViewState) mutableLiveData.e();
        if (viewState2 != null && (productDetailsMarketplaceB = ProductDetailsContractKt.b(viewState2)) != null) {
            info = productDetailsMarketplaceB.getInfo();
        }
        if (z && this.i.f8753a.getBoolean("education_bottom_sheet", true) && bottomSheet != null && info != null) {
            publishSubject.onNext(new ProductDetailsContract.Actions.LaunchEducationBottomSheet(bottomSheet, info));
            return;
        }
        publishSubject.onNext(new ProductDetailsContract.Actions.AddButtonClick(productCard, (bottomSheet == null || info == null) ? false : true));
        TrackingMetadata trackingMetadataS6 = s6(productCard);
        if (trackingMetadataS6 != null) {
            analyticsManager.i(event, trackingMetadataS6);
        }
    }

    public final void u6(boolean z, boolean z2, ProductDetailsAnalytics.Details.Action trackEvent) {
        ProductCard productCardC;
        Intrinsics.h(trackEvent, "trackEvent");
        ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) this.o.e();
        if (viewState == null || (productCardC = ProductDetailsContractKt.c(viewState)) == null) {
            return;
        }
        t6(z, z2, trackEvent, productCardC);
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void v0(HealthierHorizontalListData data) {
        Intrinsics.h(data, "data");
        this.g.c(ProductDetailsActions.OpenHealthOptionsMoreInfo.e);
        this.p.onNext(new ProductDetailsContract.Actions.LaunchHealthierBottomSheet(data));
    }

    @Override // au.com.woolworths.product.details.ProductDetailsClickHandler
    public final void z0(String sellerName, String channel, String facet) {
        Intrinsics.h(sellerName, "sellerName");
        Intrinsics.h(channel, "channel");
        Intrinsics.h(facet, "facet");
        this.p.onNext(new ProductDetailsContract.Actions.LaunchMarketplaceSellerItemsList(sellerName, channel, facet));
    }

    @Override // au.com.woolworths.promotion.banner.ui.PromotionBannerListener
    public final void z3(PromotionBanner promotionBanner) {
        PromotionBannerAction promotionBannerAction = promotionBanner.b;
        boolean z = promotionBannerAction instanceof PromotionBannerAction.Link;
        PublishSubject publishSubject = this.p;
        if (z) {
            publishSubject.onNext(new ProductDetailsContract.Actions.WebLinkClick(((PromotionBannerAction.Link) promotionBannerAction).d));
        } else if (promotionBannerAction instanceof PromotionBannerAction.LaunchPromotionDetails) {
            publishSubject.onNext(new ProductDetailsContract.Actions.LaunchPromotionScreen(((PromotionBannerAction.LaunchPromotionDetails) promotionBannerAction).d));
        } else if (!promotionBannerAction.equals(PromotionBannerAction.None.d)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
