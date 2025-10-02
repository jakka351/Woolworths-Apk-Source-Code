package au.com.woolworths.foundation.shop.instore.navigation;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsManagerExtKt {
    public static final void a(AnalyticsManager analyticsManager, String str, String str2, String str3, ProductCard productCard) {
        Intrinsics.h(analyticsManager, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("screen.Name", str);
        }
        if (str2 != null) {
            linkedHashMap.put("screen.Type", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("app.Section", str3);
        }
        linkedHashMap.put("event.Category", "button");
        linkedHashMap.put("event.Action", "button_click");
        linkedHashMap.put("event.Label", "Aisle");
        AisleClickEvent aisleClickEvent = new AisleClickEvent(linkedHashMap);
        if (productCard == null) {
            analyticsManager.g(aisleClickEvent);
        } else {
            analyticsManager.i(aisleClickEvent, ProductAnalyticsExtKt.h(productCard, null, null, 7));
        }
    }

    public static void b(AnalyticsManager analyticsManager, String str, String str2) {
        Intrinsics.h(analyticsManager, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("screen.Name", str);
        }
        if (str2 != null) {
            linkedHashMap.put("app.Section", str2);
        }
        linkedHashMap.put("event.Category", "product finder");
        linkedHashMap.put("event.Action", "impression");
        linkedHashMap.put("event.Label", "find products on a map");
        analyticsManager.g(new FeatureHighlightImpressionEvent(linkedHashMap));
    }
}
