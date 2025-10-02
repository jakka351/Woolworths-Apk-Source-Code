package androidx.work;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/NetworkType;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkType {
    public static final NetworkType d;
    public static final NetworkType e;
    public static final NetworkType f;
    public static final NetworkType g;
    public static final NetworkType h;
    public static final NetworkType i;
    public static final /* synthetic */ NetworkType[] j;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        d = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        e = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        f = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        g = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        h = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        i = networkType6;
        j = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) j.clone();
    }
}
