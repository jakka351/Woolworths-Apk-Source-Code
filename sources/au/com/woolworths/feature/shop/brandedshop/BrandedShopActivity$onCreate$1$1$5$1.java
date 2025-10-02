package au.com.woolworths.feature.shop.brandedshop;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.aem.components.model.GenericPageFeedItem;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthContentCardData;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import au.com.woolworths.shop.aem.components.model.product.ProductSectionData;
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
final /* synthetic */ class BrandedShopActivity$onCreate$1$1$5$1 extends FunctionReferenceImpl implements Function1<GenericPageFeedItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final String str;
        GenericPageFeedItem p0 = (GenericPageFeedItem) obj;
        Intrinsics.h(p0, "p0");
        BrandedShopViewModel brandedShopViewModel = (BrandedShopViewModel) this.receiver;
        AnalyticsManager analyticsManager = brandedShopViewModel.i;
        if (p0 instanceof FullWidthImageCardData) {
            BrandedShopAnalytics.BrandedShop brandedShop = new BrandedShopAnalytics.BrandedShop(brandedShopViewModel.r6());
            FullWidthImageCardData fullWidthImageCardData = (FullWidthImageCardData) p0;
            final String str2 = fullWidthImageCardData.d;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = fullWidthImageCardData.f10150a;
            str = str3 != null ? str3 : "";
            final BrandedShopAnalytics.BrandedShop.Action action = brandedShop.h;
            action.getClass();
            analyticsManager.g(new Event(action, str2, str) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$imageImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action.f4030a.g);
                    spreadBuilder.a(new Pair("event.Category", "branded_shop"));
                    spreadBuilder.a(new Pair("event.Action", "image_impression"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str2, spreadBuilder, "event.Description", str);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "image_impression";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "image_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else if (p0 instanceof FullWidthContentCardData) {
            BrandedShopAnalytics.BrandedShop brandedShop2 = new BrandedShopAnalytics.BrandedShop(brandedShopViewModel.r6());
            FullWidthContentCardData fullWidthContentCardData = (FullWidthContentCardData) p0;
            final String str4 = fullWidthContentCardData.c;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = fullWidthContentCardData.f10149a;
            str = str5 != null ? str5 : "";
            final BrandedShopAnalytics.BrandedShop.Action action2 = brandedShop2.h;
            action2.getClass();
            analyticsManager.g(new Event(action2, str4, str) { // from class: au.com.woolworths.analytics.supers.brandedshop.BrandedShopAnalytics$BrandedShop$Action$contentCardImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                    spreadBuilder.b(action2.f4030a.g);
                    spreadBuilder.a(new Pair("event.Category", "Content Card"));
                    spreadBuilder.a(new Pair("event.Action", "banner_impression"));
                    androidx.constraintlayout.core.state.a.z("event.Label", str4, spreadBuilder, "event.Description", str);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "contentcard_banner_impression";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "contentcard_banner_impression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
        } else if (p0 instanceof ProductSectionData) {
            List list = ((ProductSectionData) p0).d;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ProductCard) {
                    arrayList.add(obj2);
                }
            }
            analyticsManager.i((Event) new BrandedShopAnalytics.BrandedShop(brandedShopViewModel.r6()).h.b.getD(), ProductAnalyticsExtKt.f(arrayList));
        }
        return Unit.f24250a;
    }
}
