package au.com.woolworths.rewards.base.analytics;

import au.com.woolworths.foundation.shop.olive.voice.ui.search.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/analytics/CustomFormatProperty;", "Lau/com/woolworths/rewards/base/analytics/TealiumEventKeyProperty;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CustomFormatProperty implements TealiumEventKeyProperty {

    /* renamed from: a, reason: collision with root package name */
    public final a f9355a;

    public CustomFormatProperty(a aVar) {
        this.f9355a = aVar;
    }

    @Override // au.com.woolworths.rewards.base.analytics.TealiumEventKeyProperty
    public final Object a(Object obj) {
        return this.f9355a.invoke(obj);
    }

    @Override // au.com.woolworths.rewards.base.analytics.TealiumEventKeyProperty
    /* renamed from: b */
    public final String getF9357a() {
        return "offer.RTLCampaignID";
    }
}
