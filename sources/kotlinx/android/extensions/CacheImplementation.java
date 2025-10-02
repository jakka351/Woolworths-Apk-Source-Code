package kotlinx.android.extensions;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation;", "", "Companion", "kotlin-android-extensions-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheImplementation {
    public static final CacheImplementation d;
    public static final /* synthetic */ CacheImplementation[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/android/extensions/CacheImplementation$Companion;", "", "kotlin-android-extensions-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CacheImplementation cacheImplementation = new CacheImplementation("SPARSE_ARRAY", 0);
        CacheImplementation cacheImplementation2 = new CacheImplementation("HASH_MAP", 1);
        d = cacheImplementation2;
        CacheImplementation[] cacheImplementationArr = {cacheImplementation, cacheImplementation2, new CacheImplementation("NO_CACHE", 2)};
        e = cacheImplementationArr;
        f = EnumEntriesKt.a(cacheImplementationArr);
    }

    public static CacheImplementation valueOf(String str) {
        return (CacheImplementation) Enum.valueOf(CacheImplementation.class, str);
    }

    public static CacheImplementation[] values() {
        return (CacheImplementation[]) e.clone();
    }
}
