package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.ui;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsInteractor;
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
final /* synthetic */ class PromotionDetailsScreenKt$PromotionDetailsScreen$2$1$2$1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) this.receiver;
        PromotionDetailsInteractor promotionDetailsInteractor = promotionDetailsViewModel.e;
        Activities.CataloguePromotionDetails.Extra extra = promotionDetailsViewModel.l;
        if (extra == null) {
            Intrinsics.p("extra");
            throw null;
        }
        final String str = extra.e;
        ArrayList arrayList = promotionDetailsInteractor.d;
        int i = iIntValue + 1;
        if (i % 20 == 0 && arrayList.size() > i) {
            int i2 = iIntValue + 21;
            int size = arrayList.size();
            if (i2 > size) {
                i2 = size;
            }
            List listSubList = arrayList.subList(i, i2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listSubList) {
                if (obj2 instanceof ProductCard) {
                    arrayList2.add(obj2);
                }
            }
            AnalyticsManager analyticsManager = promotionDetailsInteractor.c;
            CatalogueAnalytics.PromotionDetails.Action.Companion companion = CatalogueAnalytics.PromotionDetails.Action.d;
            if (str == null) {
                str = "";
            }
            companion.getClass();
            analyticsManager.i(new Event(str) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$nextPage$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                    spreadBuilder.a(new Pair("app.Section", "Specials"));
                    spreadBuilder.a(new Pair("event.Category", "universal_product_list_price_family_variants"));
                    spreadBuilder.a(new Pair("event.Action", "button_click"));
                    spreadBuilder.a(new Pair("event.Label", "load more products"));
                    a.y("event.Description", str, spreadBuilder);
                    ArrayList arrayList3 = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "universalproductlist_buttonclick";
                }

                public final boolean equals(Object obj3) {
                    if (!(obj3 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj3;
                    return "universalproductlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            }, ProductAnalyticsExtKt.f(arrayList2));
        }
        return Unit.f24250a;
    }
}
