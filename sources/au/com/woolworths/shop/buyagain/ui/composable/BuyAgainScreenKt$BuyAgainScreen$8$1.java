package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.shop.buyagain.domain.BuyAgainChip;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$8$1 extends FunctionReferenceImpl implements Function2<ProductCard, Double, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProductCard p0 = (ProductCard) obj;
        double dDoubleValue = ((Number) obj2).doubleValue();
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.getClass();
        AnalyticsManager analyticsManager = buyAgainViewModel.g;
        BuyAgainAnalytics.BuyAgain.Action.Companion companion = BuyAgainAnalytics.BuyAgain.Action.d;
        List listS6 = buyAgainViewModel.s6();
        final ArrayList arrayList = new ArrayList(CollectionsKt.s(listS6, 10));
        Iterator it = listS6.iterator();
        while (it.hasNext()) {
            arrayList.add(((BuyAgainChip) it.next()).f10251a);
        }
        List listS62 = buyAgainViewModel.s6();
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listS62, 10));
        Iterator it2 = listS62.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(((BuyAgainChip) it2.next()).c));
        }
        List listS63 = buyAgainViewModel.s6();
        final ArrayList arrayList3 = new ArrayList(CollectionsKt.s(listS63, 10));
        Iterator it3 = listS63.iterator();
        while (it3.hasNext()) {
            Integer num = ((BuyAgainChip) it3.next()).d;
            arrayList3.add(Integer.valueOf(num != null ? num.intValue() : 0));
        }
        companion.getClass();
        analyticsManager.i(new Event(arrayList, arrayList2, arrayList3) { // from class: au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics$BuyAgain$Action$Companion$stepperMinus$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                spreadBuilder.b(BuyAgainAnalytics.BuyAgain.e);
                spreadBuilder.a(new Pair("event.Category", "button"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Label", "Stepper Minus"));
                spreadBuilder.a(new Pair("chip.ID", arrayList));
                ArrayList arrayList4 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(String.valueOf(((Boolean) it4.next()).booleanValue()));
                }
                spreadBuilder.a(new Pair("chip.Status", arrayList4));
                ArrayList arrayList5 = new ArrayList(CollectionsKt.s(arrayList3, 10));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(String.valueOf(((Number) it5.next()).intValue()));
                }
                spreadBuilder.a(new Pair("chip.Count", arrayList5));
                ArrayList arrayList6 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList6.toArray(new Pair[arrayList6.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "button_click";
            }

            public final boolean equals(Object obj3) {
                if (!(obj3 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj3;
                return "button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, ProductAnalyticsExtKt.h(p0, null, null, 7));
        ProductTrolleyData trolley = p0.getTrolley();
        if (trolley != null) {
            buyAgainViewModel.r6(p0, new BigDecimal(Math.max(dDoubleValue - trolley.getMinimum(), 0.0d)).setScale(2, RoundingMode.HALF_UP).doubleValue());
        }
        return Unit.f24250a;
    }
}
