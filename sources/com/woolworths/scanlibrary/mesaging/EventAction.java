package com.woolworths.scanlibrary.mesaging;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/mesaging/EventAction;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventAction {
    public static final Companion e;
    public static final /* synthetic */ EventAction[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/mesaging/EventAction$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        EventAction[] eventActionArr = {new EventAction("LOGOUT", 0, "logout"), new EventAction("CART_EXPIRING", 1, "cart_expiry"), new EventAction("CART_EXPIRED", 2, "cart_expired"), new EventAction("TRANSFER_TO_POS", 3, "cart_transfer_to_pos"), new EventAction("BAG_CHECK_COMPLETED", 4, "bag_check_completed"), new EventAction("PARKING_VOUCHER_READY", 5, "parking_voucher_ready")};
        f = eventActionArr;
        g = EnumEntriesKt.a(eventActionArr);
        e = new Companion();
    }

    public EventAction(String str, int i, String str2) {
        this.d = str2;
    }

    public static EventAction valueOf(String str) {
        return (EventAction) Enum.valueOf(EventAction.class, str);
    }

    public static EventAction[] values() {
        return (EventAction[]) f.clone();
    }
}
