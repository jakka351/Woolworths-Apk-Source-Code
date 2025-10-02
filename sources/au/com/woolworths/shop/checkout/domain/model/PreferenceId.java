package au.com.woolworths.shop.checkout.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/PreferenceId;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PreferenceId {
    public static final PreferenceId d;
    public static final PreferenceId e;
    public static final PreferenceId f;
    public static final PreferenceId g;
    public static final PreferenceId h;
    public static final PreferenceId i;
    public static final /* synthetic */ PreferenceId[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        PreferenceId preferenceId = new PreferenceId("SELF_ISOLATION", 0);
        d = preferenceId;
        PreferenceId preferenceId2 = new PreferenceId("LEAVE_UNATTENDED", 1);
        e = preferenceId2;
        PreferenceId preferenceId3 = new PreferenceId("DELIVERY_INSTRUCTION", 2);
        f = preferenceId3;
        PreferenceId preferenceId4 = new PreferenceId("NOMINATED_ID_CHECK", 3);
        g = preferenceId4;
        PreferenceId preferenceId5 = new PreferenceId("SHOPPER_INSTRUCTION", 4);
        h = preferenceId5;
        PreferenceId preferenceId6 = new PreferenceId("UNKNOWN", 5);
        i = preferenceId6;
        PreferenceId[] preferenceIdArr = {preferenceId, preferenceId2, preferenceId3, preferenceId4, preferenceId5, preferenceId6};
        j = preferenceIdArr;
        k = EnumEntriesKt.a(preferenceIdArr);
    }

    public static PreferenceId valueOf(String str) {
        return (PreferenceId) Enum.valueOf(PreferenceId.class, str);
    }

    public static PreferenceId[] values() {
        return (PreferenceId[]) j.clone();
    }
}
