package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics;
import au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$click$1;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.base.shopapp.modules.button.Analytics;
import au.com.woolworths.base.shopapp.modules.button.ButtonActionApiData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorContract;
import au.com.woolworths.feature.shop.modeselector.ModeSelectorViewModel;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ModeSelectorScreenKt$ModeSelectorScreen$2$5$1 extends FunctionReferenceImpl implements Function1<ButtonApiData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final String label;
        Event modeSelectorAnalytics$ModeSelector$Action$Companion$click$1;
        String str;
        Object value;
        final String label2;
        ButtonApiData p0 = (ButtonApiData) obj;
        Intrinsics.h(p0, "p0");
        ModeSelectorViewModel modeSelectorViewModel = (ModeSelectorViewModel) this.receiver;
        AnalyticsManager analyticsManager = modeSelectorViewModel.h;
        ButtonActionApiData action = p0.getAction();
        int i = action == null ? -1 : ModeSelectorViewModel.WhenMappings.b[action.ordinal()];
        if (i == 1) {
            Analytics analytics = p0.getAnalytics();
            if (analytics != null && (label = analytics.getLabel()) != null) {
                if (modeSelectorViewModel.f.w() instanceof CollectionMode.InStore) {
                    ModeSelectorAnalytics.ModeSelector.Action.d.getClass();
                    modeSelectorAnalytics$ModeSelector$Action$Companion$click$1 = new Event(label) { // from class: au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$instoreLinkClick$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                            spreadBuilder.b(ModeSelectorAnalytics.ModeSelector.e);
                            spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                            spreadBuilder.a(new Pair("event.Action", "link_click"));
                            a.y("event.Label", label, spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "mode_selector_click";
                        }

                        public final boolean equals(Object obj2) {
                            if (!(obj2 instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj2;
                            return "mode_selector_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    };
                } else {
                    ModeSelectorAnalytics.ModeSelector.Action.d.getClass();
                    modeSelectorAnalytics$ModeSelector$Action$Companion$click$1 = new ModeSelectorAnalytics$ModeSelector$Action$Companion$click$1(label);
                }
                analyticsManager.g(modeSelectorAnalytics$ModeSelector$Action$Companion$click$1);
            }
            String url = p0.getUrl();
            if (url != null) {
                modeSelectorViewModel.x6(url);
            }
        } else if (i == 2) {
            Analytics analytics2 = p0.getAnalytics();
            if (analytics2 != null && (label2 = analytics2.getLabel()) != null) {
                ModeSelectorAnalytics.ModeSelector.Action.d.getClass();
                analyticsManager.g(new Event(label2) { // from class: au.com.woolworths.analytics.supers.modeselector.ModeSelectorAnalytics$ModeSelector$Action$Companion$instoreLinkClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                        spreadBuilder.b(ModeSelectorAnalytics.ModeSelector.e);
                        spreadBuilder.a(new Pair("event.Category", "mode_selector"));
                        spreadBuilder.a(new Pair("event.Action", "link_click"));
                        a.y("event.Label", label2, spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "mode_selector_click";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "mode_selector_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            }
            ShoppingModeSection.ShoppingModeSelectorAddressInfoSection shoppingModeSelectorAddressInfoSection = ((ModeSelectorContract.ViewState) modeSelectorViewModel.o.getValue()).f;
            if (shoppingModeSelectorAddressInfoSection != null && (str = shoppingModeSelectorAddressInfoSection.f7533a.c) != null) {
                MutableStateFlow mutableStateFlow = modeSelectorViewModel.l;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.d(value, ModeSelectorContract.ViewState.a((ModeSelectorContract.ViewState) value, false, null, null, null, null, null, null, null, null, null, null, 2044)));
                modeSelectorViewModel.m.f(new ModeSelectorContract.Actions.OpenMapsApp(str));
            }
        }
        return Unit.f24250a;
    }
}
