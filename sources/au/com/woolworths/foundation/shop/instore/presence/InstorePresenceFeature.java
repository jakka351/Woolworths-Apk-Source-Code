package au.com.woolworths.foundation.shop.instore.presence;

import au.com.woolworths.android.onesite.featuretoggles.Feature;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/foundation/shop/instore/presence/InstorePresenceFeature;", "Lau/com/woolworths/android/onesite/featuretoggles/Feature;", "", "instore-presence_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InstorePresenceFeature implements Feature {
    public static final InstorePresenceFeature d;
    public static final /* synthetic */ InstorePresenceFeature[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        InstorePresenceFeature instorePresenceFeature = new InstorePresenceFeature() { // from class: au.com.woolworths.foundation.shop.instore.presence.InstorePresenceFeature.INSTORE_PRESENCE_DEBUG_GEO_LOCATION
            @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
            public final String c() {
                return "ft_instore_presence_debug_geo_location";
            }
        };
        d = instorePresenceFeature;
        InstorePresenceFeature[] instorePresenceFeatureArr = {instorePresenceFeature};
        e = instorePresenceFeatureArr;
        f = EnumEntriesKt.a(instorePresenceFeatureArr);
    }

    public static InstorePresenceFeature valueOf(String str) {
        return (InstorePresenceFeature) Enum.valueOf(InstorePresenceFeature.class, str);
    }

    public static InstorePresenceFeature[] values() {
        return (InstorePresenceFeature[]) e.clone();
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final String a() {
        return "";
    }

    @Override // au.com.woolworths.android.onesite.featuretoggles.Feature
    public final boolean getDefaultValue() {
        return false;
    }
}
