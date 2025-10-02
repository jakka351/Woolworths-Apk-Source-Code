package au.com.woolworths.rewards.base.homepage;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/homepage/CacheType;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CacheType {
    public static final /* synthetic */ CacheType[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        CacheType[] cacheTypeArr = {new CacheType("MEMORY", 0), new CacheType("USER_SESSION", 1)};
        d = cacheTypeArr;
        e = EnumEntriesKt.a(cacheTypeArr);
    }

    public static CacheType valueOf(String str) {
        return (CacheType) Enum.valueOf(CacheType.class, str);
    }

    public static CacheType[] values() {
        return (CacheType[]) d.clone();
    }
}
