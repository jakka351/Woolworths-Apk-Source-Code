package au.com.woolworths.shop.specials.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.shop.specials.SpecialsHomeContract;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
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

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SpecialsHomeScreenKt$Listing$2$1$1$3$1$1 extends FunctionReferenceImpl implements Function1<DynamicSizeCardData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DynamicSizeCardData p0 = (DynamicSizeCardData) obj;
        Intrinsics.h(p0, "p0");
        SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) this.receiver;
        specialsHomeViewModel.getClass();
        if (p0 instanceof ActionableCard) {
            AnalyticsManager analyticsManager = specialsHomeViewModel.i;
            SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
            ActionableCard actionableCard = (ActionableCard) p0;
            final String description = actionableCard.getLink();
            companion.getClass();
            Intrinsics.h(description, "description");
            analyticsManager.g(new Event(description) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$actionableCardClick$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                    spreadBuilder.a(new Pair("event.Category", "specials-hub-body"));
                    spreadBuilder.a(new Pair("event.Action", "link_click"));
                    a.z("event.Label", "Actionable Card", spreadBuilder, "event.Description", description);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "specialshub_linkclick";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "specialshub_linkclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            specialsHomeViewModel.q.k(new SpecialsHomeContract.Action.LaunchDeepLink(actionableCard.getLink()));
        }
        return Unit.f24250a;
    }
}
