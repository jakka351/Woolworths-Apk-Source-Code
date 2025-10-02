package au.com.woolworths.feature.shop.catalogue.productlist;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.local.CatalogueAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValue;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.TrolleyResult;
import au.com.woolworths.android.onesite.models.TrolleyResultExtKt;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.rewards.offers.detail.composable.f;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTrackingKt;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel;
import au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts.AdditionalProductItemState;
import au.com.woolworths.feature.shop.catalogue.productlist.analytics.CatalogueProductListAction;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueItemTracking;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueItemTrackingKt;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueProductDetailsAdditionalItems;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueProductDetailsList;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueProductDetailsListInfo;
import au.com.woolworths.feature.shop.catalogue.productlist.model.CatalogueProductDetailsListInfoWrapper;
import au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.models.ProductListByProductIdsApiData;
import au.com.woolworths.product.models.ProductTileButtonType;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListFullPageErrorActionInterface;", "Lau/com/woolworths/feature/shop/catalogue/productlist/OnMaxLinesToggleListener;", "Lau/com/woolworths/feature/shop/catalogue/productlist/PrimaryButtonClickListener;", "State", "NoProductListException", "CatalogueTrackingCache", "Companion", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueProductListViewModel extends ViewModel implements FullPageErrorStateClickHandler, CatalogueProductListFullPageErrorActionInterface, OnMaxLinesToggleListener, PrimaryButtonClickListener {
    public static final /* synthetic */ KProperty[] s = {Reflection.f24268a.e(new MutablePropertyReference1Impl(CatalogueProductListViewModel.class, "state", "getState()Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State;", 0))};
    public final AnalyticsManager e;
    public final CatalogueProductListInteractor f;
    public final AnalyticsManager g;
    public final FeatureToggleManager h;
    public final InstoreNavigationInteractor i;
    public final CartUpdateInteractor j;
    public final MutableLiveData k;
    public final SharedFlowImpl l;
    public String m;
    public String n;
    public String o;
    public final CatalogueTrackingCache p;
    public final Lazy q;
    public final CatalogueProductListViewModel$special$$inlined$observable$1 r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel$1", f = "CatalogueProductListViewModel.kt", l = {130}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/android/onesite/models/TrolleyResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel$1$1", f = "CatalogueProductListViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel$1$1, reason: invalid class name and collision with other inner class name */
        final class C01611 extends SuspendLambda implements Function2<TrolleyResult, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ CatalogueProductListViewModel q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01611(CatalogueProductListViewModel catalogueProductListViewModel, Continuation continuation) {
                super(2, continuation);
                this.q = catalogueProductListViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01611 c01611 = new C01611(this.q, continuation);
                c01611.p = obj;
                return c01611;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C01611 c01611 = (C01611) create((TrolleyResult) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c01611.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                TrolleyResult trolleyResult = (TrolleyResult) this.p;
                KProperty[] kPropertyArr = CatalogueProductListViewModel.s;
                CatalogueProductListViewModel catalogueProductListViewModel = this.q;
                State state = (State) catalogueProductListViewModel.r.getValue(catalogueProductListViewModel, CatalogueProductListViewModel.s[0]);
                if (state instanceof State.Loaded) {
                    ProductList productList = ((State.Loaded) state).f6921a;
                    Intrinsics.h(productList, "productList");
                    Intrinsics.h(trolleyResult, "trolleyResult");
                    catalogueProductListViewModel.w6(new State.Loaded(productList, trolleyResult));
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CatalogueProductListViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                CatalogueProductListViewModel catalogueProductListViewModel = CatalogueProductListViewModel.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01611(catalogueProductListViewModel, null), new CatalogueProductListInteractor$successfulTrolleyResults$$inlined$mapNotNull$1(new CatalogueProductListInteractor$successfulTrolleyResults$$inlined$filter$1(catalogueProductListViewModel.f.c.getP())));
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

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$CatalogueTrackingCache;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CatalogueTrackingCache {

        /* renamed from: a, reason: collision with root package name */
        public List f6919a;
        public List b;
        public CatalogueTracking c;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$Companion;", "", "", "CURRENT_CATALOGUE_INFO_DATE_FORMAT", "Ljava/lang/String;", "SNEAK_PEEK_CATALOGUE_WARNING_DATE_FORMAT", "CURRENT_CATALOGUE_INFO", "SNEAK_PEEK_CATALOGUE_WARNING", "", "ACTIONS_BUFFER_SIZE", "I", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$NoProductListException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoProductListException extends Exception {
        public static final NoProductListException d = new NoProductListException();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State;", "", "Uninitialized", "Loading", "Loaded", "Error", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Error;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Loaded;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Loading;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Uninitialized;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class State {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Error;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends State {

            /* renamed from: a, reason: collision with root package name */
            public final Exception f6920a;

            public Error(Exception exc) {
                this.f6920a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6920a, ((Error) obj).f6920a);
            }

            public final int hashCode() {
                return this.f6920a.hashCode();
            }

            public final String toString() {
                return "Error(exception=" + this.f6920a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Loaded;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loaded extends State {

            /* renamed from: a, reason: collision with root package name */
            public final ProductList f6921a;
            public final TrolleyResult b;

            public Loaded(ProductList productList, TrolleyResult trolleyResult) {
                Intrinsics.h(productList, "productList");
                Intrinsics.h(trolleyResult, "trolleyResult");
                this.f6921a = productList;
                this.b = trolleyResult;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return Intrinsics.c(this.f6921a, loaded.f6921a) && Intrinsics.c(this.b, loaded.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6921a.hashCode() * 31);
            }

            public final String toString() {
                return "Loaded(productList=" + this.f6921a + ", trolleyResult=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Loading;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Loading extends State {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6922a = new Loading();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State$Uninitialized;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListViewModel$State;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Uninitialized extends State {

            /* renamed from: a, reason: collision with root package name */
            public static final Uninitialized f6923a = new Uninitialized();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6924a;

        static {
            int[] iArr = new int[ProductTileButtonType.values().length];
            try {
                iArr[ProductTileButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductTileButtonType.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6924a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel$special$$inlined$observable$1] */
    public CatalogueProductListViewModel(AnalyticsManager analyticsManagerOld, CatalogueProductListInteractor catalogueProductListInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, InstoreNavigationInteractor instoreNavigationInteractor, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(analyticsManagerOld, "analyticsManagerOld");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = analyticsManagerOld;
        this.f = catalogueProductListInteractor;
        this.g = analyticsManager;
        this.h = featureToggleManager;
        this.i = instoreNavigationInteractor;
        this.j = cartUpdateInteractor;
        this.k = new MutableLiveData();
        this.l = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.p = new CatalogueTrackingCache();
        this.q = LazyKt.b(new f(this, 16));
        this.r = new ObservableProperty<State>() { // from class: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel$special$$inlined$observable$1
            {
                super(CatalogueProductListViewModel.State.Uninitialized.f6923a);
            }

            @Override // kotlin.properties.ObservableProperty
            public final void afterChange(KProperty property, Object obj, Object obj2) throws NumberFormatException {
                CatalogueProductListContract.ViewState viewStateR6;
                String str;
                Integer price;
                CatalogueProductListViewModel catalogueProductListViewModel = this.b;
                CatalogueProductListViewModel.CatalogueTrackingCache catalogueTrackingCache = catalogueProductListViewModel.p;
                Intrinsics.h(property, "property");
                CatalogueProductListViewModel.State state = (CatalogueProductListViewModel.State) obj2;
                if ((((CatalogueProductListViewModel.State) obj) instanceof CatalogueProductListViewModel.State.Loading) && (state instanceof CatalogueProductListViewModel.State.Loaded)) {
                    CatalogueTracking catalogueTracking = catalogueTrackingCache.c;
                    CatalogueItemTracking catalogueItemTracking = (CatalogueItemTracking) catalogueProductListViewModel.q.getD();
                    ProductList productList = ((CatalogueProductListViewModel.State.Loaded) state).f6921a;
                    CatalogueProductDetailsListInfo catalogueProductDetailsListInfo = productList.f6948a;
                    Intrinsics.h(catalogueProductDetailsListInfo, "<this>");
                    List<CatalogueProductDetailsAdditionalItems> additionalItems = ((CatalogueProductDetailsListInfoWrapper) CollectionsKt.D(catalogueProductDetailsListInfo.getCatalogueProductListDetails())).getCatalogueProductDetailsList().getAdditionalItems();
                    List<CatalogueProductDetailsAdditionalItems> listD0 = EmptyList.d;
                    if (additionalItems == null) {
                        additionalItems = listD0;
                    }
                    List<ProductCard> value = productList.b.getProducts();
                    catalogueTrackingCache.getClass();
                    catalogueTrackingCache.f6919a = additionalItems;
                    Intrinsics.h(value, "value");
                    catalogueTrackingCache.b = value;
                    AnalyticsManager analyticsManager2 = catalogueProductListViewModel.g;
                    CatalogueProductListAction.LoadSuccess loadSuccess = CatalogueProductListAction.LoadSuccess.e;
                    List<CatalogueProductDetailsAdditionalItems> list = additionalItems;
                    int iH = MapsKt.h(CollectionsKt.s(list, 10));
                    if (iH < 16) {
                        iH = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
                    for (Object obj3 : list) {
                        linkedHashMap.put(ProductId.INSTANCE.create(((CatalogueProductDetailsAdditionalItems) obj3).getSkuCode()), obj3);
                    }
                    List<ProductCard> list2 = value;
                    int iH2 = MapsKt.h(CollectionsKt.s(list2, 10));
                    if (iH2 < 16) {
                        iH2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2);
                    for (Object obj4 : list2) {
                        linkedHashMap2.put(ProductId.INSTANCE.create(((ProductCard) obj4).getProductId()), obj4);
                    }
                    for (ProductId productId : linkedHashMap.keySet()) {
                        List<CatalogueProductDetailsAdditionalItems> list3 = listD0;
                        long j = Long.parseLong(productId.getValue());
                        ProductCard productCard = (ProductCard) linkedHashMap2.get(productId);
                        if (productCard == null || (itemName = productCard.getName()) == null) {
                            CatalogueProductDetailsAdditionalItems catalogueProductDetailsAdditionalItems = (CatalogueProductDetailsAdditionalItems) linkedHashMap.get(productId);
                            if (catalogueProductDetailsAdditionalItems != null) {
                                String itemName = catalogueProductDetailsAdditionalItems.getItemName();
                                str = itemName;
                            } else {
                                str = null;
                            }
                        } else {
                            str = itemName;
                        }
                        ProductCard productCard2 = (ProductCard) linkedHashMap2.get(productId);
                        Boolean boolValueOf = productCard2 != null ? Boolean.valueOf(productCard2.isAvailable()) : null;
                        ProductCard productCard3 = (ProductCard) linkedHashMap2.get(productId);
                        String string = (productCard3 == null || (price = productCard3.getPrice()) == null) ? null : Float.valueOf(price.intValue() / 100.0f).toString();
                        if (string == null) {
                            string = "";
                        }
                        String str2 = string;
                        ProductCard productCard4 = (ProductCard) linkedHashMap2.get(productId);
                        listD0 = CollectionsKt.d0(new ProductTrackingValue(j, str, boolValueOf, null, str2, null, productCard4 != null ? productCard4.getAdId() : null, null, null, null, null, null, 16296), list3);
                    }
                    TrackingMetadata trackingMetadataA = ProductTrackingValueKt.a(listD0);
                    trackingMetadataA.a(CatalogueItemTrackingKt.a(catalogueItemTracking));
                    if (catalogueTracking != null) {
                        trackingMetadataA.a(CatalogueTrackingKt.a(catalogueTracking));
                    }
                    analyticsManager2.j(loadSuccess, trackingMetadataA);
                }
                MutableLiveData mutableLiveData = catalogueProductListViewModel.k;
                if (state instanceof CatalogueProductListViewModel.State.Uninitialized) {
                    throw new IllegalStateException("We should never be generating ViewState for Uninitialized");
                }
                if (state instanceof CatalogueProductListViewModel.State.Loading) {
                    viewStateR6 = CatalogueProductListViewModel.r6(catalogueProductListViewModel, CatalogueProductListContract.PageState.d, null, null, 6);
                } else if (state instanceof CatalogueProductListViewModel.State.Error) {
                    Exception exc = ((CatalogueProductListViewModel.State.Error) state).f6920a;
                    AnalyticsManager analyticsManager3 = catalogueProductListViewModel.e;
                    if (exc instanceof NoConnectivityException) {
                        analyticsManager3.c(CatalogueProductListAction.ApiNetworkError.e);
                        viewStateR6 = CatalogueProductListViewModel.r6(catalogueProductListViewModel, CatalogueProductListContract.PageState.f, CatalogueProductListErrorState.d, null, 4);
                    } else if (exc instanceof CatalogueProductListViewModel.NoProductListException) {
                        analyticsManager3.c(CatalogueProductListAction.ApiNoResults.e);
                        viewStateR6 = CatalogueProductListViewModel.r6(catalogueProductListViewModel, CatalogueProductListContract.PageState.f, CatalogueProductListErrorState.f, null, 4);
                    } else {
                        analyticsManager3.c(CatalogueProductListAction.ApiServerError.e);
                        viewStateR6 = CatalogueProductListViewModel.r6(catalogueProductListViewModel, CatalogueProductListContract.PageState.f, CatalogueProductListErrorState.e, null, 4);
                    }
                } else {
                    if (!(state instanceof CatalogueProductListViewModel.State.Loaded)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CatalogueProductListViewModel.State.Loaded loaded = (CatalogueProductListViewModel.State.Loaded) state;
                    ProductList productList2 = loaded.f6921a;
                    List<ProductCard> products = productList2.b.getProducts();
                    List<TrolleyResult.TrolleyItem> allGroceryAndMarketItems = TrolleyResultExtKt.getAllGroceryAndMarketItems(loaded.b);
                    int iH3 = MapsKt.h(CollectionsKt.s(allGroceryAndMarketItems, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH3 >= 16 ? iH3 : 16);
                    for (Object obj5 : allGroceryAndMarketItems) {
                        linkedHashMap3.put(ProductId.INSTANCE.create(((TrolleyResult.TrolleyItem) obj5).getArticle()), obj5);
                    }
                    List<ProductCard> list4 = products;
                    ArrayList arrayList = new ArrayList(CollectionsKt.s(list4, 10));
                    for (ProductCard productCard5 : list4) {
                        TrolleyResult.TrolleyItem trolleyItem = (TrolleyResult.TrolleyItem) linkedHashMap3.get(ProductId.INSTANCE.create(productCard5.getProductId()));
                        arrayList.add(ProductCardExtKt.A(productCard5, trolleyItem != null ? trolleyItem.getItemQuantityInTrolley() : BitmapDescriptorFactory.HUE_RED));
                    }
                    ProductListByProductIdsApiData productListByProductIdsApiData = new ProductListByProductIdsApiData(arrayList);
                    CatalogueProductDetailsListInfo catalogueProductDetailsListInfo2 = productList2.f6948a;
                    Intrinsics.h(catalogueProductDetailsListInfo2, "catalogueProductDetailsListInfo");
                    viewStateR6 = CatalogueProductListViewModel.r6(catalogueProductListViewModel, CatalogueProductListContract.PageState.e, null, new ProductList(catalogueProductDetailsListInfo2, productListByProductIdsApiData), 2);
                }
                mutableLiveData.m(viewStateR6);
            }
        };
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    public static CatalogueProductDetailsAdditionalItems p6(ProductList productList, ProductId productId) {
        CatalogueProductDetailsList catalogueProductDetailsList;
        List<CatalogueProductDetailsAdditionalItems> additionalItems;
        CatalogueProductDetailsListInfoWrapper catalogueProductDetailsListInfoWrapper = (CatalogueProductDetailsListInfoWrapper) CollectionsKt.F(productList.f6948a.getCatalogueProductListDetails());
        Object obj = null;
        if (catalogueProductDetailsListInfoWrapper == null || (catalogueProductDetailsList = catalogueProductDetailsListInfoWrapper.getCatalogueProductDetailsList()) == null || (additionalItems = catalogueProductDetailsList.getAdditionalItems()) == null) {
            return null;
        }
        Iterator<T> it = additionalItems.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.c(ProductId.INSTANCE.create(((CatalogueProductDetailsAdditionalItems) next).getSkuCode()), productId)) {
                obj = next;
                break;
            }
        }
        return (CatalogueProductDetailsAdditionalItems) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x056b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.ViewState r6(au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel r27, au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.PageState r28, au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState r29, au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList r30, int r31) {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel.r6(au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListViewModel, au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract$PageState, au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListErrorState, au.com.woolworths.feature.shop.catalogue.productlist.model.ProductList, int):au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract$ViewState");
    }

    public static TrackingMetadata s6(ProductCard productCard, CatalogueTracking catalogueTracking, CatalogueItemTracking catalogueItemTracking) {
        TrackingMetadata trackingMetadataH = ProductAnalyticsExtKt.h(productCard, null, null, 7);
        trackingMetadataH.a(CatalogueItemTrackingKt.a(catalogueItemTracking));
        if (catalogueTracking != null) {
            trackingMetadataH.a(CatalogueTrackingKt.a(catalogueTracking));
        }
        return trackingMetadataH;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.PrimaryButtonClickListener
    public final void K4(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        CatalogueProductDetailsAdditionalItems catalogueProductDetailsAdditionalItemsP6 = p6(q6().f6921a, ProductId.INSTANCE.create(productCard.getProductId()));
        if (catalogueProductDetailsAdditionalItemsP6 == null) {
            return;
        }
        ProductTrolleyData trolley = productCard.getTrolley();
        if (trolley == null) {
            throw new IllegalStateException(("ProductTrolleyData is always available for items that can be added to the cart: " + productCard).toString());
        }
        int i = WhenMappings.f6924a[trolley.getButtonState().ordinal()];
        AnalyticsManager analyticsManager = this.g;
        CatalogueTrackingCache catalogueTrackingCache = this.p;
        if (i == 1) {
            analyticsManager.i(CatalogueAnalytics.ProductList.Action.d, s6(productCard, catalogueTrackingCache.c, new CatalogueItemTracking(catalogueProductDetailsAdditionalItemsP6.getItemId(), catalogueProductDetailsAdditionalItemsP6.getItemName())));
        } else {
            if (i != 2) {
                throw new IllegalStateException("Expected one of ADD or UPDATE for items that can be added to the cart: " + trolley.getButtonState());
            }
            analyticsManager.i(CatalogueAnalytics.ProductList.Action.e, s6(productCard, catalogueTrackingCache.c, new CatalogueItemTracking(catalogueProductDetailsAdditionalItemsP6.getItemId(), catalogueProductDetailsAdditionalItemsP6.getItemName())));
        }
        this.l.f(new CatalogueProductListContract.Action.LaunchProductBottomSheet(productCard));
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.OnMaxLinesToggleListener
    public final void a0() {
        CatalogueTracking catalogueTracking = this.p.c;
        CatalogueItemTracking catalogueItemTracking = (CatalogueItemTracking) this.q.getD();
        CatalogueProductListAction.SeeMore seeMore = CatalogueProductListAction.SeeMore.e;
        TrackingMetadata trackingMetadataA = CatalogueItemTrackingKt.a(catalogueItemTracking);
        if (catalogueTracking != null) {
            trackingMetadataA.a(CatalogueTrackingKt.a(catalogueTracking));
        }
        this.g.j(seeMore, trackingMetadataA);
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.PrimaryButtonClickListener
    public final void b2(ProductCard productCard) {
        ButtonApiData button;
        Intrinsics.h(productCard, "productCard");
        CatalogueProductDetailsAdditionalItems catalogueProductDetailsAdditionalItemsP6 = p6(q6().f6921a, ProductId.INSTANCE.create(productCard.getProductId()));
        if (catalogueProductDetailsAdditionalItemsP6 == null) {
            return;
        }
        CatalogueTracking catalogueTracking = this.p.c;
        CatalogueItemTracking catalogueItemTracking = new CatalogueItemTracking(catalogueProductDetailsAdditionalItemsP6.getItemId(), catalogueProductDetailsAdditionalItemsP6.getItemName());
        InStoreAvailabilityInfo inStoreAvailabilityInfo = productCard.getInStoreAvailabilityInfo();
        String label = (inStoreAvailabilityInfo == null || (button = inStoreAvailabilityInfo.getButton()) == null) ? null : button.getLabel();
        if (label == null) {
            label = "";
        }
        this.g.j(new CatalogueProductListAction.SeeInStore(label), s6(productCard, catalogueTracking, catalogueItemTracking));
        this.l.f(new CatalogueProductListContract.Action.LaunchAvailabilityMessageBottomSheet(productCard));
    }

    public final void h1(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        CatalogueProductDetailsAdditionalItems catalogueProductDetailsAdditionalItemsP6 = p6(q6().f6921a, ProductId.INSTANCE.create(productCard.getProductId()));
        if (catalogueProductDetailsAdditionalItemsP6 == null) {
            return;
        }
        CatalogueTracking catalogueTracking = this.p.c;
        CatalogueItemTracking catalogueItemTracking = new CatalogueItemTracking(catalogueProductDetailsAdditionalItemsP6.getItemId(), catalogueProductDetailsAdditionalItemsP6.getItemName());
        this.g.j(CatalogueProductListAction.AddToList.e, s6(productCard, catalogueTracking, catalogueItemTracking));
        this.l.f(new CatalogueProductListContract.Action.LaunchAddToList(productCard));
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.PrimaryButtonClickListener
    public final void i3(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        this.g.j(CatalogueProductListAction.CheckStock.e, s6(productCard, this.p.c, (CatalogueItemTracking) this.q.getD()));
        this.l.f(new CatalogueProductListContract.Action.LaunchCheckStock(productCard));
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.OnMaxLinesToggleListener
    public final void n4() {
        CatalogueTracking catalogueTracking = this.p.c;
        CatalogueItemTracking catalogueItemTracking = (CatalogueItemTracking) this.q.getD();
        CatalogueProductListAction.SeeLess seeLess = CatalogueProductListAction.SeeLess.e;
        TrackingMetadata trackingMetadataA = CatalogueItemTrackingKt.a(catalogueItemTracking);
        if (catalogueTracking != null) {
            trackingMetadataA.a(CatalogueTrackingKt.a(catalogueTracking));
        }
        this.g.j(seeLess, trackingMetadataA);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        CatalogueProductListErrorState catalogueProductListErrorState;
        CatalogueProductListContract.ViewState viewState = (CatalogueProductListContract.ViewState) this.k.e();
        if (viewState == null || (catalogueProductListErrorState = viewState.b) == null) {
            return;
        }
        catalogueProductListErrorState.a(this);
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        CatalogueProductListErrorState catalogueProductListErrorState;
        CatalogueProductListContract.ViewState viewState = (CatalogueProductListContract.ViewState) this.k.e();
        if (viewState == null || (catalogueProductListErrorState = viewState.b) == null) {
            return;
        }
        catalogueProductListErrorState.b(this);
    }

    public final State.Loaded q6() {
        State state = (State) getValue(this, s[0]);
        if (state instanceof State.Loaded) {
            return (State.Loaded) state;
        }
        throw new IllegalStateException(("Expected State.Loaded but got " + state).toString());
    }

    public final void t6(AdditionalProductItemState itemState) {
        Intrinsics.h(itemState, "itemState");
        ProductCard productCard = itemState.b;
        if (productCard != null) {
            this.g.j(CatalogueProductListAction.ChooseProduct.e, s6(productCard, this.p.c, (CatalogueItemTracking) this.q.getD()));
            this.l.f(new CatalogueProductListContract.Action.LaunchCatalogueProductDetails(itemState.f6929a));
        }
    }

    public final void u6(String catalogueStoreId, String catalogueItemId, String catalogueItemName, CatalogueTracking catalogueTracking) {
        Intrinsics.h(catalogueStoreId, "catalogueStoreId");
        Intrinsics.h(catalogueItemId, "catalogueItemId");
        Intrinsics.h(catalogueItemName, "catalogueItemName");
        this.m = catalogueStoreId;
        this.n = catalogueItemId;
        this.o = catalogueItemName;
        this.p.c = catalogueTracking;
        BuildersKt.c(ViewModelKt.a(this), null, null, new CatalogueProductListViewModel$onReadyToLoad$1(this, catalogueStoreId, catalogueItemId, catalogueTracking, null), 3);
    }

    public final void v6() {
        this.e.c(CatalogueProductListAction.TryAgain.e);
        String str = this.m;
        if (str == null) {
            Intrinsics.p("storeId");
            throw null;
        }
        String str2 = this.n;
        if (str2 == null) {
            Intrinsics.p("itemId");
            throw null;
        }
        String str3 = this.o;
        if (str3 != null) {
            u6(str, str2, str3, this.p.c);
        } else {
            Intrinsics.p("itemName");
            throw null;
        }
    }

    public final void w6(State state) {
        setValue(this, s[0], state);
    }
}
