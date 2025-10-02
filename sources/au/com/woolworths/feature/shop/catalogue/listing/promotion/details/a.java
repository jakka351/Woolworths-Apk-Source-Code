package au.com.woolworths.feature.shop.catalogue.listing.promotion.details;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsContract;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsInteractor;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsInteractor.DetailsPagingSource;
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
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(PromotionDetailsInteractor promotionDetailsInteractor, String str, String str2, String str3) {
        this.g = promotionDetailsInteractor;
        this.e = str;
        this.f = str2;
        this.h = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                PromotionDetailsInteractor promotionDetailsInteractor = (PromotionDetailsInteractor) this.g;
                PromotionDetailsInteractor.DetailsPagingSource detailsPagingSource = promotionDetailsInteractor.new DetailsPagingSource(this.e, this.f, (String) this.h);
                promotionDetailsInteractor.e = detailsPagingSource;
                return detailsPagingSource;
            default:
                PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) this.g;
                ProductCard productCard = (ProductCard) this.h;
                AnalyticsManager analyticsManager = promotionDetailsViewModel.f;
                CatalogueAnalytics.PromotionDetails.Action.d.getClass();
                final String description = this.e;
                Intrinsics.h(description, "description");
                analyticsManager.i(new Event(description) { // from class: au.com.woolworths.analytics.supers.catalogue.CatalogueAnalytics$PromotionDetails$Action$Companion$watchlistSnackbarViewAction$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                        spreadBuilder.b(CatalogueAnalytics.PromotionDetails.e);
                        spreadBuilder.a(new Pair("app.Section", "Specials"));
                        spreadBuilder.a(new Pair("event.Category", "watchlist"));
                        a.z("event.Action", "button_click", spreadBuilder, "event.Label", "view list");
                        a.y("event.Description", String.valueOf(description), spreadBuilder);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getD() {
                        return "watchlist_buttonclick";
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj;
                        return "watchlist_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                }, ProductAnalyticsExtKt.h(productCard, null, null, 7));
                promotionDetailsViewModel.j.k(new PromotionDetailsContract.Action.LaunchViewShoppingList(this.f, true));
                return Unit.f24250a;
        }
    }

    public /* synthetic */ a(PromotionDetailsViewModel promotionDetailsViewModel, String str, ProductCard productCard, String str2) {
        this.g = promotionDetailsViewModel;
        this.e = str;
        this.h = productCard;
        this.f = str2;
    }
}
