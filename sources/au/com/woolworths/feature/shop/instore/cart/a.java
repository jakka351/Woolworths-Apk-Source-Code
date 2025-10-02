package au.com.woolworths.feature.shop.instore.cart;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.cart.instorecart.InstoreCartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ InstoreCartViewModel e;

    public /* synthetic */ a(InstoreCartViewModel instoreCartViewModel, int i) {
        this.d = i;
        this.e = instoreCartViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                InstoreCartViewModel instoreCartViewModel = this.e;
                AnalyticsManager analyticsManager = instoreCartViewModel.e;
                InstoreCartAnalytics.ErrorScreen.Action.d.getClass();
                analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.supers.cart.instorecart.InstoreCartAnalytics$ErrorScreen$Action$Companion$serverErrorTryAgain$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(InstoreCartAnalytics.ErrorScreen.e);
                        spreadBuilder.a(new Pair("event.Category", "button"));
                        spreadBuilder.a(new Pair("event.Action", "click"));
                        spreadBuilder.a(new Pair("event.Label", "Server Error - Try Again"));
                        spreadBuilder.a(new Pair("user.MarketOrderCount", ""));
                        spreadBuilder.a(new Pair("user.SupersOrderCount", ""));
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "button_click";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                instoreCartViewModel.q6();
                break;
            default:
                InstoreCartViewModel instoreCartViewModel2 = this.e;
                AnalyticsManager analyticsManager2 = instoreCartViewModel2.e;
                InstoreCartAnalytics.ErrorScreen.Action.d.getClass();
                analyticsManager2.g(new Event() { // from class: au.com.woolworths.analytics.supers.cart.instorecart.InstoreCartAnalytics$ErrorScreen$Action$Companion$networkErrorTryAgain$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(InstoreCartAnalytics.ErrorScreen.e);
                        spreadBuilder.a(new Pair("event.Category", "button"));
                        spreadBuilder.a(new Pair("event.Action", "click"));
                        spreadBuilder.a(new Pair("event.Label", "Network - Try Again"));
                        spreadBuilder.a(new Pair("user.MarketOrderCount", ""));
                        spreadBuilder.a(new Pair("user.SupersOrderCount", ""));
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "button_click";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
                instoreCartViewModel2.q6();
                break;
        }
        return Unit.f24250a;
    }
}
