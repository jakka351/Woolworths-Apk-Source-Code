package au.com.woolworths.shop.specials.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import au.com.woolworths.shop.specials.SpecialsHomeViewModelKt;
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
final /* synthetic */ class HorizontalListKt$HorizontalList$2$1 extends FunctionReferenceImpl implements Function1<HorizontalListData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HorizontalListData p0 = (HorizontalListData) obj;
        Intrinsics.h(p0, "p0");
        SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) this.receiver;
        specialsHomeViewModel.getClass();
        if (SpecialsHomeViewModelKt.b(p0)) {
            AnalyticsManager analyticsManager = specialsHomeViewModel.i;
            SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
            final String d = p0.getD();
            if (d == null) {
                d = "";
            }
            companion.getClass();
            analyticsManager.g(new Event(d) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$promotionCarouselScrollLeft$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(SpecialsAnalytics.Home.f);
                    spreadBuilder.a(new Pair("screen.Type", "productcategory"));
                    spreadBuilder.a(new Pair("event.Category", "universal_product_list_price_family_variants"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    a.z("event.Label", d.concat(" - left navigation"), spreadBuilder, "event.Description", "");
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "universalproductlist_buttonclick";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "universalproductlist_buttonclick".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
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
