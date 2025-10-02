package au.com.woolworths.feature.shop.catalogue.listing.category;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingContract;
import au.com.woolworths.feature.shop.catalogue.listing.category.analytics.PagingInfo;
import au.com.woolworths.feature.shop.catalogue.listing.category.model.ListingHeader;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/category/CategoryListingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/tile/ProductClickListener;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CategoryListingViewModel extends ViewModel implements ProductClickListener {
    public final CategoryListingInteractor e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final BufferedChannel h;
    public final Flow i;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel$1", f = "CategoryListingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public /* synthetic */ int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = CategoryListingViewModel.this.new AnonymousClass1(continuation);
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
            MutableStateFlow mutableStateFlow = CategoryListingViewModel.this.g;
            mutableStateFlow.f(CategoryListingContract.ViewState.a((CategoryListingContract.ViewState) mutableStateFlow.getValue(), new Integer(i), null, null, null, 59));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/catalogue/listing/category/model/ListingHeader;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel$2", f = "CategoryListingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<ListingHeader, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = CategoryListingViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.p = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((ListingHeader) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass2.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            ListingHeader listingHeader = (ListingHeader) this.p;
            MutableStateFlow mutableStateFlow = CategoryListingViewModel.this.g;
            mutableStateFlow.f(CategoryListingContract.ViewState.a((CategoryListingContract.ViewState) mutableStateFlow.getValue(), null, listingHeader, null, null, 55));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/catalogue/listing/category/analytics/PagingInfo;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel$3", f = "CategoryListingViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.category.CategoryListingViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<PagingInfo, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = CategoryListingViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.p = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((PagingInfo) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass3.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnalyticsManager analyticsManager = CategoryListingViewModel.this.f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            PagingInfo pagingInfo = (PagingInfo) this.p;
            if (pagingInfo instanceof PagingInfo.Loaded) {
                CatalogueAnalytics.Listing.Action action = CatalogueAnalytics.Listing.Action.e;
                PagingInfo.Loaded loaded = (PagingInfo.Loaded) pagingInfo;
                TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.C1, Integer.valueOf(loaded.f6876a));
                trackingMetadataA.b(TrackableValue.R1, Integer.valueOf(loaded.b));
                analyticsManager.i(action, trackingMetadataA);
            } else if (pagingInfo instanceof PagingInfo.Error) {
                if (((PagingInfo.Error) pagingInfo).f6875a instanceof NoConnectivityException) {
                    analyticsManager.g(CatalogueAnalytics.Listing.Action.i);
                } else {
                    analyticsManager.g(CatalogueAnalytics.Listing.Action.j);
                }
            }
            return Unit.f24250a;
        }
    }

    public CategoryListingViewModel(CategoryListingInteractor categoryListingInteractor, AnalyticsManager analyticsManager, CollectionModeInteractor collectionModeInteractor, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = categoryListingInteractor;
        this.f = analyticsManager;
        this.g = StateFlowKt.a(new CategoryListingContract.ViewState(collectionModeInteractor.b(), cartUpdateInteractor.b.z(), null, null, null, null));
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.h = bufferedChannelA;
        this.i = FlowKt.I(bufferedChannelA);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), cartUpdateInteractor.l), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), categoryListingInteractor.f), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass3(null), categoryListingInteractor.g), ViewModelKt.a(this));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.f.i(CatalogueAnalytics.Listing.Action.g, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.h.k(new CategoryListingContract.Action.LaunchProductBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCardData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardData, "productCardData");
        CatalogueAnalytics.Listing.Action.Companion companion = CatalogueAnalytics.Listing.Action.d;
        ListingHeader listingHeader = ((CategoryListingContract.ViewState) this.g.getValue()).d;
        final String str = listingHeader != null ? listingHeader.f6878a : null;
        if (str == null) {
            str = "";
        }
        companion.getClass();
        this.f.i(new Event(str) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$Listing$Action$Companion$productDetails$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(CatalogueAnalytics.Listing.e);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                a.z("event.Label", "Product tile click", spreadBuilder, "event.Description", str);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "product_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "product_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCardData, null, null, 7));
        this.h.k(new CategoryListingContract.Action.LaunchProductDetails(productCardData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.f.i(CatalogueAnalytics.Listing.Action.h, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.h.k(new CategoryListingContract.Action.LaunchListsBottomSheet(productCardTileData));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCardTileData, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCardTileData, "productCardTileData");
        this.f.i(CatalogueAnalytics.Listing.Action.f, ProductAnalyticsExtKt.h(productCardTileData, null, null, 7));
        this.h.k(new CategoryListingContract.Action.LaunchProductBottomSheet(productCardTileData));
    }
}
