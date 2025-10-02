package au.com.woolworths.analytics.model;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.Screen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/analytics/model/AnalyticsDataKt$getScreen$1", "Lau/com/woolworths/analytics/Screen;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnalyticsDataKt$getScreen$1 implements Screen {
    public final /* synthetic */ Event d;

    public AnalyticsDataKt$getScreen$1(Event event) {
        this.d = event;
    }

    @Override // au.com.woolworths.analytics.Event
    /* renamed from: d */
    public final String getD() {
        return this.d.getD();
    }

    @Override // au.com.woolworths.analytics.Event
    public final Map getData() {
        return this.d.getData();
    }

    @Override // au.com.woolworths.analytics.Screen
    public final String getName() {
        Object orDefault = this.d.getData().getOrDefault("screen.Name", "unknown_content_screen");
        Intrinsics.f(orDefault, "null cannot be cast to non-null type kotlin.String");
        return (String) orDefault;
    }
}
