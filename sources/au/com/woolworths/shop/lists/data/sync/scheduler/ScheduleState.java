package au.com.woolworths.shop.lists.data.sync.scheduler;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/scheduler/ScheduleState;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScheduleState {
    public static final /* synthetic */ ScheduleState[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ScheduleState[] scheduleStateArr = {new ScheduleState("INITIALISE", 0), new ScheduleState("COMPLETED", 1)};
        d = scheduleStateArr;
        e = EnumEntriesKt.a(scheduleStateArr);
    }

    public static ScheduleState valueOf(String str) {
        return (ScheduleState) Enum.valueOf(ScheduleState.class, str);
    }

    public static ScheduleState[] values() {
        return (ScheduleState[]) d.clone();
    }
}
