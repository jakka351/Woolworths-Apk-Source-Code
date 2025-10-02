package au.com.woolworths.android.onesite.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/UserAttributionManagerImpl;", "Lau/com/woolworths/android/onesite/analytics/UserAttributionManager;", "base-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserAttributionManagerImpl implements UserAttributionManager {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4063a = new LinkedHashMap();

    @Override // au.com.woolworths.android.onesite.analytics.UserAttributionManager
    public final Map a() {
        return MapsKt.q(this.f4063a);
    }
}
