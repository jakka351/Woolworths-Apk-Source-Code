package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.domain.BuyAgainChip;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$17$1 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCard p0 = (ProductCard) obj;
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.getClass();
        AnalyticsManager analyticsManager = buyAgainViewModel.g;
        BuyAgainAnalytics.BuyAgain.Action.Companion companion = BuyAgainAnalytics.BuyAgain.Action.d;
        final String title = p0.getName();
        List listS6 = buyAgainViewModel.s6();
        final ArrayList arrayList = new ArrayList(CollectionsKt.s(listS6, 10));
        Iterator it = listS6.iterator();
        while (it.hasNext()) {
            arrayList.add(((BuyAgainChip) it.next()).b.getText());
        }
        companion.getClass();
        Intrinsics.h(title, "title");
        analyticsManager.i(new Event(title, arrayList) { // from class: au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics$BuyAgain$Action$Companion$productClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(BuyAgainAnalytics.BuyAgain.e);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Label", "Product"));
                spreadBuilder.a(new Pair("buyAgain.Title", title));
                spreadBuilder.a(new Pair("buyAgain.FilterChips", arrayList));
                ArrayList arrayList2 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
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
        }, ProductAnalyticsExtKt.h(p0, null, null, 7));
        buyAgainViewModel.k.k(new BuyAgainContract.Actions.OpenProductDetails(p0));
        return Unit.f24250a;
    }
}
