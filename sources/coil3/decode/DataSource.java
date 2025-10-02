package coil3.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/DataSource;", "", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataSource {
    public static final DataSource d;
    public static final DataSource e;
    public static final DataSource f;
    public static final DataSource g;
    public static final /* synthetic */ DataSource[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        DataSource dataSource = new DataSource("MEMORY_CACHE", 0);
        d = dataSource;
        DataSource dataSource2 = new DataSource("MEMORY", 1);
        e = dataSource2;
        DataSource dataSource3 = new DataSource("DISK", 2);
        f = dataSource3;
        DataSource dataSource4 = new DataSource("NETWORK", 3);
        g = dataSource4;
        DataSource[] dataSourceArr = {dataSource, dataSource2, dataSource3, dataSource4};
        h = dataSourceArr;
        i = EnumEntriesKt.a(dataSourceArr);
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) h.clone();
    }
}
