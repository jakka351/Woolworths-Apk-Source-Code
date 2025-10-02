package au.com.woolworths.android.onesite.modules.search.analytics;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.ProductFinderAnalytics;
import au.com.woolworths.android.onesite.analytics.Category;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/search/analytics/ProductFinderTrackingKt$generateVoiceSearchClickEventWithProductFinder$1", "Lau/com/woolworths/analytics/Event;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductFinderTrackingKt$generateVoiceSearchClickEventWithProductFinder$1 implements Event {
    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getD() {
        Category category = Category.g;
        return "voiceproductfinder_buttonclick";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return ProductFinderAnalytics.ProductFinder.e;
    }
}
