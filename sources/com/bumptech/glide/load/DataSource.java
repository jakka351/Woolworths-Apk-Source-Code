package com.bumptech.glide.load;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class DataSource {
    public static final DataSource d;
    public static final DataSource e;
    public static final DataSource f;
    public static final DataSource g;
    public static final DataSource h;
    public static final /* synthetic */ DataSource[] i;

    static {
        DataSource dataSource = new DataSource("LOCAL", 0);
        d = dataSource;
        DataSource dataSource2 = new DataSource("REMOTE", 1);
        e = dataSource2;
        DataSource dataSource3 = new DataSource("DATA_DISK_CACHE", 2);
        f = dataSource3;
        DataSource dataSource4 = new DataSource("RESOURCE_DISK_CACHE", 3);
        g = dataSource4;
        DataSource dataSource5 = new DataSource("MEMORY_CACHE", 4);
        h = dataSource5;
        i = new DataSource[]{dataSource, dataSource2, dataSource3, dataSource4, dataSource5};
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) i.clone();
    }
}
