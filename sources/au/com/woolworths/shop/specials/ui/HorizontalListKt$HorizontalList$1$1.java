package au.com.woolworths.shop.specials.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.product.models.PromotionCard;
import au.com.woolworths.shop.aem.components.model.contentcard.ContentCardData;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class HorizontalListKt$HorizontalList$1$1 extends FunctionReferenceImpl implements Function2<HorizontalListData, Object, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object p1) {
        HorizontalListData p0 = (HorizontalListData) obj;
        Intrinsics.h(p0, "p0");
        Intrinsics.h(p1, "p1");
        SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) this.receiver;
        specialsHomeViewModel.getClass();
        if (specialsHomeViewModel.m.add(new Pair(p0, p1))) {
            if (p1 instanceof ContentCardData) {
                AnalyticsManager analyticsManager = specialsHomeViewModel.i;
                SpecialsAnalytics.Home.Action.Companion companion = SpecialsAnalytics.Home.Action.d;
                ContentCardData contentCardData = (ContentCardData) p1;
                final String str = contentCardData.f;
                if (str == null) {
                    str = "";
                }
                final String d = p0.getD();
                if (d == null) {
                    d = "";
                }
                String str2 = contentCardData.d;
                final String str3 = str2 != null ? str2 : "";
                companion.getClass();
                analyticsManager.g(new Event(str, d, str3) { // from class: au.com.woolworths.analytics.supers.specials.SpecialsAnalytics$Home$Action$Companion$contentCardImpression$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(SpecialsAnalytics.Home.f);
                        spreadBuilder.a(new Pair("event.Category", "Content Card"));
                        spreadBuilder.a(new Pair("event.Action", "banner_impression"));
                        spreadBuilder.a(new Pair("event.Label", str));
                        spreadBuilder.a(new Pair("event.Description", d));
                        a.y("internal.Campaign", str3, spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "contentcard_banner_impression";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "contentcard_banner_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            } else if (p1 instanceof PromotionCard) {
                specialsHomeViewModel.n.add(p1);
            }
        }
        return Unit.f24250a;
    }
}
