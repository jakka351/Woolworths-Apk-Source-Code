package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsViewModel;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import java.util.ArrayList;
import java.util.List;
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
/* loaded from: classes3.dex */
final /* synthetic */ class PromotionDetailsScreenKt$PromotionDetailsScreen$2$1$1$1 extends FunctionReferenceImpl implements Function1<List<? extends ProductCard>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List p0 = (List) obj;
        Intrinsics.h(p0, "p0");
        PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) this.receiver;
        promotionDetailsViewModel.getClass();
        AnalyticsManager analyticsManager = promotionDetailsViewModel.f;
        CatalogueAnalytics.PromotionDetails.Action.Companion companion = CatalogueAnalytics.PromotionDetails.Action.d;
        Activities.CataloguePromotionDetails.Extra extra = promotionDetailsViewModel.l;
        if (extra == null) {
            Intrinsics.p("extra");
            throw null;
        }
        final String str = extra.g;
        if (str == null) {
            str = "";
        }
        String str2 = extra.e;
        final String str3 = str2 != null ? str2 : "";
        companion.getClass();
        analyticsManager.i(new Event(str, str3) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$pageImpression$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                spreadBuilder.a(new Pair("app.Section", "Specials"));
                spreadBuilder.a(new Pair("event.Category", "price_family_variants"));
                spreadBuilder.a(new Pair("event.Action", "modal_impression"));
                a.z("event.Label", str.concat(" - view varieties"), spreadBuilder, "event.Description", str3);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "universalproductlist_modal_impression";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "universalproductlist_modal_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.f(p0));
        return Unit.f24250a;
    }
}
