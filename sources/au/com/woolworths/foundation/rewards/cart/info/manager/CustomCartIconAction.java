package au.com.woolworths.foundation.rewards.cart.info.manager;

import au.com.woolworths.analytics.Event;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0082\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/info/manager/CustomCartIconAction;", "Lau/com/woolworths/analytics/Event;", "", "Companion", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CustomCartIconAction implements Event {
    public static final /* synthetic */ CustomCartIconAction[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/info/manager/CustomCartIconAction$Companion;", "", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CustomCartIconAction[] customCartIconActionArr = new CustomCartIconAction[0];
        d = customCartIconActionArr;
        e = EnumEntriesKt.a(customCartIconActionArr);
    }

    public static CustomCartIconAction valueOf(String str) {
        return (CustomCartIconAction) Enum.valueOf(CustomCartIconAction.class, str);
    }

    public static CustomCartIconAction[] values() {
        return (CustomCartIconAction[]) d.clone();
    }
}
