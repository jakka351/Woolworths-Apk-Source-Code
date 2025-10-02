package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ContentPageViewModel e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ ProductCard h;

    public /* synthetic */ e(ContentPageViewModel contentPageViewModel, String str, String str2, ProductCard productCard, int i) {
        this.d = i;
        this.e = contentPageViewModel;
        this.f = str;
        this.g = str2;
        this.h = productCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                ContentPageViewModel contentPageViewModel = this.e;
                ContentPageAnalytics.ContentPage contentPageS6 = contentPageViewModel.s6();
                if (contentPageS6 != null) {
                    AnalyticsManager analyticsManager = contentPageViewModel.j;
                    final ContentPageAnalytics.ContentPage.Action action = contentPageS6.h;
                    action.getClass();
                    final String description = this.g;
                    Intrinsics.h(description, "description");
                    analyticsManager.i(new Event(action, description) { // from class: au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics$ContentPage$Action$watchlistSnackbarViewAction$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                            spreadBuilder.b(action.f4035a.g);
                            spreadBuilder.a(new Pair("event.Category", "watchlist"));
                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                            androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "view list", spreadBuilder, description), spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "watchlist_buttonclick";
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj;
                            return "watchlist_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    }, ProductAnalyticsExtKt.h(this.h, null, null, 7));
                }
                contentPageViewModel.q.f(new ContentPageContract.Actions.ViewWatchlist(this.f));
                break;
            default:
                ContentPageViewModel contentPageViewModel2 = this.e;
                ContentPageAnalytics.ContentPage contentPageS62 = contentPageViewModel2.s6();
                if (contentPageS62 != null) {
                    AnalyticsManager analyticsManager2 = contentPageViewModel2.j;
                    final ContentPageAnalytics.ContentPage.Action action2 = contentPageS62.h;
                    action2.getClass();
                    final String description2 = this.g;
                    Intrinsics.h(description2, "description");
                    analyticsManager2.i(new Event(action2, description2) { // from class: au.com.woolworths.analytics.supers.dynamicpage.ContentPageAnalytics$ContentPage$Action$watchlistSnackbarViewAction$1
                        public final Object d;

                        {
                            SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                            spreadBuilder.b(action2.f4035a.g);
                            spreadBuilder.a(new Pair("event.Category", "watchlist"));
                            spreadBuilder.a(new Pair("event.Action", "button_click"));
                            androidx.constraintlayout.core.state.a.y("event.Description", androidx.compose.ui.input.pointer.a.m("event.Label", "view list", spreadBuilder, description2), spreadBuilder);
                            ArrayList arrayList = spreadBuilder.f24269a;
                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                        }

                        @Override // au.com.woolworths.analytics.Event
                        /* renamed from: d */
                        public final String getE() {
                            return "watchlist_buttonclick";
                        }

                        public final boolean equals(Object obj) {
                            if (!(obj instanceof Event)) {
                                return false;
                            }
                            Event event = (Event) obj;
                            return "watchlist_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                        @Override // au.com.woolworths.analytics.Event
                        public final Map getData() {
                            return this.d;
                        }
                    }, ProductAnalyticsExtKt.h(this.h, null, null, 7));
                }
                contentPageViewModel2.q.f(new ContentPageContract.Actions.ViewWatchlist(this.f));
                break;
        }
        return Unit.f24250a;
    }
}
