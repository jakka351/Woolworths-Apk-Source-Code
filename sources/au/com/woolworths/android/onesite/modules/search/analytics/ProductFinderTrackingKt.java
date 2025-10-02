package au.com.woolworths.android.onesite.modules.search.analytics;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.model.EventConfig;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchActions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"app-common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductFinderTrackingKt {
    public static final Event a() {
        ProductFinderTrackingKt$generateVoiceSearchClickEventWithProductFinder$1 productFinderTrackingKt$generateVoiceSearchClickEventWithProductFinder$1 = new ProductFinderTrackingKt$generateVoiceSearchClickEventWithProductFinder$1();
        Category category = Category.g;
        return AnalyticsDataKt.b(productFinderTrackingKt$generateVoiceSearchClickEventWithProductFinder$1, new AnalyticsData((EventConfig) null, (String) null, (String) null, (String) null, "voice product finder", ((SearchActions.VOICE_SEARCH) SearchActions.f).j, (String) null, "button_click", (String) null, (String) null, (List) null, 1871, (DefaultConstructorMarker) null));
    }
}
