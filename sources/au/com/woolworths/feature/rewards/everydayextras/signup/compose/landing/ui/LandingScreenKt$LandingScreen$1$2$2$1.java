package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasTab;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class LandingScreenKt$LandingScreen$1$2$2$1 extends FunctionReferenceImpl implements Function1<EverydayExtrasTab, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EverydayExtrasTab p0 = (EverydayExtrasTab) obj;
        Intrinsics.h(p0, "p0");
        AnalyticsManager analyticsManager = ((EverydayExtraLandingViewModel) this.receiver).h;
        if (p0 instanceof EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) {
            EdxLandingAnalytics.Landing.Action.Companion companion = EdxLandingAnalytics.Landing.Action.d;
            final String str = ((EverydayExtrasTab.EverydayExtrasKeyBenefitsTab) p0).b;
            companion.getClass();
            analyticsManager.g(new Event(str) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion$sectionClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(EdxLandingAnalytics.Landing.f);
                    a.z("event.Category", "button", spreadBuilder, "event.Action", "click");
                    a.y("event.Label", "EDX ".concat(str), spreadBuilder);
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
                    Event event = (Event) obj2;
                    return "button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else {
            if (!(p0 instanceof EverydayExtrasTab.EverydayExtrasFaqsTab)) {
                throw new NoWhenBranchMatchedException();
            }
            EdxLandingAnalytics.Landing.Action.Companion companion2 = EdxLandingAnalytics.Landing.Action.d;
            final String str2 = ((EverydayExtrasTab.EverydayExtrasFaqsTab) p0).b;
            companion2.getClass();
            analyticsManager.g(new Event(str2) { // from class: au.com.woolworths.analytics.rewards.everydayextrasignup.EdxLandingAnalytics$Landing$Action$Companion$sectionClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                    spreadBuilder.b(EdxLandingAnalytics.Landing.f);
                    a.z("event.Category", "button", spreadBuilder, "event.Action", "click");
                    a.y("event.Label", "EDX ".concat(str2), spreadBuilder);
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
                    Event event = (Event) obj2;
                    return "button_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
