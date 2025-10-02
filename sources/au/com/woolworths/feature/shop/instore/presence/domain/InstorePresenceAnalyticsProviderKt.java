package au.com.woolworths.feature.shop.instore.presence.domain;

import YU.a;
import com.salesforce.marketingcloud.messages.iam.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"instore-presence_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstorePresenceAnalyticsProviderKt {
    public static final String a(String str) {
        return a.A("Geofence:", str);
    }

    public static final boolean b(String str) {
        return (str == null || str.equals(j.h) || str.equals("disconnected")) ? false : true;
    }

    public static final String c(String str) {
        return a.A("WiFi:", str);
    }
}
