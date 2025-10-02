package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.EventConfig;
import au.com.woolworths.analytics.EventKt;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class VideoAdUnitComposeEpoxyModel$wrappedModel$1$1$1$4$1 extends AdaptedFunctionReference implements Function1<AnalyticsData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnalyticsData p0 = (AnalyticsData) obj;
        Intrinsics.h(p0, "p0");
        AnalyticsManager analyticsManager = ((ProductListViewModel) this.d).g;
        Event eventA = AnalyticsDataKt.a(p0);
        if (Intrinsics.c(eventA.getE(), "video_autostart")) {
            eventA.getG().getClass();
            eventA = EventKt.a(eventA, null, null, new EventConfig(true));
        }
        analyticsManager.g(eventA);
        return Unit.f24250a;
    }
}
