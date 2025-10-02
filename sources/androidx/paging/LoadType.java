package androidx.paging;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/paging/LoadType;", "", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoadType {
    public static final LoadType d;
    public static final LoadType e;
    public static final LoadType f;
    public static final /* synthetic */ LoadType[] g;

    static {
        LoadType loadType = new LoadType("REFRESH", 0);
        d = loadType;
        LoadType loadType2 = new LoadType("PREPEND", 1);
        e = loadType2;
        LoadType loadType3 = new LoadType("APPEND", 2);
        f = loadType3;
        g = new LoadType[]{loadType, loadType2, loadType3};
    }

    public static LoadType valueOf(String str) {
        return (LoadType) Enum.valueOf(LoadType.class, str);
    }

    public static LoadType[] values() {
        return (LoadType[]) g.clone();
    }
}
