package au.com.woolworths.foundation.wxid.impl.data;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/wxid/impl/data/WxidDataStore;", "", "Keys", "wxid-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WxidDataStore {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/wxid/impl/data/WxidDataStore$Keys;", "", "wxid-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Keys {

        /* renamed from: a, reason: collision with root package name */
        public static final Preferences.Key f8937a = PreferencesKeys.c("wxid_value");
        public static final Preferences.Key b = PreferencesKeys.b("wxid_next_fetch_at");
    }
}
