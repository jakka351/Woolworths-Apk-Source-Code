package au.com.woolworths.foundation.force.upgrade.impl.datastore;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/impl/datastore/AppConfigDataStoreKeys;", "", "force-upgrade-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppConfigDataStoreKeys {

    /* renamed from: a, reason: collision with root package name */
    public static final Preferences.Key f8509a = PreferencesKeys.b("next_fetch_at");

    public static Preferences.Key a() {
        return f8509a;
    }
}
