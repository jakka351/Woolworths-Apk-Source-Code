package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.buyagain.domain.BuyAgainChip;
import au.com.woolworths.shop.buyagain.domain.BuyAgainProductList;
import au.com.woolworths.shop.buyagain.domain.ProductList;
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
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$12$1 extends FunctionReferenceImpl implements Function1<BuyAgainChip, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BuyAgainProductList buyAgainProductListA;
        BuyAgainChip p0 = (BuyAgainChip) obj;
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.getClass();
        AnalyticsManager analyticsManager = buyAgainViewModel.g;
        BuyAgainAnalytics.BuyAgain.Action.Companion companion = BuyAgainAnalytics.BuyAgain.Action.d;
        final String str = p0.f10251a;
        final List listQ = CollectionsKt.Q(str);
        boolean z = p0.c;
        boolean z2 = !z;
        final List listQ2 = CollectionsKt.Q(Boolean.valueOf(z2));
        Integer num = p0.d;
        final List listQ3 = CollectionsKt.Q(Integer.valueOf(num != null ? num.intValue() : 0));
        companion.getClass();
        analyticsManager.g(new Event(str, listQ, listQ2, listQ3) { // from class: au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics$BuyAgain$Action$Companion$chipClick$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                spreadBuilder.b(BuyAgainAnalytics.BuyAgain.e);
                spreadBuilder.a(new Pair("event.Category", "Buy again filter chips"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                spreadBuilder.a(new Pair("event.Label", str));
                spreadBuilder.a(new Pair("chip.ID", listQ));
                List list = listQ2;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                }
                spreadBuilder.a(new Pair("chip.Status", arrayList));
                List list2 = listQ3;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((Number) it2.next()).intValue()));
                }
                spreadBuilder.a(new Pair("chip.Count", arrayList2));
                ArrayList arrayList3 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "buy_again_filter_chip_click";
            }

            public final boolean equals(Object obj2) {
                if (!(obj2 instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj2;
                return "buy_again_filter_chip_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
        MutableStateFlow mutableStateFlow = buyAgainViewModel.m;
        BuyAgainProductList buyAgainProductList = ((BuyAgainContract.ViewState) mutableStateFlow.getValue()).d;
        if (buyAgainProductList != null) {
            ProductList productList = buyAgainProductList.c;
            List<BuyAgainChip> list = productList.d;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (BuyAgainChip buyAgainChip : list) {
                if (buyAgainChip.f10251a.equals(str)) {
                    buyAgainChip = new BuyAgainChip(buyAgainChip.f10251a, buyAgainChip.b, z2, buyAgainChip.d);
                }
                arrayList.add(buyAgainChip);
            }
            buyAgainProductListA = BuyAgainProductList.a(buyAgainProductList, ProductList.a(productList, null, arrayList, 7));
        } else {
            buyAgainProductListA = null;
        }
        String str2 = str;
        BuyAgainViewModel.x6(buyAgainViewModel, mutableStateFlow, false, false, null, buyAgainProductListA, null, null, false, null, false, null, null, false, false, false, 16375);
        String str3 = z ? null : str2;
        if (!z) {
            str2 = null;
        }
        buyAgainViewModel.u6(str3, str2);
        return Unit.f24250a;
    }
}
