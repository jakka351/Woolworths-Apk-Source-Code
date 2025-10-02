package au.com.woolworths.analytics.supers.products;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.ZeroResultAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/supers/products/ZeroResultAnalytics$ZeroPageResult$Action$replaceInitiated$1", "Lau/com/woolworths/analytics/Event;", "specs-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ZeroResultAnalytics$ZeroPageResult$Action$replaceInitiated$1 implements Event {
    public final Object d;

    public ZeroResultAnalytics$ZeroPageResult$Action$replaceInitiated$1(ZeroResultAnalytics.ZeroPageResult.Action action, List list, List list2, List list3, List list4) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(8);
        spreadBuilder.b(action.f4048a.e);
        spreadBuilder.a(new Pair("event.Action", "click"));
        spreadBuilder.a(new Pair("event.Category", "Product Out of Stock: View Similar Items"));
        spreadBuilder.a(new Pair("event.Label", "Replace product initiated"));
        spreadBuilder.a(new Pair("product.ID", list));
        spreadBuilder.a(new Pair("product.ReplacedItemID", list2));
        spreadBuilder.a(new Pair("product.ReplacedItemName", list3));
        spreadBuilder.a(new Pair("product.ReplacedItemPrice", list4));
        ArrayList arrayList = spreadBuilder.f24269a;
        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getD() {
        return "product_alternatives_replacement_initiated";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return "product_alternatives_replacement_initiated".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d;
    }
}
