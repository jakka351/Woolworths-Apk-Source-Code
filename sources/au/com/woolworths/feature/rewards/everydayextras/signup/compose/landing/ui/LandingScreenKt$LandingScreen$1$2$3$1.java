package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtraFaqsSectionItem;
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
final /* synthetic */ class LandingScreenKt$LandingScreen$1$2$3$1 extends FunctionReferenceImpl implements Function1<EverydayExtraFaqsSectionItem.FaqsFaqUiItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        EverydayExtraFaqsSectionItem.FaqsFaqUiItem p0 = (EverydayExtraFaqsSectionItem.FaqsFaqUiItem) obj;
        Intrinsics.h(p0, "p0");
        EverydayExtraLandingViewModel everydayExtraLandingViewModel = (EverydayExtraLandingViewModel) this.receiver;
        AnalyticsManager analyticsManager = everydayExtraLandingViewModel.h;
        final String str = p0.d.f6156a;
        MutableStateFlow mutableStateFlow = everydayExtraLandingViewModel.i;
        EverydayExtraLandingContract.ViewState viewState = (EverydayExtraLandingContract.ViewState) mutableStateFlow.getValue();
        androidx.lifecycle.f fVar = new androidx.lifecycle.f(13, everydayExtraLandingViewModel, p0);
        if (viewState instanceof EverydayExtraLandingContract.ViewState.Content) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, (EverydayExtraLandingContract.ViewState) fVar.invoke(viewState)));
        }
        if (p0.e) {
            EdxLandingAnalytics.Landing.Action.d.getClass();
            analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion$faqClose$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(EdxLandingAnalytics.Landing.f);
                    spreadBuilder.a(new Pair("event.Action", "close"));
                    spreadBuilder.a(new Pair("event.Category", "accordion"));
                    a.y("event.Label", YU.a.h("EDX FAQ ", str, " close"), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "accordion_close";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "accordion_close".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else {
            EdxLandingAnalytics.Landing.Action.d.getClass();
            analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion$faqOpen$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(EdxLandingAnalytics.Landing.f);
                    spreadBuilder.a(new Pair("event.Action", "open"));
                    spreadBuilder.a(new Pair("event.Category", "accordion"));
                    a.y("event.Label", YU.a.h("EDX FAQ ", str, " open"), spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "accordion_open";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "accordion_open".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        }
        return Unit.f24250a;
    }
}
