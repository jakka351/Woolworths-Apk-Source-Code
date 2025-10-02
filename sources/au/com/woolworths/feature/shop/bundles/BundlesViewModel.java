package au.com.woolworths.feature.shop.bundles;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.bundles.BundlesAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.feature.shop.bundles.BundlesUiEffect;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOption;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOptions;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesDataKt;
import au.com.woolworths.feature.shop.bundles.data.BundlesExtKt;
import au.com.woolworths.feature.shop.bundles.data.UpdateCartBundleQuantity;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.offers.ProductBoostInteractor;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesViewModel;", "Landroidx/lifecycle/ViewModel;", "Factory", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BundlesViewModel extends ViewModel {
    public final e A;
    public final String e;
    public final BundlesInteractor f;
    public final CartUpdateInteractor g;
    public final CollectionModeInteractor h;
    public final InstoreNavigationInteractor i;
    public final FeatureToggleManager j;
    public final ProductBoostInteractor k;
    public final AnalyticsManager l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final SharedFlowImpl o;
    public final Flow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final SharedFlowImpl s;
    public final MutableStateFlow t;
    public final MutableStateFlow u;
    public final MutableStateFlow v;
    public final MutableStateFlow w;
    public final ArrayList x;
    public List y;
    public boolean z;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$1", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.bundles.BundlesViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BundlesViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            BundlesViewModel bundlesViewModel = BundlesViewModel.this;
            MutableStateFlow mutableStateFlow = bundlesViewModel.m;
            BuildersKt.c(ViewModelKt.a(bundlesViewModel), null, null, new BundlesViewModel$updateCartThroughQuantityMap$1(bundlesViewModel, MapsKt.q(((BundlesUiState) mutableStateFlow.getValue()).f), MapsKt.q(((BundlesUiState) mutableStateFlow.getValue()).g), null), 3);
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "offerInfoList", "", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$2", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.bundles.BundlesViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends BasicRewardsOfferStatusData>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = BundlesViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((List) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            BundlesViewModel bundlesViewModel = BundlesViewModel.this;
            bundlesViewModel.y = list;
            MutableStateFlow mutableStateFlow = bundlesViewModel.q;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, PagingDataTransforms.a((PagingData) value, new BundlesViewModel$updateProductWithOffersInfo$1$1(list, null))));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cartQuantities", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$3", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.bundles.BundlesViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public /* synthetic */ int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = BundlesViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.p = ((Number) obj).intValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            int i = this.p;
            BundlesViewModel bundlesViewModel = BundlesViewModel.this;
            MutableStateFlow mutableStateFlow = bundlesViewModel.m;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, BundlesUiState.a((BundlesUiState) value, new Integer(i), false, null, false, null, null, null, null, null, 510)));
            if (bundlesViewModel.z) {
                bundlesViewModel.q6(false);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/modules/collectionmode/common/CollectionMode;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$4", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.bundles.BundlesViewModel$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CollectionMode, Continuation<? super Unit>, Object> {
        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return BundlesViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) create((CollectionMode) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass4.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            BundlesViewModel bundlesViewModel = BundlesViewModel.this;
            if (bundlesViewModel.z) {
                bundlesViewModel.q6(false);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lau/com/woolworths/feature/shop/bundles/data/UpdateCartBundleQuantity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.bundles.BundlesViewModel$5", f = "BundlesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.bundles.BundlesViewModel$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<UpdateCartBundleQuantity, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass5 anonymousClass5 = BundlesViewModel.this.new AnonymousClass5(continuation);
            anonymousClass5.p = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass5 anonymousClass5 = (AnonymousClass5) create((UpdateCartBundleQuantity) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass5.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            UpdateCartBundleQuantity updateCartBundleQuantity = (UpdateCartBundleQuantity) this.p;
            if (updateCartBundleQuantity != null) {
                BundlesViewModel.p6(BundlesViewModel.this, updateCartBundleQuantity);
            }
            return Unit.f24250a;
        }
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/bundles/BundlesViewModel$Factory;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        BundlesViewModel a(String str);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6740a;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                ActionType actionType = ActionType.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6740a = iArr;
        }
    }

    public BundlesViewModel(String str, BundlesInteractor interactor, CartUpdateInteractor cartUpdateInteractor, CollectionModeInteractor collectionModeInteractor, InstoreNavigationInteractor instoreNavigationInteractor, FeatureToggleManager featureToggleManager, ProductBoostInteractor productBoostInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(interactor, "interactor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(productBoostInteractor, "productBoostInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = str;
        this.f = interactor;
        this.g = cartUpdateInteractor;
        this.h = collectionModeInteractor;
        this.i = instoreNavigationInteractor;
        this.j = featureToggleManager;
        this.k = productBoostInteractor;
        this.l = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(BundlesUiState.j);
        this.m = mutableStateFlowA;
        this.n = mutableStateFlowA;
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, bufferOverflow, 1);
        this.o = sharedFlowImplB;
        this.p = FlowKt.a(sharedFlowImplB);
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(PagingData.Companion.a());
        this.q = mutableStateFlowA2;
        this.r = mutableStateFlowA2;
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(0, 1, bufferOverflow);
        this.s = sharedFlowImplA;
        Boolean bool = Boolean.FALSE;
        this.t = StateFlowKt.a(bool);
        this.u = StateFlowKt.a(null);
        this.v = StateFlowKt.a(null);
        this.w = StateFlowKt.a(bool);
        this.x = new ArrayList();
        this.A = new e(this, 0);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), FlowKt.o(sharedFlowImplA, 1000L)), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), productBoostInteractor.c), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), cartUpdateInteractor.l), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass4(null), collectionModeInteractor.getM()), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass5(null), interactor.a()), ViewModelKt.a(this));
    }

    public static final void p6(BundlesViewModel bundlesViewModel, UpdateCartBundleQuantity updateCartBundleQuantity) {
        Object value;
        MutableStateFlow mutableStateFlow = bundlesViewModel.q;
        PagingData pagingData = (PagingData) mutableStateFlow.getValue();
        MutableStateFlow mutableStateFlow2 = bundlesViewModel.m;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.d(value, BundlesUiState.a((BundlesUiState) value, null, false, null, false, null, EmptyMap.d, EmptyMap.d, null, null, 279)));
        mutableStateFlow.setValue(PagingDataTransforms.a(pagingData, new BundlesViewModel$processCartUpdateResponse$2(updateCartBundleQuantity, bundlesViewModel, null)));
    }

    public final void q6(boolean z) {
        MutableStateFlow mutableStateFlow;
        Object value;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        CollectionModeInteractor collectionModeInteractor;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        do {
            mutableStateFlow = this.t;
            value = mutableStateFlow.getValue();
            ((Boolean) value).getClass();
        } while (!mutableStateFlow.d(value, Boolean.valueOf(z)));
        do {
            mutableStateFlow2 = this.v;
            value2 = mutableStateFlow2.getValue();
            collectionModeInteractor = this.h;
        } while (!mutableStateFlow2.d(value2, collectionModeInteractor.b() ? collectionModeInteractor.a() : null));
        BuildersKt.c(ViewModelKt.a(this), null, null, new BundlesViewModel$hardRefresh$1(this, null), 3);
        do {
            mutableStateFlow3 = this.m;
            value3 = mutableStateFlow3.getValue();
        } while (!mutableStateFlow3.d(value3, BundlesUiState.a((BundlesUiState) value3, null, false, null, false, null, null, null, null, null, 251)));
        FlowKt.E(FlowKt.Q(FlowKt.j(this.w, mutableStateFlow, this.u, mutableStateFlow2, new BundlesViewModel$fetchBundles$3(this, null)), new BundlesViewModel$fetchBundles$$inlined$flatMapLatest$1(this, null)), ViewModelKt.a(this));
    }

    public final AnalyticsData r6() {
        BundlesData bundlesData = ((BundlesUiState) this.n.getValue()).c;
        BundlesData.BundlesLandingPage bundlesLandingPage = bundlesData instanceof BundlesData.BundlesLandingPage ? (BundlesData.BundlesLandingPage) bundlesData : null;
        if (bundlesLandingPage != null) {
            return bundlesLandingPage.c;
        }
        return null;
    }

    public final String s6() {
        BundleSortOptions bundleSortOptions;
        Object next;
        BundlesData bundlesData = ((BundlesUiState) this.n.getValue()).c;
        String str = null;
        BundlesData.BundlesLandingPage bundlesLandingPage = bundlesData instanceof BundlesData.BundlesLandingPage ? (BundlesData.BundlesLandingPage) bundlesData : null;
        if (bundlesLandingPage != null && (bundleSortOptions = bundlesLandingPage.f6763a.c) != null) {
            Iterator it = bundleSortOptions.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BundleSortOption) next).b.c) {
                    break;
                }
            }
            BundleSortOption bundleSortOption = (BundleSortOption) next;
            if (bundleSortOption != null) {
                str = bundleSortOption.b.b;
            }
        }
        return str == null ? "" : str;
    }

    public final void t6(ActionData actionData) {
        if (WhenMappings.f6740a[actionData.getType().ordinal()] == 1) {
            this.o.f(new BundlesUiEffect.LaunchDeepLink(actionData.getAction()));
            AnalyticsData analytics = actionData.getAnalytics();
            if (analytics != null) {
                this.l.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analytics, r6(), false)));
            }
        }
    }

    public final void u6(Bundle bundle, int i, final String str, boolean z) {
        AnalyticsData analyticsDataC;
        Event event;
        MutableStateFlow mutableStateFlow;
        Object value;
        LinkedHashMap linkedHashMapS;
        LinkedHashMap linkedHashMapS2;
        Double inTrolley;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(bundle, Integer.valueOf(i));
        MapBuilder mapBuilderB = BundlesExtKt.b(bundle, i);
        List list = bundle.b;
        ArrayList arrayListA = BundlesDataKt.a(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add(((BundleProductCard) it.next()).f6758a);
        }
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ProductCard productCard = (ProductCard) it2.next();
            Double d = (Double) mapBuilderB.get(productCard.getProductId());
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
            ProductTrolleyData trolley = productCard.getTrolley();
            if (trolley != null && (inTrolley = trolley.getInTrolley()) != null) {
                dDoubleValue = inTrolley.doubleValue();
            }
            arrayList2.add(String.valueOf(Math.abs(dDoubleValue2 - dDoubleValue)));
        }
        final int iAbs = Math.abs(bundle.c.d - i);
        AnalyticsData analyticsData = bundle.d;
        if (analyticsData != null) {
            analyticsDataC = AnalyticsDataKt.c(analyticsData, r6(), false);
            Iterator it3 = BundlesDataKt.a(list).iterator();
            while (it3.hasNext()) {
                analyticsDataC = AnalyticsDataKt.c(analyticsDataC, ((BundleProductCard) it3.next()).f6758a.getProductCardAnalytics(), true);
            }
        } else {
            analyticsDataC = null;
        }
        ArrayList arrayListA2 = BundlesDataKt.a(list);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayListA2, 10));
        Iterator it4 = arrayListA2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((BundleProductCard) it4.next()).f6758a);
        }
        if (z) {
            BundlesAnalytics.Bundles.Action.Companion companion = BundlesAnalytics.Bundles.Action.d;
            final ArrayList arrayListA3 = BundlesExtKt.a(bundle);
            companion.getClass();
            event = new Event(iAbs, str, arrayList2, arrayListA3) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$bundleAddToCartClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Value", String.valueOf(iAbs)));
                    spreadBuilder.a(new Pair("event.Label", str));
                    spreadBuilder.a(new Pair("product.Quantity", arrayList2));
                    spreadBuilder.a(new Pair("product.IDs", arrayListA3));
                    ArrayList arrayList4 = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList4.toArray(new Pair[arrayList4.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "add_bundle_to_cart";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "add_bundle_to_cart".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        } else {
            BundlesAnalytics.Bundles.Action.Companion companion2 = BundlesAnalytics.Bundles.Action.d;
            final ArrayList arrayListA4 = BundlesExtKt.a(bundle);
            companion2.getClass();
            event = new Event(iAbs, str, arrayList2, arrayListA4) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$bundleQuantityStepperMinus$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Value", String.valueOf(iAbs)));
                    spreadBuilder.a(new Pair("event.Label", str));
                    spreadBuilder.a(new Pair("product.Quantity", arrayList2));
                    spreadBuilder.a(new Pair("product.IDs", arrayListA4));
                    ArrayList arrayList4 = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList4.toArray(new Pair[arrayList4.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "remove_bundle_from_cart";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event2 = (Event) obj;
                    return "remove_bundle_from_cart".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            };
        }
        Event eventB = AnalyticsDataKt.b(event, analyticsDataC);
        TrackingMetadata trackingMetadataF = ProductAnalyticsExtKt.f(arrayList3);
        trackingMetadataF.b(TrackableValue.d2, arrayList2);
        this.l.i(eventB, trackingMetadataF);
        do {
            mutableStateFlow = this.m;
            value = mutableStateFlow.getValue();
            linkedHashMapS = MapsKt.s(((BundlesUiState) mutableStateFlow.getValue()).f);
            linkedHashMapS.putAll(mapBuilderB);
            linkedHashMapS2 = MapsKt.s(((BundlesUiState) mutableStateFlow.getValue()).g);
            linkedHashMapS2.putAll(linkedHashMap);
        } while (!mutableStateFlow.d(value, BundlesUiState.a((BundlesUiState) value, null, false, null, false, null, linkedHashMapS, linkedHashMapS2, null, null, 287)));
        this.s.f(Unit.f24250a);
    }
}
