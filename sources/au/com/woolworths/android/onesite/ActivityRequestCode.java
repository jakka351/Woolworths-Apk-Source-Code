package au.com.woolworths.android.onesite;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/ActivityRequestCode;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityRequestCode {
    public static final /* synthetic */ ActivityRequestCode[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ActivityRequestCode[] activityRequestCodeArr = {new ActivityRequestCode("PICK_UP_SUBURB_LOCATION_SEARCH_RESULT", 0), new ActivityRequestCode("MANAGE_FULL_DELIVERY_ADDRESSES", 1), new ActivityRequestCode("MANAGE_POST_DELIVERY_ADDRESSES", 2), new ActivityRequestCode("ADD_NEW_ADDRESS_BY_SEARCH", 3), new ActivityRequestCode("ADD_MANUAL_DELIVERY_ADDRESS", 4)};
        d = activityRequestCodeArr;
        e = EnumEntriesKt.a(activityRequestCodeArr);
    }

    public static ActivityRequestCode valueOf(String str) {
        return (ActivityRequestCode) Enum.valueOf(ActivityRequestCode.class, str);
    }

    public static ActivityRequestCode[] values() {
        return (ActivityRequestCode[]) d.clone();
    }
}
