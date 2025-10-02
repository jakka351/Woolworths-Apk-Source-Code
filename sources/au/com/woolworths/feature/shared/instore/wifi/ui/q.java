package au.com.woolworths.feature.shared.instore.wifi.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.instorewifi.WifiTermsAndConditionsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q(int i, Function2 function2) {
        this.d = 2;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                JoinWifiViewModel joinWifiViewModel = (JoinWifiViewModel) this.e;
                final String linkText = (String) obj2;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(linkText, "linkText");
                joinWifiViewModel.getClass();
                AnalyticsManager analyticsManager = joinWifiViewModel.f;
                WifiTermsAndConditionsAnalytics.Tnc.Action.d.getClass();
                analyticsManager.g(new Event(linkText) { // from class: au.com.woolworths.analytics.rewards.instorewifi.WifiTermsAndConditionsAnalytics$Tnc$Action$Companion$quickLinkClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                        spreadBuilder.b(WifiTermsAndConditionsAnalytics.Tnc.e);
                        a.z("event.Category", "quick_link", spreadBuilder, "event.Action", "click");
                        a.y("event.Label", String.valueOf(linkText), spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "quick_link_click";
                    }

                    public final boolean equals(Object obj3) {
                        if (!(obj3 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj3;
                        return "quick_link_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                break;
            case 1:
                JoinWifiViewModel joinWifiViewModel2 = (JoinWifiViewModel) this.e;
                final String linkText2 = (String) obj2;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(linkText2, "linkText");
                joinWifiViewModel2.getClass();
                AnalyticsManager analyticsManager2 = joinWifiViewModel2.f;
                WifiTermsAndConditionsAnalytics.Tnc.Action.d.getClass();
                analyticsManager2.g(new Event(linkText2) { // from class: au.com.woolworths.analytics.rewards.instorewifi.WifiTermsAndConditionsAnalytics$Tnc$Action$Companion$everydayGuestWifiTncClick$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                        spreadBuilder.b(WifiTermsAndConditionsAnalytics.Tnc.e);
                        a.z("event.Category", "link", spreadBuilder, "event.Action", "click");
                        a.y("event.Label", String.valueOf(linkText2), spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "link_click";
                    }

                    public final boolean equals(Object obj3) {
                        if (!(obj3 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj3;
                        return "link_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                break;
            default:
                Function2 function2 = (Function2) this.e;
                ((Integer) obj2).getClass();
                JoinInStoreWifiScreenKt.a(RecomposeScopeImplKt.a(1), (Composer) obj, function2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ q(JoinWifiViewModel joinWifiViewModel, int i) {
        this.d = i;
        this.e = joinWifiViewModel;
    }
}
