package au.com.woolworths.feature.shop.instore.navigation.onboarding;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.MapsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.domain.ProductFinderOnboardingInteractorImpl;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$EventSink;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderOnboardingViewModel extends ViewModel implements ProductFinderOnboardingContract.EventSink {
    public final ProductFinderOnboardingInteractorImpl e;
    public final AnalyticsManager f;
    public final MutableStateFlow g;
    public final SharedFlowImpl h;

    public ProductFinderOnboardingViewModel(ProductFinderOnboardingInteractorImpl productFinderOnboardingInteractorImpl, AnalyticsManager analyticsManager) {
        Object value;
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = productFinderOnboardingInteractorImpl;
        this.f = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new ProductFinderOnboardingContract.ViewState(EmptyList.d, 0, "", false));
        this.g = mutableStateFlowA;
        this.h = SharedFlowKt.b(1, 0, BufferOverflow.e, 2);
        do {
            value = mutableStateFlowA.getValue();
        } while (!mutableStateFlowA.d(value, ProductFinderOnboardingContract.ViewState.a((ProductFinderOnboardingContract.ViewState) value, this.e.a(), 0, null, false, 14)));
    }

    public final boolean p6() {
        MutableStateFlow mutableStateFlow = this.g;
        return ((ProductFinderOnboardingContract.ViewState) FlowKt.b(mutableStateFlow).getValue()).b == ((ProductFinderOnboardingContract.ViewState) FlowKt.b(mutableStateFlow).getValue()).f7420a.size() - 1;
    }

    public final void q6(ProductFinderOnboardingContract.OnboardingEvent onboardingEvent) {
        Object value;
        ProductFinderOnboardingContract.ViewState viewState;
        ProductFinderOnboardingContract.OnboardingEvent.UpdateCurrentPageIndex updateCurrentPageIndex;
        int i;
        Object value2;
        ProductFinderOnboardingContract.ViewState viewState2;
        boolean z = onboardingEvent instanceof ProductFinderOnboardingContract.OnboardingEvent.OnBackButtonClick;
        SharedFlowImpl sharedFlowImpl = this.h;
        if (z) {
            sharedFlowImpl.f(ProductFinderOnboardingContract.Actions.CloseOnboarding.f7414a);
            return;
        }
        boolean z2 = onboardingEvent instanceof ProductFinderOnboardingContract.OnboardingEvent.OnNextButtonClick;
        ProductFinderOnboardingContract.Actions.CloseAndMoveToProductFinder closeAndMoveToProductFinder = ProductFinderOnboardingContract.Actions.CloseAndMoveToProductFinder.f7413a;
        ProductFinderOnboardingInteractorImpl productFinderOnboardingInteractorImpl = this.e;
        AnalyticsManager analyticsManager = this.f;
        MutableStateFlow mutableStateFlow = this.g;
        if (z2) {
            if (p6()) {
                MapsAnalytics.Onboarding.Action.Companion companion = MapsAnalytics.Onboarding.Action.d;
                final String str = ((ProductFinderOnboardingContract.ViewState) FlowKt.b(mutableStateFlow).getValue()).c;
                companion.getClass();
                analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$Onboarding$Action$Companion$doneButtonClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(MapsAnalytics.Onboarding.e);
                        spreadBuilder.a(new Pair("event.Category", "product finder"));
                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                        androidx.constraintlayout.core.state.a.z("event.Label", "done", spreadBuilder, "event.Description", str);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "productfinder_button_click";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "productfinder_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            } else {
                MapsAnalytics.Onboarding.Action.Companion companion2 = MapsAnalytics.Onboarding.Action.d;
                final String str2 = ((ProductFinderOnboardingContract.ViewState) FlowKt.b(mutableStateFlow).getValue()).c;
                companion2.getClass();
                analyticsManager.g(new Event(str2) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$Onboarding$Action$Companion$nextButtonClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(MapsAnalytics.Onboarding.e);
                        spreadBuilder.a(new Pair("event.Category", "product finder"));
                        spreadBuilder.a(new Pair("event.Action", "button_click"));
                        spreadBuilder.a(new Pair("event.Label", "next"));
                        spreadBuilder.a(new Pair("app.Section", "Search"));
                        androidx.constraintlayout.core.state.a.y("event.Description", str2, spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "productfinder_button_click";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "productfinder_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
            if (p6()) {
                productFinderOnboardingInteractorImpl.f7424a.b();
                sharedFlowImpl.f(closeAndMoveToProductFinder);
                return;
            } else {
                do {
                    value2 = mutableStateFlow.getValue();
                    viewState2 = (ProductFinderOnboardingContract.ViewState) value2;
                } while (!mutableStateFlow.d(value2, ProductFinderOnboardingContract.ViewState.a(viewState2, null, viewState2.b + 1, null, false, 13)));
                return;
            }
        }
        if (!(onboardingEvent instanceof ProductFinderOnboardingContract.OnboardingEvent.OnActionButtonClick)) {
            if (!(onboardingEvent instanceof ProductFinderOnboardingContract.OnboardingEvent.UpdateCurrentPageIndex)) {
                if (!(onboardingEvent instanceof ProductFinderOnboardingContract.OnboardingEvent.TrackScreenImpression)) {
                    throw new NoWhenBranchMatchedException();
                }
                analyticsManager.g(MapsAnalytics.Onboarding.Action.e);
                return;
            } else {
                do {
                    value = mutableStateFlow.getValue();
                    viewState = (ProductFinderOnboardingContract.ViewState) value;
                    updateCurrentPageIndex = (ProductFinderOnboardingContract.OnboardingEvent.UpdateCurrentPageIndex) onboardingEvent;
                    i = updateCurrentPageIndex.f7419a;
                } while (!mutableStateFlow.d(value, ProductFinderOnboardingContract.ViewState.a(viewState, null, i, updateCurrentPageIndex.b, i == ((ProductFinderOnboardingContract.ViewState) FlowKt.b(mutableStateFlow).getValue()).f7420a.size() - 1, 1)));
                return;
            }
        }
        if (p6()) {
            MapsAnalytics.Onboarding.Action.Companion companion3 = MapsAnalytics.Onboarding.Action.d;
            final String str3 = ((ProductFinderOnboardingContract.ViewState) FlowKt.b(mutableStateFlow).getValue()).c;
            companion3.getClass();
            analyticsManager.g(new Event(str3) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$Onboarding$Action$Companion$doneButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.Onboarding.e);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "done", spreadBuilder, "event.Description", str3);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "productfinder_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "productfinder_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else {
            MapsAnalytics.Onboarding.Action.Companion companion4 = MapsAnalytics.Onboarding.Action.d;
            final String str4 = ((ProductFinderOnboardingContract.ViewState) FlowKt.b(mutableStateFlow).getValue()).c;
            companion4.getClass();
            analyticsManager.g(new Event(str4) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$Onboarding$Action$Companion$skipButtonClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(MapsAnalytics.Onboarding.e);
                    spreadBuilder.a(new Pair("event.Category", "product finder"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    androidx.constraintlayout.core.state.a.z("event.Label", "skip", spreadBuilder, "event.Description", str4);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "productfinder_button_click";
                }

                public final boolean equals(Object obj) {
                    if (!(obj instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj;
                    return "productfinder_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
        productFinderOnboardingInteractorImpl.f7424a.b();
        sharedFlowImpl.f(closeAndMoveToProductFinder);
    }
}
