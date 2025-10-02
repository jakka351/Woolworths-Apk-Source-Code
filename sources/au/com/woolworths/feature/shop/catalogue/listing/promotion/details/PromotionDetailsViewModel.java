package au.com.woolworths.feature.shop.catalogue.listing.promotion.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsContract;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.product.tile.ProductClickListener;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.WatchlistInteractor;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/product/tile/ProductClickListener;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PromotionDetailsViewModel extends ViewModel implements ProductClickListener {
    public final PromotionDetailsInteractor e;
    public final AnalyticsManager f;
    public final FeatureToggleManager g;
    public final WatchlistInteractor h;
    public final MutableStateFlow i;
    public final BufferedChannel j;
    public final Flow k;
    public Activities.CataloguePromotionDetails.Extra l;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel$1", f = "PromotionDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        public /* synthetic */ int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = PromotionDetailsViewModel.this.new AnonymousClass1(continuation);
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
            MutableStateFlow mutableStateFlow = PromotionDetailsViewModel.this.i;
            mutableStateFlow.f(PromotionDetailsContract.ViewState.a((PromotionDetailsContract.ViewState) mutableStateFlow.getValue(), new Integer(i), null, null, null, null, 123));
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lau/com/woolworths/product/models/ProductId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel$2", f = "PromotionDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends ProductId>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = PromotionDetailsViewModel.this.new AnonymousClass2(continuation);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            List list = (List) this.p;
            MutableStateFlow mutableStateFlow = PromotionDetailsViewModel.this.i;
            mutableStateFlow.f(PromotionDetailsContract.ViewState.a((PromotionDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, null, list, null, 95));
            return Unit.f24250a;
        }
    }

    public PromotionDetailsViewModel(PromotionDetailsInteractor promotionDetailsInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager, WatchlistInteractor watchlistInteractor, CollectionModeInteractor collectionModeInteractor, CartUpdateInteractor cartUpdateInteractor) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        Intrinsics.h(watchlistInteractor, "watchlistInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(cartUpdateInteractor, "cartUpdateInteractor");
        this.e = promotionDetailsInteractor;
        this.f = analyticsManager;
        this.g = featureToggleManager;
        this.h = watchlistInteractor;
        this.i = StateFlowKt.a(new PromotionDetailsContract.ViewState(collectionModeInteractor.b(), cartUpdateInteractor.b.z(), null, null, null, EmptyList.d, null));
        BufferedChannel bufferedChannelA = ChannelKt.a(0, 7, null);
        this.j = bufferedChannelA;
        this.k = FlowKt.I(bufferedChannelA);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(null), cartUpdateInteractor.l), ViewModelKt.a(this));
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(null), watchlistInteractor.e), ViewModelKt.a(this));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void D4(ProductCard productCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        this.j.k(new PromotionDetailsContract.Action.LaunchProductBottomSheet(productCard));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void J1(ProductCard productCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        CatalogueAnalytics.PromotionDetails.Action.Companion companion = CatalogueAnalytics.PromotionDetails.Action.d;
        Activities.CataloguePromotionDetails.Extra extra = this.l;
        if (extra == null) {
            Intrinsics.p("extra");
            throw null;
        }
        final String str = extra.e;
        if (str == null) {
            str = "";
        }
        companion.getClass();
        this.f.i(new Event(str) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$productClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                spreadBuilder.a(new Pair("app.Section", "Specials"));
                spreadBuilder.a(new Pair("event.Category", "price_family_variants"));
                a.z("event.Action", "tile_click", spreadBuilder, "event.Label", "product tile click");
                a.y("event.Description", str.concat(" - price_family_variants"), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "price_family_variants_tile_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "price_family_variants_tile_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
        this.j.k(new PromotionDetailsContract.Action.LaunchProductDetails(productCard));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void L0(ProductCard productCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        CatalogueAnalytics.PromotionDetails.Action.Companion companion = CatalogueAnalytics.PromotionDetails.Action.d;
        Activities.CataloguePromotionDetails.Extra extra = this.l;
        if (extra == null) {
            Intrinsics.p("extra");
            throw null;
        }
        final String str = extra.e;
        if (str == null) {
            str = "";
        }
        companion.getClass();
        this.f.i(new Event(str) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$addToList$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                spreadBuilder.a(new Pair("app.Section", "Specials"));
                spreadBuilder.a(new Pair("event.Category", "price_family_variants"));
                a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Add To List");
                a.y("event.Description", str.concat(" - price_family_variants"), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "price_family_variants_savetolist_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "price_family_variants_savetolist_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
        this.j.k(new PromotionDetailsContract.Action.LaunchListsBottomSheet(productCard));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void T4(ProductCard productCard, String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        CatalogueAnalytics.PromotionDetails.Action.Companion companion = CatalogueAnalytics.PromotionDetails.Action.d;
        Activities.CataloguePromotionDetails.Extra extra = this.l;
        if (extra == null) {
            Intrinsics.p("extra");
            throw null;
        }
        final String str = extra.e;
        if (str == null) {
            str = "";
        }
        companion.getClass();
        this.f.i(new Event(str) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$addToCart$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                spreadBuilder.a(new Pair("app.Section", "Specials"));
                spreadBuilder.a(new Pair("event.Category", "cart"));
                a.z("event.Action", "button_click", spreadBuilder, "event.Label", "Add");
                a.y("event.Description", str.concat(" - price_family_variants"), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "addtocart_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "addtocart_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
        this.j.k(new PromotionDetailsContract.Action.LaunchProductBottomSheet(productCard));
    }

    @Override // au.com.woolworths.product.tile.ProductClickListener
    public final void g6(final ProductCard productCard, final String containerTitle) {
        Intrinsics.h(containerTitle, "containerTitle");
        Intrinsics.h(productCard, "productCard");
        WatchlistInteractor watchlistInteractor = this.h;
        if (watchlistInteractor.c()) {
            this.j.k(PromotionDetailsContract.Action.LaunchWatchlistGuestOnboardingScreen.f6893a);
            return;
        }
        String strB = watchlistInteractor.b();
        if (strB == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.i;
        boolean zT = ProductCardExtKt.t(productCard, ((PromotionDetailsContract.ViewState) mutableStateFlow.getValue()).f);
        AnalyticsManager analyticsManager = this.f;
        if (zT) {
            watchlistInteractor.d(productCard);
            CatalogueAnalytics.PromotionDetails.Action.d.getClass();
            analyticsManager.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$removeFromWatchlist$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                    spreadBuilder.a(new Pair("app.Section", "Specials"));
                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                    a.z("event.Action", "button_click", spreadBuilder, "event.Label", "unsave from watchlist");
                    a.y("event.Description", String.valueOf(containerTitle), spreadBuilder);
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
            }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
            ResText resText = new ResText(R.string.watchlist_product_removed_snackbar_message);
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.b
                public final /* synthetic */ PromotionDetailsViewModel e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String message = (String) obj;
                    switch (i) {
                        case 0:
                            Intrinsics.h(message, "message");
                            AnalyticsManager analyticsManager2 = this.e.f;
                            CatalogueAnalytics.PromotionDetails.Action.d.getClass();
                            String description = containerTitle;
                            Intrinsics.h(description, "description");
                            analyticsManager2.i(new Event(message, description) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                                    spreadBuilder.a(new Pair("app.Section", "Specials"));
                                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message), spreadBuilder, description), spreadBuilder);
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
                            }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                            break;
                        default:
                            Intrinsics.h(message, "message");
                            AnalyticsManager analyticsManager3 = this.e.f;
                            CatalogueAnalytics.PromotionDetails.Action.d.getClass();
                            String description2 = containerTitle;
                            Intrinsics.h(description2, "description");
                            analyticsManager3.i(new Event(message, description2) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$watchlistSnackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                                    spreadBuilder.a(new Pair("app.Section", "Specials"));
                                    spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                    a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message), spreadBuilder, description2), spreadBuilder);
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
                            }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
            mutableStateFlow.f(PromotionDetailsContract.ViewState.a((PromotionDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, new PromotionDetailsContract.Snackbar(resText, null, new h(20), function1), 63));
            return;
        }
        watchlistInteractor.a(productCard);
        CatalogueAnalytics.PromotionDetails.Action.d.getClass();
        analyticsManager.i(new Event(containerTitle) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$addToWatchlist$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                spreadBuilder.a(new Pair("app.Section", "Specials"));
                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                a.z("event.Action", "button_click", spreadBuilder, "event.Label", "save to watchlist");
                a.y("event.Description", String.valueOf(containerTitle), spreadBuilder);
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
        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
        final int i2 = 1;
        mutableStateFlow.f(PromotionDetailsContract.ViewState.a((PromotionDetailsContract.ViewState) mutableStateFlow.getValue(), null, null, null, null, new PromotionDetailsContract.Snackbar(new ResText(R.string.watchlist_product_added_snackbar_message), new ResText(R.string.view_list), new a(this, containerTitle, productCard, strB), new Function1(this) { // from class: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.b
            public final /* synthetic */ PromotionDetailsViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String message = (String) obj;
                switch (i2) {
                    case 0:
                        Intrinsics.h(message, "message");
                        AnalyticsManager analyticsManager2 = this.e.f;
                        CatalogueAnalytics.PromotionDetails.Action.d.getClass();
                        String description = containerTitle;
                        Intrinsics.h(description, "description");
                        analyticsManager2.i(new Event(message, description) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                                spreadBuilder.a(new Pair("app.Section", "Specials"));
                                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message), spreadBuilder, description), spreadBuilder);
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
                        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                        break;
                    default:
                        Intrinsics.h(message, "message");
                        AnalyticsManager analyticsManager3 = this.e.f;
                        CatalogueAnalytics.PromotionDetails.Action.d.getClass();
                        String description2 = containerTitle;
                        Intrinsics.h(description2, "description");
                        analyticsManager3.i(new Event(message, description2) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$watchlistSnackbarImpression$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                                spreadBuilder.a(new Pair("app.Section", "Specials"));
                                spreadBuilder.a(new Pair("event.Category", "watchlist"));
                                a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", androidx.compose.ui.input.pointer.a.m("event.Action", "snackbar_impression", spreadBuilder, message), spreadBuilder, description2), spreadBuilder);
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
                        }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                        break;
                }
                return Unit.f24250a;
            }
        }), 63));
    }
}
