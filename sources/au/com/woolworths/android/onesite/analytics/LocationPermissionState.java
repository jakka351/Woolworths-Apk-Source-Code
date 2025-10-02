package au.com.woolworths.android.onesite.analytics;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/LocationPermissionState;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocationPermissionState {
    public static final /* synthetic */ LocationPermissionState[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        LocationPermissionState[] locationPermissionStateArr = {new LocationPermissionState("AUTHORISED", 0), new LocationPermissionState("RESTRICTED", 1), new LocationPermissionState("DENIED", 2)};
        d = locationPermissionStateArr;
        e = EnumEntriesKt.a(locationPermissionStateArr);
    }

    public static LocationPermissionState valueOf(String str) {
        return (LocationPermissionState) Enum.valueOf(LocationPermissionState.class, str);
    }

    public static LocationPermissionState[] values() {
        return (LocationPermissionState[]) d.clone();
    }
}
