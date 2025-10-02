package au.com.woolworths.feature.shop.bundles;

import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.AnalyticsDataKt$getScreen$1;
import au.com.woolworths.analytics.supers.bundles.BundlesAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.bundles.BundlesUiEffect;
import au.com.woolworths.feature.shop.bundles.BundlesUiEvent;
import au.com.woolworths.feature.shop.bundles.BundlesViewModel;
import au.com.woolworths.feature.shop.bundles.bottomsheet.AddBundlesToCartViewModel;
import au.com.woolworths.feature.shop.bundles.data.Bundle;
import au.com.woolworths.feature.shop.bundles.data.BundleProductCard;
import au.com.woolworths.feature.shop.bundles.data.BundleQuantityStepper;
import au.com.woolworths.feature.shop.bundles.data.BundleSortOption;
import au.com.woolworths.feature.shop.bundles.data.BundlesData;
import au.com.woolworths.feature.shop.bundles.data.BundlesDataKt;
import au.com.woolworths.feature.shop.bundles.data.BundlesExtKt;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData actionData;
        ActionData actionData2;
        AnalyticsData analytics;
        Object value;
        Object value2;
        Object value3;
        AnalyticsData analytics2;
        Object value4;
        switch (this.d) {
            case 0:
                BundlesViewModel bundlesViewModel = (BundlesViewModel) this.e;
                MutableStateFlow mutableStateFlow = bundlesViewModel.m;
                SharedFlowImpl sharedFlowImpl = bundlesViewModel.o;
                AnalyticsManager analyticsManager = bundlesViewModel.l;
                BundlesUiEvent event = (BundlesUiEvent) obj;
                Intrinsics.h(event, "event");
                if (event instanceof BundlesUiEvent.AddBundleToCartClick) {
                    Bundle bundle = ((BundlesUiEvent.AddBundleToCartClick) event).f6718a;
                    BundleQuantityStepper bundleQuantityStepper = bundle.c;
                    bundlesViewModel.u6(bundle, bundleQuantityStepper.d + bundleQuantityStepper.c, bundleQuantityStepper.e, true);
                } else if (event instanceof BundlesUiEvent.BundlesDecrementClick) {
                    BundlesUiEvent.BundlesDecrementClick bundlesDecrementClick = (BundlesUiEvent.BundlesDecrementClick) event;
                    Bundle bundle2 = bundlesDecrementClick.f6720a;
                    bundlesViewModel.u6(bundle2, bundlesDecrementClick.b - bundle2.c.c, "stepper minus", false);
                } else if (event instanceof BundlesUiEvent.BundlesIncrementClick) {
                    BundlesUiEvent.BundlesIncrementClick bundlesIncrementClick = (BundlesUiEvent.BundlesIncrementClick) event;
                    Bundle bundle3 = bundlesIncrementClick.f6721a;
                    int i = bundlesIncrementClick.b;
                    BundleQuantityStepper bundleQuantityStepper2 = bundle3.c;
                    int i2 = bundleQuantityStepper2.b;
                    if (i < i2) {
                        bundlesViewModel.u6(bundle3, Math.min(i + bundleQuantityStepper2.c, i2), "stepper plus", true);
                    }
                } else if (event instanceof BundlesUiEvent.RefreshClick) {
                    BundlesUiEvent.RefreshClick refreshClick = (BundlesUiEvent.RefreshClick) event;
                    final String str = refreshClick.f6729a;
                    final String str2 = refreshClick.b;
                    final String str3 = refreshClick.c;
                    BundlesAnalytics.Bundles.Action.d.getClass();
                    analyticsManager.g(new Event(str, str2, str3) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$errorCtaClick$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                            spreadBuilder.b(BundlesAnalytics.Bundles.e);
                            spreadBuilder.a(new Pair("event.Action", "click"));
                            spreadBuilder.a(new Pair("event.Description", str + " - " + str2));
                            spreadBuilder.a(new Pair("screen.Type", "bundle.specialsGroup"));
                            a.z("event.Label", str3, spreadBuilder, "event.Category", "bundle_products");
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "button_click";
                        }

                        public final boolean equals(Object obj2) {
                            if (!(obj2 instanceof Event)) {
                                return false;
                            }
                            Event event2 = (Event) obj2;
                            return "button_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    });
                    do {
                        value4 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.d(value4, BundlesUiState.a((BundlesUiState) value4, null, false, null, false, null, null, null, null, null, 251)));
                    bundlesViewModel.f.e();
                } else if (event instanceof BundlesUiEvent.CartIconClick) {
                    sharedFlowImpl.f(BundlesUiEffect.OpenCartScreen.f6714a);
                } else if (event instanceof BundlesUiEvent.BundlesQuantityClick) {
                    BundlesUiEvent.BundlesQuantityClick bundlesQuantityClick = (BundlesUiEvent.BundlesQuantityClick) event;
                    Bundle bundle4 = bundlesQuantityClick.f6722a;
                    BundlesData.BundlesLandingPage bundlesLandingPage = bundlesQuantityClick.b;
                    AnalyticsData analyticsData = bundle4.d;
                    if (analyticsData != null) {
                        analyticsManager.g(AnalyticsDataKt.b(BundlesAnalytics.Bundles.Action.e, AnalyticsDataKt.c(analyticsData, bundlesLandingPage.c, false)));
                    }
                    sharedFlowImpl.f(new BundlesUiEffect.OpenBundlesAddToCartBottomSheet(bundle4, bundlesLandingPage));
                } else {
                    AnalyticsData analyticsDataC = null;
                    type = null;
                    ActionType type = null;
                    AnalyticsData analyticsDataC2 = null;
                    if (event instanceof BundlesUiEvent.ProductClick) {
                        BundlesUiEvent.ProductClick productClick = (BundlesUiEvent.ProductClick) event;
                        ProductCard productCard = productClick.f6728a;
                        Bundle bundle5 = productClick.b;
                        ActionData productCardAction = productCard.getProductCardAction();
                        AnalyticsData analyticsDataC3 = (productCardAction == null || (analytics2 = productCardAction.getAnalytics()) == null) ? null : AnalyticsDataKt.c(AnalyticsDataKt.c(AnalyticsDataKt.c(analytics2, bundle5.d, false), bundlesViewModel.r6(), false), productCard.getProductCardAnalytics(), true);
                        BundlesAnalytics.Bundles.Action.Companion companion = BundlesAnalytics.Bundles.Action.d;
                        final List listQ = CollectionsKt.Q(productCard.getProductId());
                        companion.getClass();
                        analyticsManager.i(AnalyticsDataKt.b(new Event(listQ) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$bundleProductClick$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                                spreadBuilder.b(BundlesAnalytics.Bundles.e);
                                spreadBuilder.a(new Pair("product.IDs", listQ));
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getE() {
                                return "product_click";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event2 = (Event) obj2;
                                return "product_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        }, analyticsDataC3), ProductAnalyticsExtKt.h(productCard, null, null, 7));
                        sharedFlowImpl.f(new BundlesUiEffect.OpenProductDetailsActivity(productCard.getProductId()));
                    } else if (event instanceof BundlesUiEvent.OpenSortBottomSheetModal) {
                        BundlesAnalytics.Bundles.Action.Companion companion2 = BundlesAnalytics.Bundles.Action.d;
                        final String strS6 = bundlesViewModel.s6();
                        companion2.getClass();
                        analyticsManager.g(AnalyticsDataKt.b(new Event(strS6) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$bundleSortOptionClick$1
                            public final Object d;

                            {
                                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                spreadBuilder.b(BundlesAnalytics.Bundles.e);
                                spreadBuilder.a(new Pair("event.Action", "click"));
                                spreadBuilder.a(new Pair("event.Label", "sort by - open"));
                                spreadBuilder.a(new Pair("event.Category", "bundle_products"));
                                spreadBuilder.a(new Pair("productList.SortBy", strS6));
                                a.y("productList.FilterChips", "", spreadBuilder);
                                ArrayList arrayList = spreadBuilder.f24269a;
                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                            }

                            @Override // au.com.woolworths.analytics.Event
                            /* renamed from: d */
                            public final String getE() {
                                return "bundle_filter_click";
                            }

                            public final boolean equals(Object obj2) {
                                if (!(obj2 instanceof Event)) {
                                    return false;
                                }
                                Event event2 = (Event) obj2;
                                return "bundle_filter_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                            }

                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                            @Override // au.com.woolworths.analytics.Event
                            public final Map getData() {
                                return this.d;
                            }
                        }, bundlesViewModel.r6()));
                        sharedFlowImpl.f(BundlesUiEffect.OpenSortBottomSheetModal.f6716a);
                    } else {
                        boolean z = event instanceof BundlesUiEvent.CloseSortBottomSheetModal;
                        BundlesUiEffect.CloseSortBottomSheetModal closeSortBottomSheetModal = BundlesUiEffect.CloseSortBottomSheetModal.f6711a;
                        if (z) {
                            sharedFlowImpl.f(closeSortBottomSheetModal);
                        } else if (event instanceof BundlesUiEvent.SortOptionClick) {
                            BundleSortOption bundleSortOption = ((BundlesUiEvent.SortOptionClick) event).f6731a;
                            sharedFlowImpl.f(closeSortBottomSheetModal);
                            BundlesAnalytics.Bundles.Action.Companion companion3 = BundlesAnalytics.Bundles.Action.d;
                            final String str4 = bundleSortOption.b.b;
                            final String strS62 = bundlesViewModel.s6();
                            companion3.getClass();
                            analyticsManager.g(AnalyticsDataKt.b(new Event(str4, strS62) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$bundleSortOptionSelected$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                                    a.z("event.Action", "click", spreadBuilder, "event.Category", "bundle_products");
                                    spreadBuilder.a(new Pair("event.Label", "sort by - ".concat(str4)));
                                    spreadBuilder.a(new Pair("productList.SortBy", strS62));
                                    a.y("productList.FilterChips", "", spreadBuilder);
                                    ArrayList arrayList = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "bundle_filter_click";
                                }

                                public final boolean equals(Object obj2) {
                                    if (!(obj2 instanceof Event)) {
                                        return false;
                                    }
                                    Event event2 = (Event) obj2;
                                    return "bundle_filter_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            }, bundlesViewModel.r6()));
                            if (!bundleSortOption.b.c) {
                                do {
                                    value = mutableStateFlow.getValue();
                                } while (!mutableStateFlow.d(value, BundlesUiState.a((BundlesUiState) value, null, false, null, false, null, null, null, null, null, 251)));
                                MutableStateFlow mutableStateFlow2 = bundlesViewModel.t;
                                do {
                                    value2 = mutableStateFlow2.getValue();
                                    ((Boolean) value2).getClass();
                                } while (!mutableStateFlow2.d(value2, Boolean.FALSE));
                                MutableStateFlow mutableStateFlow3 = bundlesViewModel.u;
                                do {
                                    value3 = mutableStateFlow3.getValue();
                                } while (!mutableStateFlow3.d(value3, bundleSortOption.f6760a));
                                BuildersKt.c(ViewModelKt.a(bundlesViewModel), null, null, new BundlesViewModel$hardRefresh$1(bundlesViewModel, null), 3);
                            }
                        } else if (event instanceof BundlesUiEvent.NoBundlesCtaClick) {
                            BundlesData.BundlesLandingErrorPage bundlesLandingErrorPage = ((BundlesUiEvent.NoBundlesCtaClick) event).f6725a;
                            LinkData linkData = bundlesLandingErrorPage.d;
                            if (linkData != null && (actionData2 = linkData.b) != null && (analytics = actionData2.getAnalytics()) != null) {
                                analyticsManager.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analytics, bundlesLandingErrorPage.e, false)));
                            }
                            if (linkData != null && (actionData = linkData.b) != null) {
                                type = actionData.getType();
                            }
                            if ((type == null ? -1 : BundlesViewModel.WhenMappings.f6740a[type.ordinal()]) == 1) {
                                sharedFlowImpl.f(new BundlesUiEffect.LaunchDeepLink(linkData.b.getAction()));
                            }
                        } else if (event instanceof BundlesUiEvent.TrackBundleImpression) {
                            BundlesUiEvent.TrackBundleImpression trackBundleImpression = (BundlesUiEvent.TrackBundleImpression) event;
                            Bundle bundle6 = trackBundleImpression.f6734a;
                            BundlesData.BundlesLandingPage bundlesLandingPage2 = trackBundleImpression.b;
                            AnalyticsData analyticsData2 = bundle6.e;
                            List list = bundle6.b;
                            if (analyticsData2 != null) {
                                AnalyticsData analyticsDataC4 = AnalyticsDataKt.c(AnalyticsDataKt.c(analyticsData2, bundle6.d, false), bundlesLandingPage2.c, false);
                                Iterator it = BundlesDataKt.a(list).iterator();
                                analyticsDataC2 = analyticsDataC4;
                                while (it.hasNext()) {
                                    analyticsDataC2 = AnalyticsDataKt.c(analyticsDataC2, ((BundleProductCard) it.next()).f6758a.getProductCardAnalytics(), true);
                                }
                            }
                            ArrayList arrayListA = BundlesDataKt.a(list);
                            ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListA, 10));
                            Iterator it2 = arrayListA.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((BundleProductCard) it2.next()).f6758a);
                            }
                            if (analyticsDataC2 != null) {
                                BundlesAnalytics.Bundles.Action.Companion companion4 = BundlesAnalytics.Bundles.Action.d;
                                final String strS63 = bundlesViewModel.s6();
                                final ArrayList arrayListA2 = BundlesExtKt.a(bundle6);
                                companion4.getClass();
                                analyticsManager.b(new AnalyticsDataKt$getScreen$1(AnalyticsDataKt.b(new Event(strS63, arrayListA2) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$bundleImpression$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(BundlesAnalytics.Bundles.e);
                                        spreadBuilder.a(new Pair("productList.SortBy", strS63));
                                        spreadBuilder.a(new Pair("productList.FilterChips", ""));
                                        spreadBuilder.a(new Pair("product.IDs", arrayListA2));
                                        ArrayList arrayList2 = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "null_null";
                                    }

                                    public final boolean equals(Object obj2) {
                                        if (!(obj2 instanceof Event)) {
                                            return false;
                                        }
                                        Event event2 = (Event) obj2;
                                        return "null_null".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                }, analyticsDataC2)), ProductAnalyticsExtKt.f(arrayList));
                            }
                        } else if (event instanceof BundlesUiEvent.TrackBundlesMaxQuantityReached) {
                            BundlesUiEvent.TrackBundlesMaxQuantityReached trackBundlesMaxQuantityReached = (BundlesUiEvent.TrackBundlesMaxQuantityReached) event;
                            Bundle bundle7 = trackBundlesMaxQuantityReached.f6735a;
                            BundlesData.BundlesLandingPage bundlesLandingPage3 = trackBundlesMaxQuantityReached.b;
                            AnalyticsData analyticsData3 = bundle7.d;
                            List list2 = bundle7.b;
                            if (analyticsData3 != null) {
                                AnalyticsData analyticsDataC5 = AnalyticsDataKt.c(analyticsData3, bundlesLandingPage3.c, false);
                                Iterator it3 = BundlesDataKt.a(list2).iterator();
                                analyticsDataC = analyticsDataC5;
                                while (it3.hasNext()) {
                                    analyticsDataC = AnalyticsDataKt.c(analyticsDataC, ((BundleProductCard) it3.next()).f6758a.getProductCardAnalytics(), true);
                                }
                            }
                            ArrayList arrayListA3 = BundlesDataKt.a(list2);
                            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayListA3, 10));
                            Iterator it4 = arrayListA3.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(((BundleProductCard) it4.next()).f6758a);
                            }
                            if (analyticsDataC != null) {
                                BundlesAnalytics.Bundles.Action.Companion companion5 = BundlesAnalytics.Bundles.Action.d;
                                final String str5 = bundle7.c.f;
                                if (str5 == null) {
                                    str5 = "";
                                }
                                final ArrayList arrayListA4 = BundlesExtKt.a(bundle7);
                                companion5.getClass();
                                analyticsManager.b(new AnalyticsDataKt$getScreen$1(AnalyticsDataKt.b(new Event(str5, arrayListA4) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$bundleMaxReached$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                        spreadBuilder.b(BundlesAnalytics.Bundles.e);
                                        spreadBuilder.a(new Pair("event.Action", "show_alert_impression"));
                                        spreadBuilder.a(new Pair("event.Label", str5));
                                        spreadBuilder.a(new Pair("product.IDs", arrayListA4));
                                        ArrayList arrayList3 = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "bundle_alert_impression";
                                    }

                                    public final boolean equals(Object obj2) {
                                        if (!(obj2 instanceof Event)) {
                                            return false;
                                        }
                                        Event event2 = (Event) obj2;
                                        return "bundle_alert_impression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                }, analyticsDataC)), ProductAnalyticsExtKt.f(arrayList2));
                            }
                        } else if (event instanceof BundlesUiEvent.TrackErrorScreenImpression) {
                            BundlesUiEvent.TrackErrorScreenImpression trackErrorScreenImpression = (BundlesUiEvent.TrackErrorScreenImpression) event;
                            final String str6 = trackErrorScreenImpression.f6736a;
                            final String str7 = trackErrorScreenImpression.b;
                            BundlesAnalytics.Bundles.Action.d.getClass();
                            analyticsManager.f(new AnalyticsDataKt$getScreen$1(AnalyticsDataKt.b(new Event(str6, str7) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$errorImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                                    spreadBuilder.a(new Pair("event.Action", "show_error"));
                                    a.z("error.Name", str6 + " - " + str7, spreadBuilder, "screen.Type", "bundle.specialsGroup");
                                    ArrayList arrayList3 = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "error_impression";
                                }

                                public final boolean equals(Object obj2) {
                                    if (!(obj2 instanceof Event)) {
                                        return false;
                                    }
                                    Event event2 = (Event) obj2;
                                    return "error_impression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            }, bundlesViewModel.r6())));
                        } else if (event instanceof BundlesUiEvent.TrackSnackbarImpression) {
                            final String str8 = ((BundlesUiEvent.TrackSnackbarImpression) event).f6737a;
                            BundlesAnalytics.Bundles.Action.Companion companion6 = BundlesAnalytics.Bundles.Action.d;
                            final String strS64 = bundlesViewModel.s6();
                            companion6.getClass();
                            analyticsManager.f(new AnalyticsDataKt$getScreen$1(AnalyticsDataKt.b(new Event(str8, strS64) { // from class: au.com.woolworths.analytics.supers.bundles.BundlesAnalytics$Bundles$Action$Companion$snackbarImpression$1
                                public final Object d;

                                {
                                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                                    spreadBuilder.b(BundlesAnalytics.Bundles.e);
                                    spreadBuilder.a(new Pair("event.Action", "snackbar_impression"));
                                    spreadBuilder.a(new Pair("event.Category", "bundle_products"));
                                    spreadBuilder.a(new Pair("event.Label", str8));
                                    spreadBuilder.a(new Pair("productList.SortBy", strS64));
                                    a.y("productList.FilterChips", "", spreadBuilder);
                                    ArrayList arrayList3 = spreadBuilder.f24269a;
                                    this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                                }

                                @Override // au.com.woolworths.analytics.Event
                                /* renamed from: d */
                                public final String getE() {
                                    return "bundles_snackbar_impression";
                                }

                                public final boolean equals(Object obj2) {
                                    if (!(obj2 instanceof Event)) {
                                        return false;
                                    }
                                    Event event2 = (Event) obj2;
                                    return "bundles_snackbar_impression".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                }

                                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                @Override // au.com.woolworths.analytics.Event
                                public final Map getData() {
                                    return this.d;
                                }
                            }, bundlesViewModel.r6())));
                        } else if (event instanceof BundlesUiEvent.TrackBroadcastBannerDismissed) {
                            analyticsManager.g(AnalyticsDataKt.b(AnalyticsDataKt.a(((BundlesUiEvent.TrackBroadcastBannerDismissed) event).f6733a), bundlesViewModel.r6()));
                        } else if (event instanceof BundlesUiEvent.RetryPaginationClick) {
                            sharedFlowImpl.f(BundlesUiEffect.RetryPaginationClick.f6717a);
                        } else if (event instanceof BundlesUiEvent.UpdateCachedProducts) {
                            List list3 = ((BundlesUiEvent.UpdateCachedProducts) event).f6738a;
                            ArrayList arrayList3 = bundlesViewModel.x;
                            arrayList3.clear();
                            List list4 = list3;
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.s(list4, 10));
                            Iterator it5 = list4.iterator();
                            while (it5.hasNext()) {
                                ArrayList arrayListA5 = BundlesDataKt.a(((Bundle) it5.next()).b);
                                ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayListA5, 10));
                                Iterator it6 = arrayListA5.iterator();
                                while (it6.hasNext()) {
                                    arrayList5.add(((BundleProductCard) it6.next()).f6758a);
                                }
                                arrayList4.add(arrayList5);
                            }
                            arrayList3.addAll(CollectionsKt.G(arrayList4));
                        } else if (event instanceof BundlesUiEvent.BroadcastBannerActionClick) {
                            bundlesViewModel.t6(((BundlesUiEvent.BroadcastBannerActionClick) event).f6719a);
                        } else if (event instanceof BundlesUiEvent.OnAlertActionClick) {
                            bundlesViewModel.t6(((BundlesUiEvent.OnAlertActionClick) event).f6726a);
                        } else {
                            if (!(event instanceof BundlesUiEvent.TrackAlertImpression)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AnalyticsData analyticsData4 = ((BundlesUiEvent.TrackAlertImpression) event).f6732a;
                            if (analyticsData4 != null) {
                                analyticsManager.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analyticsData4, bundlesViewModel.r6(), false)));
                            }
                        }
                    }
                }
                return Unit.f24250a;
            default:
                AddBundlesToCartBottomSheetFragment addBundlesToCartBottomSheetFragment = (AddBundlesToCartBottomSheetFragment) this.e;
                AddBundlesToCartViewModel.Factory factory = (AddBundlesToCartViewModel.Factory) obj;
                Intrinsics.h(factory, "factory");
                return factory.a(addBundlesToCartBottomSheetFragment.Q1().d);
        }
    }
}
