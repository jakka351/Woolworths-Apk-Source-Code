package coil.request;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/CachePolicy;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CachePolicy {
    public static final CachePolicy f;
    public static final CachePolicy g;
    public static final /* synthetic */ CachePolicy[] h;
    public static final /* synthetic */ EnumEntries i;
    public final boolean d;
    public final boolean e;

    static {
        CachePolicy cachePolicy = new CachePolicy(0, "ENABLED", true, true);
        f = cachePolicy;
        CachePolicy cachePolicy2 = new CachePolicy(1, "READ_ONLY", true, false);
        CachePolicy cachePolicy3 = new CachePolicy(2, "WRITE_ONLY", false, true);
        CachePolicy cachePolicy4 = new CachePolicy(3, "DISABLED", false, false);
        g = cachePolicy4;
        CachePolicy[] cachePolicyArr = {cachePolicy, cachePolicy2, cachePolicy3, cachePolicy4};
        h = cachePolicyArr;
        i = EnumEntriesKt.a(cachePolicyArr);
    }

    public CachePolicy(int i2, String str, boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) h.clone();
    }
}
