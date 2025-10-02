package au.com.woolworths.shop.specials.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.aem.components.model.CatalogueCard;
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
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SpecialsHomeScreenKt$Listing$2$1$1$2$1$1 extends FunctionReferenceImpl implements Function1<CatalogueCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String id;
        CatalogueCard p0 = (CatalogueCard) obj;
        Intrinsics.h(p0, "p0");
        SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) this.receiver;
        BufferedChannel bufferedChannel = specialsHomeViewModel.q;
        AnalyticsManager analyticsManager = specialsHomeViewModel.i;
        SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
        final String title = p0.f10140a;
        companion.getClass();
        Intrinsics.h(title, "title");
        analyticsManager.g(new Event(title) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$catalogueClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(SpecialsAnalytics.Home.f);
                a.z("event.Category", "catalogue", spreadBuilder, "event.Action", "link_click");
                a.y("event.Label", String.valueOf(title), spreadBuilder);
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
        if (specialsHomeViewModel.g.f6778a.a() == null || (id = p0.getId()) == null || id.length() == 0) {
            bufferedChannel.k(SpecialsHomeContract.Action.LaunchCatalogueHome.f12928a);
        } else {
            bufferedChannel.k(new SpecialsHomeContract.Action.LaunchCatalogueDetails(p0));
        }
        return Unit.f24250a;
    }
}
