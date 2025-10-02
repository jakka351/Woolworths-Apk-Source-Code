package au.com.woolworths.shop.lists.data.sync.scheduler;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/sync/scheduler/SyncType;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SyncType {
    public static final SyncType d;
    public static final SyncType e;
    public static final SyncType f;
    public static final /* synthetic */ SyncType[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        SyncType syncType = new SyncType("IMMEDIATE", 0);
        d = syncType;
        SyncType syncType2 = new SyncType("DEBOUNCED", 1);
        e = syncType2;
        SyncType syncType3 = new SyncType("ONLY_IF_STALE", 2);
        f = syncType3;
        SyncType[] syncTypeArr = {syncType, syncType2, syncType3};
        g = syncTypeArr;
        h = EnumEntriesKt.a(syncTypeArr);
    }

    public static SyncType valueOf(String str) {
        return (SyncType) Enum.valueOf(SyncType.class, str);
    }

    public static SyncType[] values() {
        return (SyncType[]) g.clone();
    }
}
